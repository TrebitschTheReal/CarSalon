package carSalon.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import carSalon.model.User;
import carSalon.service.LoginService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");

        User user = new User(userName, password);
        new LoginService(user);

        if (user.getUserSecurityLevel() >= 0) {
            HttpSession session = request.getSession();
            session.setAttribute("name", user.getUserName());
            session.setAttribute("userSecurityLevel", user.getUserSecurityLevel());
            response.sendRedirect("inside");




            
        } else {
            response.sendRedirect("login");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/index.jsp");
        rd.forward(request, response);
    }
}
