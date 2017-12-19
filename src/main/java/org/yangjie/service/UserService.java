package org.yangjie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yangjie.dao.UserDao;

@Service	// 注解为service层spring管理bean
public class UserService {

	@Autowired
	private UserDao userDao;
	
	/**
	 * 验证用户密码
	 * @param username
	 * @param password
	 * @return
	 */
	public boolean checkUser(String username, String password){
		return userDao.selectByUsernameAndPassword(username, password) != null;
	}
	
}
