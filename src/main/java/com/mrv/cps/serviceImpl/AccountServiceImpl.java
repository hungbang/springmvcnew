/**
 * 
 */
package com.mrv.cps.serviceImpl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.mrv.cps.dao.AccountDAO;
import com.mrv.cps.dao.CustomerDAO;
import com.mrv.cps.service.AccountService;
import com.mrv.cps.utils.Constants;
import com.mrv.cps.vo.AccountVO;

/**
 * @author PC
 *
 */
@Service(Constants.ACCOUNT_SERVICE)
public class AccountServiceImpl implements AccountService {

	/* (non-Javadoc)
	 * @see com.mrv.cps.service.AccountService#getLstAccount()
	 */
	
	@Autowired
	@Qualifier(Constants.ACCOUNT_DAO)
	private AccountDAO accountDao;
	@Override
	public List<AccountVO> getLstAccount() throws DataAccessException {
		return accountDao.getALlAccountVO();
	}

	/* (non-Javadoc)
	 * @see com.mrv.cps.service.AccountService#getCustomerListForPaging(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public List<AccountVO> getCustomerListForPaging(Integer pageNumber,
			Integer pageDisplayLength) throws DataAccessException {
		return accountDao.getAccountListForPaging(pageNumber, pageDisplayLength);

	}

	@Override
	public AccountVO isValidUser(String username, String password)
			throws DataAccessException, SQLException {
		// TODO Auto-generated method stub
		return accountDao.isValueAcc(username, password);
	}

	@Override
	public AccountVO addNewAccount(AccountVO accountVO)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return accountDao.addNewAccount(accountVO);
	}

	@Override
	public AccountVO updateAccount(AccountVO accountVO)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return accountDao.updateAccount(accountVO);
	}

	@Override
	public void deleteAccount(Integer id) throws DataAccessException {
		accountDao.deleteAccount(id);
		
	}

	@Override
	public AccountVO findById(Integer id) throws DataAccessException {
		// TODO Auto-generated method stub
		return accountDao.findById(id);
	}

	@Override
	public AccountVO findByName(String name) throws DataAccessException {
		// TODO Auto-generated method stub
		return accountDao.findByName(name);
	}



}
