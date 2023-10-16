/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Autor;
import model.Knjiga;
import model.Zanr;

/**
 *
 * @author vanja
 */
public class Controller {
    
    private List<Knjiga> listaKnjiga = new ArrayList<>();
    private List<Autor> listaAutora = new ArrayList<>();

    private static Controller instance;
    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }
    private Controller() {
        Autor autor1 = new Autor("Ivo", "Andric", 1892, "Biografija autora Ive Andrica bla bla");
        Autor autor2 = new Autor("Danilo", "Kiš", 1935, "Biografija Danila Kisa bla bla bla bla");
        Autor autor3 = new Autor("Mesa", "Selimovic", 1910, "Mesa Selimovic je rodjen u BiH");
                
        Knjiga knjiga1 = new Knjiga("Na Drini ćuprija", autor1, "1234567890", 1945,Zanr.DETEKTIVSKI);
        Knjiga knjiga2 = new Knjiga("Bašta, pepeo", autor2, "0987654321", 1982,Zanr.ISTORIJSKI);
        Knjiga knjiga3 = new Knjiga("Tvrđava", autor3, "1122334455", 1970,Zanr.NAUCNA_FANTASTIKA);
         
          listaKnjiga.add(knjiga1);
          listaKnjiga.add(knjiga2);
          listaKnjiga.add(knjiga3);
          
          listaAutora.add(autor1);
          listaAutora.add(autor2);
          listaAutora.add(autor3);
    }

    public List<Knjiga> getListaKnjiga() {
        return listaKnjiga;
    }

    public void setListaKnjiga(List<Knjiga> listaKnjiga) {
        this.listaKnjiga = listaKnjiga;
    }

    public List<Autor> getListaAutora() {
        return listaAutora;
    }

    public void setListaAutora(List<Autor> listaAutora) {
        this.listaAutora = listaAutora;
    }

    public void obrisiKnjigu(int selektovaniRed) {
        listaKnjiga.remove(selektovaniRed);
    }

    public void dodajKnjigu(Knjiga novaKnjiga) {
        listaKnjiga.add(novaKnjiga);
        //System.out.println("KNJIGA JE DODATA");
        //System.out.println(listaKnjiga);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
