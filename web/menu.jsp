<%-- 
  Projeto Clinica Veterinária Web - Sistemas de Informação 4º período
  menu.jsp
  Autores: André Franco - Hugo Andrade - Luiz Augusto - FrancysNathya Brito - Ingliths Gabrielle
  12 de novembro de 2014 as 01:56
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="controller.Usuario,controller.Login"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">


<%!
String codUsu = ""; 
%>
<%
 Login.validarSessao(request, response);
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Gestor de Clínica Veterinária</title>
    </head>
    <body>
        <h2>Menu</h2>
         <a href='/locadora/servletweb?acao=ListarProprietarios'>Cadastro de Proprietários</a><br>
         <a href='/locadora/servletweb?acao=ListarAnimais'>Cadastro de Animais</a><br>
         <a href='/locadora/servletweb?acao=ListarRaca'>Cadastro de Raças</a><br>
         <a href='/locadora/servletweb?acao=ListarEspecie'>Cadastro de Espécies</a><br>
         <a href='/locadora/servletweb?acao=ListarUsuarios'>Cadastro de Usuários</a><br> 
    </body>
</html>
