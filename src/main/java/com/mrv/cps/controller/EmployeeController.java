/**
 * 
 */
package com.mrv.cps.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.mrv.cps.service.EmployeeService;
import com.mrv.cps.utils.Constants;
import com.mrv.cps.vo.EmployeeVO;

/**
 * @author hungbang
 *
 */
@RestController
public class EmployeeController {
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	@Qualifier(Constants.EMPLOYEE_SERVICE)
	private EmployeeService employeeService;
	/**
	 * @author hungbang
	 * @return ResponseEntity with 
	 */
	@RequestMapping(value="/employee/", method= RequestMethod.GET)	
	public ResponseEntity<List<EmployeeVO>> getEmployeesList() throws DataAccessException{
		logger.info("getEmployeesList");
		List<EmployeeVO> employeeList = employeeService.getAllEmployeeList();
		if(employeeList.isEmpty()){
			return new ResponseEntity<List<EmployeeVO>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<EmployeeVO>>(employeeList, HttpStatus.OK);
	}
	
	@RequestMapping(value="/employee/{id}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EmployeeVO> getEmployee(@PathVariable int id) throws DataAccessException{
		logger.info("getEmployee function");
		EmployeeVO employeeVO = employeeService.findById(id);
		if(employeeVO == null){
			logger.info("Employee with id "+id+" not found");
			return new ResponseEntity<EmployeeVO>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<EmployeeVO>(employeeVO,HttpStatus.NOT_FOUND);
	}
	@RequestMapping(value="/employee/", method = RequestMethod.POST)
	public ResponseEntity<Void> addEmployee(@RequestBody EmployeeVO employeeVO, UriComponentsBuilder uriBuilder) throws DataAccessException{
		logger.info("--------create a employee -------------");
		employeeService.addNewEmployee(employeeVO);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uriBuilder.path("/employee/{id}").buildAndExpand(employeeVO.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/employee/{id}", method = RequestMethod.PUT)
	public ResponseEntity<EmployeeVO> updateEmployee(@PathVariable int id, @RequestBody EmployeeVO employeeVO) throws DataAccessException{
		logger.info("--------update employee--------------");
		EmployeeVO currentEmployee = employeeService.findById(id);
		if(currentEmployee == null){
			logger.info("-------------------employee current not found-------------");
			return new ResponseEntity<EmployeeVO>(HttpStatus.NOT_FOUND);
		}
		currentEmployee.setAddress(employeeVO.getAddress());
		currentEmployee.setEmail(employeeVO.getEmail());
		currentEmployee.setEmployeeName(employeeVO.getEmployeeName());
		
		employeeService.updateEmployee(currentEmployee);
		return new ResponseEntity<EmployeeVO>(currentEmployee, HttpStatus.OK);
	}
	@RequestMapping(value="/employee/{id}", method= RequestMethod.DELETE)
	public ResponseEntity<EmployeeVO> deleteEmployee(@PathVariable int id){
		logger.info("------------deleteEmployee----------------");
		
		EmployeeVO employeeVO = employeeService.findById(id);
		if(employeeVO == null){
			logger.info("----Employee not found-----------");
			return new ResponseEntity<EmployeeVO>(HttpStatus.NOT_FOUND);
		}
		employeeService.deleteEmployee(id);
		return new ResponseEntity<EmployeeVO>(HttpStatus.NO_CONTENT);
		
	}
}
