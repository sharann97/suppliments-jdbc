package com.suppliments.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.suppliments.model.Suppliments;
import com.suppliments.util.DBQueries;

@Repository
public class SupplimentsRepositoryImpl implements ISupplimentsRepository{

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
    @Override
	public void updateSuppliments(int prodId, double amount) {
		jdbcTemplate.update(DBQueries.UPDATEQUERY,prodId,amount);
	}

	@Override
	public void deleteSuppliment(int prodId) {
		jdbcTemplate.update(DBQueries.DELETEQUERY,prodId);
	}

	@Override
	public List<Suppliments> findByAll() {
		return null;
	}

	@Override
	public List<Suppliments> findByType(String type) {
		return null;
	}

	@Override
	public List<Suppliments> findByProdId(int prodId) {
		return null;
	}


	@Override
	public void addInvestment(Suppliments suppliments) {
		// TODO Auto-generated method stub
		
	}



	
	
}
