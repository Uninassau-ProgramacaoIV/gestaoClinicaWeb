/* Projeto Clinica Veterinária Web - Sistemas de Informação 4º período
 * usuarioDAO.java
 * Autores: André Franco - Hugo Andrade - Luiz Augusto - FrancysNathya Brito - Ingliths Gabrielle
 * 12 de novembro de 2014 as 00:18
 */

package sistema.usuario.model;

import java.sql.*;
import java.util.ArrayList;
import sistema.usuario.controller.Usuario;

public class UsuarioDAO {
    private static PreparedStatement pstmt = null;
    private static ResultSet rs = null;
    
    public static boolean create(Usuario usuario) {
        try {            
            pstmt = Conexao.getConnection().prepareStatement(
                    "INSERT INTO usuarios(nome, senha, admin, proprietario, animal, raca, especie) Values(?,?,?,?,?,?,?)");
            pstmt.setInt   (1, usuario.getCodUsu());
            pstmt.setString(2, usuario.getNome());
            pstmt.setString(3, usuario.getSenha());            
            pstmt.setString(4, usuario.getAdmin());
            pstmt.setString(5, usuario.getProprietario());
            pstmt.setString(6, usuario.getAnimal());
            pstmt.setString(7, usuario.getRaca());
            pstmt.setString(8, usuario.getEspecie());            
            pstmt.executeUpdate();
            pstmt.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static boolean update(Usuario usuario) {
        try {
            pstmt = Conexao.getConnection().prepareStatement(
                    "UPDATE usuarios SET nome=?, senha=?, admin=?, proprietario=?, animal=?, raca=?, especie=? WHERE codusu = ?");
            pstmt.setString(1, usuario.getNome());
            pstmt.setString(2, usuario.getSenha());            
            pstmt.setString(3, usuario.getAdmin());
            pstmt.setString(4, usuario.getProprietario());
            pstmt.setString(5, usuario.getAnimal());
            pstmt.setString(6, usuario.getRaca());
            pstmt.setString(7, usuario.getEspecie());            
            pstmt.executeUpdate();
            pstmt.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static boolean delete(Usuario usuario) {
        try {
            pstmt = Conexao.getConnection().prepareStatement(
                    "DELETE FROM usuarios WHERE codusuario = ?");
            pstmt.setInt(1, usuario.getCodUsu());
            pstmt.executeUpdate();
            pstmt.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static ArrayList<Usuario> getAll() {
        try {
            ArrayList<Usuario> listAll = null;
            Usuario usuario = new Usuario();
            pstmt = Conexao.getConnection().prepareStatement(
                    "SELECT * FROM usuarios ORDER BY nome");
            rs = pstmt.executeQuery();
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    usuario = new Usuario();
                    usuario.setCodUsu(rs.getInt("codusu"));
                    usuario.setNome(rs.getString("nome"));
                    usuario.setSenha(rs.getString("senha"));                    
                    usuario.setAdmin(rs.getString("admin"));
                    usuario.setProprietario(rs.getString("proprietario"));
                    usuario.setAnimal(rs.getString("animal"));
                    usuario.setRaca(rs.getString("raca"));
                    usuario.setEspecie(rs.getString("especie"));
                    listAll.add(usuario);
                } while (rs.next());
            }
            rs.close();
            pstmt.close();
            return listAll;
        } catch (Exception e) {
            return null;
        }
    }
    
    public static Usuario getById(int Id) {
        try {
            Usuario usuario = null;
            pstmt = Conexao.getConnection().prepareStatement(
                    "SELECT * FROM usuarios WHERE codusu = ?");
            pstmt.setInt(1, Id);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                usuario = new Usuario();
                usuario.setCodUsu(rs.getInt("codusu"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSenha(rs.getString("senha"));                
                usuario.setAdmin(rs.getString("admin"));
                usuario.setProprietario(rs.getString("proprietario"));
                usuario.setAnimal(rs.getString("animal"));
                usuario.setRaca(rs.getString("raca"));
                usuario.setEspecie(rs.getString("especie"));
            }
            rs.close();
            pstmt.close();
            return usuario;
        } catch (Exception e) {
            return null;
        }
    }
    
    public static Usuario getUserLogin(String nome, String senha){
        try {
            Usuario user = null;
            
            pstmt = Conexao.getConnection().prepareStatement(
                    "SELECT * FROM usuarios WHERE nome = ? AND senha = ?");
            pstmt.setString(1, nome);
            pstmt.setString(2, senha);
            rs = pstmt.executeQuery();
            if(rs.next()){
                user = new Usuario();
                user.setCodUsu(rs.getInt("codusu"));
                user.setNome(rs.getString("nome"));
                user.setSenha(rs.getString("senha"));                
                user.setAdmin(rs.getString("admin"));
                user.setProprietario(rs.getString("proprietario"));
                user.setAnimal(rs.getString("animal"));
                user.setRaca(rs.getString("raca"));
                user.setEspecie(rs.getString("especie"));
            }            
            return user;
        } catch (Exception e) {
            return null;
        }        
    }
}