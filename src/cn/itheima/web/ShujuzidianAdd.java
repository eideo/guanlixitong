package cn.itheima.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itheima.domain.Shujuzidian;
import cn.itheima.service.ShujuzidianService;

/**
 * Servlet implementation class ShujuzidianAdd
 */
public class ShujuzidianAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShujuzidianAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String value = request.getParameter("value");
		ShujuzidianService service = new ShujuzidianService();
		try {
			service.add(name,value);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(3000);
			response.sendRedirect(request.getContextPath() + "/ShujuzidianList");
		} catch (Exception e) {
		}	
		//response.sendRedirect(request.getContextPath() + "/ShujuzidianList");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
