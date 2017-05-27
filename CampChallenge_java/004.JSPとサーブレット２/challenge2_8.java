/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.java;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;


/**
 *
 * @author yamada
 */
public class challenge2_8 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    //課題：引数と戻り値3（メソッド）
    //「引数、戻り値2」の処理において、Integer limit=2を用意し、
    //limitを利用して２名のプロフィール表示までで停止する様に処理を実装してください。
    
    ArrayList<String> profileShow(String id) {
       
ArrayList<String> profile1 = new ArrayList<String>();
 for(String val : new String[]{"123","山田","3月4日","台東区"}) { 
  profile1.add(val);
 }
   
  ArrayList<String> profile2 = new ArrayList<String>();
  for(String val : new String[]{"456","佐藤","1月8日",""}) { 
 profile2.add(val);
 }
      
 ArrayList<String> profile3 = new ArrayList<String>();
  for(String val : new String[]{"789","鈴木","8月1日","港区"}) { 
  profile3.add(val);
  }
      
 ArrayList<String> prof = new ArrayList<String>();

 switch(id) {
  case "1":
 prof = profile1;
 break;
 case "2":
  prof = profile2;
  break; 
  case "3":
  prof = profile3;
 break;
 default:
 prof.add("0"); //指定されたIDがない場合、IDが0のみのプロフを返す
 break;
  }
   
 return prof;
}

  
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet challenge2_8</title>");            
            out.println("</head>");
            out.println("<body>");
                 
          int limit=2;
          
            for(int j=1;j<=limit;  j++) {   
  ArrayList<String> profile = profileShow(String.valueOf(j));
 
   //ID:0のプロフ(空プロフ)に到達したらループを抜ける
 if(profile.get(0) == "0") {
 break;
 } else {
 for(int i=1; i<profile.size(); i++) {
 if(profile.get(i) == "") continue;
 out.print(profile.get(i)+"<br>");
 }
 }
  out.print("<br>");
}
             
 out.println("</body>");
  out.println("</html>");
 
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
