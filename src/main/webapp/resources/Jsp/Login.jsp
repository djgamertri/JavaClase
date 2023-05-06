<!-- <%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> -->
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="../Img/piano.png" type="image/x-icon">
    <link rel="stylesheet" href="./resources/css/style.css">

    <title>Java Project - 2687350</title>
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</head>
<body>
<div style="width: 500px; margin: auto;">
    <header></header>
    <nav></nav>
    <section>
        <form action="">
            <h1 style="text-align: center">Login</h1>
            <div class="mb-3">
                <label for="Email" class="form-label">Correo</label>
                <input type="email" name="userEmail" class="form-control" id="Email" placeholder="Example@Example.com" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" required>
            </div>
            <div class="mb-3">
                <label for="Password" class="form-label">Contraseña</label>
                <input type="password" name="userPass" class="form-control" id="Password" pattern="{5,16}" required>
                <div id="PasswordTip" class="form-text">No compartas tu contraseña con nadie</div>
            </div>
            <button type="submit" class="btn btn-outline-second">Regresar</button>
            <button type="submit" class="btn btn-primary">Ingresar</button>
        </form>
    </section>
    <footer></footer>
</div>
</body>
</html>
