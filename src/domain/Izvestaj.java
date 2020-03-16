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
public class Izvestaj implements Serializable{
    private String gazdinstvo;
    private Date datumRegistracije;
    private BigDecimal ukupnoSubvencija;
    private Long brojGrla;
    private String stado;

    public Izvestaj() {
    }

    public Izvestaj(String gazdinstvo, Date datumRegistracije, BigDecimal ukupnoSubvencija, Long brojGrla, String stado) {
        this.gazdinstvo = gazdinstvo;
        this.datumRegistracije = datumRegistracije;
        this.ukupnoSubvencija = ukupnoSubvencija;
        this.brojGrla = brojGrla;
        this.stado = stado;
    }

    public String getGazdinstvo() {
        return gazdinstvo;
    }

    public void setGazdinstvo(String gazdinstvo) {
        this.gazdinstvo = gazdinstvo;
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

    public Long getBrojGrla() {
        return brojGrla;
    }

    public void setBrojGrla(Long brojGrla) {
        this.brojGrla = brojGrla;
    }

    public String getStado() {
        return stado;
    }

    public void setStado(String stado) {
        this.stado = stado;
    }
    
    
    
}
