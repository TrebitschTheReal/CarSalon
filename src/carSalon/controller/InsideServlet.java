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
//        String quitButton = request.getParameter("logoutButton");
//        if(quitButton != null) {
//            HttpSession session=request.getSession();
//            session.invalidate();
//            response.setHeader("Cache-Control","no-cache");
//            response.setHeader("Cache-Control","no-store");
//            response.setHeader("Pragma","no-cache");
//            response.sendRedirect("login");
//        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();

        if(session.getAttribute("name") != null) {
            RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/inside.jsp");
            rd.forward(request, response);
        }
        else {
            response.sendRedirect("login");
        }
    }
}
