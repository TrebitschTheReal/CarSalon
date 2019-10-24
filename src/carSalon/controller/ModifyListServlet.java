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

@WebServlet("/modifylist")
public class ModifyListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String newBrand = request.getParameter("modify-brand");
        String newColor = request.getParameter("modify-color");
        String modifiableCarId = request.getParameter("choosedCar");

        Car car = new Car(modifiableCarId, newBrand, newColor);

        try {
            CarService cs = new CarService();
            cs.modifyCar(car);
            System.out.println("Car successfully modified!");
            request.setAttribute("upload-complete", true);
        } catch (Exception e) {
            System.out.println("Car modification failed");
            e.printStackTrace();
        }
        response.sendRedirect("listcar");
    }
    //TODO: esetleg scroll spy-t beletenni egy kereső inputra ami keyupra oda ugrik ahol matchol

}
