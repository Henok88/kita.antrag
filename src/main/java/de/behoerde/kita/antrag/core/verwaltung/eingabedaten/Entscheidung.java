package de.behoerde.kita.antrag.core.verwaltung.eingabedaten;

/**
 * Eine Antrag-Entscheidung
 * 
 * Entspricht: Request Body ist JSON: {boolean:antragAbgelehnt, number:zugewieseneKita}
 * 
 * @author nedislav
 *
 */
public class Entscheidung {

	private boolean antragAbgelehnt;
	
	private Long zugewieseneKita;

	public boolean isAntragAbgelehnt() {
		return antragAbgelehnt;
	}

	public void setAntragAbgelehnt(boolean antragAbgelehnt) {
		this.antragAbgelehnt = antragAbgelehnt;
	}

	public Long getZugewieseneKita() {
		return zugewieseneKita;
	}

	public void setZugewieseneKita(Long zugewieseneKita) {
		this.zugewieseneKita = zugewieseneKita;
	}
	
	@Override
    public String toString() {
        return "Entscheidung { antragAbgelehnt='" + antragAbgelehnt + "'" + ", zugewieseneKita='" + zugewieseneKita + "' }";
    }
	
}
