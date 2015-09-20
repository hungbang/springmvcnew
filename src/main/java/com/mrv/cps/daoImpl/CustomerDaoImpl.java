/**
 * 
 */
package com.mrv.cps.daoImpl;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import javax.management.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.object.SqlQuery;
import org.springframework.stereotype.Repository;

import com.mrv.cps.controller.HomeController;
import com.mrv.cps.dao.CustomerDAO;
import com.mrv.cps.mapper.CustomerMapper;
import com.mrv.cps.utils.Constants;
import com.mrv.cps.vo.CustomerVO;

/**
 * @author hungbang
 *
 */
@Repository(Constants.CUSTOMER_DAO)
public class CustomerDaoImpl extends BaseDAO implements CustomerDAO {

	private static final Logger logger = LoggerFactory.getLogger(CustomerDaoImpl.class);
	
	/* (non-Javadoc)
	 * @see com.mrv.cps.dao.CustomerDAO#getLstCustomer()
	 */
	@Override
	public List<CustomerVO> getLstCustomer() throws DataAccessException{
		String sqlSelect = "select * from customers";
		List<CustomerVO> lstCustomerVO = jdbcTemplate.query(sqlSelect, new CustomerMapper());
		
		return lstCustomerVO;
	}

	@Override
	public List<CustomerVO> getCustomerListForPaging(Integer pageNumber,
			Integer pageDisplayLength) throws DataAccessException {
		logger.info("Get customerListForPaging at CustomerDaoImpl");
		logger.info("pageNumber :: "+ pageNumber);
		logger.info("pageDisplayLength:: "+ pageDisplayLength);
		List<CustomerVO> customerList = new ArrayList<CustomerVO>();
		try{
			customerList = new ArrayList<CustomerVO>();
			String sql = "select * from customers limit "+ pageNumber +", "+pageDisplayLength+"";
			customerList = jdbcTemplate.query(sql, new CustomerMapper());
			if(customerList.size() > 0){
				logger.info("Info list customer: ", customerList.get(0).getCustomerName());
				logger.info("size customer list");
			}
		}catch(DataAccessException e){
			logger.info("error when get list paging: "+ e.getMessage());
		}
		
		return customerList;
	}

}
