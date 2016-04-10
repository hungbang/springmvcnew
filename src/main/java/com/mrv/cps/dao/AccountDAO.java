/**
 * 
 */
package com.mrv.cps.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.mrv.cps.utils.Constants;
import com.mrv.cps.vo.AccountVO;
import com.mrv.cps.vo.CustomerVO;
import com.mrv.cps.vo.EmployeeVO;

/**
 * @author PC
 *
 */

public interface AccountDAO {
	public List<AccountVO> getALlAccountVO();
	public AccountVO isValueAcc(String username, String password)  throws DataAccessException, SQLException;
	public List<AccountVO> getAccountListForPaging(Integer pageNumber, Integer pageDisplayLength) throws DataAccessException;
	public AccountVO addNewAccount(AccountVO accountVO) throws DataAccessException;
	public AccountVO updateAccount(AccountVO accountVO) throws DataAccessException;
	public void deleteAccount(Integer id) throws DataAccessException;
	public AccountVO findById(Integer id) throws DataAccessException;
	public AccountVO findByName(String name) throws DataAccessException;

}
