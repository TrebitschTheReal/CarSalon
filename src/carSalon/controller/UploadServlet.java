package carSalon.controller;

import carSalon.model.Car;
import carSalon.model.User;
import carSalon.service.LoginService;
import carSalon.service.UploadCarService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/upload")
public class UploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String brand = request.getParameter("brand");
        String color = request.getParameter("color");

        Car car = new Car(brand, color);
        try {
            new UploadCarService(car);
            System.out.println("Car uploaded!");
            request.setAttribute("upload-complete", true);
        } catch (Exception e) {
            System.out.println("Upload failed!");
            e.printStackTrace();
        }
        response.sendRedirect("inside?page=uploadcar");

        //request.setAttribute("page", "uploadcar");
        //this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/main-inside-page.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}