package de.behoerde.kita.antrag.core.verwaltung.ausgabedaten;

import com.fasterxml.jackson.annotation.JsonFormat;

import de.behoerde.kita.antrag.core.enums.Status;

import java.time.ZonedDateTime;

import javax.persistence.Lob;

import java.time.ZonedDateTime;

/**
 *  Schnittstellenobjekt zum Darstellen eines Eintrags.
 */
public class EintragDaten {
private String nachnameAntragssteller;
    
    private String vornameAntragssteller;
    
    private String email;
    
    private String nachnameKind;
    
    private String vornameKind;
    
    private Long kitaIdEins;
    
    private Long kitaIdZwei;
    
    private Long kitaIdDrei;
    
    private Status status;

    @Lob
    private String anmerkung;

    private ZonedDateTime datum;

    /**
     * Erzeugt ein neues Schnittstellenobjekt zum Darstellen eines Eintrags.
     *
     * @param verfasser Der Verfasser des Eintrags
     * @param text Der Text des Eintrags
     * @param datum Datum und Uhrzeit des Eintrags.
     */
    public EintragDaten(String nachnameAntragssteller, String vornameAntragssteller, String email,
    		String nachnameKind, String vornameKind, Long kitaIdEins, Long kitaIdZwei, Long kitaIdDrei, Status status,
    		String anmerkung, ZonedDateTime datum) {
    	this.nachnameAntragssteller = nachnameAntragssteller;
        this.vornameAntragssteller = vornameAntragssteller;
        this.email = email;
        this.nachnameKind = nachnameKind;
        this.vornameKind = vornameKind;
        this.kitaIdEins = kitaIdEins;
        this.kitaIdZwei = kitaIdZwei;
        this.kitaIdDrei = kitaIdDrei;
        this.status = status;
        this.anmerkung = anmerkung;
        this.datum = datum;
    }

    public String getNachnameAntragssteller() {
		return nachnameAntragssteller;
	}


	public void setNachnameAntragssteller(String nachnameAntragssteller) {
		this.nachnameAntragssteller = nachnameAntragssteller;
	}


	public String getVornameAntragssteller() {
		return vornameAntragssteller;
	}


	public void setVornameAntragssteller(String vornameAntragssteller) {
		this.vornameAntragssteller = vornameAntragssteller;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNachnameKind() {
		return nachnameKind;
	}


	public void setNachnameKind(String nachnameKind) {
		this.nachnameKind = nachnameKind;
	}


	public String getVornameKind() {
		return vornameKind;
	}


	public void setVornameKind(String vornameKind) {
		this.vornameKind = vornameKind;
	}


	public Long getKitaIdEins() {
		return kitaIdEins;
	}


	public void setKitaIdEins(Long kitaIdEins) {
		this.kitaIdEins = kitaIdEins;
	}


	public Long getKitaIdZwei() {
		return kitaIdZwei;
	}


	public void setKitaIdZwei(Long kitaIdZwei) {
		this.kitaIdZwei = kitaIdZwei;
	}


	public Long getKitaIdDrei() {
		return kitaIdDrei;
	}


	public void setKitaIdDrei(Long kitaIdDrei) {
		this.kitaIdDrei = kitaIdDrei;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public String getAnmerkung() {
		return anmerkung;
	}


	public void setAnmerkung(String anmerkung) {
		this.anmerkung = anmerkung;
	}


	public ZonedDateTime getDatum() {
        return datum;
    }

    public void setDatum(ZonedDateTime datum) {
        this.datum = datum;
    }
}
