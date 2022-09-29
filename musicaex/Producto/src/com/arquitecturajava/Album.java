package com.arquitecturajava;
public class Album {
  private String ncancion;
  private double alanzamiento;
 
  public String getNcancion() {
    return ncancion;
  }
  public void setNcancion(String ncancion) {
    this.ncancion = ncancion;
  }
  public double getAlanzamiento() {
    return alanzamiento;
  }
  public void setAlanzamiento(double alanzamiento) {
    this.alanzamiento = alanzamiento;
  }
  public Album(String ncancion, double alanzamiento) {
    super();
    this.ncancion = ncancion;
    this.alanzamiento = alanzamiento;
  }
  
  public void addAlbum(Album p) {
    lista.add(p);
  }
  public void addAlbum(String ncancion, double alanzamiento) {
    lista.add(new Album(ncancion, alanzamiento));
  }
  
}