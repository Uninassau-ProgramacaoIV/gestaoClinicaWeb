/* Projeto Clinica Veterinária Web - Sistemas de Informação 4º período
 * Login.java
 * Autores: André Franco - Hugo Andrade - Luiz Augusto - FrancysNathya Brito - Ingliths Gabrielle
 * 12 de novembro de 2014 as 00:25
 */

package sistema.usuario.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sistema.usuario.model.UsuarioDAO;
        
public class Login {
     
    @SuppressWarnings("static-access")
    public static String execute(HttpServletRequest request) {        
        
        String jsp = "";        
        String nome = request.getParameter("nome");
        String senha = request.getParameter("senha");
        
        Usuario usr = new Usuario();
        UsuarioDAO usrDAO = new UsuarioDAO();        
        
        try 
        {
            usr = usrDAO.getUserLogin(nome, senha);
            if(usr == null)
            {
              jsp = "erro.jsp";                  
            }               
            else
            {
              request.getSession().setAttribute("codUsu", usr.getCodUsu());                
              jsp = "menu.jsp";
            }
            
        } catch (Exception e) 
        {
            e.printStackTrace();
            jsp = "";
        }
        return jsp;        
     }
    
    public static void validarSessao(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        Integer codUsuario = (Integer) request.getSession().getAttribute("codUsu");
        String jsp="";
        if(codUsuario == null )
        {
            jsp = "/index.jsp";
             //Redirecionando pagina
            RequestDispatcher rd = request.getRequestDispatcher(jsp);
            rd.forward(request, response);
        }        
    }
}
