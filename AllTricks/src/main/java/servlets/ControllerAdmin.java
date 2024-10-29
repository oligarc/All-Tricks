package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import daos.DaoBicicleta;
import entidades.Bicicleta;

/**
 * Servlet implementation class ControllerAdmin
 */
public class ControllerAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String operacion = request.getParameter("operacion");
		
		switch (operacion) {
		case "iniciar":
			
			DaoBicicleta daoBici = new DaoBicicleta();
			ArrayList<Bicicleta> listadoBicicletas = new ArrayList<Bicicleta>();
			listadoBicicletas = daoBici.listadoBicicletasTrampa();
			request.setAttribute("listadoBicicletas", listadoBicicletas);
			request.getRequestDispatcher("home.jsp").forward(request, response);
			
			break;
			
		case "buscarBici":
			
			String marcaSeleccionada = request.getParameter("eligeMarca");
			String ordenElegida = request.getParameter("eligeOrden");
			int fav = Integer.parseInt(request.getParameter("fav"));
			DaoBicicleta daoBici2 = new DaoBicicleta();
			ArrayList<Bicicleta> listadoBicicletas2 = new ArrayList<Bicicleta>();
			
			listadoBicicletas2 = daoBici2.listadoBicicletasMarcaOrdenFavorito(marcaSeleccionada, ordenElegida, fav);
			request.setAttribute("listadoBicicletas", listadoBicicletas2);
			request.getRequestDispatcher("home.jsp").forward(request, response);
			
			break;
			
		case "cambiarFav":
			
			ArrayList<Bicicleta> listadoBicicletas3 = new ArrayList<Bicicleta>();
			DaoBicicleta daoBici3 = new DaoBicicleta();
			int idBici = Integer.parseInt(request.getParameter("idBici"));
			int valorFav = Integer.parseInt(request.getParameter("favBici"));
			
			daoBici3.cambiarFav(idBici, valorFav);
			
			listadoBicicletas3 = daoBici3.listadoBicicletasTrampa();
			request.setAttribute("listadoBicicletas", listadoBicicletas3);
			request.getRequestDispatcher("home.jsp").forward(request, response);
			
			break;
		
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
