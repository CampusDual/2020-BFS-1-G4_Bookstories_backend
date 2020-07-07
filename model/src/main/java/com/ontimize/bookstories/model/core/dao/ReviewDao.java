package com.ontimize.bookstories.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Lazy
@Repository("ReviewDao")
@ConfigurationFile(
	configurationFile = "dao/ReviewDao.xml",
	configurationFilePlaceholder = "dao/placeholders.properties")
public class ReviewDao extends OntimizeJdbcDaoSupport {

	public static final String REVIEW_ID = "review_id";
	public static final String REVIEW_COMMENT = "comment";
	public static final String REVIEW_VALUE = "value";
	public static final String TUSERS_USER = "tusers_user";
	public static final String BOOKS_BOOK_ID = "books_book_id";
}
