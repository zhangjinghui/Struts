package com.zjh.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

@ParentPackage(value="struts-default")
@Action(value="user1")
@Results({
	@Result(name="login",location="/login.jsp"),
	@Result(name="register",location="/register.jsp")	
})
public class UserAction extends ActionSupport {
	public String login() throws Exception {
		return "login";
	}
	public String register() throws Exception {
		return "register";
	}
}
