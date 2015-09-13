/**
 * 
 */
package com.mrv.cps.daoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

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

	/* (non-Javadoc)
	 * @see com.mrv.cps.dao.CustomerDAO#getLstCustomer()
	 */
	@Override
	public List<CustomerVO> getLstCustomer() {
		String sqlSelect = "select * from customers";
		List<CustomerVO> lstCustomerVO = jdbcTemplate.query(sqlSelect, new CustomerMapper());
		
		return lstCustomerVO;
	}

}
