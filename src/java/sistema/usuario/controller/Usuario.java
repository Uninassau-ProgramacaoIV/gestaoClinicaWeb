/* Projeto Clinica Veterinária Web - Sistemas de Informação 4º período
 * Usuario.java
 * Autores: André Franco - Hugo Andrade - Luiz Augusto - FrancysNathya Brito - Ingliths Gabrielle
 * 12 de novembro de 2014 as 01:00
 */

package sistema.usuario.controller;

public class Usuario {
    private Integer codUsu;
    private String nome;
    private String senha;    
    private String admin;
    private String proprietario;
    private String animal;
    private String raca;
    private String especie;

    public Integer getCodUsu() {
        return codUsu;
    }

    public void setCodUsu(Integer codUsu) {
        this.codUsu = codUsu;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }    

    
    public String getAdmin() {
        return admin;
    }

    
    public void setAdmin(String admin) {
        this.admin = admin;
    }

    
    public String getProprietario() {
        return proprietario;
    }

    
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    
    public String getAnimal() {
        return animal;
    }

    
    public void setAnimal(String animal) {
        this.animal = animal;
    }

    
    public String getRaca() {
        return raca;
    }

    
    public void setRaca(String raca) {
        this.raca = raca;
    }

    
    public String getEspecie() {
        return especie;
    }

    
    public void setEspecie(String especie) {
        this.especie = especie;
    }    
}
