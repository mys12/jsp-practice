

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NumberServlet
 */
@WebServlet("/Number.do")
public class NumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NumberServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int num1 = Integer.parseInt(request.getParameter("a"));
		int num2 = Integer.parseInt(request.getParameter("b"));
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title> HOMEWORK </title>");
		out.print("</head>");
		out.print("<body>");

		for(int i=1; i<=num1; i++) {
			int cnt=0;
			for(int j=1; j<=i; j++) {
				if(i%j == 0) {
					cnt++;
				}
			}
			if(cnt == 1||cnt == 2) {
				out.printf("%d ",i);
			}
		}

		out.print("<br>");

		out.print(num2%2 == 0  ? "짝수" : "홀수");

		out.print("</body>");
		out.print("</html>");
	}

}
