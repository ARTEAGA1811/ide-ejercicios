package deber3;

import java.util.Random;

public class DatosPersona {

    private String nombre;
    private String apellido;
    private String cedula;
    private String provinciaNatal;

    public DatosPersona(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;

    }

    //Getter and Setter
    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getProvinciaNatal() {
        return this.provinciaNatal;
    }

    public void setProvinciaNatal(String provinciaNatal) {
        this.provinciaNatal = provinciaNatal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    //METODOS
    public boolean esPalindromo() {
        boolean esPalindromo = false;
        String nombrePalindromo = "";

        for (int i = (this.nombre.length() - 1); i >= 0; i--) {

            nombrePalindromo += this.nombre.charAt(i);

        }

        if (this.nombre.equalsIgnoreCase(nombrePalindromo)) { //AQUI SE COMPARA SI ES PALINDROMO O NO Y MANDA UN BOOLEANO
            esPalindromo = true;
        }
        //System.out.println(nombrePalindromo);

        return esPalindromo;
    }

    public boolean esCedulaValida() {
        boolean ciValida = true;
        int numeroPar, numeroImpar, sumaPar, sumaImpar, sumaTotal;
        sumaPar = 0;
        sumaImpar = 0;

        //Verificar que tenga 10 digitos
        if (this.cedula.length() != 10) {
            ciValida = false;

        }

        if (this.cedula.length() == 10) {
            //Cada dígito de posición impar se lo duplica, si el resultado es mayor
            //que nueve se resta nueve.
            for (int i = 0; i < 9; i += 2) {
                numeroImpar = Integer.parseInt(Character.toString(cedula.charAt(i))) * 2;

                if (numeroImpar > 9) {
                    numeroImpar -= 9;
                }

                sumaImpar += numeroImpar;

            }

            //Se suman todos los digitos de posicion par.
            for (int i = 1; i < 9; i += 2) {
                numeroPar = Integer.parseInt(Character.toString(cedula.charAt(i)));

                sumaPar += numeroPar;

            }
            //SE SUMAN LOS 2. PARES E IMPARES
            sumaTotal = sumaPar + sumaImpar;

            int decenaSuperior;
            if (sumaTotal % 10 != 0 && sumaTotal > 10) {
                decenaSuperior = sumaTotal - (sumaTotal % 10) + 10;
                sumaTotal = decenaSuperior - sumaTotal;

            }
            if (sumaTotal % 10 == 0) {
                sumaTotal = 0;
            }

            if (sumaTotal != Integer.parseInt(Character.toString(this.cedula.charAt(9)))) {
                ciValida = false;
            }

        }

        return ciValida;

    }

    public String generarNumeroDeCedula() {
        //ESTE METODO SE EJECUTA EN CASO QUE LA CEDULA NO SEA VALIDA.
        Random numAleatorio = new Random();
        String numeroDeCedula = "";
        for (int i = 0; i < 10; i++) {
            numeroDeCedula += Integer.toString(numAleatorio.nextInt(10)); //Entre el cero y nueve.  
        }

        return numeroDeCedula;
    }

    public void definirProvinciaNatal() {
        String codigoDeProvincia = this.cedula.substring(0, 2);
        String provincia = "";

        switch (codigoDeProvincia) {

            case "01":
                provincia += "Azuay";
                break;
            case "02":
                provincia += "Bolivar";
                break;
            case "03":
                provincia += "Cañar";
                break;
            case "04":
                provincia += "Carchi";
                break;
            case "05":
                provincia += "Cotopaxi";
                break;
            case "06":
                provincia += "Chimborazo";
                break;
            case "07":
                provincia += "El Oro";
                break;
            case "08":
                provincia += "Esmeraldas";
                break;
            case "09":
                provincia += "Guayas";
                break;
            case "10":
                provincia += "Imbabura";
                break;
            case "11":
                provincia += "Loja";
                break;
            case "12":
                provincia += "Los Rios";
                break;
            case "13":
                provincia += "Manabi";
                break;
            case "14":
                provincia += "Morona Santiago";
                break;
            case "15":
                provincia += "Napo";
                break;
            case "16":
                provincia += "Pastaza";
                break;
            case "17":
                provincia += "Pichincha";
                break;
            case "18":
                provincia += "Tungurahua";
                break;
            case "19":
                provincia += "Zamora Chinchipe";
                break;
            case "20":
                provincia += "Galapagos";
                break;
            case "21":
                provincia += "Sucumbios";
                break;
            case "22":
                provincia += "Orellana";
                break;
            case "23":
                provincia += "Santo Domingo de los Tsachilas";
                break;
            case "24":
                provincia += "Santa Elena";
                break;

            default:
                provincia += "PENDIENTE";
                break;

        }

        this.provinciaNatal = provincia; 
        

    }

}
