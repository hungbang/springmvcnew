/**
 * 
 */
package com.mrv.cps.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

/**
 * @author hungbang
 *
 */
@Controller
@RequestMapping("/")
public class IndexController {
	@RequestMapping(method= RequestMethod.GET)
	public String indexPage(){
		return "home";
	}
}
