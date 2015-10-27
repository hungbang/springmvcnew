/**
 * 
 */
package com.mrv.cps.daoImpl;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.mrv.cps.dao.EmployeeDAO;
import com.mrv.cps.mapper.EmployeeMapper;
import com.mrv.cps.utils.Constants;
import com.mrv.cps.vo.EmployeeVO;
import com.sun.corba.se.impl.orbutil.closure.Constant;

/**
 * @author hungbang
 *
 */
@Repository(Constants.EMPLOYEE_DAO)
public class EmployeeDAOImpl extends BaseDAO implements EmployeeDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeDAOImpl.class);
	/* (non-Javadoc)
	 * @see com.mrv.cps.dao.EmployeeDAO#getAllEmployeeList()
	 */
	@Override
	public List<EmployeeVO> getAllEmployeeList() throws DataAccessException{
		logger.info("getAllEmployeeList");
		String sqlString = "select * from employees";
		List<EmployeeVO> employees = new ArrayList<EmployeeVO>();
		employees = jdbcTemplate.query(sqlString,new EmployeeMapper());
		return employees;
	}

	/* (non-Javadoc)
	 * @see com.mrv.cps.dao.EmployeeDAO#addNewEmployee(com.mrv.cps.vo.EmployeeVO)
	 */
	@Override
	public EmployeeVO addNewEmployee(EmployeeVO employeeVO) throws DataAccessException{
		logger.info("addNewEmployee");
		String sqlString = "insert into employees(employee_name, email, address) values(?,?,?)";
		Object[] params = new Object[]{employeeVO.getEmployeeName(), employeeVO.getEmail(), employeeVO.getAddress()};
		int [] types = new int[]{Types.VARCHAR, Types.VARCHAR, Types.VARCHAR};
		int row = jdbcTemplate.update(sqlString, params, types);
		
		return employeeVO;
	}

	/* (non-Javadoc)
	 * @see com.mrv.cps.dao.EmployeeDAO#updateEmployee(com.mrv.cps.vo.EmployeeVO)
	 */
	@Override
	public EmployeeVO updateEmployee(EmployeeVO employeeVO) throws DataAccessException{
		logger.info("updateEmployee");
		String sqlString = "update employees set employee_name = ?, email = ?, address = ? where id = ?";
		Object[] params = new Object[]{employeeVO.getEmployeeName(), employeeVO.getEmail(), employeeVO.getAddress(), employeeVO.getId()};
		int[] types = new int[]{Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.BIGINT};
		int row = jdbcTemplate.update(sqlString, params, types);
		
		return employeeVO;
	}

	/* (non-Javadoc)
	 * @see com.mrv.cps.dao.EmployeeDAO#deleteEmployee(java.lang.Integer)
	 */
	@Override
	public void deleteEmployee(Integer id) throws DataAccessException{
		logger.info("deleteEmployee");
		String sqlString = "delete from employees where id = ?";
		Object[] params = {id};
		int[] types = {Types.BIGINT};
		int row = jdbcTemplate.update(sqlString, params, types);
	}

	@Override
	public EmployeeVO findById(Integer id) throws DataAccessException {
		logger.info("-----------findById--------------");
		String sqlString = "select * from employees where id = ?";
		EmployeeVO employeeVO = new EmployeeVO();
		Object[] params = {id};
		int[] types = {Types.BIGINT};
		employeeVO = (EmployeeVO)jdbcTemplate.queryForObject(sqlString, params, types, new EmployeeMapper());
		return employeeVO;
	}

	@Override
	public EmployeeVO findByName(String name) throws DataAccessException {
		logger.info("---------------findByName--------------");
		String sqlString ="select * from employees where employee_name = ?";
		EmployeeVO employeeVO = new EmployeeVO();
		Object[] params = {name};
		int[] types = {Types.VARCHAR};
		employeeVO = (EmployeeVO)jdbcTemplate.queryForObject(sqlString, params, types, new EmployeeMapper());
		return employeeVO;
	}

}
