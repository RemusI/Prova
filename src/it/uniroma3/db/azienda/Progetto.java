package it.uniroma3.db.azienda;

import java.util.*;

import javax.persistence.*;
@Entity
public class Progetto {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(nullable=false)
	private String nome,datainizio;
	@OneToMany(cascade={CascadeType.ALL})
	private List<Impiegato> schiavo;
	public Progetto(String nome, String datainizio, List<Impiegato> schiavo) {
		this.nome = nome;
		this.datainizio = datainizio;
		this.schiavo = schiavo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datainizio == null) ? 0 : datainizio.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((schiavo == null) ? 0 : schiavo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Progetto other = (Progetto) obj;
		if (datainizio == null) {
			if (other.datainizio != null)
				return false;
		} else if (!datainizio.equals(other.datainizio))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (schiavo == null) {
			if (other.schiavo != null)
				return false;
		} else if (!schiavo.equals(other.schiavo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Progetto [nome=" + nome + ", datainizio=" + datainizio + ", schiavo=" + schiavo + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDatainizio() {
		return datainizio;
	}
	public void setDatainizio(String datainizio) {
		this.datainizio = datainizio;
	}
	public List<Impiegato> getSchiavo() {
		return schiavo;
	}
	public void setSchiavo(List<Impiegato> schiavo) {
		this.schiavo = schiavo;
	}
}
