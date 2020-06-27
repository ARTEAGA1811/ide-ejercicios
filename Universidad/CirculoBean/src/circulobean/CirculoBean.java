
package circulobean;

/**
 *
 * @author David Arteaga
 */
public class CirculoBean implements java.io.Serializable{
    
    private double radio;
    private double diametro;
    private double area;
    
    public CirculoBean(){
    }
    
    public CirculoBean(double radio){
        
//        setRadio(radio);
//        setDiametro(radio*2);
//        setArea(Math.PI * radio * radio);

    
        this.radio = radio;
        this.diametro = 2 * radio;
        this.area = Math.PI * radio * radio;
    
    }
    
    
    //GETTER AND SETTER
    public double getRadio(){
        return this.radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    

    
        
        
        
        
    
    
}
