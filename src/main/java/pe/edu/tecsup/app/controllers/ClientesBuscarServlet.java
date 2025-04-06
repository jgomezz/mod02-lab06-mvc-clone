package pe.edu.tecsup.app.controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pe.edu.tecsup.app.models.Cliente;



/**
 * Servlet implementation class ClientesBuscarServlet
 */
@WebServlet("/ClientesBuscarServlet")
public class ClientesBuscarServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	//          key , value
	private Map<String,Cliente> clientes 
		= new HashMap<String, Cliente>();

	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientesBuscarServlet() {
        super();
    	clientes.put("X001",new Cliente("X001","Jaime","Gomez","Diaz"));
    	clientes.put("X002",new Cliente("X002","Maria","Mercedes","Leon"));
    	clientes.put("X003",new Cliente("X003","Pedro","Candia","Ruiz"));
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String codigo = request.getParameter("txtCodigo");
		
		System.out.println("Codigo --> " + codigo);
		
		// Procesamiento de datos
		System.out.println(clientes);
		
		Cliente value = clientes.get(codigo);

		System.out.println(value);
		
		request.getRequestDispatcher("respuesta.jsp")
			   .forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
