package com.ontimize.bookstories.api.core.service;


import java.util.List;
import java.util.Map;
import com.ontimize.db.EntityResult;


public interface IUserService {

	public EntityResult userQuery(Map<?, ?> keyMap, List<?> attrList);
	public EntityResult userInsert(Map<?, ?> attrMap);
	public EntityResult userUpdate(Map<?, ?> attrMap, Map<?, ?> keyMap);
	public EntityResult userDelete(Map<?, ?> keyMap);

}
