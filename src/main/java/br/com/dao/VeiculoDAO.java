package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.entidade.Veiculo;
import br.com.util.Conexao;

public class VeiculoDAO {

	public VeiculoDAO() {
			
		}
		
		public void addVeiculo(Veiculo newVeiculo) {
			Conexao conexao = Conexao.getInstance();
			Connection connection = conexao.getConnection();
			
			try {
				PreparedStatement preStat = connection.prepareStatement("insert into veiculo (modelo, ano) values (?,?)");
				preStat.setString(1, newVeiculo.getModelo());
				preStat.setInt(2, newVeiculo.getAno());
				System.out.println(preStat);
				preStat.executeUpdate();
				System.out.println("Comando executado");
				preStat.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
		}
		
		
		
		
		public ArrayList<Veiculo> getListVeiculo(){
			Conexao conexao = Conexao.getInstance();
			Connection connection = conexao.getConnection();
			ArrayList<Veiculo> lista = new ArrayList<Veiculo>();
			try {
				PreparedStatement preStat = connection.prepareStatement("select * from veiculo");
				ResultSet resultSet = preStat.executeQuery();			
				
				while (resultSet.next()) {
					Integer id2 = resultSet.getInt("id_veiculo");
					String model = resultSet.getString("modelo");
					Integer ano = resultSet.getInt("ano");
					Veiculo Veiculo = new Veiculo(model,ano);
					Veiculo.setIdVeiculo(id2);;
					lista.add(Veiculo);
				}
				resultSet.close();
				preStat.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return lista;
		}
		
		
		public void removeVeiculo(Integer id) {
			Conexao conexao = Conexao.getInstance();
			Connection connection = conexao.getConnection();
			
			try {
				PreparedStatement preStat = connection.prepareStatement("delete from veiculo where id_veiculo = ?");
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
		
		public void updateVeiculo(Veiculo updateVeiculo) {
			Conexao conexao = Conexao.getInstance();
			Connection connection = conexao.getConnection();
			
			try {
				PreparedStatement preStat = connection.prepareStatement("update veiculo set modelo = ?, ano = ? where id_veiculo = ?");
				preStat.setString(1, updateVeiculo.getModelo());
				preStat.setInt(2, updateVeiculo.getAno());
				preStat.setInt(3, updateVeiculo.getIdVeiculo());
				System.out.println(preStat);
				preStat.executeUpdate();
				System.out.println("Comando executado");
				preStat.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		
		public Veiculo buscarVeiculo(Integer id) {
			Conexao conexao = Conexao.getInstance();
			Connection connection = conexao.getConnection();
			Veiculo Veiculo = null;
			try {
				PreparedStatement preStat = connection.prepareStatement("select * from veiculo where id_veiculo = ?");
				preStat.setInt(1, id);
				ResultSet resultSet = preStat.executeQuery();			
				while ( resultSet.next()) {
					Integer id2 = resultSet.getInt("id_veiculo");
					String model = resultSet.getString("modelo");
					Integer ano = resultSet.getInt("ano");
					Veiculo = new Veiculo(model,ano);
					Veiculo.setIdVeiculo(id2);;
				}
				 resultSet.close();
				 preStat.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return Veiculo;
		}
		
		
		
		
	}

	
