/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yamada
 */
public class challenge2_29 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          
           
            //データ操作（クッキー）課題：クッキーの記録と表示
            //クッキーに現在時刻を記録し、次にアクセスした際に、前回記録した日時を表示してください。
            
          //今日の日時を作成
          Date now =new Date();
         
          //SimpleDateFormatを作成
          SimpleDateFormat sdf= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
          
          //日付を文字列に変換
          String time=sdf.format(now);
          
          //現在時刻を表示
          out.print("現在時刻"+ time);
        
          //クッキーへ「LastLogin」という名前で今日の日付（文字列）を登録
          //クッキーに反映
          //クッキー情報を取得し、自分が利用したい情報を探す
         
          Cookie[] cs =request.getCookies();
          if(cs.length==0){
          Cookie c = new Cookie("LastLogin",time);
          response.addCookie(c);
          }
          
          
         if (cs != null) {
       for (int i = 0; i < cs.length; i++) {
            if (cs[i].getName().equals("LastLogin")) {
                out.print("前回のログインは、" + cs[i].getValue());
                break;
            }
        }
    }
        }
         
          
          
      
          
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
