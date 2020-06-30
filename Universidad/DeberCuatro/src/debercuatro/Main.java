
package debercuatro;

/**
 *
 * @author David Arteaga
 */
public class Main {

    
    public static void main(String[] args) {
        
        String correo = "bryan.arteaga02@epn.edu.ec";
        String usuario ="david_art3-18m";        
        System.out.println(Validacion.esUnCorreo(correo));
        System.out.println(Validacion.esUnUsuario(usuario));
    }
    
}
