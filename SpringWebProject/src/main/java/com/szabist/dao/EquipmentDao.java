package com.szabist.dao;

import java.util.List;

import com.szabist.model.Equipment;

public interface EquipmentDao {

	public void add(Equipment equipment);
	public List<Equipment> getEquipment();
	public void edit(Equipment equipment);
	public void delete(String id);
	public Equipment getoneequipment(String id);
}
