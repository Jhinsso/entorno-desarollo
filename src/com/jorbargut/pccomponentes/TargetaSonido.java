package com.jorbargut.pccomponentes;

public class TargetaSonido {
    /**
     * Atributos
     */
    private Integer id;
    private String brand;
    private String model;
    private String memory;
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
    public String getMemory(){return memory; }
    public void setMemory(String memory){this.memory = memory;}
    public String getMaker(){return maker;}
    public void setMaker(String maker) {this.maker = maker;}
}
