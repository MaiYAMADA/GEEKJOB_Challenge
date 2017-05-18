<%-- 
    Document   : challenge3
    Created on : 2017/05/16, 13:17:40
    Author     : yamada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>



<%
    
  //課題：四則演算
  
  final int number1=100;
  int number2=10;
  
//足し算
int add=number1+number2;
out.print(add);
out.print("<br>");
//引き算
int pull=number1-number2;
out.print(pull+"<br>");

//掛け算
int multiply=number1*number2;
out.print(multiply);
out.print("<br>");

//割り算
int division=number1/number2;
out.print(division+"<br>");

%>
