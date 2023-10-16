/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vanja
 */
public class Knjiga {
    private String naslov;
    private Autor autor;   
    private String ISBN;
    private int godinaIzdanja;
    private Zanr zanr;

    public Knjiga() {
    }

    public Knjiga(String naslov, Autor autor, String ISBN, int godinaIzdanja, Zanr zanr) {
        this.naslov = naslov;
        this.autor = autor;
        this.ISBN = ISBN;
        this.godinaIzdanja = godinaIzdanja;
        this.zanr = zanr;
    }

    
    
    
    
    
    public Zanr getZanr() {
        return zanr;
    }

    public void setZanr(Zanr zanr) {
        this.zanr = zanr;
    }
    
    
    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    @Override
    public String toString() {
        return "Knjiga{" + "naslov=" + naslov + ", autor=" + autor + ", ISBN=" + ISBN + ", godinaIzdanja=" + godinaIzdanja + '}';
    }
    
    
    
    
    
    
}
