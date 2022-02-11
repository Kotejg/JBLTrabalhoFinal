package br.com.entidade;

public class Veiculo {
	private Integer idVeiculo; 
	private String modelo; 
	private Integer ano;
	
	public Veiculo(String modelo, Integer ano) {
		super();
		this.modelo = modelo;
		this.ano = ano;
	}

	public Integer getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(Integer idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	} 
	

	public String toString() {
		return "Veiculo [idVeiculo=" + idVeiculo + ", modelo=" + modelo + ", ano=" + ano + "]";
	}

}
