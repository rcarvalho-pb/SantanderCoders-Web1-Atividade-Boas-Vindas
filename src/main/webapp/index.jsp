<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="style.css">
    <title>Boas vindas</title>
</head>
<body>
<form action="boasVindas" name="boas-vindas" method="POST">
    <div class="entrada-form">
        <label for="nome">Nome:</label>
        <input type="text" name="nome" id="nome" placeholder="Seu nome" required>
    </div>
    <div class="entrada-form">
        <label for="email">E-mail:</label>
        <input type="email" name="email" id="email" required placeholder="seu-email@provedor.com">
    </div>
    <input type="submit" value="Enviar" id="btn">
</form>
</body>
</html>