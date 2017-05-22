<%-- 
    Document   : challenge1-11
    Created on : 2017/05/19, 13:23:23
    Author     : yamada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
//課題：for文1・ループ処理
//for文を利用して、8を20回掛ける処理を実現して下さい（2の20乗）

long total = 1;
for (int i = 1; i<= 20; i++){
    total *= 8;
}
out.print(total);

%>