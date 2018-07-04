package com.software.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;

/**
 * Servlet Filter implementation class login
 */
public class login implements Filter {

    /**
     * Default constructor. 
     */
    public login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;
		if(req.getRequestURI().indexOf("login.action")>=0 || req.getRequestURI().indexOf("abc.action")>=0  
				|| req.getRequestURI().indexOf("admin_login.action")>=0)
		
		
		

		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		else {
			if(req.getSession().getAttribute("user")!=null)
			{
				chain.doFilter(request, response);
			}else {
			 
				resp.sendRedirect(req.getContextPath()+"/login.jsp");
			}
				
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
