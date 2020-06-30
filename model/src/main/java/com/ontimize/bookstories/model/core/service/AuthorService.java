package com.ontimize.bookstories.model.core.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.ontimize.db.EntityResult;
import com.ontimize.bookstories.api.core.service.IAuthorService;
import com.ontimize.bookstories.model.core.dao.AuthorDao;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;

@Service("AuthorService")
@Lazy
public class AuthorService implements IAuthorService {
	@Autowired
	private AuthorDao authorDao;
	@Autowired
	private DefaultOntimizeDaoHelper daoHelper;

	@Override
	public EntityResult authorQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.authorDao, keyMap, attrList);
	}

	@Override
	public EntityResult authorInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.insert(this.authorDao, attrMap);
	}

	@Override
	public EntityResult authorUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.authorDao, attrMap, keyMap);
	}

	@Override
	public EntityResult authorDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.authorDao, keyMap);
	}
	
	@Override
	public EntityResult authorbooksQuery(Map<String, Object> keyMap, List<String> attrList) {
		return this.daoHelper.query(this.authorDao, keyMap, attrList, authorDao.AUTHOR_BOOKS);
	}

}
