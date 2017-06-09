<%-- 
    Document   : challenge2_24
    Created on : 2017/06/09, 15:17:32
    Author     : yamada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
          
          out.println("以下の内容に間違いがないかご確認下さい。");
          
        //受け取るパラメータの文字コード
        request.setCharacterEncoding("UTF-8");
            
         //名前
         out.println(request.getParameter("txtname"));
         
         //性別
         out.println(request.getParameter("sex"));
         
         //住所
         out.println(request.getParameter("zip01"));
         out.println(request.getParameter("pref01"));
         out.println(request.getParameter("addr01"));

           //電話番号
         out.println(request.getParameter("tell"));
        
         //アドレス
         out.println(request.getParameter("mail"));
        
         //振り込み方法
         out.println(request.getParameter("payment"));         

         
        
       
       %>
    </body>
</html>
