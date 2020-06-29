package com.ontimize.bookstories.model.core.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import com.ontimize.bookstories.api.core.service.IBookService;
import com.ontimize.bookstories.model.core.dao.BookDao;
import com.ontimize.db.EntityResult;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;


@Service("BookService")
@Lazy
public class BookService implements IBookService {

	@Autowired
	private BookDao bookDao;

	@Autowired
	private DefaultOntimizeDaoHelper daoHelper;

	public EntityResult bookQuery(Map<String, Object> keyMap, List<String> attrList) {
		return this.daoHelper.query(bookDao, keyMap, attrList);
	}
	public EntityResult bookdetailsQuery(Map<String, Object> keyMap, List<String> attrList) {
		return this.daoHelper.query(this.bookDao, keyMap, attrList, bookDao.QUERY_BOOK_DETAILS);
	}
	public EntityResult bookInsert(Map<String, Object> attrMap) {
		return this.daoHelper.insert(bookDao, attrMap);
	}

	public EntityResult bookUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) {
		return this.daoHelper.update(bookDao, attrMap, keyMap);
	}

	@Override
	public EntityResult bookDelete(Map<String, Object> keyMap) {
		return this.daoHelper.delete(this.bookDao, keyMap);
	}
	
	@Override
	public EntityResult bookauthorsQuery(Map<String, Object> keyMap, List<String> attrList) {
		return this.daoHelper.query(this.bookDao, keyMap, attrList, bookDao.BOOK_AUTHORS);
	}
	@Override
	public EntityResult bookreviewsQuery(Map<String, Object> keyMap, List<String> attrList) {
		return this.daoHelper.query(this.bookDao, keyMap, attrList, bookDao.BOOK_REVIEWS);
	}

}
