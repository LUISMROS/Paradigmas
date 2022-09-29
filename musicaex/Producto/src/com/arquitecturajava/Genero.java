package com.arquitecturajava;
import java.util.ArrayList;
import java.util.List;
public class Genero {
    
  private List<Album> lista = new ArrayList<Album>();
  
  
  public Genero() {
    super();
  }
  public Genero(List<Album> lista) {
    super();
    this.lista = lista;
  }
  public void addAlbum(Album p) {
    lista.add(p);
  }
  public void addAlbum(String ncancion, double alanzamiento) {
    lista.add(new Album(ncancion, alanzamiento));
  }
  public void addAlbum(List<Album> albumes) {
    lista.addAll(albumes);
  }
  public void addAlbum(Album... albumes) {
    for (Album f : albumes) {
      lista.add(f);
    }
  }
}