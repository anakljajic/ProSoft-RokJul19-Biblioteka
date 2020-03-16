/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author anakl
 */
public class Stado implements Serializable {

    private Gazdinstvo gazdinstvo;
    private Long stadoID;
    private Long brojGrla;
    private BigDecimal iznosSubvencije;
    private Zivotinja zivotinja;

    public Stado() {
    }

    public Stado(Gazdinstvo gazdinstvo, Long stadoID, Long brojGrla, BigDecimal iznosSubvencije, Zivotinja zivotinja) {
        this.gazdinstvo = gazdinstvo;
        this.stadoID = stadoID;
        this.brojGrla = brojGrla;
        this.iznosSubvencije = iznosSubvencije;
        this.zivotinja = zivotinja;
    }

    public Gazdinstvo getGazdinstvo() {
        return gazdinstvo;
    }

    public void setGazdinstvo(Gazdinstvo gazdinstvo) {
        this.gazdinstvo = gazdinstvo;
    }

    public Long getStadoID() {
        return stadoID;
    }

    public void setStadoID(Long stadoID) {
        this.stadoID = stadoID;
    }

    public Long getBrojGrla() {
        return brojGrla;
    }

    public void setBrojGrla(Long brojGrla) {
        this.brojGrla = brojGrla;
    }

    public BigDecimal getIznosSubvencije() {
        return iznosSubvencije;
    }

    public void setIznosSubvencije(BigDecimal iznosSubvencije) {
        this.iznosSubvencije = iznosSubvencije;
    }

    public Zivotinja getZivotinja() {
        return zivotinja;
    }

    public void setZivotinja(Zivotinja zivotinja) {
        this.zivotinja = zivotinja;
    }

}
