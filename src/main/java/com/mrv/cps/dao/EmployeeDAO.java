/**
 * 
 */
package com.mrv.cps.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.mrv.cps.vo.EmployeeVO;

/**
 * @author hungbang
 *
 */
public interface EmployeeDAO {
	public List<EmployeeVO> getAllEmployeeList() throws DataAccessException;
	public EmployeeVO addNewEmployee(EmployeeVO employeeVO) throws DataAccessException;
	public EmployeeVO updateEmployee(EmployeeVO employeeVO) throws DataAccessException;
	public void deleteEmployee(Integer id) throws DataAccessException;
	
	public EmployeeVO findById(Integer id) throws DataAccessException;
	public EmployeeVO findByName(String name) throws DataAccessException;
}
