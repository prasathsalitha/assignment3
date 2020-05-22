/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displayRegistryServletPkg;

import entityBeanPkg.Registry;
import entityBeanPkg.RegistryFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp
 */
public class DisplayRegistryServlet extends HttpServlet {
    @EJB
    private RegistryFacadeLocal registryFacade;

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
       
        
        
        
        
        List<Registry> registryList;
        registryList = registryFacade.findAll();
        Registry registrant;
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DisplayRegistryServlet</title>"); 
            
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"cssRegistrationProject.css\">"); 
            
            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<header>");
            out.println("<h1>Registration Database Table</h1>");            
            out.println("</header>");
            
            out.println("<div class\"showDBWrapper:\">");         
            out.println("<table>");
            
            for(int i=0; i<registryList.size(); i++){
                registrant = registryList.get(i);
                
                if((i & 1)== 0){
                    out.println("<tr>");
                    out.println("<td class=\"cellEven\">" + registrant.getName() +"</td>");
                    out.println("<tr>");   
                
                }
                else{
                    out.println("<tr>");
                    out.println("<td class=\"cellOdd\">" + registrant.getName() +"</td>");
                    out.println("<tr>"); 
                                  
                }
                            
            }
            out.println("</table>");
            out.println("</div>");
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
