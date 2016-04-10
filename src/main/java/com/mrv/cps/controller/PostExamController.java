/**
 * 
 */
package com.mrv.cps.controller;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.UriComponentsBuilder;

import com.mrv.cps.service.AccountService;
import com.mrv.cps.utils.Constants;
import com.mrv.cps.vo.AccountVO;
import com.mrv.cps.vo.EmployeeVO;

/**
 * @author PC
 *
 */
@Controller
public class PostExamController {
	private static final Logger logger = LoggerFactory
			.getLogger(PostExamController.class);

	@Autowired
	@Qualifier(Constants.ACCOUNT_SERVICE)
	private AccountService accountService;

	
	@RequestMapping(value="/toan", method = RequestMethod.GET)
	public String getAllAcc(Locale locale, Model model){
		logger.info("---------get All Account-------------");
		List<AccountVO> acc = accountService.getLstAccount() ;
		model.addAttribute("Toan",acc);
		return "getAllAccount.tile";
	}
	@RequestMapping(value="/createAccount", method = RequestMethod.POST)
	public ResponseEntity<Void> addAccount(@RequestBody AccountVO accountVO, UriComponentsBuilder uriBuilder) throws DataAccessException{
		logger.info("--------create a employee -------------");
		accountService.addNewAccount(accountVO);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uriBuilder.path("/account/{id}").buildAndExpand(accountVO.getAccountId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
//	@RequestMapping(value="/accountAction/{id}", method = RequestMethod.GET)
//	public String accountAction(Locale locale, Model model, @PathVariable int id){
//		logger.info("---------accountAction-------------"+id);
//		
//		model.addAttribute("data", "hahahahhaahahahah");
//		return "data";
//	}
	
	@RequestMapping(value="/accountAction/{id}", method = RequestMethod.POST)
	  public @ResponseBody AccountVO post( @RequestBody final  AccountVO person) {    
	 
	      person.setAccountId(12);
	      person.setUsername("Toan Nguyen");
	      return person;
	  }
	
	
	
}
