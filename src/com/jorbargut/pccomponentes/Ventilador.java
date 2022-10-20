package com.jorbargut.pccomponentes;

public class Ventilador {
    /**
     * Atributos
     */
    private Integer id;
    private String brand;
    private String model;
    private String watts;
    private String maker;

    /**
     * Metodos
     */
    public Integer getId(){return id;}
    public void  setId(Integer id){this.id = id;}
    public String getBrand(){return brand;}
    public void setBrand(String brand){this.brand = brand;}
    public String getModel(){return model;}
    public void setModel(String model){this.model = model;}
    public String getWatts(){return watts; }
    public void setWatts(String watts){this.watts = watts;}
    public String getMaker(){return maker;}
    public void setMaker(String maker) {this.maker = maker;}
}
