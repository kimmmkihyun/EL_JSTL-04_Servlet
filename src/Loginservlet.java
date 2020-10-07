

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Loginservlet
 */
//@WebServlet("/login.do")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginservlet() {
        super();
        System.out.println("Loginservlet()");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init()");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("destroy()");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");
		//doGet(request, response);
		
		
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		String[] hobby = request.getParameterValues("hobby");
		
		System.out.println("id : "+ id);
		System.out.println("passwd : "+ passwd);
		System.out.println("name : "+ name);
		System.out.println("addr : "+ addr);
		
		for(int i=0;i<hobby.length;i++) {
			System.out.print(hobby[i]+" " );
		}
		
		PrintWriter pw = response.getWriter(); //웹 브라우저에 나온다
		pw.print("아이디 : " + id + "<br>");
		pw.print("비밀번호 : " + passwd + "<br>");
		pw.print("회원명 : " + name + "<br>");
		pw.print("주소 : " + addr + "<br>");
		pw.print("취미 : ");
		for(int i=0;i<hobby.length;i++) {
			pw.print(hobby[i]+" ");
		}
	
	
	}

}
