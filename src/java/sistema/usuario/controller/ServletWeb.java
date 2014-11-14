/* Projeto Clinica Veterinária Web - Sistemas de Informação 4º período
 * ServletWeb.java
 * Autores: André Franco - Hugo Andrade - Luiz Augusto - FrancysNathya Brito - Ingliths Gabrielle
 * 12 de novembro de 2014 as 00:05
 */

package sistema.usuario.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import sistema.usuario.model.Conexao;

public class ServletWeb extends HttpServlet 
{
    private ServletContext sc;
    private String jsp = "";
    
    @Override
    public void init(ServletConfig config) throws ServletException 
    {
        super.init(config);
        sc = config.getServletContext();
        Conexao.conectar(sc.getInitParameter("url"), sc.getInitParameter("usuario"),
                sc.getInitParameter("senha"), sc.getInitParameter("driver"));
    }
    

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        String acao = request.getParameter("acao");
                  
        if(acao.equals("Logar"))            
         jsp = Login.execute(request);
        
  
        //Redirecionando pagina
        RequestDispatcher rd = request.getRequestDispatcher(jsp);
        rd.forward(request, response);
            
    }
        
    
    @Override
    public void destroy() 
    {
        Conexao.destroy();
    }
}
