package com.ontimize.bookstories.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Lazy
@Repository("ListDao")
@ConfigurationFile(
	configurationFile = "dao/ListDao.xml",
	configurationFilePlaceholder = "dao/placeholders.properties")
public class ListDao extends OntimizeJdbcDaoSupport {

	public static final String LIST_ID = "list_id";
	public static final String LIST_USER = "tusers_user";
	public static final String LIST_NAME = "lib_name";
	public static final String LIST_CREATION_DATE = "creation_date";
	public static final String LIST_DESCRIPCION = "lib_name";
	public static final String LIST_TYPE = "idtype_of_list";
	public static final String QUERY_LIST = "lists";

	
}
