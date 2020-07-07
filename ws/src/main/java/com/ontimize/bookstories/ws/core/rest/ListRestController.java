package com.ontimize.bookstories.ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ontimize.bookstories.api.core.service.IBookService;
import com.ontimize.bookstories.api.core.service.IListService;
import com.ontimize.jee.server.rest.ORestController;
@RestController
@RequestMapping("/LISTS")
@ComponentScan(basePackageClasses={com.ontimize.bookstories.api.core.service.IListService.class})
public class ListRestController extends ORestController<IListService> {

	@Autowired
	private IListService listSrv;

	@Override
	public IListService getService() {
		return this.listSrv;
	}

}
