/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author anakl
 */
public class Gazdinstvo implements Serializable {

    private Long gazdinstvoID;
    private String naziv;
    private Date datumRegistracije;
    private BigDecimal ukupnoSubvencija;
    private Poljoprivrednik poljoprivrednik;

    public Gazdinstvo() {
    }

    public Gazdinstvo(Long gazdinstvoID, String naziv, Date datumRegistracije, BigDecimal ukupnoSubvencija, Poljoprivrednik poljoprivrednik) {
        this.gazdinstvoID = gazdinstvoID;
        this.naziv = naziv;
        this.datumRegistracije = datumRegistracije;
        this.ukupnoSubvencija = ukupnoSubvencija;
        this.poljoprivrednik = poljoprivrednik;
    }

    public Long getGazdinstvoID() {
        return gazdinstvoID;
    }

    public void setGazdinstvoID(Long gazdinstvoID) {
        this.gazdinstvoID = gazdinstvoID;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Date getDatumRegistracije() {
        return datumRegistracije;
    }

    public void setDatumRegistracije(Date datumRegistracije) {
        this.datumRegistracije = datumRegistracije;
    }

    public BigDecimal getUkupnoSubvencija() {
        return ukupnoSubvencija;
    }

    public void setUkupnoSubvencija(BigDecimal ukupnoSubvencija) {
        this.ukupnoSubvencija = ukupnoSubvencija;
    }

    public Poljoprivrednik getPoljoprivrednik() {
        return poljoprivrednik;
    }

    public void setPoljoprivrednik(Poljoprivrednik poljoprivrednik) {
        this.poljoprivrednik = poljoprivrednik;
    }

    @Override
    public String toString() {
        return naziv;
    }

}
