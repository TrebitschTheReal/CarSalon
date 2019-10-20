<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (request.getParameterMap().containsKey("page")) {
        String insidePage = request.getParameter("page");
        if (insidePage.equals("uploadcar")) {
            %><jsp:include page="inside-element-upload-car.jsp"></jsp:include><%
        }
        else if(insidePage.equals("listcars")) {
            %><jsp:include page="inside-element-list-cars.jsp"></jsp:include><%
        }
        else if(insidePage.equals("modifycars")) {
            %><jsp:include page="inside-element-modify-cars.jsp"></jsp:include><%
        }
    }
%>