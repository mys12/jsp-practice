

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
      String action = request.getParameter("action");
      if(action.equals("prime")) {
    	  int num = Integer.parseInt(request.getParameter("number"));
    	  response.setContentType("text/html;charset=UTF-8");
    	  PrintWriter out = response.getWriter();
    	  out.print("<html>");
    	  out.print("<head>");
    	  out.print("<title> HOMEWORK </title>");
    	  out.print("</head>");
    	  out.print("<body>");
    	  out.print("1부터" + num+"까지의 소수 : ");
    	  for(int i=1; i<=num; i++) {
    		  int cnt=0;
    		  for(int j=1; j<=i; j++) {
    			  if(i%j == 0) {
    				  cnt++;
    			  }
    		  }
    		  if(cnt == 2) {
    			  out.print(i + " ");
    		  }
    	  }
    	  out.print("</body>");
          out.print("</html>");
          
      } else if(action.equals("oddEven")) {
    	  int num = Integer.parseInt(request.getParameter("number"));
    	  response.setContentType("text/html;charset=UTF-8");
    	  PrintWriter out = response.getWriter();
    	  out.print("<html>");
    	  out.print("<head>");
    	  out.print("<title> HOMEWORK </title>");
    	  out.print("</head>");
    	  out.print("<body>");
    	  out.printf("입력하신 숫자 %d는 ", num);
    	  out.print(num%2 == 0  ? "짝수" : "홀수");
    	  out.print("</body>");
          out.print("</html>");
      }

   }

}