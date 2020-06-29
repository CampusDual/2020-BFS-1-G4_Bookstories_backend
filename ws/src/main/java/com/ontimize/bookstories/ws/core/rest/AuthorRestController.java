package com.ontimize.bookstories.ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ontimize.bookstories.api.core.service.IAuthorService;
import com.ontimize.jee.server.rest.ORestController;
@RestController
@RequestMapping("/AUTHORS")
@ComponentScan(basePackageClasses ={com.ontimize.bookstories.api.core.service.IAuthorService.class })
public class AuthorRestController extends ORestController<IAuthorService> {

	 @Autowired
	 private IAuthorService authorService;

	 @Override
	 public IAuthorService getService() {
	  return this.authorService;
	 }
	
	
}
