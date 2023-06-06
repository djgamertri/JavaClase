<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="shortcut icon" href="./resources/Img/piano.png" type="image/x-icon">
  <link rel="stylesheet" href="./resources/css/style.css">

  <!-- CDN Tailwind -->
  <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.7/dist/tailwind.min.css" rel="stylesheet">
  
  <title>Java Project - 2687350</title>
</head>

<%@include file="./Header.jsp"%>

<body class="bg-gray-100">
  <div class="flex items-center justify-center w-screen" style="height: 86vh;">
    <div class="w-full max-w-md">
      <div class="bg-white p-8 border border-gray-300">
        <div class="flex justify-center flex-col items-center mb-6">
            <h2 class="text-xl font-semibold mb-6">Registro de categoría</h2>
            <img src="https://cdn.icon-icons.com/icons2/2406/PNG/512/tags_categories_icon_145927.png" alt="Imagen de ejemplo" class="h-40">
        </div>
        <form action="./CategoryRegister" method="post">
          <div class="mb-4">
            <label for="NameCategory" class="block text-gray-700 text-sm font-bold mb-2">Nombre de Categoría:</label>
            <input type="text" id="NameCategory" name="NameCategory" class="w-full px-3 py-2 border border-gray-300 rounded focus:outline-none focus:border-indigo-500" placeholder="Ingrese el nombre de la categoría" required>
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
  </div>
</body>

<%@include file="./Footer.jsp"%>

</html>
