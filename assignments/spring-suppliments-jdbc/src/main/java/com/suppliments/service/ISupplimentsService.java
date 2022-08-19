package com.suppliments.service;

import java.util.List;

import com.suppliments.model.Suppliments;

public interface ISupplimentsService {

	void addSuppliments(String brand);
	void updateSuppliments(int prodId,double amount);
	void deleteSuppliment(int prodId);
	
	List<Suppliments> getAll();
	List<Suppliments> getByType(String type);
	List<Suppliments> getByProdId(int prodId);
	
}
