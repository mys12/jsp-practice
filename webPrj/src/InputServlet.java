

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InputServlet
 */
@WebServlet("/Input.do")
public class InputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InputServlet() {
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
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String sbirth = request.getParameter("birth");
		SimpleDateFormat tool = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date birth = null;
		try {
			birth = tool.parse(sbirth);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String[] hobbys = request.getParameterValues("hobby");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		int grade = Integer.parseInt(request.getParameter("grade"));
		String intro = request.getParameter("intro");
		String area = request.getParameter("area");
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title> input 예제 </title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h2>입력 정보 </h2>");
		out.printf("아이디 : %s<br>", id);
		out.printf("비밀번호 : %s<br>", pw);
		out.printf("생년월일 : %s<br>", birth.toString());
		HashMap<String,String> hobbyMap = new HashMap<>();
		hobbyMap.put("1", "독서");
		hobbyMap.put("2", "TV시청");
		hobbyMap.put("3", "게임");
		hobbyMap.put("4", "산책");
		out.print("취미: ");
		for(String key: hobbys) {
			out.print(hobbyMap.get(key)+ " ");
		}
		out.print("<br>");
		
		out.printf("성별 : %s<br>", gender.equals("1") ? "남" : "여");
		out.printf("이메일 : %s<br>", email);
		out.printf("연락처 : %s<br>", tel);
		out.printf("학년 : %d<br>", grade);
		out.print("자기소개<br>");
		out.printf("<pre>%s</pre><br>", intro);
		HashMap<String,String> areaMap = new HashMap<>();
		areaMap.put("1", "서울");
		areaMap.put("2", "경기도");
		areaMap.put("3", "충청도");
		areaMap.put("4", "강원도");
		out.printf("지역: %s<br>", areaMap.get(area));
		
		
		out.print("</body>");
		out.print("</html>");
		
	}

}
