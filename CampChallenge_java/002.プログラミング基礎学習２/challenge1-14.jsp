<%-- 
    Document   : challenge1-14
    Created on : 2017/05/19, 16:31:32
    Author     : yamada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
 //課題：while文・ループ処理
 //1000を2で割り続け、100より小さくなったらループを抜ける処理
 
int x=1000;
while(x>100){
    x/=2;
}
    out.print(x);



    %>
    
   