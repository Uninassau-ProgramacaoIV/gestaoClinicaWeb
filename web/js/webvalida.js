/*---------------------------------------------------------------------
 * Função de validação dos campos formLogin
 * Utilização:  funcao ValidaLogin() 
 *---------------------------------------------------------------------*/	 
 function validarCamposLogin(){    
     var frm = document.frmLogin;
     var nome = frm.nome.value;
     var senha = frm.senha.value;
     
     if(nome === ""){
        alert("Informe o nome do usuário!");
        frm.nome.focus();
        return false;
     }else if(senha === ""){
        alert("Informe a senha do usuário!");
        frm.senha.focus();
        return false;
     }else{
        caminhourl = "servletweb?acao=Logar";  
        document.forms[0].action = caminhourl;  
        window.document.forms[0].submit();
        return true;
     }      
 }
 
