<%-- 
    Document   : challenge1-6
    Created on : 2017/05/16, 18:36:14
    Author     : yamada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
 /*課題：Switch文（条件分岐）
   値が1なら「one」
   値が2なら「two」
   それ以外は「想定外」と表示する処理
*/
int type=2;
 
switch(type){
    
case 1:
out.print("one");
break;
case 2:
out.print("two");
break;
default:
out.print("想定外");
break;

}
%>
