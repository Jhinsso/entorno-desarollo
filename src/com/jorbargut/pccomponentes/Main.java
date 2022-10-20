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

        System.out.println(nvidia.getBrand());
        System.out.println(nvidia.getModel());
        System.out.println(nvidia.getMaker());
        System.out.println(nvidia.getMemory());
        /**
         * RAM
         */
        RAM corsair= new RAM();
        corsair.setId(1);
        corsair.setBrand("Corsair");
        corsair.setModel("Vengeance LPX DDR4 3200 PC4-25600");
        corsair.setMemory("8Gb");
        corsair.setMaker("Corsair");

        System.out.println(corsair.getBrand());
        System.out.println(corsair.getModel());
        System.out.println(corsair.getMaker());
        System.out.println(corsair.getMemory());

        /**
         *Disco Duro
         */
        DiscoDuro samsung= new DiscoDuro();
        samsung.setId(1);
        samsung.setBrand("980");
        samsung.setModel("PCIe 3.0 NVMe M.2");
        samsung.setMemory("1Tb");
        samsung.setMaker("Samsung");

        System.out.println(samsung.getBrand());
        System.out.println(samsung.getModel());
        System.out.println(samsung.getMaker());
        System.out.println(samsung.getMemory());

        /**
         *Targeta de Sonido
         */
        TargetaSonido asus1= new TargetaSonido();
        asus1.setId(1);
        asus1.setBrand("Xonar");
        asus1.setModel("AE Tarjeta de Sonido 7.1 PCIe");
        asus1.setMaker("Asus");

        System.out.println(asus1.getBrand());
        System.out.println(asus1.getModel());
        System.out.println(asus1.getMaker());
        /**
         * DVD
         */
        DVD hitachi= new DVD();
        hitachi.setId(1);
        hitachi.setBrand("Hitachi-LG");
        hitachi.setModel("GH24NSD5 Grabadora DVD-RW Interna Negra");
        hitachi.setMaker("Hitachi-LG");

        System.out.println(hitachi.getBrand());
        System.out.println(hitachi.getModel());
        System.out.println(hitachi.getMaker());
        /**
         * Altavoces
         */
        Altavoces tempest= new Altavoces();
        tempest.setId(1);
        tempest.setBrand("M20 RGB");
        tempest.setModel("Master 2.0 Gaming Speakers");
        tempest.setMaker("Tempest");

        System.out.println(tempest.getBrand());
        System.out.println(tempest.getModel());
        System.out.println(tempest.getMaker());
        /**
         * Monitor
         */
        Monitor lenovo= new Monitor();
        lenovo.setId(1);
        lenovo.setBrand("Lenovo");
        lenovo.setModel("C24-25 23.8\" WLED FullHD FreeSync");
        lenovo.setMaker("Lenovo");

        System.out.println(lenovo.getBrand());
        System.out.println(lenovo.getModel());
        System.out.println(lenovo.getMaker());
    }
}