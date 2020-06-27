
package poo.cap1.ej2;

public class Veterinario {
    
    public String diagnosticar(Raton ratonPaciente){
        String mensaje = "El raton ";
        double relacion = ratonPaciente.getEdad() / ratonPaciente.getPeso();
        
        if(relacion <0.25){
            mensaje += "debe comer mas";
        }else{
            mensaje += "esta OK";
        }
        
        ratonPaciente.setNombre("PEPITO");//DESDE ESTA CLASE TAMBIEN PUEDO CAMBIAR LOS 
        //VALORES A LA CLASE RATON
        return mensaje;
        
    
    }
    
        
        
    
    
    public String diagnosticar(int edad, double peso){
        String mensaje = "El raton";
        double relacion = edad / peso;
        
        if(relacion <0.25){
            mensaje += "debe comer mas";
        }else{
            mensaje += "esta OK";
        }
        return mensaje;
    
    }
    
}
