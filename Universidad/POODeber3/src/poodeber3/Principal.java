
package poodeber3;

import java.util.Scanner;


public class Principal {

   
    public static void main(String[] args) {
        
        String nombre, apellido, cedula;
        Scanner input = new Scanner(System.in);
        
        System.out.println("\tDEBER #4");
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.print("Ingrese su apellido: ");
        apellido = input.nextLine();
        System.out.print("Ingrese su Nro. de cedula: ");
        cedula = input.nextLine();
        
        
        DatosPersona persona1 = new DatosPersona(nombre, apellido, cedula);
        
        //VERIFICAR QUE EL NOMBRE SEA PALINDROMO.
        if(persona1.esPalindromo()){
            System.out.println("\nEl nombre " + persona1.getNombre() + " SI es palindromo");
        }else{
            System.out.println("\nEl nombre " + persona1.getNombre() + " NO es palindromo");
        }
        
        //VERIFICAR QUE LA CEDULA SEA VALIDA, EN CASO DE QUE NO SEA VALIDA SE ASIGNA UNA VALOR POR DEFAULT
        boolean esValido = persona1.esCedulaValida();
        System.out.println("Nro. de CI ingresado: "+ persona1.getCedula());
        System.out.println("Cedula Valida: "+ esValido);
        
        if(esValido == false){
            persona1.setCedula("1724321789"); //AQUI SE LE ASIGNA ESTE NUMERO DE CEDULA POR DEFAULT
            System.out.println("Nuevo Nro. de CI por default: "+ persona1.getCedula());
        }
        //En este punto ya tenemos una CI valida, ahora vamos a analizar
        //si pertenece a una provincia o no, ES DECIR, SI LA CEDULA TIENE UN VALOR CORRECTO O NO.
        persona1.definirProvinciaNatal();
        
        System.out.println("Provincia: " +persona1.getProvinciaNatal());
        
        
    }
        
    
}
