<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="../Img/piano.png" type="image/x-icon">
    <link rel="stylesheet" href="../css/style.css">

    <!-- CDN Tailwind -->
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.7/dist/tailwind.min.css" rel="stylesheet">
    
    <title>Java Project - 2687350</title>
</head>
<body class="flex items-center justify-center bg-gray-100">
    <div class="w-full max-w-md">
      <div class="bg-white p-8 border border-gray-300">
          <div class="flex justify-center flex-col items-center mb-6">
            <h2 class="text-xl font-semibold mb-6">Ingreso de usuarios</h2>
            <img src="https://cdn-icons-png.flaticon.com/512/149/149071.png" alt="Imagen de ejemplo" class="h-40">
        </div>
        <form>
          <div class="mb-4">
            <label for="Email" class="block text-gray-700 text-sm font-bold mb-2">Correo:</label>
            <input type="Email" id="Email" name="userEmail" class="w-full px-3 py-2 border border-gray-300 rounded focus:outline-none focus:border-indigo-500" placeholder="Example@Example.com" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" required>
          </div>
          <div class="mb-4">
            <label for="Password" class="block text-gray-700 text-sm font-bold mb-2">Contraseña:</label>
            <input type="text" id="Password" name="userPass" class="w-full px-3 py-2 border border-gray-300 rounded focus:outline-none focus:border-indigo-500" placeholder="**********" pattern="{5,16}" required>
          </div>
          <div class="flex justify-around">
            <a href="" class="bg-gray-500 hover:bg-gray-600 text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline">
              Regresar
            </a>
            <button type="submit" class="bg-indigo-500 hover:bg-indigo-600 text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline">
              Registrar
            </button>
          </div>
        </form>
      </div>
    </div>
  </body>
</html>
