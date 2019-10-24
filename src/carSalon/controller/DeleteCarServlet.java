package carSalon.controller;

import carSalon.model.Car;
import carSalon.service.CarService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class DeleteCarServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            String deletedCarId = request.getParameter("deleteCar");
            Car car = new Car(deletedCarId);
            CarService cs = new CarService();
            cs.deleteCar(car);
            System.out.printf("Car with ID %s deleted!", car.getId());
        } catch (Exception e) {
            System.out.println("Delete failed");
            e.printStackTrace();
        }

        response.sendRedirect("listcar");
    }
}
