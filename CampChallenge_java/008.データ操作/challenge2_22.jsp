<%-- 
    Document   : challenge2_22
    Created on : 2017/06/09, 10:37:42
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
        <!--データ操作課題：HTMLの入力データと取得
        以下の機能を実装してください。
       「入力フィールド」の課題で作成したHTMLの入力データを取得し、画面に表示する
        challenge2_21の情報-->
        <%
        //受け取るパラメータの文字コード
        request.setCharacterEncoding("UTF-8");
            
         //テキストボックスの情報（名前）
         out.println(request.getParameter("txtname"));
         
         //ラジオボタンの情報（性別）
         out.println(request.getParameter("sex"));
         
         //複数行テキストボックスの情報（趣味）
         out.println(request.getParameter("hobby"));
       

        %>



    </body>
</html>
