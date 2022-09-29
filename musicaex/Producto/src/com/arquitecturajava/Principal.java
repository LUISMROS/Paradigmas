package com.arquitecturajava;
import java.util.ArrayList;
import java.util.List;

public class Principal {
  public static void main(String[] args) {
    
   Album p1= new Album ("rock",3);
    
    Genero b= new Genero();
    b.addAlbum(p1);
    b.addAlbum("ADAN",4);
  
    List<Album> albumes = new ArrayList<Album>();
    albumes.add(new Album("JUNGLE",2));
    albumes.add(new Album("GLADIATOR",3));
    
    Album p2= new Album ("ELECTRONICA",3);
    
    Genero c= new Genero ();
    b.addAlbum(p1);
    b.addAlbum("STAY",4);
  
    List<Album> albumes = new ArrayList<Album>();
    albumes.add(new Album("RUSH",2));
    albumes.add(new Album("ANIMAL",3));
    
    Album p3= new Album ("RAP",3);
    
    Genero d= new Genero();
    b.addAlbum(p1);
    b.addAlbum("VENOM",4);
  
    List<Album> albumes = new ArrayList<Album>();
    albumes.add(new Album("GODZILLA",2));
    albumes.add(new Album("MARSH",3));
  
    
   Album p4= new Album ("INDY",3);
    
    Genero e= new Genero();
    b.addAlbum(p1);
    b.addAlbum("DIGITAL",4);
  
    List<Album> albumes = new ArrayList<Album>();
    albumes.add(new Album("ZERO",2));
    albumes.add(new Album("LOVE",3));
    
    
  }
}

  
