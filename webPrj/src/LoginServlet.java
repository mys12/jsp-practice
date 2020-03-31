

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession();
		session.invalidate();
		request.setAttribute("message", "로그아웃 되었습니다.");
		request.getRequestDispatcher("/Login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id= request.getParameter("id");
		String pw =request.getParameter("pw");
		String url = "";
		if(id.equals("mys") && pw.equals("0000")) {
			HttpSession session = request.getSession();
			session.setAttribute("userid", id);
//			session.setMaxInactiveInterval(3600);
			Cookie c1 = new Cookie("id", id);
			Cookie c2 = new Cookie("pw", pw);
//			c1.setMaxAge(1);
			response.addCookie(c1); response.addCookie(c2);
			response.sendRedirect("/DataIndex.jsp");
			return;
		}else {
			request.setAttribute("message", "아이디 또는 비밀번호가 다릅니다.");
			url = "/Login.jsp";
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

}
