package br.com.entidade;

public class Ipva {

	private Integer idIpva; 
	private Integer ano;
	
	public Ipva(Integer ano) {
		super();
		this.ano = ano;
	}

	public Integer getIdIpva() {
		return idIpva;
	}

	public void setIdIpva(Integer idIpva) {
		this.idIpva = idIpva;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	
	
	
	public String toString() {
		return "Ipva [idIpva=" + idIpva + ", ano=" + ano + "]";
	} 
	
}
