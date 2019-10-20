<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header class="main--navbar">
    <nav class="navbar navbar-expand-sm navbar-dark bg-dark mb-3">
        <div class="container">
            <a class="navbar-brand" href="#">Car Salon</a>
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="inside?page=uploadcar">Upload new car</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link mx-2" href="#">List salon cars</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Modify salon cars</a>
                </li>
            </ul>
            <form action="logout" class="form-inline my-2 my-lg-0">
                <input type="submit" class="btn btn-dark px-5" id="logoutButton" value="Log out"/>
            </form>
        </div>
    </nav>
</header>