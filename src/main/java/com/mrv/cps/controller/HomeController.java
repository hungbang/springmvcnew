package com.mrv.cps.controller;



import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	@Qualifier(Constants.CUSTOMER_SERVICE)
	private CustomerService customerService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		List<CustomerVO> lstCustomerVO = customerService.getLstCustomer();
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		model.addAttribute("name", lstCustomerVO.get(0).getCustomerName());
		model.addAttribute("dob", lstCustomerVO.get(0).getBirthday());
		model.addAttribute("serverTime", formattedDate );
		
		return "home.tile";
	}
	
	@RequestMapping(value = "/dataCustomer", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String getDataForTable(Locale locale,HttpServletRequest req) throws IOException{
		logger.info("function get data for Table", locale);
		Integer pageNumber = 0;
		if(null != req.getParameter("iDisplayStart")){
			pageNumber = (Integer.valueOf(req.getParameter("iDisplayStart"))/10)+1;
		}
		String searchParameter = req.getParameter("sSeach");
		Integer pageDisplayLength = Integer.valueOf(req.getParameter("iDisplayLength"));
		
		List<CustomerVO> customerList =  customerService.getLstCustomer();
		
		
		
		CustomerJsonObject customerJsonObject = new CustomerJsonObject();
		customerJsonObject.setiTotalRecords(500);
		customerJsonObject.setiTotalDisplayRecords(500);
		customerJsonObject.setAaData(customerList);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json2 = gson.toJson(customerJsonObject);
		
		return json2;
	}
		
}
