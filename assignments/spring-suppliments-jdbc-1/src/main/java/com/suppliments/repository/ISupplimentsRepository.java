package com.suppliments.repository;

import java.util.List;

import com.suppliments.model.Suppliments;

public interface ISupplimentsRepository {

	void addInvestment(Suppliments suppliments);
	void updateSuppliments(int prodId,double amount);
	void deleteSuppliment(int prodId);
	
	List<Suppliments> findByAll();
	List<Suppliments> findByType(String type);
	List<Suppliments> findByProdId(int prodId);
	
}
