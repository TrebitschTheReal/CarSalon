package carSalon.controller;

import carSalon.model.Car;
import carSalon.service.CarService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/listcar")
public class ListCarServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CarService cs = new CarService();
        List<Car> listOfCars = cs.getAllCars();

        request.setAttribute("cars", listOfCars);
        RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/inside-car-list.jsp");
        rd.forward(request, response);
    }
}
