package com.mrv.cps.controller;



import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mrv.cps.service.CustomerService;
import com.mrv.cps.utils.Constants;
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
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		List<CustomerVO> lstCustomerVO = customerService.getLstCustomer();
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		model.addAttribute("name", lstCustomerVO.get(0).getCustomerName());
		model.addAttribute("dob", lstCustomerVO.get(0).getBirthday());
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
}
