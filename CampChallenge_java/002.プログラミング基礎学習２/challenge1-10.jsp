<%-- 
    Document   : challenge1-10
    Created on : 2017/05/18, 20:37:20
    Author     : yamada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page import="java.util.HashMap"%>

<%
   //課題：連想配列の作成(Mapの操作）
   
HashMap<String,String>data=
          new HashMap<String,String>();

data.put("1","AAA");
data.put("hello","world");
data.put("soeda", "33");
data.put("20","20");

out.print(data.get("hello"));


%>