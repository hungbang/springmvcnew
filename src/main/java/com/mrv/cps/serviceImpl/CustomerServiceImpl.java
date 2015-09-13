/**
 * 
 */
package com.mrv.cps.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mrv.cps.dao.CustomerDAO;
import com.mrv.cps.service.CustomerService;
import com.mrv.cps.utils.Constants;
import com.mrv.cps.vo.CustomerVO;

/**
 * @author hungbang
 *
 */
@Service(Constants.CUSTOMER_SERVICE)
public class CustomerServiceImpl implements CustomerService {

	/* (non-Javadoc)
	 * @see com.mrv.cps.service.CustomerService#getLstCustomer()
	 */
	@Autowired
	@Qualifier(Constants.CUSTOMER_DAO)
	private CustomerDAO customerDao;
	
	@Override
	public List<CustomerVO> getLstCustomer() {
		
		return customerDao.getLstCustomer();
	}

}
