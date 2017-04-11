package it.uniroma3.db.azienda;

import java.util.*;

import javax.persistence.*;
@Entity
public class Divisione {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(nullable=false)
	private String nomedivisione;
	@OneToMany(mappedBy="division")
	private List<Impiegato> schiavo;
	public Divisione(String nomedivisione, List<Impiegato> schiavo) {
		this.nomedivisione = nomedivisione;
		this.schiavo = schiavo;
	}
	public String getNomedivisione() {
		return nomedivisione;
	}
	public void setNomedivisione(String nomedivisione) {
		this.nomedivisione = nomedivisione;
	}
	public List<Impiegato> getSchiavo() {
		return schiavo;
	}
	public void setSchiavo(List<Impiegato> schiavo) {
		this.schiavo = schiavo;
	}
	@Override
	public String toString() {
		return "Divisione [nomedivisione=" + nomedivisione + ", schiavo=" + schiavo + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomedivisione == null) ? 0 : nomedivisione.hashCode());
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
		Divisione other = (Divisione) obj;
		if (nomedivisione == null) {
			if (other.nomedivisione != null)
				return false;
		} else if (!nomedivisione.equals(other.nomedivisione))
			return false;
		if (schiavo == null) {
			if (other.schiavo != null)
				return false;
		} else if (!schiavo.equals(other.schiavo))
			return false;
		return true;
	}
	
}
