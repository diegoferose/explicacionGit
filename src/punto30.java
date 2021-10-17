import javax.swing.*;

public class punto30 {
    public static void main(String[] args) {
        /*int numeroImpar;
        for (int i = 0; i < 5; i++) {
            numeroImpar = 2*i+1;
            // numeroImpar = 1
            for (int j = numeroImpar; j >= 1 ; j= j -2) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }*/
        String miNombrecito = JOptionPane.showInputDialog(null,"Ingrese el nombre");
        //System.out.println(miNombrecito.toUpperCase());
        //System.out.println(miNombrecito.toLowerCase());
        String nombreMinuscula = miNombrecito.toLowerCase();
        String letra;
        String letraAnterior = "z";
        String nombreConstruido = "";

        for (int i = 0; i < nombreMinuscula.length(); i++) {
            letra = nombreMinuscula.charAt(i)+"";

            if (i == 0){
                nombreConstruido = nombreConstruido + letra.toUpperCase();
            }else{
                //diego rosero
                letraAnterior = nombreMinuscula.charAt(i-1)+"";
                if (letraAnterior.equals(" ") && !letra.equals(" ")){
                    System.out.println("ingreso por aca");
                    nombreConstruido = nombreConstruido + letra.toUpperCase();
                }else{
                    nombreConstruido = nombreConstruido + letra;
                }

            }
            System.out.println("letra: "+letra+" letra anterior: "+letraAnterior);

        }
        System.out.println(nombreConstruido);
    }
}
