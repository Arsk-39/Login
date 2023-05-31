package jp.co.aforce.beans;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.DAOlogin;
import been.login;

/**
 * Servlet implementation class Login
 */
@WebServlet("/jsp/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("/Login/jsp/login.jsp");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	HttpSession session=request.getSession();
	String userid=request.getParameter("userid");
	String password=request.getParameter("password");
	
	DAOlogin dao = new DAOlogin();
	login login;
	try {
		login = dao.search(userid, password);
		if(login != null) {
			session.setAttribute("login",login);
			request.getRequestDispatcher("/jsp/top.jsp").forward(request, response);
		}else {
			session.setAttribute("errormsg", "ユーザIDもしはパスワードが違います。");
			response.sendRedirect("/Login/jsp/top.jsp");
		}
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
	}
