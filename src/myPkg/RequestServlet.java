package myPkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestServlet
 */
/* @~~~ : 어노테이션 
 * @override
 * @WebServlet
 * ... 등
 */
//@WebServlet("/Request.do")   web.xml화일에서도 설정가능하다!!!! (대신 두곳중 한곳에만 작성해야한다)
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestServlet() {
        super();
        System.out.println("RequestServlet()");
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
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	
	/* service 메서드가 있을 경우에는 doGet or doPost 메서드를 직접 호출해야 하는 번거로움이 생긴다
	 * new HttpServletRequest()
	 * new HttpServletResponse()
	 *  */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service()");
		String  method = request.getMethod();
		System.out.println("method : " + method);
		
		
		if(method.equalsIgnoreCase("get")) {
			doGet(request, response);
		}
		
		else { //POST
			doPost(request, response);
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()");
		
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		/* response.getWriter() : PrintWriter 객체를 리턴(웹브라우저에 출력할 수 있게 해주는 연결다리) */
	
		PrintWriter pw = response.getWriter();
		pw.append("<h3>get방식 처리<h3>");
		pw.write("가나다라");
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");
		doGet(request, response);
	}

}
