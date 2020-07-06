package com.ontimize.bookstories.model.core.service;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import com.ontimize.bookstories.model.core.dao.ReviewDao;
import com.ontimize.db.EntityResult;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;


@Service("ReviewService")
@Lazy
public class ReviewService implements com.ontimize.bookstories.api.core.service.IReviewService {

	@Autowired
	private ReviewDao reviewDao;

	@Autowired
	private DefaultOntimizeDaoHelper daoHelper;
	
	public EntityResult reviewQuery(Map<String, Object> keyMap, List<String> attrList) {
		return this.daoHelper.query(reviewDao, keyMap, attrList);
	}

	public EntityResult reviewInsert(Map<String, Object> attrMap) {
		return this.daoHelper.insert(reviewDao, attrMap);
	}

	public EntityResult reviewUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) {
		return this.daoHelper.update(reviewDao, attrMap, keyMap);
	}

	@Override
	public EntityResult reviewDelete(Map<String, Object> keyMap) {
		return this.daoHelper.delete(this.reviewDao, keyMap);
	}

}
