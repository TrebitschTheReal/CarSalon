<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container mx-auto m-3 text-center">
    <form action="upload" class="text-center" method="post">
        <div class="form-group">
            <input id="upload-brand" name="brand" type="text" placeholder="Brand" class="mb-1 form-control input-sm" data-container="body" data-toggle="popover-brand" data-placement="left" data-content="Uploadable car's brand and type need to be minimum 3 chars long!">
            <input id="upload-color" name="color" type="text" placeholder="Color" class="mb-3 form-control" data-container="body" data-toggle="popover-color" data-placement="right" data-content="Color must be minimum 3 characters long">
            <input id="upload-submit" type="submit" value="Upload car" class="btn btn-dark px-5" disabled>
        </div>
    </form>
</div>

<%
    if(request.getParameter("upload-complete") != null) {
%>

<!--TODO: ha belépünk az ifbe, jelenjen meg ez az alert. -->

<div class="alert alert-success" role="alert">
    Car upload complete!
</div>


<%
    }
%>