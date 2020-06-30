
package debercuatro;


public class Validacion {
    //Validar correo electronico
    public static boolean esUnCorreo(String correoAValidar){
        return correoAValidar.matches("[a-z]+[.][a-z]+[0-9]*@epn[.]edu[.]ec");
        
        
    }
    
    public static boolean esUnUsuario(String usuarioAValidar){
        return usuarioAValidar.matches("[[a-z]*[-]*[_]*[0-9]*]{5,14}");
    }
    
}
