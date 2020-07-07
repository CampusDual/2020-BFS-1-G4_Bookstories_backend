package com.ontimize.bookstories.api.core.service;
import java.util.List;
import java.util.Map;
import com.ontimize.db.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;


public interface IListService {
	//Book
	 public EntityResult listQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;
	 public EntityResult listsQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;

	 public EntityResult listInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;
	 public EntityResult listUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
	 public EntityResult listDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

}
