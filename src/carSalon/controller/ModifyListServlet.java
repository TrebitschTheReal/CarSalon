package carSalon.controller;

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

        System.out.println("###############################");
        System.out.println("Car id: " + modifiableCarId);
        System.out.println("Car brand: " + newBrand);
        System.out.println("Car color: " + newColor);
        System.out.println("###############################");



        //TODO: esetleg scroll spy-t beletenni egy kereső inputra ami keyupra oda ugrik ahol matchol

        response.sendRedirect("listcar");
    }
}
