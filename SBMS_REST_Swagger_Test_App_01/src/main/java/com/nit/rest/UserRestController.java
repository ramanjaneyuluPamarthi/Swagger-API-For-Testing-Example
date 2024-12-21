package com.nit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nit.binders.UserBinders;

@RestController

public class UserRestController {

	@PostMapping(value="/swagger")
	public ResponseEntity<UserBinders> getDetails(@RequestBody UserBinders binders){
	//	UserBinders binders = new UserBinders();
		System.out.println(binders);
		return new ResponseEntity<UserBinders>(binders,HttpStatus.OK);
	}
}
