/**
 * 
 */
package com.mrv.cps.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

import com.mrv.cps.controller.HomeController;
import com.mrv.cps.vo.CustomerVO;

/**
 * @author hungbang
 *
 */
public class CustomerMapper implements RowMapper<CustomerVO> {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Override
	public CustomerVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		CustomerVO customerVO = new CustomerVO();
		customerVO.setCustomerId(rs.getInt("id"));
		customerVO.setCustomerName(rs.getString("customer_name"));
		customerVO.setBirthday(rs.getString("customer_dob"));
		customerVO.setEmail(rs.getString("customer_email"));
		customerVO.setAddress(rs.getString("customer_address"));
		
		return customerVO;
	}
}
