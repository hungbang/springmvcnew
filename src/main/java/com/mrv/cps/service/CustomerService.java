/**
 * 
 */
package com.mrv.cps.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.mrv.cps.vo.CustomerVO;

/**
 * @author hungbang
 *
 */
public interface CustomerService {
	public List<CustomerVO> getLstCustomer() throws DataAccessException;

	public List<CustomerVO> getCustomerListForPaging(Integer pageNumber,
			Integer pageDisplayLength) throws DataAccessException;
	public Integer getTotalRecord() throws DataAccessException;
}
