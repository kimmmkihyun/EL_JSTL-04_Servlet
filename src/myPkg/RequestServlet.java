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
/* @~~~ : ������̼� 
 * @override
 * @WebServlet
 * ... ��
 */
//@WebServlet("/Request.do")   web.xmlȭ�Ͽ����� ���������ϴ�!!!! (��� �ΰ��� �Ѱ����� �ۼ��ؾ��Ѵ�)
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
	
	/* service �޼��尡 ���� ��쿡�� doGet or doPost �޼��带 ���� ȣ���ؾ� �ϴ� ���ŷο��� �����
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
		/* response.getWriter() : PrintWriter ��ü�� ����(���������� ����� �� �ְ� ���ִ� ����ٸ�) */
	
		PrintWriter pw = response.getWriter();
		pw.append("<h3>get��� ó��<h3>");
		pw.write("�����ٶ�");
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
