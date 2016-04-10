/**
 * 
 */
package com.mrv.cps.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;
import com.mrv.cps.vo.RoleVO;

/**
 * @author PC
 *
 */
public class RoleMapper implements RowMapper<RoleVO>{
	private static final Logger logger = LoggerFactory.getLogger(RoleMapper.class);

	@Override
	public RoleVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		RoleVO roleVO =new RoleVO();
		roleVO.setRoleId(rs.getInt("RoleID"));
		roleVO.setRoleName(rs.getString("RoleName"));
		
		return roleVO;
	}
}
