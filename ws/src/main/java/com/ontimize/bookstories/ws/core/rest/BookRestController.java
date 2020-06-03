package com.ontimize.bookstories.ws.core.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ontimize.bookstories.api.core.service.IBookService;
import com.ontimize.jee.server.rest.ORestController;


@RestController
@RequestMapping("/books")
@ComponentScan(basePackageClasses={com.ontimize.bookstories.api.core.service.IBookService.class})
public class BookRestController extends ORestController<IBookService> {

	@Autowired
	private IBookService bookSrv;

	@Override
	public IBookService getService() {
		return this.bookSrv;
	}

}
