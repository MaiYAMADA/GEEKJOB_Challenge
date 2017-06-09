<%-- 
    Document   : challenge2_21
    Created on : 2017/06/08, 14:35:32
    Author     : yamada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>入力フィールド</title>
    </head>
    <body>
        <!--データ操作課題：入力フィールド -->
        <!--以下の入力フィールドを持ったHTMLを、Javaで処理する想定で記述してください。
          ・名前（テキストボックス）、性別（ラジオボタン）、趣味（複数行テキストボックス）-->

        <div>名前、性別、趣味を入力して下さい。</div>
        <br>
    <form action="./challenge2_22.jsp" method="post">

        名前 <input type="text" name="txtname">

        
        <br>
        <br>

       
            <input type="radio" name="sex" value="男" checked="man">男
            <input type="radio" name="sex" value="女">女
        
        <br>
        <br>
 
        
            <label for="hobby">趣味</label><br>
            <textarea id="hobby" name="hobby" cols="40" rows="4" maxlength="20" placeholder="趣味をご記入ください"></textarea>
        

       
 
         <br>
         <br>
         
        <!--送信ボタン-->

        <input type="submit" name="btnSubmit">

    </form>
</body>
</html>
