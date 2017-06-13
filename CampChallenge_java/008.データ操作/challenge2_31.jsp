<%-- 
    Document   : challenge2_31
    Created on : 2017/06/13, 14:01:21
    Author     : yamada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%

    HttpSession hs = request.getSession();

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <!--データ操作課題：入力フィールドの作成と実装
        名前・性別・趣味を入力するページを作成してください。
　　　また、入力された名前・性別・趣味を記憶し、次にアクセスした際に
        記録されたデータを初期値として表示してください。 (入力側）--> 

        <div>名前、性別、趣味を入力して下さい。</div>
        <br>
        <form action="./challenge2_32.jsp" method="post">

            名前 
            <% if (hs.getAttribute("txtname1") == null) { %>
            <input type="text" name="txtname">
            <% } else {%>
            <input type="text" name="txtname" value="<%= hs.getAttribute("txtname1")%>">
            <% } %>
            <br>

            性別 
            <% if (hs.getAttribute("sex1") == null) { %>
            男 <input type="radio" name="sex" value="男" >男
            女 <input type="radio" name="sex" value="女">女
            <% } else {%>
              <% if( hs.getAttribute("sex1")=="男"){%>
            男<input type="radio" name="sex"  value="男" checked>
           女<input type="radio" name="sex" value="女">
           <% } else{%>
            男<input type="radio" name="sex"  value="男" >
           女<input type="radio" name="sex" value="女"  checked>
           <%}%>
           
            <% } %>
            <br>

     　　 <label for="hobby">趣味</label><br>
            <% if (hs.getAttribute("hobby1") == null) { %>
            <textarea id="hobby" name="hobby" cols="40" rows="4" maxlength="20" placeholder="趣味をご記入ください"></textarea>
            <% } else {%>
            <textarea id="hobby" name="hobby" cols="40" rows="4" maxlength="20" ><%= hs.getAttribute("hobby1")%></textarea>
            <% }%>

　<br>

            <!--送信ボタン-->
            <input type="submit" name="btnSubmit">

        </form>

    </body>
</html>
