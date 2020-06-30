package com.ontimize.bookstories.api.core.service;
import java.util.List;
import java.util.Map;
import com.ontimize.db.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface IAuthorService {
	
	
	// Author
	 public EntityResult authorQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;
	 public EntityResult authorInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;
	 public EntityResult authorUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
	 public EntityResult authorDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
	 public EntityResult authorbooksQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;

}
