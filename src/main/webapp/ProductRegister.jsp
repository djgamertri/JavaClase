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

<jsp:include page="./Header.jsp"/>

<body class="flex items-center justify-center bg-gray-100">
  <div class="w-full max-w-md">
    <div class="bg-white p-8 border border-gray-300">
        <div class="flex justify-center flex-col items-center mb-6">
          <h2 class="text-xl font-semibold mb-6">Registro de productos</h2>
          <img src="https://cdn-icons-png.flaticon.com/512/1170/1170679.png" alt="Imagen de ejemplo" class="h-40">
      </div>
      <form action="./ProductRegister" method="post">
        <div class="mb-4">
          <label for="NameProduct" class="block text-gray-700 text-sm font-bold mb-2">Nombre del Producto:</label>
          <input type="text" id="NameProduct" name="NameProduct" class="w-full px-3 py-2 border border-gray-300 rounded focus:outline-none focus:border-indigo-500" placeholder="Leche" pattern="[A-Za-z]{2,40}" required>
        </div>
        <div class="mb-4">
            <label for="ValueProduct" class="block text-gray-700 text-sm font-bold mb-2">Valor de Producto:</label>
            <input type="number" id="ValueProduct" name="ValueProduct" class="w-full px-3 py-2 border border-gray-300 rounded focus:outline-none focus:border-indigo-500" placeholder="10000" min="0" required>
        </div>
        <div class="mb-4 w-full">
            <label for="category" class="block mb-2">Categoría</label>
            <select id="category" name="CategoryProduct" class="w-full px-3 py-2 border border-gray-300 rounded-md focus:outline-none focus:border-indigo-500">
              <option value="1">Lacteos</option>
              <option value="2">Granos</option>
              <option value="3">Opción 3</option>
            </select>
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

<jsp:include page="./Footer.jsp"/>

</html>
