package com.mrv.cps.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mrv.cps.service.CustomerService;
import com.mrv.cps.utils.Constants;
import com.mrv.cps.utils.CustomerJsonObject;
import com.mrv.cps.vo.CustomerVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	@Autowired
	@Qualifier(Constants.CUSTOMER_SERVICE)
	private CustomerService customerService;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		List<CustomerVO> lstCustomerVO = new ArrayList<CustomerVO>();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);
		String checkErrorMess = null;
		try{
			lstCustomerVO = customerService.getLstCustomer();
			Date date = new Date();
			String formattedDate = dateFormat.format(date);
			model.addAttribute("name", lstCustomerVO.get(0).getCustomerName());
			model.addAttribute("dob", lstCustomerVO.get(0).getBirthday());
			model.addAttribute("serverTime", formattedDate);
		}catch(Exception e){
			logger.info("error when get database"+ e.getMessage());
			checkErrorMess = e.getMessage().replaceAll("\n", " ");
		}
		model.addAttribute("error", checkErrorMess);
		return "home.tile";
	}
	@RequestMapping(value = "/table", method = RequestMethod.GET)
	public String table(Locale locale, Model model) {
		logger.info("Welcome table! The client locale is {}.", locale);
		
		return "table.tile";
	}
	@RequestMapping(value="/employee", method= RequestMethod.GET)	
	public String employee(Locale locale, Model model){
		logger.info("employee management function");
		return "employee.tile";
	}
	
	/**
	 * @author hungbang
	 * @param req
	 * @return json
	 * @throws IOException
	 */
	@RequestMapping(value = "/dataCustomer", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody
	String getDataForTable(HttpServletRequest req)
			throws IOException {
		logger.info("function get data for Table");
		List<CustomerVO> customerList = new ArrayList<CustomerVO>();
		Integer pageNumber = 0;
		Integer pageDisplayLength = 0;
		String checkError = null;
		String searchParameter = req.getParameter("sSearch");
		if (null != req.getParameter("iDisplayStart")) {
			logger.info("111111111: "+ req.getParameter("iDisplayStart"));
			//add more +1 if using Hibernate , else not need. 
			//pageNumber = (Integer.valueOf(req.getParameter("iDisplayStart")) / 10) + 1;
			pageNumber = Integer.valueOf(req.getParameter("iDisplayStart"));
		}
		if(null != req.getParameter("iDisplayLength")){
			logger.info("222222222:: "+ req.getParameter("iDisplayLength"));
			pageDisplayLength = Integer.valueOf(req
					.getParameter("iDisplayLength"));
			
		}
		
		
		// List<CustomerVO> customerList = customerService.getLstCustomer();
		try {
			customerList = customerService.getCustomerListForPaging(pageNumber,
					pageDisplayLength);
		} catch (Exception e) {
			logger.info(e.getMessage(), e);
			checkError = e.getMessage().replaceAll("\n", " ");
		}
		if(customerList.size() >0){
			for (CustomerVO customerVO : customerList) {
				logger.info("ssssss"+ customerVO.getCustomerName());
			}
		}
		customerList = getListBasedOnSearchParameter(searchParameter,
				customerList);
		
		if(customerList.size() >0){
			for (CustomerVO customerVO : customerList) {
				logger.info("xxxxx"+ customerVO.getCustomerName());
			}
		}
		CustomerJsonObject customerJsonObject = new CustomerJsonObject();
		Integer totalRecord = 0;
		totalRecord = customerService.getTotalRecord();
		customerJsonObject.setiTotalRecords(totalRecord);
		customerJsonObject.setiTotalDisplayRecords(totalRecord);
		customerJsonObject.setAaData(customerList);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json2 = gson.toJson(customerJsonObject);
		logger.info("this is json string: "+ json2);
		return json2;
	}
	/**
	 * @author hungbang
	 * @param searchParameter
	 * @param customerList
	 * @return List<CustomerVO>
	 */
	private List<CustomerVO> getListBasedOnSearchParameter(
			String searchParameter, List<CustomerVO> customerList) {
		logger.info("4444444444::: "+ searchParameter);
		if (null != searchParameter && !searchParameter.equals("")) {
			List<CustomerVO> customerListForSearch = new ArrayList<CustomerVO>();
			searchParameter = searchParameter.toUpperCase();
			for (CustomerVO cus : customerList) {
				if (cus.getAddress().toUpperCase().indexOf(searchParameter) != -1
						|| cus.getBirthday().toUpperCase()
								.indexOf(searchParameter) != -1
						|| cus.getCustomerId().toString()
								.indexOf(searchParameter) != -1
						|| cus.getCustomerName().toUpperCase()
								.indexOf(searchParameter) != -1
						|| cus.getEmail().toUpperCase()
								.indexOf(searchParameter) != -1) {
					customerListForSearch.add(cus);
				}
			}
			if(customerListForSearch.size() > 0){
				customerList = customerListForSearch;
			}
			customerListForSearch = null;
		}
		return customerList;
	}
	
	
	
}
