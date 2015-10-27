/**
 * 
 */
package com.mrv.cps.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.mrv.cps.dao.EmployeeDAO;
import com.mrv.cps.service.EmployeeService;
import com.mrv.cps.utils.Constants;
import com.mrv.cps.vo.EmployeeVO;

/**
 * @author hungbang
 *
 */
@Service(Constants.EMPLOYEE_SERVICE)
public class EmployeeServiceImpl implements EmployeeService {

	/* (non-Javadoc)
	 * @see com.mrv.cps.service.EmployeeService#getAllEmployeeList()
	 */
	@Autowired
	@Qualifier(Constants.EMPLOYEE_DAO)
	private EmployeeDAO employeeDao;
	
	@Override
	public List<EmployeeVO> getAllEmployeeList() throws DataAccessException{
		return employeeDao.getAllEmployeeList();
	}

	/* (non-Javadoc)
	 * @see com.mrv.cps.service.EmployeeService#addNewEmployee(com.mrv.cps.vo.EmployeeVO)
	 */
	@Override
	public EmployeeVO addNewEmployee(EmployeeVO employeeVO) throws DataAccessException{
		return employeeDao.addNewEmployee(employeeVO);
	}

	/* (non-Javadoc)
	 * @see com.mrv.cps.service.EmployeeService#updateEmployee(com.mrv.cps.vo.EmployeeVO)
	 */
	@Override
	public EmployeeVO updateEmployee(EmployeeVO employeeVO) throws DataAccessException{
		return employeeDao.updateEmployee(employeeVO);
	}

	/* (non-Javadoc)
	 * @see com.mrv.cps.service.EmployeeService#deleteEmployee(java.lang.Integer)
	 */
	@Override
	public void deleteEmployee(Integer id) throws DataAccessException{
		employeeDao.deleteEmployee(id);
	}

	@Override
	public EmployeeVO findById(Integer id) throws DataAccessException {
		// TODO Auto-generated method stub
		return employeeDao.findById(id);
	}

	@Override
	public EmployeeVO findByName(String name) throws DataAccessException {
		// TODO Auto-generated method stub
		return employeeDao.findByName(name);
	}

}
