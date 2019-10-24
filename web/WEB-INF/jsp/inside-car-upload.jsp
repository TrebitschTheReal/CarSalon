<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <jsp:include page="inside-element-header.jsp"></jsp:include>
    <div class="container mx-auto m-3 text-center">
        <form action="upload" class="text-center" method="post">
            <div class="form-group">
                <input id="upload-brand" name="brand" type="text" placeholder="Brand" class="mb-1 form-control input-sm" data-container="body" data-toggle="popover-upload-brand" data-placement="left" data-content="Uploadable car's brand and type need to be minimum 3 chars long!">
                <input id="upload-color" name="color" type="text" placeholder="Color" class="mb-3 form-control" data-container="body" data-toggle="popover-upload-color" data-placement="right" data-content="Color must be minimum 3 characters long">
                <input id="upload-submit" type="submit" value="Upload car" class="btn btn-dark px-5" disabled>
            </div>
        </form>
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