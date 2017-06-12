<%-- 
    Document   : challenge2_26
    Created on : 2017/06/12, 10:56:02
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
           
        //データ操作課題：クエリストリングの利用
        
        //受け取るパラメータの文字コード
       request.setCharacterEncoding("UTF-8");
      //価格
     
     
      int total1 = Integer.parseInt(request.getParameter("total"));
      //個数
      int count1 = Integer.parseInt(request.getParameter("count"));
      //商品種別
      int type1 = Integer.parseInt(request.getParameter("type"));
      

//     //商品種別の表示
      if(type1==1){
          out.println("1:雑貨");
      }
      else if(type1==2){
          out.println("2:生鮮食品");
      }
      else{
          out.println("3.その他");
      }
//     //総額
      int x = total1 * count1;
      
      out.println("お会計は合計で" + x + "になります。");
      
     //ポイントの計算
      out.print("ポイントは");
      
      if(x>=3000){
         out.print(x * 0.04);    
      }
      else if(x>=5000){
       out.print(x * 0.05);
      }
      else{
       out.print("なし");
      }
      
      out.print("です");
      
//         
      
      
           %>
           
    </body>
</html>
