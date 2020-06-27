
package poo.cap1.deber2;


public class TrianguloRectangulo {
    private double cateto1;
    private double cateto2;
    private double hipotenusa;
    private double perimetro;
    private double area;
    
    
    public void setCateto1(double cateto1){
        this.cateto1 = cateto1;
    }
    
    public void setCateto2(double cateto2){
        this.cateto2 = cateto2;
    }
    
    public void calcularHipotenusa(){
        this.hipotenusa = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
        
    }
    
    public void calcularPerimetro(){
        this.perimetro = cateto1 + cateto2 + hipotenusa;
    }
    
    public void calcularArea(){
        this.area = (cateto1 * cateto2)/2;
    }
    
    
    
    //Editar el metodo toString

    @Override
    public String toString() {
        return "\nTrianguloRectangulo: \n" + "cateto1= " + cateto1 + "\ncateto2= " + cateto2 + "\nhipotenusa= " + hipotenusa + "\nperimetro= " + perimetro + "\narea= " + area;
    }
    
    
    
    
    
    
    
}
