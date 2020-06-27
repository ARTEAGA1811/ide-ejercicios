
package aprendiendojava;


public class ejerciciomatrices {
    public static void main(String[] args){
        //Hacer una matriz de 5x5 y que los bordes tengan 1, y lo de dentro, 0.
        int matriz[][] = new int[5][5];
        
        for(int i = 0; i<5; i++){
            for(int z = 0; z<5; z++){
                if(i == 0 || i == 4 || z == 0 || z == 4){
                    matriz[i][z] = 1; 
                }else{
                    matriz[i][z] = 0;
                }
                
                System.out.print(matriz[i][z] + "  ");
            }
            System.out.println("");
        }
        
        
        
        
    }
    
}
