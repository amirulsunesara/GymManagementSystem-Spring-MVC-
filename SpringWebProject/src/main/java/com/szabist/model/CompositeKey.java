package com.szabist.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

	@Embeddable
	public class CompositeKey implements Serializable
	{
		
		private int customerid;
		
		private int supplementid;
//		public CompositeKey(int customerid, int supplementid) {
//			super();
//			this.customerid = customerid;
//			this.supplementid = supplementid;

		public int getCustomerid() {
			return customerid;
		}

		public void setCustomerid(int customerid) {
			this.customerid = customerid;
		}

		public int getSupplementid() {
			return supplementid;
		}

		public void setSupplementid(int supplementid) {
			this.supplementid = supplementid;
		}
		
		public CompositeKey(){}
		
		public CompositeKey(int customerid, int supplementid) {
			super();
			this.customerid = customerid;
			this.supplementid = supplementid;
		}

		public boolean equals(Object object){
			if (object instanceof CompositeKey) {
				CompositeKey pk = (CompositeKey)object;
	            return customerid==pk.customerid && supplementid == pk.supplementid;
	        } else {
	            return false;
	        }
	    }
		  public int hashCode() {
		        return customerid + supplementid;
		    }
	}
	
		
		
	

