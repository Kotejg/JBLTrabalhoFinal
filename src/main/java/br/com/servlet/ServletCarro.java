package br.com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//feito pelo jefferson
import br.com.dao.IpvaDAO;
import br.com.dao.VeiculoDAO;
import br.com.entidade.Veiculo;

/**
 * Servlet implementation class ServletCarro
 */
@WebServlet("/ServletCarro")
public class ServletCarro extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private VeiculoDAO dao;
    private IpvaDAO idao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCarro() {
        super();
        dao = new VeiculoDAO(); 
        idao = new IpvaDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Auto-generated method stub 44824#$%$#4345#$%#$ahfuisdhasuidhsauidhasuiahsudisahudhasduiaiausihdisahduiashdauisshudiashdsaidhsauidhsauhdaishdCopiadodojeffersonsdhfosijfiosd
//		doGet(request, response); 
		
		String escolha = request.getParameter("btnopcao"); 
		  if(escolha.equals("insert")){
			insert(request, response);
		} else if (escolha.equals("update")) {
			update(request, response);
		}else if (escolha.equals("frmUpdate")) {
			frmUpdate(request, response);
		}else if (escolha.equals("delete")) {
			delete(request, response);
		} else if (escolha.equals("frmNewCar")) {
			frmNewVeiculo(request, response);
		} else if(escolha.equals("lista")) {
			listar(request, response);
			totalVeiculo(request, response);
		}else if (escolha.equals("listaCar")) {
			request.getRequestDispatcher("listCar.jsp").forward(request, response);
		}
			  listar(request, response);
			  totalVeiculo(request, response);
	} 
	
	protected void frmUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idfront = request.getParameter("id");  
		int id = Integer.parseInt(idfront);
		Veiculo veiculoBuscar = dao.buscarVeiculo(id);
		request.setAttribute("veiculo", veiculoBuscar);
		request.getRequestDispatcher("frmCar.jsp").forward(request, response);
		
		
	}
	
	protected void frmNewVeiculo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("frmCar.jsp").forward(request, response);
	}
	
	protected void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String modelo = request.getParameter("modelo");
		Integer ano = Integer.parseInt(request.getParameter("ano"));
		if((modelo != null && modelo !="") && (ano != null)) {
			Veiculo veiculo = new Veiculo(modelo, ano);
			dao.addVeiculo(veiculo);
		}
	}
	
	protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id")); 
		if(id != null) {
			dao.removeVeiculo(id);
		}
	}
	
	protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String modelo = request.getParameter("modelo"); 
		Integer id = Integer.parseInt(request.getParameter("id")); 
		Integer ano = Integer.parseInt(request.getParameter("ano")); 
		if((modelo != null && modelo !="") && (ano != null)) {
			Veiculo vl = new Veiculo(modelo, ano);
			vl.setIdVeiculo(id);
			dao.updateVeiculo(vl);
		}
	
		
	}
	
	protected void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("listaVeiculo", dao.getListVeiculo()); 
		request.setAttribute("ipva", idao.buscarIpva(1));
//		request.getRequestDispatcher("listCar.jsp").forward(request, response);
		
	} 
	
	
	protected void totalVeiculo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int totalVeiculo = 0; 
		int totalSem = 0;
		int totalCom = 0;
		for(Veiculo veiculo: dao.getListVeiculo()) {
			if (veiculo.getAno() <= idao.buscarIpva(1).getAno()) {
				totalSem++;
			}else {
				totalCom++;
			}
			totalVeiculo++;
		}
		request.setAttribute("totalVeiculo",totalVeiculo );
		request.setAttribute("totalCom",totalCom );
		request.setAttribute("totalSem",totalSem );
		request.getRequestDispatcher("listCar.jsp").forward(request, response);
	}

	
	
}

