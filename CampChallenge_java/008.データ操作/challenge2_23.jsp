<%-- 
    Document   : challenge2_23
    Created on : 2017/06/09, 11:52:50
    Author     : yamada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>入力フィールド</title>
        <script src="https://ajaxzip3.github.io/ajaxzip3.js" charset="UTF-8"></script>
    </head>
    <body>
        <!--データ操作課題：HTMLのタグについて
        HTMLについて調べましょう。
         HTMLには入力フィールド意外にも様々なタグが存在します。
         Webページをデザインする上で欠かせない知識なので、タグを調べ、色々と使ってみましょう。 -->
    <vis>下記の項目を入力して下さい。 *印は必須になります。</vis>
    <form action="./challenge2_24.jsp" method="post">

        名前 * <input type="text" required name="txtname">
          　<br><br>
           
        男<input type="radio" name="sex" value="男">
        女<input type="radio" name="sex" value="女">
          　<br><br>
           
        <label for="Streetaddress">住所
            <br>
       　<!-- ▼郵便番号入力フィールド(3桁+4桁) -->
            郵便番号<input type="text" name="zip01"onKeyUp="AjaxZip3.zip2addr(this, '', 'pref01', 'addr01');" size="4" maxlength="7"> 
            <!-- ▼住所入力フィールド(都道府県) -->
            都道府県<input type="text" name="pref01" size="20">
            <!-- ▼住所入力フィールド(都道府県以降の住所) -->
            以降の住所 <input type="text" name="addr01" size="40">
 　　　　　　<br><br>
       
            電話番号 *<input type="text" required name="tell">
            <br><br>
            
            Eメールアドレス<input type="email" name="mail" size="30" multiple> 
            <br><br>
            
            お支払方法
            <br>
             商品代引き<input type="radio" name="payment" value="商品代引き">
             銀行振り込み<input type="radio" name="payment" value="銀行振り込み">
           　クレジット<input type="radio" name="payment" value="クレジット">
            <br><br>
            
            <!--送信ボタン-->
            <input type="submit" name="btnSubmit">

            </form>  
            </body>
            </html>
