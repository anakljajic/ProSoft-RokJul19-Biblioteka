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
public class Zivotinja implements Serializable {

    private Long zivotinjaID;
    private String naziv;
    private int autohtonaVrsta;
    private BigDecimal subvencijaPoGrlu;

    public Zivotinja() {
    }

    public Zivotinja(Long zivotinjaID, String naziv, int autohtonaVrsta, BigDecimal subvencijaPoGrlu) {
        this.zivotinjaID = zivotinjaID;
        this.naziv = naziv;
        this.autohtonaVrsta = autohtonaVrsta;
        this.subvencijaPoGrlu = subvencijaPoGrlu;
    }

    public Long getZivotinjaID() {
        return zivotinjaID;
    }

    public void setZivotinjaID(Long zivotinjaID) {
        this.zivotinjaID = zivotinjaID;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getAutohtonaVrsta() {
        return autohtonaVrsta;
    }

    public void setAutohtonaVrsta(int autohtonaVrsta) {
        this.autohtonaVrsta = autohtonaVrsta;
    }

    public BigDecimal getSubvencijaPoGrlu() {
        return subvencijaPoGrlu;
    }

    public void setSubvencijaPoGrlu(BigDecimal subvencijaPoGrlu) {
        this.subvencijaPoGrlu = subvencijaPoGrlu;
    }

    @Override
    public String toString() {
        return naziv;
    }

}
