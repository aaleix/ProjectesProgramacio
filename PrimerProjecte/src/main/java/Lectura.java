import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {
        //1. Declaro una variable de tipo Scanner
        Scanner ent = new Scanner(System.in);
        int numero;
        double real, suma;

        //2. Vaig a llegir una dada... entera (int)
        // i la guardo a una variable entera
        System.out.println("Introdueix un número enter i un número real:");
        numero = ent.nextInt();
        real = ent.nextDouble();


        //3. Treballo en la variable de la manera que vulgue
        System.out.println("La variable val "+numero);
        System.out.println("la suma dels valors és "+(numero+real)); //Important els parentesis en la suma ja que si no hi son concatena
        suma = numero + real;
        System.out.println("La suma dels valors és "+suma);
    }
}
