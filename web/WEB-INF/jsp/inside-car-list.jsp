<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/global.css" defer>
    <script src="${pageContext.request.contextPath}/scripts/main.js" defer></script>
    <title>Car Salon</title>
</head>
<body>
<div class="inner-body">
    <jsp:include page="inside-element-header.jsp"/>
    <div class="container p-2">
        <p class="display-4 text-center mx-auto bg-dark text-light p-2">List of all cars</p>

        <table class="table table-striped table-dark">
            <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Brand</th>
                <th scope="col">Color</th>
                <th scope="col">Select</th>
                <th scope="col">Modify Brand</th>
                <th scope="col">Modify Color</th>
                <th scope="col"><!-- Modify Button --></th>
                <th scope="col"><!-- Delete Button --></th>
            </thead>
            <tbody>

            <c:forEach var="car" items="${cars}">
                <c:set var="count" value="0" scope="page" />
                <c:set var="count" value="${count + 1}" scope="page"/>

                <form action="modifylist" method="get">
                    <tr>
                        <th scope="row">${car.id}.</th>
                        <td>${car.brand}</td>
                        <td>${car.color}</td>
                        <td>
                            <span>
                                <input class="form-check-input" type="checkbox" name="choosedCar" value="${car.id}" id="${count}">
                            </span>
                        </td>
                        <td><input class="modify-brand form-control-sm" type="text" name="modify-brand" id="${count}"></td>
                        <td><input class="modify-color form-control-sm" type="text" name="modify-color" id="${count}"></td>
                        <td><input class="modify-button btn btn-primary" type="submit" value="Modify data"></td>
                </form>
                <form action="delete" type="get">
                    <td class="modify-delete-button">
                        <input hidden type="text" name="deleteCar" value="${car.id}">
                        <input class="btn btn-danger" type="submit" value="Delete car">
                    </td>
                </form>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>