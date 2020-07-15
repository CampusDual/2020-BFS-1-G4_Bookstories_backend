package com.ontimize.bookstories.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Lazy
@Repository("BookOfListDao")
@ConfigurationFile(
	configurationFile = "dao/BookOfListsDao.xml",
	configurationFilePlaceholder = "dao/placeholders.properties")
public class BookOfListsDao extends OntimizeJdbcDaoSupport {

	public static final String LIST_LIST_ID = "list_list_id";
	public static final String BOOKS_BOOK_ID = "books_book_id";
	public static final String ESTADO = "estado";
	public static final String DATE_ADD = "date_add";
	public static final String QUERY_BOOK_AT_LIST = "bookatlist";
}
