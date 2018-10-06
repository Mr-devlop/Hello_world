/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vikas Saroj
 */
@WebServlet(urlPatterns = {"/Future1"})
public class Future1 extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Future1</title>");            
            out.println("</head>");
            out.println("<body>");
             String name=request.getParameter("name");
            String dob=request.getParameter("dob");
            out.println("<h2>Hello! "+name+"</h2>");
            String str=dob.replace('-','0');
            int n=0;
            for(int i=0;i<str.length();i++)
            {
                n=n+Integer.parseInt(str.charAt(i)+"");
            }
            while(n>9)
            {
                n=n/10+n%10;
            }
            out.println("<h2>Your Lucky no. is= "+n+"</h2>");
            String future="";
            switch(n)
            {
                case 1: future="You are an intelligent person.";
                        break;
                case 2: future="You can be a successful software developer.";
                        break;
                case 3: future="You are a delligent person.";
                        break;
                case 4: future="You can get mary soon.";
                        break;
                case 5: future="You can be next PM of India.";
                        break;
                case 6: future="You are an average person.";
                        break;
                case 7:future="You futre is very bright.";
                        break;
                case 8: future="You can be a successful scientist.";
                        break;
                case 9: future="All is well in your life.";
                        break;
                default:future="Are you not enter the date?";
            }
            out.println("<h2>"+future+"</h2>");
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
