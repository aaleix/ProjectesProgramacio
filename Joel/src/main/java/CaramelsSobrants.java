import java.util.Scanner;

public class CaramelsSobrants {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int NombreNens;
        int NombreCaramels;

        NombreNens = ent.nextInt();
        NombreCaramels = ent.nextInt();

        System.out.println(NombreNens%NombreCaramels);

    }




}



