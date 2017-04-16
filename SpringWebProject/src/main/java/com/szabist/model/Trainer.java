package com.szabist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
@Entity
@NamedQueries({
@NamedQuery(name="Trainer.getTrainer",
    query="SELECT e FROM Trainer e"),
@NamedQuery(name="Trainer.getoneTrainer ",query="SELECT e FROM Trainer e WHERE e.id = :id")
})
public class Trainer {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	
	@Column
	private String trainer_style;

	
	public Trainer(){}
	public Trainer(String id, String trainer_style) {
		super();
		this.id = id;
		this.trainer_style = trainer_style;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTrainer_style() {
		return trainer_style;
	}

	public void setTrainer_style(String trainer_style) {
		this.trainer_style = trainer_style;
	}

	

	
	
}
