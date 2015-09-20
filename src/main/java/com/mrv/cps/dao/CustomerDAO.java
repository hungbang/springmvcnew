/**
 * 
 */
package com.mrv.cps.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.mrv.cps.vo.CustomerVO;

/**
 * @author hungbang
 *
 */
public interface CustomerDAO {
	public List<CustomerVO> getLstCustomer() throws DataAccessException;
	public List<CustomerVO> getCustomerListForPaging(Integer pageNumber, Integer pageDisplayLength) throws DataAccessException;
}
