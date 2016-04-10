/**
 * 
 */
package com.mrv.cps.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.mrv.cps.dao.AccountDAO;
import com.mrv.cps.mapper.AccountMapper;
import com.mrv.cps.mapper.CustomerMapper;
import com.mrv.cps.mapper.EmployeeMapper;
import com.mrv.cps.utils.Constants;
import com.mrv.cps.vo.AccountVO;
import com.mrv.cps.vo.CustomerVO;
import com.mrv.cps.vo.EmployeeVO;
import com.mysql.jdbc.PreparedStatement;

/**
 * @author PC
 * 
 */
@Repository(Constants.ACCOUNT_DAO)
public class AccountDAOImpl extends BaseDAO implements AccountDAO {
	DataSource dataSource;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mrv.cps.dao.AccountDAO#getALlAccountVO()
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(AccountDAOImpl.class);

	@Override
	public List<AccountVO> getALlAccountVO() throws DataAccessException {
		logger.info("------getAllAccountVO---------");
		String sqlSelect = "select * from account";
		List<AccountVO> lstAccountVO = jdbcTemplate.query(sqlSelect,
				new AccountMapper());
		logger.info("--------hhhdhdhdhdhdh------------");

		for (AccountVO acc : lstAccountVO) {
			logger.info(acc.getUsername());
		}
		return lstAccountVO;
	}

	@Override
	public List<AccountVO> getAccountListForPaging(Integer pageNumber,
			Integer pageDisplayLength) throws DataAccessException {
		logger.info("Get accountListForPaging at AccountDaoImpl");
		logger.info("pageNumber :: " + pageNumber);
		logger.info("pageDisplayLength:: " + pageDisplayLength);
		List<AccountVO> accountList = new ArrayList<AccountVO>();
		try {
			accountList = new ArrayList<AccountVO>();
			String sql = "select * from account limit " + pageNumber + ", "
					+ pageDisplayLength + "";
			accountList = jdbcTemplate.query(sql, new AccountMapper());
			if (accountList.size() > 0) {
				logger.info("Info list account: ", accountList.get(0)
						.getUsername());
				logger.info("size account list");
			}
		} catch (DataAccessException e) {
			logger.info("error when get list paging: " + e.getMessage());
		}

		return accountList;
	}

	@Override
	public AccountVO isValueAcc(String username, String password)
			throws DataAccessException, SQLException {
		String sqlString = "Select * from account where UserName = ? and Password = ?";
		AccountVO accountVO = null;
		Object[] params = { username, password };
		int[] types = { Types.VARCHAR, Types.VARCHAR };
		try{
			accountVO = (AccountVO) jdbcTemplate.queryForObject(sqlString, params,
					types, new AccountMapper());
		}catch(Exception e){
			logger.info("=======DataAccessException==============DataAccessException========"+ e);
		}
		return accountVO;

	}

	@Override
	public AccountVO addNewAccount(AccountVO accountVO)
			throws DataAccessException {
		logger.info("addNewAccount");
		String sqlString = "insert into account(AccountID, UserName, Password ,RoleID) values(?,?,?,?)";
		Object[] params = new Object[] { accountVO.getAccountId(),
				accountVO.getUsername(), accountVO.getPassword(),
				accountVO.getRoleVO() };
		int[] types = new int[] { Types.BIGINT, Types.VARCHAR, Types.VARCHAR,
				Types.BIGINT };
		int row = jdbcTemplate.update(sqlString, params, types);

		return accountVO;
	}

	@Override
	public AccountVO updateAccount(AccountVO accountVO)
			throws DataAccessException {
		logger.info("updateAccount");
		String sqlString = "update account set UsreName = ?, Password = ?, RoleID = ? where AccountID = ?";
		Object[] params = new Object[] { accountVO.getUsername(),
				accountVO.getPassword(), accountVO.getRoleVO(),
				accountVO.getAccountId() };
		int[] types = new int[] { Types.VARCHAR, Types.VARCHAR, Types.VARCHAR,
				Types.BIGINT };
		int row = jdbcTemplate.update(sqlString, params, types);

		return accountVO;
	}

	@Override
	public void deleteAccount(Integer id) throws DataAccessException {
		logger.info("deleteAccount");
		String sqlString = "delete from account where AccountID = ?";
		Object[] params = { id };
		int[] types = { Types.BIGINT };
		int row = jdbcTemplate.update(sqlString, params, types);
	}

	@Override
	public AccountVO findById(Integer id) throws DataAccessException {
		logger.info("-----------findById--------------");
		String sqlString = "select * from employees where AccountID = ?";
		AccountVO accountVO = new AccountVO();
		Object[] params = { id };
		int[] types = { Types.BIGINT };
		accountVO = (AccountVO) jdbcTemplate.queryForObject(sqlString, params,
				types, new AccountMapper());
		return accountVO;
	}

	@Override
	public AccountVO findByName(String name) throws DataAccessException {
		logger.info("---------------findByName--------------");
		String sqlString = "select * from account where UserName = ?";
		AccountVO accountVO = new AccountVO();
		Object[] params = { name };
		int[] types = { Types.VARCHAR };
		accountVO = (AccountVO) jdbcTemplate.queryForObject(sqlString, params,
				types, new AccountMapper());
		return accountVO;
	}

}
