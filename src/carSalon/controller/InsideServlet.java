package carSalon.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/inside")
public class InsideServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("userSecurityLevel") == null || (int) session.getAttribute("userSecurityLevel") < 0) {
            response.sendRedirect("login");
        } else {
            RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/inside.jsp");
            rd.forward(request, response);
        }
    }
}
