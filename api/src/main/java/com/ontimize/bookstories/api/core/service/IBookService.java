package com.ontimize.bookstories.api.core.service;
import java.util.List;
import java.util.Map;
import com.ontimize.db.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;


public interface IBookService {
	//Book
	 public EntityResult bookQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;
	 public EntityResult booksbaseQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;
	 public EntityResult bookdetailsQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;
	 public EntityResult bookInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;
	 public EntityResult bookUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
	 public EntityResult bookDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
	 public EntityResult bookauthorsQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;
	 public EntityResult bookreviewsQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;

}
