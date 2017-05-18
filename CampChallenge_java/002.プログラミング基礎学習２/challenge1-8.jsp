<%-- 
    Document   : challenge1-8
    Created on : 2017/05/17, 16:55:45
    Author     : yamada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page import="java.util.ArrayList"%>

<%
ArrayList<String> datas =new ArrayList<String>();

/*
課題：配列の作成（ArrayListの操作）
以下の順番で要素が格納された配列を作成して下さい。
10→100→soeda→hayashi→-20→118→END
*/
        
datas.add("10");
datas.add("100");
datas.add("soeda");
datas.add("hayashi");
datas.add("-20");
datas.add("118");
datas.add("END");

out.print(datas.get(2));

%>

      
      