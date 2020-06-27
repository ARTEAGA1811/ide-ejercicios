/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2ejercicio1;

/**
 *
 * @author Marcela
 */
//Un mÃ©dico tiene nombre e identificador Ãºnico 
public class Medico {

    //declaraciÃ³n de variables de instancia
    private String nombre;
    private int identificador;

    //constructores
    public Medico(String nombre, int identificador) {
        this.nombre = nombre;
        this.identificador = identificador;
    }

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
    

    //mÃ©todo para asignar los datos de peso y estatura al paciente
    public void registrarDatosPaciente(Paciente miPaciente, double peso, double estatura) {
        miPaciente.setEstatura(estatura);
        miPaciente.setPeso(peso);
    }

    //mÃ©todo para calcular el Ã­ndice de masa corporal
    public double calcularIndiceMasaCorporal(Paciente miPaciente) {
        double indiceMasaCorporal;

        indiceMasaCorporal = miPaciente.getPeso() / Math.pow(miPaciente.getEstatura(), 2);
        return indiceMasaCorporal;

    }

    //mÃ©todo para emitir un diagnÃ³stico a partir del Ã­ndice de masa corporal
    public String diagnosticarPaciente(Paciente miPaciente) {
        String mensajeDiagnostico = " Paciente con ";
        double indiceMasaCorporal = calcularIndiceMasaCorporal(miPaciente);
        if (indiceMasaCorporal < 18.5) {
            mensajeDiagnostico += "bajo peso";
        } else if (indiceMasaCorporal < 24.9) {
            mensajeDiagnostico += "peso normal ";
        } else {
            mensajeDiagnostico += " obesidad";
        }
        return mensajeDiagnostico;

    }
}
