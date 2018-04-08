package com.enesmumu.nba.platform.user.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.enesmumu.nba.base.Constant;
import com.enesmumu.nba.base.ResultBean;
import com.enesmumu.nba.base.ResultData;
import com.enesmumu.nba.platform.user.pojo.User;
import com.enesmumu.nba.platform.user.service.IUserService;

@Controller
@RequestMapping(value = "ul/")
public class UserLogin_Controller {
	private static Logger logger = Logger.getLogger(UserLogin_Controller.class);
	@Autowired
	@Qualifier("user")
	private IUserService userService;
	@Autowired
	private HttpSession session;

	/**
	 * 注册接口
	 * 
	 * @param name
	 * @param password
	 * @return
	 */
	@ResponseBody
	@GetMapping(value = "register.do")
	// @RequestMapping(value = "login.do", method = RequestMethod.GET)
	public ResultBean register(@RequestParam("name") String name, @RequestParam("password") String password) {
		return new ResultBean<Boolean>(userService.register(name, password));
	}

	/**
	 * 登录接口
	 * 
	 * @param name
	 * @param password
	 * @return
	 */
	@ResponseBody
	@GetMapping(value = "login.do")
	// @RequestMapping(value = "login.do", method = RequestMethod.GET)
	public ResultData login(@RequestParam("name") String name, @RequestParam("password") String password) {
		SimpleDateFormat bartDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		ResultData resultData = new ResultData();
		try {
			Map<String, String> p = new HashMap<String, String>();
			p.put("userName", name);
			p.put("password", password);
			List<User> userList = userService.findByParams(p);
			if (userList != null && userList.size() > 0) {
				session.setAttribute(session.getId(), userList.get(0));
				session.setMaxInactiveInterval(900);
				resultData.setCode(Constant.SUCCESS);
			} else {
				resultData.setCode(Constant.FAILED);
			}
		} catch (Exception e) {
			logger.error("时间：" + bartDateFormat.format(new Date()) + "  事件：登陆失败", e);
			resultData.setCode(Constant.FAILED);
		}
		return resultData;
	}

	/**
	 * 注销接口
	 */
	@ResponseBody
	@GetMapping(value = "logout.do")
	public void login() {
		session.invalidate();
	}
}
