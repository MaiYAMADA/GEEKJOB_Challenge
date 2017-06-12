<%-- 
    Document   : challenge2_28
    Created on : 2017/06/12, 15:01:31
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
            //受け取るパラメータの文字コード
            request.setCharacterEncoding("UTF-8");
//</form>で送られてきた数値
int num=0;

if(request.getParameter("number")!=null){
            num = Integer.parseInt(request.getParameter("number"));
}

            out.println("元の値:" + num + "<br>");
            out.println("素因数分解の結果:");

            int[] sosuu = {2, 3, 5, 7};
            for (int i = 0; i < 4; i++) {
                int j = sosuu[i];
                while (num % j == 0) {
//結果の値
                    out.println(j + "、");
                    num /= j;
                  
                }
            }

//余った値
            if (num > 1) {
                out.print("余った値：" + num);
            }
        %>

    </body>
</html>
