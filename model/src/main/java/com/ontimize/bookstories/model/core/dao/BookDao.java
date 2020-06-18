package com.ontimize.bookstories.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Lazy
@Repository("BookDao")
@ConfigurationFile(
	configurationFile = "dao/BookDao.xml",
	configurationFilePlaceholder = "dao/placeholders.properties")
public class BookDao extends OntimizeJdbcDaoSupport {

	public static final String BOOK_ID = "book_ID";
	public static final String BOOK_TITLE = "book_Title";
	public static final String BOOK_LANGUAGE = "language_idlanguage";
	public static final String QUERY_BOOK_DETAILS = "bookdetails";
}
