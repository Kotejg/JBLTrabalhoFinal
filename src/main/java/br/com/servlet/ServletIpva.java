package br.com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dao.IpvaDAO;
import br.com.entidade.Ipva;


/**
 * Servlet implementation class ServletIpva
 */
@WebServlet("/ServletIpva")
public class ServletIpva extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IpvaDAO dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletIpva() {
        super();
        dao = new IpvaDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: copia não comedia ").append(request.getContextPath()); 
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub copia não comedia
//		doGet(request, response);
		
		String escolha = request.getParameter("btnopcao"); 
		
		  if(escolha.equals("insert")){
			insert(request, response);
		} else if (escolha.equals("update")) {
			update(request, response);
		}else if (escolha.equals("frmUpdateIpva")) {
			frmUpdate(request, response);
		}else if (escolha.equals("delete")) {
			delete(request, response);
		} else if (escolha.equals("frmInsertIpva")) {
			frmNewIpva(request, response);
		} else if (escolha.equals("listaIpva")) {
			listar(request, response);
		}else if (escolha.equals("lista")) {
			request.setAttribute("listaIpva", dao.getListIpva());
		}	
		  
			listar(request, response);
		
	}
	
	public void frmUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id")); 
		Ipva ipva = dao.buscarIpva(id);
		request.setAttribute("ipva", ipva);
		request.getRequestDispatcher("frmIpva.jsp").forward(request, response);
		
	}
	
	public void frmNewIpva(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("frmIpva.jsp").forward(request, response);
	}
	
	public void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ano = request.getParameter("ano");
		if(ano != null && ano !="") {
			Integer ano1 = Integer.parseInt(ano);
			Ipva ip = new Ipva(ano1);
			dao.addIpva(ip); 
		}	
	}
	
	public void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id")); 
		if(id != null) {
			dao.removeIpva(id);
		}
	}
	
	public void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ano = request.getParameter("anoi"); 
		String id = request.getParameter("id"); 
		if(ano != null && ano !="") {
			Integer ano1 = Integer.parseInt(ano);
			int id1 = Integer.parseInt(id);
			Ipva ipva = new Ipva(ano1);
			ipva.setIdIpva(id1);
			dao.updateIpva(ipva);			
		}
	}
	
	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("listaIpva", dao.getListIpva()); 
		request.getRequestDispatcher("listIpva.jsp").forward(request, response);
	}

}
