/**
 * 
 */
package com.mrv.cps.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author hungbang
 *
 */
@Controller
public class CPSMergeController {
	private static final Logger logger = LoggerFactory.getLogger(CPSMergeController.class);
	
	@RequestMapping(value = "/upcinfordatagrid", method = RequestMethod.GET)
	public String upcInformation(){
		return "upcinformation.tile";
	}
}
