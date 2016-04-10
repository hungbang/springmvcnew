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
import com.mrv.cps.vo.AccountVO;
import com.mrv.cps.vo.RoleVO;

/**
 * @author PC
 *
 */
public class AccountMapper implements RowMapper<AccountVO>{
	private static final Logger logger = LoggerFactory.getLogger(AccountMapper.class);
	
	@Override
	public AccountVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		AccountVO accVO= new AccountVO();
		accVO.setAccountId(rs.getInt("AccountID"));
		accVO.setUsername(rs.getString("UserName"));
		accVO.setPassword(rs.getString("Password"));
		accVO.getRoleVO().setRoleId(rs.getInt("RoleID"));
		
		return accVO;
	}

}
