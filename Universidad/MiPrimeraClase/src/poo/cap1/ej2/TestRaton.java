package poo.cap1.ej2;

import java.util.Scanner;


public class TestRaton {
    public static void main(String [] args){
        /*
        System.out.println("Ingrese la tasa de crecimiento: ");
        double tasa;
        int dias;
        Scanner input = new Scanner(System.in);
        tasa = input.nextDouble();
        System.out.println("Ingrese la cantidad de dias: ");
        dias = input.nextInt();
        
        Raton gus = new Raton(); //variable de la clase raton
        
        System.out.println("\nRaton gus: ");
        gus.setTasaCrecimientoPorcentual(tasa);
        
        gus.desplegar();
        gus.crecer(dias);
        gus.desplegar();
        Raton pepe = new Raton(); //Declaracion e inicializacion
        System.out.println("\nRaton Pepe: ");
        pepe.setTasaCrecimientoPorcentual(20);
        pepe.desplegar();
        pepe.crecer(dias);
        pepe---.desplegar();
        */
        
        
        //RATON JAC
//        Raton jac = new Raton();
//        jac.setTasaCrecimientoPorcentual(30);
//       // jac.crecer(4);
//       jac.crecer();
//       jac.crecer();
//       jac.crecer();
//       jac.crecer();
//       jac.desplegar();
//      
//        System.out.println("Edad de jac " + jac.getEdad() + jac.toString());
//        System.out.println(jac.getEdad());
//        
//        if(jac.esAdolescente()){
//            System.out.println("Jac es adolescente");
//        }
//        if(!jac.esAdolescente()){
//            System.out.println("Jac no es un adolescente");
//        }
        
//        System.out.println(jac.toString());
        
        //Nuevo raton
       // Raton lola = new Raton(4.0 ,6); se manda al segundo constructor
       //EL METODO EQUALS EN LA DEFINICION DE LA CLASE DEL OBJETO COMPARA LAS
        //VARIABLES DE INSTANCIA DE DOS OBJETOS.
        Raton jaq = new Raton("jaq", 6.0, 4);
        Raton lola = new Raton("lola", 6.0, 4);

        if (lola.equals(jaq)) {
            System.out.println("ambos ratones tienen la misma edad y peso");

        } else {
            System.out.println("Los ratones difieren en edad o peso");
        }

        
         lola.setTasaCrecimientoPorcentual(50);
        lola.crecer(90);
       
        System.out.println(lola.toString());
        
        Veterinario vet = new Veterinario();
        String m1 = vet.diagnosticar(lola);
        
        System.out.println(m1);
         System.out.println(lola.toString());


       
       
                
        
             
    }
    
}
