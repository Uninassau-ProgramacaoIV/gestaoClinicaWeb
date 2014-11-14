/* Projeto Clinica Veterinária Web - Sistemas de Informação 4º período
 * Conexao.java
 * Autores: André Franco - Hugo Andrade - Luiz Augusto - FrancysNathya Brito - Ingliths Gabrielle
 * 12 de novembro de 2014 as 00:34
 */

package sistema.usuario.model;

import java.sql.*;

public class Conexao {
    private static Connection conn;
    
    public static void conectar(String url, String usuario, String senha, String driver) {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, usuario, senha);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static Connection getConnection() {
        return conn;
    }
    
    public static void destroy() {
        try {
            conn = null;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
