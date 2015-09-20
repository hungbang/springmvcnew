<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

    <div class="col-md-12">
        <h1>
            Hello world!
        </h1>
        <div>
            <label id="errorMess" style="color: red;"></label>
        </div>
        <P>  The time on the server is ${serverTime}. </P>
        <div class="#">
                My Name is : ${name}
                <br>
                My Birthday is: ${dob}
        </div>

    </div>

    <script type="text/javascript">
    
        console.log('<c:out value="${error}"/>');
        if(null != '<c:out value="${error}"/>'){
            $('#errorMess').text('<c:out value="${error}"/>');
            $('#errorMess').css('display', 'inline');
        }

    </script>
