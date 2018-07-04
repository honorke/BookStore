package com.software.controller;

import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.UsesSunHttpServer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.software.entity.Admin;
import com.software.entity.BookTitle;
import com.software.entity.Business;
import com.software.entity.Remark;
import com.software.entity.User;
import com.software.entity.cart;
import com.software.service.Admin_service;
import com.software.service.BookTitle_service;
import com.software.service.Business_service;
import com.software.service.Cart_service;
import com.software.service.Remark_service;
import com.software.service.User_service;
import com.software.utils.Md5;
import com.software.utils.SearchInfo;
import com.software.utils.User_state;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import jdk.nashorn.internal.ir.RuntimeNode.Request;


@Controller
@RequestMapping("BookTitle")
public class BookTitle_controller {
	
	@Autowired
	BookTitle_service bs;
	@Autowired
	Remark_service rs;
	
	@Autowired
	User_service us;
	
	@Autowired
	Cart_service cs;
	
	@Autowired
	Business_service bus;
	
	
	@Autowired
	Admin_service as;
	
	
	
	@RequestMapping("/index1")
	public String select(ModelMap m, Integer pageno) {
		SearchInfo info = new SearchInfo();
		info.setPageno(pageno);
		
		m.put("BookTitle_list", bs.select(info));
		m.put("searchinfo",info);
		return "BookTitle/index1";
	}
	
	//这是新的 替代上边的index1  是从index中传入，查询所有的英语书籍
	@RequestMapping("select_English")
	public String select_English(ModelMap m) {
		m.put("BookTitle_list", bs.select_English());
		
		return "BookTitle/index1";
		
	}
	//查询书籍 0是英语 1是计算机
	@RequestMapping(value = "select_Book")
	public String select_Book(ModelMap m, int classNo) {
		m.put("BookTitle_list",bs.select_Book(classNo));
		System.out.println("Hello, world");
		return "BookTitle/index2";
		
	}
	
	@RequestMapping("/admin_index")
	public String admin_select(ModelMap m, Integer pageno) {
		SearchInfo info = new SearchInfo();
		info.setPageno(pageno);
		m.put("book_list", bs.select(info));
		return "BookTitle/admin_index1";
		
	}
	@RequestMapping(value = "selectBook_by_id")
	public String select2(ModelMap m, int  book_id, int book_no)
	{
		m.put("BookId_list",bs.selectBook_by_id( book_id) );
		m.put("Book_Remark_list", rs.selectRemark_by_no(book_no));
		System.out.println(rs.selectRemark_by_no(book_no));
		return "Book/index1";
	}
	
	//注册
	@RequestMapping("/abc")
	public String register(User u, String code, HttpServletRequest req) {
		System.out.println("Hello, worlds");
		System.out.println(u.getName());
		System.out.println("Password = "+u.getPassword());
		String ran = req.getSession().getAttribute("randomCode").toString();
		if(ran.equalsIgnoreCase(code)) {
			u.setPassword(Md5.MD5(u.getPassword()));
			
			us.insertUser(u);
			//System.out.println(u.toString());
			System.out.println("True Code in register");
			return "redirect:../login.jsp";
			
			
			
			
			
		}
		
		
		return "redirect:../login.jsp";
		
	}
	
	
	@RequestMapping("/login")
	public String login(String name, String password, String code, HttpServletRequest req) {
		String ran = req.getSession().getAttribute("randomCode").toString();
		System.out.println(ran);
		System.out.println("code = "+code);
		System.out.println("password= "+password);
		
		if(ran.equalsIgnoreCase(code)) {
			String pass = Md5.MD5(password);
			System.out.println(Md5.MD5(password));
			/**
			 * admin 123
			 * password afslk
			 */
			//String md_password = us.selectUser_by_name(name).getPassword();
			System.out.println(name);
			User u_md = us.selectUser_by_name(name);
			System.out.println(u_md);
			String md_password = "";
			if(u_md!=null) {
				md_password = u_md.getPassword();
			}
			System.out.println("md  =  "+ md_password);
			System.out.println("pass = "+pass);
			
			
			
			if(md_password.equalsIgnoreCase(pass))
			
			{
				req.getSession().setMaxInactiveInterval(10000);
				req.getSession().setAttribute("user", name);
				System.out.println("True Code in login in");
				return "redirect:../index.jsp";
			}
				
			
		}
		return "redirect:../login.jsp";
	}
	
	
	
	@RequestMapping("/admin_login")
	public String admin_login(String name, String password, String code, HttpServletRequest req) {
		String ran = req.getSession().getAttribute("randomCode").toString();
		System.out.println(ran);
		System.out.println("code = "+code);
		System.out.println("password= "+password);
		
		if(ran.equalsIgnoreCase(code)) {
			String pass = Md5.MD5(password);
			System.out.println(Md5.MD5(password));
			/**
			 * admin 123
			 * password afslk
			 */
			//String md_password = us.selectUser_by_name(name).getPassword();
			System.out.println(name);
			Admin u_md = as.select_admin_by_name(name);
			System.out.println(u_md);
			String md_password = "";
			if(u_md!=null) {
				md_password = u_md.getPassword();
			}
			System.out.println("md  =  "+ md_password);
			System.out.println("pass = "+pass);
			
			
			
			if(md_password.equalsIgnoreCase(pass))
			
			{
				req.getSession().setMaxInactiveInterval(10000);
				req.getSession().setAttribute("user", name);
				System.out.println("True Code in login in");
				return "redirect:../admin_index.jsp";
			}
				
			
		}
		return "redirect:../admin.jsp";
	}
	
	@RequestMapping(value = "addcart")
	public String addcart_book(ModelMap m, HttpServletRequest res, cart c) {
		
		cs.insert_cart(c);
		
		return  select_cart(c.getUsername(), m);
	}
	
	@RequestMapping("select_cart")
	public String select_cart(String username, ModelMap m) {
		//cs.select_cart_by_name(name);
		m.put("user_cart_list", cs.select_cart_by_name(username));
		m.put("book_list", bs.select(null));
		System.out.println("username" + cs.select_cart_by_name(username));
		return "Cart/index1";
		
	}
	
	@RequestMapping("select_cart_1")
	public String select_cart_2(HttpServletRequest res, ModelMap m) {
		String name = res.getSession().getAttribute("user").toString();
		
		return select_cart(name,m);
		
		
	}
	
	@RequestMapping("delete_cart")
	public String delete_cart(@Param("username")String username,@Param("uclid") int uclid, ModelMap m) {
		cs.delete_cart(uclid);
		return select_cart(username, m);
	      
	}
	
	@RequestMapping("delete_cart_money")
	public String delete_cart_money(@Param("username")String username,@Param("uclid") int uclid, ModelMap m, HttpServletRequest res) {
		bus.delete_business_id(uclid);
		return accept_wait(res,  m) ;
	      
	}
	
	
	@RequestMapping("/admin_delete_cart_money")
	public String admin_delete_cart_money(@Param("username")String username,@Param("uclid") int uclid, ModelMap m, HttpServletRequest res) {
		bus.delete_business_id(uclid);
		return give_wait(m) ;
	      
	}
	
	
	
	@RequestMapping("pay_cart")
	public String pay_cart(@Param("username")String username,@Param("bookId") int bookId, ModelMap m) {
		System.out.println("username in paycart" + username);
		User u = us.selectUser_by_name(username);
		System.out.println("user "+u + " "+username);
		Business b = new Business();
		b.setBookid(bookId);
		b.setState(0);
		b.setUseraddress(u.getAddress());
		b.setUsername(u.getName());
		b.setUserphone(u.getPhone());
		
		bus.insert_business(b);
		System.out.println("insert success ful");
		
		
		
		
		return wait_accept_1(username, m);
	}
	
	@RequestMapping("wait_accept")
	public String wait_accept_1(String username, ModelMap m) {
		User_state state1 = new User_state();
		User_state state2 = new User_state();
		
		
		state1.setState(0);
		state1.setUsername(username);
		
		state2.setState(1);
		state2.setUsername(username);
		
		m.put("book_list_1", bs.select(null));
		
		m.put("wait_accept_0", bus.select_state(state1));
		
		m.put("wait_accept_1",bus.select_state(state2));
		
		return "Cart/waitAccept";
		
		
	}
	
	@RequestMapping("/accept_wait")
	public String accept_wait(HttpServletRequest res, ModelMap m) {
		String username = res.getSession().getAttribute("user").toString();
		User_state state1 = new User_state();
		User_state state2 = new User_state();
		
		
		state1.setState(0);
		state1.setUsername(username);
		
		state2.setState(1);
		state2.setUsername(username);
		
		m.put("book_list_1", bs.select(null));
		
		m.put("wait_accept_0", bus.select_state(state1));
		
		m.put("wait_accept_1",bus.select_state(state2));
		
		return "Cart/waitAccept";
		
	}
	
	
	@RequestMapping("/give_wait")
	public String give_wait(ModelMap m) {
		
		User_state state1 = new User_state();
		User_state state2 = new User_state();
		
		
		
		
		m.put("give_book_list_1", bs.select(null));
		
		m.put("give_accept_0", bus.select_state_no(0));
		
		//m.put("wait_accept_1",bus.select_state(state2));
		
		return "Cart/admin_waitAccept";
		
	}
	
	@RequestMapping("/end_wait")
	public String end_wait(ModelMap m) {
		
		User_state state1 = new User_state();
		User_state state2 = new User_state();
		
		
		
		
		m.put("end_book_list_1", bs.select(null));
		
		m.put("end_accept_0", bus.select_state_no(1));
		
		//m.put("wait_accept_1",bus.select_state(state2));
		
		return "Cart/admin_endAccept";
		
	}
	
	
	@RequestMapping(value = "admin_update_cart")
	public String admin_update_cart(int uclid, ModelMap m) {
		bus.update_business_id(uclid);
		return give_wait(m);
		
	}
	
	//管理员修改书籍
	@RequestMapping("/admin_edit")
	public String admin_edit(BookTitle b, ModelMap m) {
		bs.updateBook(b);
		
		return admin_select(m, null);
	}
	
	@RequestMapping("/give_remark")
	public String  give_remark(ModelMap m, Remark r,HttpServletRequest res) {
		rs.insert_remark(r);
		return accept_wait( res,  m);
	}
	
	

}
