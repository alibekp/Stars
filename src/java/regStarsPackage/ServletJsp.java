/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regStarsPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(name = "ServletJsp", urlPatterns = {"/ServletJsp"})
public class ServletJsp extends HttpServlet {

    EntityManager em;
    StarsBeanRemote starbean;
    InitialContext ctx;
    Query query;

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
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("regStarsPU");
            EntityManager em = emf.createEntityManager();
            String starname = null;
           // star s = null;
           // List result = em.createQuery("SELECT s FROM star s", star.class).getResultList(); //100% рабочий код!
           
           
           //List result = em.createQuery("SELECT s FROM star s WHERE s.starName = :sname", star.class).setParameter("sname", starName).getResultList();//100% рабочий код!
           
        /*for (int i = 0; i < result.size(); i++)
        {
            System.out.println(result.get(i).toString());
        } */
        /*star st = null;
        Query q = em.createQuery("SELECT s FROM star s WHERE s.starName = :sname", star.class).setParameter("sname", starName);
        st=(star) q.getResultList();
        System.out.println(st.getStarName()); */
        //star st = null;
        
        
                          

        //Query q = em.createQuery("SELECT s FROM star s WHERE s.starName = :sname", star.class).setParameter("sname", starname);
        //Query q = em.createQuery("Select s from star s where s.starName = :sname").setParameter("sname", starname);
        //Query q = em.createQuery("SELECT s FROM star s", star.class);
        Query q = em.createQuery("SELECT s.starName FROM star s");
        List <star> st = q.getResultList();
        out.println(st.toString());
        
        Query q1 = em.createQuery("SELECT s.starCoordinateX FROM star s");
        List <star> st1 = q1.getResultList();
        out.println(st1.toString());
        
        Query q2 = em.createQuery("SELECT s.starCoordinateY FROM star s");
        List <star> st2 = q2.getResultList();
        out.println(st2.toString());
        
              
       // request.setAttribute("st", st);
        //request.getRequestDispatcher("Form.jsp").forward(request, response);
        
        request.setAttribute("st", st);

        RequestDispatcher view = request.getRequestDispatcher("/Form.jsp");      
        view.include(request, response);
       
            /* for(int i = 0; i < st.size(); i++) {
            out.println(st.toString());
        }    */
       
                
        /*for(int i = 0; i < result.size(); i++) {
            System.out.println(result.toString());
        } */
         
                       
           /* int i = 0;
            for (Object starr : result) {
                System.out.println((i + 1) + ". " + starr.toString());
                
                i++;
            } */ 

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
