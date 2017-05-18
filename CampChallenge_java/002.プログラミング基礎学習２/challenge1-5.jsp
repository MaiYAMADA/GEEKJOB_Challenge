<%-- 
    Document   : challenge1-5
    Created on : 2017/05/16, 16:15:16
    Author     : yamada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
 //課題：変数の表示とif文(if文)
int num=2;

/*
値が1なら「1です！」
値が2なら「プログラミングキャンプ！」
それ以外なら「その他です！」
*/

if(num==1){
    out.print("1です");
}else if(num==2){
    out.print("プログラミングキャンプ！");
}else{
    out.print("変数の中身は想定外です！");
}

%>
