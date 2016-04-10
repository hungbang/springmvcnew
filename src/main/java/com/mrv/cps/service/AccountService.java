package com.mrv.cps.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.mrv.cps.vo.AccountVO;
import com.mrv.cps.vo.EmployeeVO;


public interface AccountService {
	public List<AccountVO> getLstAccount() throws DataAccessException;
	public AccountVO isValidUser(String username, String password) throws DataAccessException,SQLException;


	public List<AccountVO> getCustomerListForPaging(Integer pageNumber,
			Integer pageDisplayLength) throws DataAccessException;
	
	public AccountVO addNewAccount(AccountVO accountVO) throws DataAccessException;
	public AccountVO updateAccount(AccountVO accountVO) throws DataAccessException;
	public void deleteAccount(Integer id) throws DataAccessException;
	
	public AccountVO findById(Integer id) throws DataAccessException;
	public AccountVO findByName(String name) throws DataAccessException;
}
