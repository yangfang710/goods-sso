package com.goods.sso.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.goods.common.utils.GoodsResult;
import com.goods.pojo.TbUser;

public interface UserService {
	GoodsResult checkData(String content, Integer type);

	GoodsResult createUser(TbUser user);

	GoodsResult userLogin(String username, String password, HttpServletRequest request, HttpServletResponse response);

	GoodsResult getUserByToken(String token);
}
