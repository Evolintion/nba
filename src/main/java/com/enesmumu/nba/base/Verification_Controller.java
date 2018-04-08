package com.enesmumu.nba.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** 
 * 控制访问Controller
 *
 * @author 作者:BoXuelin
 * @date 创建时间：2017年8月17日
 * @version 1.0
 */
@Controller
@RequestMapping(value = "")
public class Verification_Controller {
	private static Logger logger = Logger.getLogger(Verification_Controller.class);
	@Autowired
	private HttpSession session;
	@Autowired
	private HttpServletRequest request;  
	
	
	/**
	 * 用户控制访问
	 * 
	 * @param url
	 * @return
	 */
	@RequestMapping(value = "{folder}/{path}.shtml", method = RequestMethod.GET)
	public String folderVerification(@PathVariable String folder,@PathVariable String path) {
		try {
			return folder+"/"+path;
		}catch(Exception e) {
			return "error";
		}
	}
	
	/**
	 * 用户控制访问
	 * 
	 * @param url
	 * @return
	 */
	@RequestMapping(value = "{path}.shtml", method = RequestMethod.GET)
	public String fileVerification(@PathVariable String path) {
		try {
			return path;
		}catch(Exception e) {
			return "error";
		}
	}

}
