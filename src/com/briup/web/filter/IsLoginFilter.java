package com.briup.web.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/admin/*")
public class IsLoginFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//判断是否已经登录，如果已经登录自动跳转到主界面
		System.out.println("进入isLoginFilter");
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;
		Cookie[] cookies = req.getCookies();
		boolean isLogin = false;
		for (Cookie cookie : cookies) {
			if ("isLogin".equals(cookie.getName())
					&&cookie.getValue()!=null) {
				isLogin = true;
				System.out.println(cookie.getName()+"="+cookie.getValue());
				chain.doFilter(req, resp);
			}
		}
		if (!isLogin) {
			resp.sendRedirect(req.getContextPath() + "/login.jsp");
		}	
	}

	public void init(FilterConfig fConfig) throws ServletException {
	
	}

	@Override
	public void destroy() {
		
	}

}
