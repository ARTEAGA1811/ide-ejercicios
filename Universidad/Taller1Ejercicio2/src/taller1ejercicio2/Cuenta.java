
package taller1ejercicio2;


public class Cuenta {

   private double balance;
   private boolean esCuentaInactiva = false;

    public Cuenta(double saldoInicial) {
        this.balance = saldoInicial;
    }
    
    public void abonar(double monto){
        this.balance += monto;
    }
    
    public void fusionarCuenta(Cuenta otraCuenta){
        this.balance += otraCuenta.balance; 
        
    }
    
    public double obtenerSaldo(){
        return this.balance;
    }
    
    
    
    
    
    
    public void setEsCuentaInactiva(boolean esCuentaInactiva){
        this.esCuentaInactiva = esCuentaInactiva;
    }
    
    public void quitarTodoElDinero(){
        this.balance = 0;
    
    }
    
    //TOSTRING

    @Override
    public String toString() {
        return "balance= " + balance + "\nCuenta Inactiva= " + esCuentaInactiva;
    }
    
   
   
   
}
