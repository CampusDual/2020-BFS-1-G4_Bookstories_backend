package com.ontimize.bookstories.model.core.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import com.ontimize.bookstories.api.core.service.IListService;
import com.ontimize.bookstories.model.core.dao.ListDao;
import com.ontimize.db.EntityResult;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;


@Service("ListService")
@Lazy
public class ListService implements IListService {

	@Autowired
	private ListDao listDao;

	@Autowired
	private DefaultOntimizeDaoHelper daoHelper;
	
	public EntityResult listQuery(Map<String, Object> keyMap, List<String> attrList) {
		return this.daoHelper.query(listDao, keyMap, attrList);
	}
	
	public EntityResult listsQuery(Map<String, Object> keyMap, List<String> attrList) {
		return this.daoHelper.query(listDao, keyMap, attrList,ListDao.QUERY_LIST);
	}
	
	public EntityResult listInsert(Map<String, Object> attrMap) {
		return this.daoHelper.insert(listDao, attrMap);
	}

	public EntityResult listUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) {
		return this.daoHelper.update(listDao, attrMap, keyMap);
	}

	@Override
	public EntityResult listDelete(Map<String, Object> keyMap) {
		return this.daoHelper.delete(this.listDao, keyMap);
	}
	
	

}
