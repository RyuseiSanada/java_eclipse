package servlet;

import java.io.IOException;
import java.util.Random;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/ex62")
public class Ex62 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random rand = new Random();
		int num = rand.nextInt(10);
		
		if (num % 2 == 0) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/forwarded.jsp");
			dispatcher.forward(request, response);}
		else {
			response.sendRedirect("redirected.jsp");
		}
	}

}
