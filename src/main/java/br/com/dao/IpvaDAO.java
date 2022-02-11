package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.entidade.Ipva;
import br.com.util.Conexao;


public class IpvaDAO {

	public IpvaDAO() {}
		
		public void addIpva(Ipva newIpva) {
			Conexao conexao = Conexao.getInstance();
			Connection connection = conexao.getConnection();
			
			try {
				PreparedStatement preStat = connection.prepareStatement("insert into ipva (ano) values (?)");
				preStat.setInt(1, newIpva.getAno());
				System.out.println(preStat);
				preStat.executeUpdate();
				System.out.println("Comando executado");
				preStat.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
		}
		
		
		public ArrayList<Ipva> getListIpva(){
			Conexao conexao = Conexao.getInstance();
			Connection connection = conexao.getConnection();
			ArrayList<Ipva> lista = new ArrayList<Ipva>();
			try {
				PreparedStatement preStat = connection.prepareStatement("select * from ipva");
				ResultSet resultSet = preStat.executeQuery();			
				
				while (resultSet.next()) {
					Integer id = resultSet.getInt("id_ipva");
					Integer ano = resultSet.getInt("ano");
					Ipva ipva = new Ipva(ano);
					ipva.setIdIpva(id);
					lista.add(ipva);
				}
				resultSet.close();
				preStat.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return lista;
		}
		
		
		public void removeIpva(Integer id) {
			Conexao conexao = Conexao.getInstance();
			Connection connection = conexao.getConnection();
			
			try {
				PreparedStatement preStat = connection.prepareStatement("delete from ipva where id_ipva = ?");
				preStat.setInt(1, id);
				System.out.println(preStat);
				preStat.executeUpdate();
				System.out.println("Comando executado");
				preStat.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();       
			}
			
		}
		
		public void updateIpva(Ipva updateIpva) {
			Conexao conexao = Conexao.getInstance();
			Connection connection = conexao.getConnection();
			
			try {
				PreparedStatement preStat = connection.prepareStatement("update ipva set ano = ? where id_ipva = ?");
				preStat.setInt(1, updateIpva.getAno());
				preStat.setInt(2, updateIpva.getIdIpva());
				System.out.println(preStat);
				preStat.executeUpdate();
				System.out.println("Comando executado");
				preStat.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		
		public Ipva buscarIpva(Integer id) {
			Conexao conexao = Conexao.getInstance();
			Connection connection = conexao.getConnection();
			Ipva ipva = null;
			try {
				PreparedStatement preStat = connection.prepareStatement("select * from ipva where id_ipva = ?");
				preStat.setInt(1, id);
				ResultSet resultSet = preStat.executeQuery();			
				while ( resultSet.next()) {
					Integer ida = resultSet.getInt("id_ipva");
					Integer ano = resultSet.getInt("ano");
					ipva = new Ipva(ano);
					ipva.setIdIpva(ida);
					
				}
				 resultSet.close();
				 preStat.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ipva;
		}
		
	}


