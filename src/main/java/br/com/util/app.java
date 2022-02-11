package br.com.util;

import br.com.dao.IpvaDAO;
import br.com.entidade.Ipva;

public class app {

	public static void main(String[] args) {
		Ipva ip; 
		IpvaDAO dao = new IpvaDAO();
		
		
		for (int i= 0; i< 5; i++) {
			ip = new Ipva(i);
			 dao.addIpva(ip);
		}

	}

}
