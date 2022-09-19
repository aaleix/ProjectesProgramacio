public class Variable { //nom classes --> PascalCase

    public static void main(String[] args) {

        //Zona de declaració de variables
        int numero; //declaració de variable
        numero = 25;//inicialització de la variable

        char lletra;

        int any = 2023; //variable de tipo int i nom any
        int mes = 9; //declaració + inicialització de la variable
        int diaMes = 12; //nom variables --> camelCase

        double real1, real2 = 3.4;  //Declaro 2 variables del mateix tipo, la variable real1 no te un valor
        boolean int1=true;

        //Codi del programa
        System.out.println("Estem a l'any "+any);
        System.out.println("Estem al mes "+(mes+1)); //per a sumar i concatenar donem prioritat en ()
        System.out.println("Estem al dia "+(diaMes+1));

        System.out.println("Estem a l'any "+any+", al mes "+mes+" i al dia "+diaMes);


        //Inicialitzo la lletra
        lletra = 'a';
    }
}
