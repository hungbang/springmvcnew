/**
 * 
 */
package com.mrv.cps.daoImpl;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.mrv.cps.dao.RoleDAO;
import com.mrv.cps.mapper.AccountMapper;
import com.mrv.cps.mapper.RoleMapper;
import com.mrv.cps.vo.AccountVO;
import com.mrv.cps.vo.RoleVO;

/**
 * @author PC
 *
 */
public class RoleDAOimpl extends BaseDAO implements RoleDAO {

	/* (non-Javadoc)
	 * @see com.mrv.cps.dao.RoleDAO#getRoleVO()
	 */
	@Override
	public List<RoleVO> getRoleVO() throws DataAccessException {
		
		String sqlSelect = "select * from role";
		List<RoleVO> lstRoleVO = jdbcTemplate.query(sqlSelect, new RoleMapper());	
		return lstRoleVO;
	}

}
