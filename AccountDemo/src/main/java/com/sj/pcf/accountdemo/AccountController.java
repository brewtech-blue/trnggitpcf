package com.sj.pcf.accountdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;
	
	@RequestMapping("/create")
	public void createAccount(Account a) {
		accountRepository.save(a);
	}
	
	@RequestMapping("/all")
	public Iterable<Account> getAll(){
		return accountRepository.findAll();
	}
	
}
