//Exercice 1 : Comparaison 1
/*
package etoiles;

import java.util.Scanner;
public class condition {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisir les valeur de A,B et C
        System.out.print("Entrez la valeur de A : ");
        int A = scanner.nextInt();

        System.out.print("Entrez la valeur de B : ");
        int B = scanner.nextInt();

        System.out.print("Entrez la valeur de C : ");
        int C = scanner.nextInt();

        // Vérification si C est compris entre A et B
        if (C > A && C < B) {
            System.out.println("Oui, C est compris entre A et B");
        } else {
            System.out.println("Non, C n'est pas compris entre A et B");
        }

        scanner.close();
    }
}
*/

package etoiles;

import java.util.Scanner;
public class condition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie du nombre
        System.out.print("Entrez un nombre : ");
        int nombre = scanner.nextInt();

        // Vérification si le nombre est pair ou impair
        if (nombre % 2 == 0) {
            System.out.println("Le nombre est pair.");
        } else {
            System.out.println("Le nombre est impair.");
        }

        scanner.close();
    }
   }    