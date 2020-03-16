/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;

/**
 *
 * @author anakl
 */
public class Poljoprivrednik implements Serializable {

    private Long poljoprivrednikID;
    private String ime;
    private String prezime;
    private String korisnickoIme;
    private String lozinka;

    public Poljoprivrednik() {
    }

    public Poljoprivrednik(Long poljoprivrednikID, String ime, String prezime, String korisnickoIme, String lozinka) {
        this.poljoprivrednikID = poljoprivrednikID;
        this.ime = ime;
        this.prezime = prezime;
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
    }

    public Long getPoljoprivrednikID() {
        return poljoprivrednikID;
    }

    public void setPoljoprivrednikID(Long poljoprivrednikID) {
        this.poljoprivrednikID = poljoprivrednikID;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }

}
