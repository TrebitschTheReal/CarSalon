package carSalon.controller;

import carSalon.model.Car;
import carSalon.service.CarService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/upload")
public class UploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String brand = request.getParameter("brand");
        String color = request.getParameter("color");

        Car car = new Car(brand, color);
        try {
            CarService cs = new CarService();
            cs.uploadCar(car);
            System.out.println("Car uploaded!");
            request.setAttribute("upload-complete", true);
        } catch (Exception e) {
            System.out.println("Upload failed!");
            e.printStackTrace();
        }

        request.setAttribute("test", "test test easdsadsadad");
        this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/inside-car-upload.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}