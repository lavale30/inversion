package com.mintic2022.r2.retos.ciclo2;





public class App 

{

    public static void main( String[] args ) 
    {
        Inversion obj =new Inversion();
        Inversion objNew=new Inversion(12,2000000,3.0);
        System.out.println(objNew.calcularInteresSimple());
        System.out.println(objNew.calcularInteresCompuesto());
        System.out.println(objNew.compararInversion());
        
        System.out.println(objNew.calcularInteresSimple());
        System.out.println(objNew.calcularInteresCompuesto());
        System.out.println(objNew.compararInversion());
        

        


    }
}
