package com.ontimize.bookstories.ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ontimize.bookstories.api.core.service.IBookService;
import com.ontimize.bookstories.api.core.service.IReviewService;
import com.ontimize.jee.server.rest.ORestController;
@RestController
@RequestMapping("/REVIEWS")
@ComponentScan(basePackageClasses={com.ontimize.bookstories.api.core.service.IReviewService.class})
public class ReviewRestController extends ORestController<IReviewService> {

	@Autowired
	private IReviewService reviewSrv;

	@Override
	public IReviewService getService() {
		return this.reviewSrv;
	}

}
