package com.ontimize.bookstories.model.core.dao;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;
import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;
@Repository("AuthorDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/AuthorDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class AuthorDao extends OntimizeJdbcDaoSupport {

}
