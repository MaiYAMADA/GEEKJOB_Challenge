<%-- 
    Document   : challenge1-13
    Created on : 2017/05/19, 13:24:24
    Author     : yamada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
 //課題：for文3・ループ処理
 //for文を利用して0から100を全部足す処理を実現して下さい。
 long total=1;
 for(int i =1; i<=100; i++){
   total+=i;
}
 
out.print(total);

%>
