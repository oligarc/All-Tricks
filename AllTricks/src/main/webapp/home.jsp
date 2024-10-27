<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Bicicletas AllTricks</title>
    <!-- Required meta tags -->
    <meta charset="utf-8" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1, shrink-to-fit=no"
    />

    <!-- Bootstrap CSS v5.2.1 -->
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
      crossorigin="anonymous"
    />
  </head>

  <body>
    <header class="bg-primary p-4">
      <img src="img/logo-white.png" alt="" />
    </header>
    
    <div class="container py-3">
      <form
        action="${pageContext.request.contextPath}/ControllerAdmin"
        method="get"
        style="display: flex; align-items: center"
      >
      
       <input type="hidden" name="operacion" value="buscarBici" /> <!-- Input oculto para pasar el value al controlador -->
        <select
          name="eligeMarca"
          id="eligeMarca"
          style="width: 20%; margin-right: 5%"
        >
          <option value="" disabled selected>Elige Marca</option>
          <option value="BH">BH</option>
          <option value="BMC">BMC</option>
          <option value="Bombtrack">Bombtrack</option>
          <option value="Cannondale">Cannondale</option>
          <option value="Commencal">Commencal</option>
          <option value="Cube">Cube</option>
          <option value="Dartmoor">Dartmoor</option>
          <option value="Fuji">Fuji</option>
          <option value="GT">GT</option>
          <option value="Haibike">Haibike</option>
          <option value="Kona">Kona</option>
          <option value="Moma Bikes">Moma Bikes</option>
          <option value="Mondraker">Mondraker</option>
          <option value="Monty">Monty</option>
          <option value="NS Bikes">NS Bikes</option>
          <option value="R Raymon">R Raymon</option>
          <option value="Radio Bikes">Radio Bikes</option>
          <option value="Rockrider">Rockrider</option>
          <option value="Santa cruz">Santa cruz</option>
          <option value="Sunn">Sunn</option>
          <option value="Trek">Trek</option>
        </select>

        <select
          name="eligeOrden"
          id="eligeOrden"
          style="width: 20%; margin-right: 5%"
        >
          <option value="" disabled selected>Elige Orden</option>
          <option value="marca">Marca</option>
          <option value="ascendente">Precio Ascendente</option>
          <option value="descendente">Precio Descendente</option>
        </select>

        <a href="#" class="text-decoration-none" onclick="toggleFavorito(event)" id="favIcon" style="font-size: 200%; margin-right: 5%; color: grey;">&#9733;</a>

  
  		<input type="hidden" name="fav" id="fav" value="false" />

        <button
          type="submit"
          style="padding: 0.5em 1em; font-size: 1em; margin-right: 5%"
        >
          Buscar
        </button>
      </form>
    </div>
    
    <main>
      <div class="container">
        <div class="row justify-content-center mt-3">
        <c:forEach items="${listadoBicicletas}" var="bicicleta">
          <div class="col-xl-2 col-lg-3 col-md-4 col-6 mb-3">
            <div class="card pb-3">
              <img class="card-img-top" src="${bicicleta.foto}" alt="Title" />
              <div class="card-body">
                <h4 class="card-title">${bicicleta.nombreMarca}</h4>
                <p class="card-text">${bicicleta.descripcion}</p>
                <p class="card-text">${bicicleta.precio}</p>
                <a href="#" class="text-decoration-none">&#9733;</a>
              </div>
            </div>
          </div>
          </c:forEach>
        </div>
      </div>
    </main>
    <footer></footer>
    <!-- Bootstrap JavaScript Libraries -->
    <script
      src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
      integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
      crossorigin="anonymous"
    ></script>

    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"
      integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+"
      crossorigin="anonymous"></script>
    
    <script>
  	function toggleFavorito(event) {
    event.preventDefault();

    const favInput = document.getElementById("fav");
    const favIcon = document.getElementById("favIcon");

    if (favInput.value === "false") {
      favInput.value = "true";
      favIcon.style.color = "gold";
    } else {
      favInput.value = "false";
      favIcon.style.color = "grey";
    }
  }
</script>
  </body>
</html>