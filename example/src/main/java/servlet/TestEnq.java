package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/TestEnq")
public class TestEnq extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String qtype = request.getParameter("qtype");
		String body = request.getParameter("body");
		
		String errorMsg = "";
		if(name == null || name.length() == 0) {
			errorMsg += "名前が入力されていません<br>";
		}
		if(qtype == null || qtype.length() == 0) {
			errorMsg += "性別が選択されていません<br>";
		} else {
			if (qtype.equals("company")) { qtype = "会社について"; }
			else if (qtype.equals("product")) {qtype = "製品について"; }
			else if (qtype.equals("support")) {qtype = "サポートについて"; }
		}
		if(body == null || body.length() == 0) {
			errorMsg += "質問が入力されていません<br>";
		}
		String msg = String.format("\n名前：%s\nお問い合わせ種類：%s\n質問内容：%s",name,qtype,body);
		if(errorMsg.length() != 0) {
			msg = errorMsg;
		}
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>ユーザー登録結果</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div>");
		out.println("<p>以下の内容で送信されました</p>");
		out.println(msg);
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}

}
