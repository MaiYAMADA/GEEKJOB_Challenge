<%-- 
    Document   : challenge2_25
    Created on : 2017/06/12, 10:53:55
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
        
        <!--データ操作課題：クエリストリングの利用-->
        
        <div>商品を選んで下さい。</div>
      <form action="./challenge2_26.jsp" method="get">
          商品<select name="total">
              <option value="1000">手帳 ￥1000</option>
              <option value="200">はさみ　￥200</option>
              <option value="130">レタス　￥130</option>
              <option value="80">トマト　￥80</option>
              <option value="3500">洗濯機　￥3500</option>
              <option value="5800">こたつ　￥5800</option>
              </select>
          <br>
          <br>
          個数<select name="count">
              <option value=0>0個</option>
              <option value=1>1個</option>
              <option value=2>2個</option>
              <option value=3>3個</option>
              <option value=4>4個</option>
          </select>
          <br>
          <br>
           商品<select name="type">
              <option value="1">手帳 ￥1000</option>
              <option value="1">はさみ　￥200</option>
              <option value="2">レタス　￥130</option>
              <option value="2">トマト　￥80</option>
              <option value="3">洗濯機　￥3500</option>
              <option value="3">こたつ　￥5800</option>
              </select>
          <!--送信ボタン-->
          <input type="submit" name="btnSubmit">
      </form>
        
    </body>
</html>
