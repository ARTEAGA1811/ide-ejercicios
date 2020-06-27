
package practicaprueba;

/**
 *
 * @author ADvid Arteaga
 */
public class Doctor {
    
    private String nombre;
    private int identificador;
    
    //CONSTRUCTORES
    public Doctor(String nombre, int identificador){
        this.nombre = nombre;
        this.identificador = identificador;
    }
    
    //GETTER AND SETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
    
    //metodos
    public void registrarDatos(Enfermo paciente, double peso, double estatura){
        paciente.setPeso(peso);
        paciente.setEstatura(estatura);
        
    }
    
    public double calcularIndiceMasa(Enfermo paciente){
        double indiceMasa;
        indiceMasa = paciente.getPeso() * paciente.getEstatura();
        return indiceMasa;
        
    }
    
    public String diagnosticarEnfermo(Enfermo miPaciente){
        double masaCorporal = calcularIndiceMasa(miPaciente);//QUI YA ME CALCULA EL INDICE
        String diagnostico = "El paciente "+ miPaciente.getNombre() + " es: ";
        if(masaCorporal >10){
            diagnostico += " Gordo";
        }
        else{
            diagnostico += " Flaco";
        }
        return diagnostico;
        
        
    }

    @Override
    public String toString() {
        return "Doctor{" + "nombre=" + nombre + ", identificador=" + identificador + '}';
    }
    
    
    
    
}
