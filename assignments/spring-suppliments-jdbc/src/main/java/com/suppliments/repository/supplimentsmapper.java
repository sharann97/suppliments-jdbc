package com.suppliments.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.investmentapp.model.Investment;
import com.suppliments.model.Suppliments;

public class supplimentsmapper implements RowMapper<Suppliments> {

	@Override
	public Suppliments mapRow(ResultSet rs, int rowNum) throws SQLException {
		String brandname=rs.getString("brand_name");
		int  prodId =rs.getInt("prodId");
		double amount=rs.getDouble("amount");
		String type=rs.getString("type");
		
		
		
		Suppliments suppliments=new Suppliments();
		suppliments.setAmount(amount);
	    suppliments.setBrandName(brandname);
	    suppliments.setprodId(prodId);
	    suppliments.setType(plantype);
	
	return suppliments;	
	}
	
}
