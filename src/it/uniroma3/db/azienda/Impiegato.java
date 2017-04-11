package it.uniroma3.db.azienda;

import javax.persistence.*;
@Entity
public class Impiegato {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(nullable=false)
	private String nome,cognome,mansione;
	@ManyToOne
	private Divisione division;
	public Impiegato(String nome, String cognome, String mansione, Divisione division) {
		this.nome = nome;
		this.cognome = cognome;
		this.mansione = mansione;
		this.division = division;

	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getMansione() {
		return mansione;
	}
	public void setMansione(String mansione) {
		this.mansione = mansione;
	}
	public Divisione getDivision() {
		return division;
	}
	public void setDivision(Divisione division) {
		this.division = division;
	}
	

	@Override
	public String toString() {
		return "Impiegato [nome=" + nome + ", cognome=" + cognome + ", mansione=" + mansione + ", division=" + division
				+  "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		result = prime * result + ((division == null) ? 0 : division.hashCode());
		result = prime * result + ((mansione == null) ? 0 : mansione.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Impiegato other = (Impiegato) obj;
		if (cognome == null) {
			if (other.cognome != null)
				return false;
		} else if (!cognome.equals(other.cognome))
			return false;
		if (division == null) {
			if (other.division != null)
				return false;
		} else if (!division.equals(other.division))
			return false;
		if (mansione == null) {
			if (other.mansione != null)
				return false;
		} else if (!mansione.equals(other.mansione))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	 
	}


