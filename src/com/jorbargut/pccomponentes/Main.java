package com.jorbargut.pccomponentes;

public class Main {
    public static void main(String[] args) {
        System.out.println("Winner Winner Chicken Dinner");
        /**
         * Código a ejecutar por administrador de la empresa.
         * Código para introducir información de procesadores.
         */

        /**
         * Procesador
         */

        Procesador amd= new Procesador();
        amd.setId(1);
        amd.setMarca("Rayzen 7");
        amd.setFabricante("AMD");

        System.out.println(amd.getMarca());
        System.out.println(amd.getFabricante());

        Procesador pentium= new Procesador();
        pentium.setId(1);
        pentium.setMarca("i7");
        pentium.setFabricante("Intel");

        System.out.println(pentium.getMarca());
        System.out.println(pentium.getFabricante());
        /**
         * Placa Base
         */

        PlacaBase asus= new PlacaBase();
        asus.setId(1);
        asus.setMarca("MonsterGX234_DDR4");
        asus.setFabricante("Asus");
        asus.setDimension("10x35");

        System.out.println(asus.getMarca());
        System.out.println(asus.getFabricante());
        System.out.println(asus.getDimension());


        /**
         * Grafica
         */
         Grafica nvidia= new Grafica();
         nvidia.setId(1);
         nvidia.setBrand("Nvidia");
         nvidia.setModel("GTX 3090");
         nvidia.setMemory("8Gb");
         nvidia.setMaker("Intel");
        /**
         * RAM
         */


        /**
         *HDD o SDD
         */


        /**
         *
         */
    }
}