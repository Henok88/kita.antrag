package de.behoerde.kita.antrag.persistence.verwaltung.entity;

import javax.persistence.*;

import de.behoerde.kita.antrag.core.enums.Status;

import java.time.ZonedDateTime;

@Entity
public class Eintrag {

    @Id
    @GeneratedValue
    private Long aktenzeichen;    

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

    public Long getAktenzeichen() {
		return aktenzeichen;
	}

	public void setAktenzeichen(Long aktenzeichen) {
		this.aktenzeichen = aktenzeichen;
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
