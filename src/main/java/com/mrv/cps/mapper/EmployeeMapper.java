/**
 * 
 */
package com.mrv.cps.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

import com.mrv.cps.vo.EmployeeVO;

/**
 * @author hungbang
 *
 */
public class EmployeeMapper implements RowMapper<EmployeeVO>{
	private static final Logger logger = LoggerFactory.getLogger(EmployeeMapper.class);

	@Override
	public EmployeeVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmployeeVO employeeVO = new EmployeeVO();
		employeeVO.setAddress(rs.getString("address"));
		employeeVO.setEmail(rs.getString("email"));
		employeeVO.setEmployeeName(rs.getString("employee_name"));
		employeeVO.setId(rs.getInt("id"));
		return employeeVO;
	}
}
