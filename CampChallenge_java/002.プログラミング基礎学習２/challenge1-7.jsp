<%-- 
    Document   : challenge1-7
    Created on : 2017/05/16, 19:38:30
    Author     : yamada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>



<%

 /*
  課題：switch文2（条件分岐）
  switch文を利用して、以下の処理を実現してください。
1. 値が"A"なら「英語」
値が"あ"なら「日本語」
それ以外は何も表示しない処理
  */
 
char type='B';

switch(type){
    case 'A':
     out.print("英語");
     break;
    case 'あ':
      out.print("日本語");
      break;
   
       
        
}

%>


