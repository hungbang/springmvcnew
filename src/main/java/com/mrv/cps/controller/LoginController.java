/**
 * 
 */
package com.mrv.cps.controller;

import java.sql.SQLException;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mrv.cps.dao.AccountDAO;
import com.mrv.cps.daoImpl.AccountDAOImpl;
import com.mrv.cps.service.AccountService;
import com.mrv.cps.utils.Constants;
import com.mrv.cps.vo.AccountVO;

/**
 * @author PC
 * 
 */
@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory
			.getLogger(PostExamController.class);
	@Autowired
	@Qualifier(Constants.ACCOUNT_SERVICE)
	private AccountService accountService;

	/*@RequestMapping(value = "/toLogin", method = RequestMethod.POST)
	public String login(Locale locale, Model model, @ModelAttribute("account") AccountVO acc,@RequestParam("username") String userName,@RequestParam("roleId") int roleId) {
		AccountDAO accDao =new AccountDAO();
		RoleDAO roleDao= new RoleDAO();
		
		RoleVO role = roleDao.finById(roleId);
		accDao.RoleVO(role);
		logger.info("---------Login Account-------------");
		return "login.tile";
	}*/
	@RequestMapping(value="/select", method = RequestMethod.GET)
	public String selectUse(Locale locale, Model model){
		return "selectUser.tile";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String toLogin(Locale locale, Model model) {
		
		return "login.tile";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String doLogin(Locale locale, Model model, @RequestParam("username") String username,@RequestParam("password") String password ) throws DataAccessException, SQLException {
		logger.info("========username============="+ username);
		logger.info("========password============="+ password);
		try{
			accountService.isValidUser(username, password);
		}catch(Exception e){
			logger.info("==========Exception=================="+ e);
		}
		if(accountService.isValidUser(username, password)!=null ){
			return "selectUser.tile";
		}
		else{
			return "login.tile";
		}
	}
	
	
	
	
}
