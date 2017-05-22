<%-- 
    Document   : challenge1-12
    Created on : 2017/05/19, 13:23:58
    Author     : yamada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
 //課題：for文2・ループ処理
 //適当な変数へ文字連結を行い、中に「A」が30個入った状態にして下さい。
 
int total=30;
String str = "";
for(int i=1;i<=total;i++){
   str = str + "A";
}

out.print(str);

%>