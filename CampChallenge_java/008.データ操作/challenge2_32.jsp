<%-- 
    Document   : challenge2_32
    Created on : 2017/06/13, 14:04:53
    Author     : yamada
--%>
<%@page import="javax.servlet.http.HttpSession"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
          <!--データ操作課題：入力フィールドの作成と実装
      名前・性別・趣味を入力するページを作成してください。
　　　また、入力された名前・性別・趣味を記憶し、次にアクセスした際に
      記録されたデータを初期値として表示してください。 (読み込み側）--> 
    
   <%
        //受け取るパラメータの文字コード
        request.setCharacterEncoding("UTF-8");
            
         //テキストボックスの情報（名前）
         out.println(request.getParameter("txtname"));
         String txtname2 =request.getParameter("txtname");
         
         //ラジオボタンの情報（性別）
         out.println(request.getParameter("sex"));
         String sex2 =request.getParameter("sex");
         
         //複数行テキストボックスの情報（趣味）
         out.println(request.getParameter("hobby"));
         String hobby2 =request.getParameter("hobby");
         
//セッション「hs」へ登録
HttpSession hs = request.getSession();

//名前
//セッションへ「txtname1」という名前で「txtname2」を登録
hs.setAttribute("txtname1", txtname2);
//セッションから情報を取得
out.print( hs.getAttribute("txtname1")); 

//性別
//セッションへ「sex1」という名前で「sex2」を登録
hs.setAttribute("sex1", sex2);
//セッションから情報を取得
out.print( hs.getAttribute("sex1")); 
         
 //趣味
//セッションへ「hobby1」という名前で「hobby2」を登録
hs.setAttribute("hobby1", hobby2);
//セッションから情報を取得
out.print( hs.getAttribute("hobby1"));      
        %>
          
    </body>
</html>
