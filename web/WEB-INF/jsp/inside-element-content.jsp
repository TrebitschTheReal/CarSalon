<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (request.getParameterMap().containsKey("page")) {
        String oldal = request.getParameter("page");
        if (oldal.equals("uploadcar")) {
%>
<jsp:include page="inside-element-upload-car.jsp"></jsp:include>
<%
        } else {

        }
    }
%>