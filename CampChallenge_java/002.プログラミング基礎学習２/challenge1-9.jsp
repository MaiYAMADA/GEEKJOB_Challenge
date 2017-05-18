<%-- 
    Document   : challenge1-9
    Created on : 2017/05/17, 16:56:07
    Author     : yamada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page import="java.util.ArrayList"%>

<%
ArrayList<String> datas =new ArrayList<String>();

/*
課題：配列の作成（ArrayListの変更）
challenge1-8の「soeda」を「33」に変更
*/
        
datas.add("10");
datas.add("100");
datas.add("soeda");
datas.add("hayashi");
datas.add("-20");
datas.add("118");
datas.add("END");

datas.set(3,"33");

out.print(datas.get(3));

%>
