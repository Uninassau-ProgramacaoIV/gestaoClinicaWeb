<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta name="robots" content="noindex" />
        <title>Gestão de Clínica Veterinária</title>
        <script src="js/webvalida.js"></script>
        <style>
            body
            {
                background-color:#11a6d4;
            }
            #login-box
            {
                background-color:#1992b7;
                width:380px;
                height:260px;
                margin:140px auto 0px;
                border-radius:5px;
            }
            #login-box-interno
            {
                background-color:#fdfdfd;
                width:360px;
                height:240px;
                margin:140px auto 0px;
                position:absolute;
                margin:10px;
                border-radius:5px;
                box-shadow:0px 0px 5px black;
                overflow:hidden;
            }
            #login-box-label
            {    
                height:45px;
                text-align:center;    
                font:bold 14px/45px sans-serif;
                border-top-left-radius:5px;
                border-top-right-radius:5px;
                background: rgb(254,255,255); /* Old browsers */
                background: -moz-linear-gradient(top,  rgba(254,255,255,1) 0%, rgba(210,235,249,1) 100%); /* FF3.6+ */
                background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgba(254,255,255,1)), color-stop(100%,rgba(210,235,249,1))); /* Chrome,Safari4+ */
                background: -webkit-linear-gradient(top,  rgba(254,255,255,1) 0%,rgba(210,235,249,1) 100%); /* Chrome10+,Safari5.1+ */
                background: -o-linear-gradient(top,  rgba(254,255,255,1) 0%,rgba(210,235,249,1) 100%); /* Opera 11.10+ */
                background: -ms-linear-gradient(top,  rgba(254,255,255,1) 0%,rgba(210,235,249,1) 100%); /* IE10+ */
                background: linear-gradient(to bottom,  rgba(254,255,255,1) 0%,rgba(210,235,249,1) 100%); /* W3C */
                filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#feffff', endColorstr='#d2ebf9',GradientType=0 ); /* IE6-9 */

                border-bottom:1px solid white;
                box-shadow:1px 0px 3px black;
                color:#555555;
                text-shadow:1px 0px 1px white;

            }
            .input-div
            {
                margin:20px;
                padding:5px;
                background-color:#f2f5f7;
                border-radius:3px;
            }
            .input-div input
            {
                width:310px;
                height:35px;
                padding-left:2px;
                font:normal 13px sans-serif;
                color:#aeaeae;
                border-radius:3px;
                border:1px solid #bfc4c6;
                outline:none;
            }
            .input-div:hover
            {
                background-color:#e0f1fc;
            }
            .input-div:hover input
            {
                border-color:#7dc6dd;
            }
            #input-senha
            {
                margin-top:-10px;
            }
            #botoes
            {
                width:310px;
                margin-left:25px;
            }
            #botao
            {
                float:right;
                background-color:yellow;
                padding:5px 15px;
                font:bold 12px sans-serif;
                border-radius:20px;
                text-shadow:0px 1px 0px;
                border:1px solid #9eb9c3;
                background: rgb(237,246,249); /* Old browsers */
                background: -moz-linear-gradient(top,  rgba(237,246,249,1) 0%, rgba(205,229,238,1) 100%); /* FF3.6+ */
                background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgba(237,246,249,1)), color-stop(100%,rgba(205,229,238,1))); /* Chrome,Safari4+ */
                background: -webkit-linear-gradient(top,  rgba(237,246,249,1) 0%,rgba(205,229,238,1) 100%); /* Chrome10+,Safari5.1+ */
                background: -o-linear-gradient(top,  rgba(237,246,249,1) 0%,rgba(205,229,238,1) 100%); /* Opera 11.10+ */
                background: -ms-linear-gradient(top,  rgba(237,246,249,1) 0%,rgba(205,229,238,1) 100%); /* IE10+ */
                background: linear-gradient(to bottom,  rgba(237,246,249,1) 0%,rgba(205,229,238,1) 100%); /* W3C */
                filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#edf6f9', endColorstr='#cde5ee',GradientType=0 ); /* IE6-9 */
                color:#527988;
                box-shadow:0px 0px 10px #c9c9c9;
            }
            #botao:hover
            {
                background: rgb(205,229,238); /* Old browsers */
                background: -moz-linear-gradient(top,  rgba(205,229,238,1) 0%, rgba(237,246,249,1) 100%); /* FF3.6+ */
                background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgba(205,229,238,1)), color-stop(100%,rgba(237,246,249,1))); /* Chrome,Safari4+ */
                background: -webkit-linear-gradient(top,  #cde5ee 0%, #edf6f9 100%); /* Chrome10+,Safari5.1+ */
                background: -o-linear-gradient(top,  rgba(205,229,238,1) 0%,rgba(237,246,249,1) 100%); /* Opera 11.10+ */
                background: -ms-linear-gradient(top,  #cde5ee 0%, #edf6f9 100%); /* IE10+ */
                background: linear-gradient(to bottom,  rgba(205,229,238,1) 0%,rgba(237,246,249,1) 100%); /* W3C */
                filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#cde5ee', endColorstr='#edf6f9',GradientType=0 ); /* IE6-9 */
                cursor:pointer;
            }
        </style>

    </head>
    <body>
        <div id="login-box">
            <form id="login-box-interno" name="frmLogin">
                <div id="login-box-label">
                    Login de acesso ao sistema
                </div>    

                <div class="input-div" id="input-usuario">
                    <input type="text" name="nome" placeholder="Usuário" />
                </div>

                <div class="input-div" id="input-senha">
                    <input type="password" name="senha" placeholder="Senha" />
                </div>

                <div id="botoes">
                    <input type="submit" id="botao" onclick="validarCamposLogin()" value="Login" />
                </div>
            </form>    
        </div>
    </body>
</html>