package com.jorbargut.pccomponentes;

public class PlacaBase {
    /**
     * Atributos
     */
    private Integer id;
    private String marca;
    private String fabricante;
    private String dimension;
    /**
     * Metodos
      */
    public Integer getId(){
        return id;
    }
    public void  setId(Integer id){
        this.id = id;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getDimension(){
        return dimension;
    }
    public void setDimension(String dimension){
        this.dimension = dimension;
    }
    public String getFabricante(){
        return fabricante;
    }
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;}
}
