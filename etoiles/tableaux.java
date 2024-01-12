/* 
//Exercice 1 : La carré de la première valeur
package etoiles;
import java.util.Scanner;


public class tableaux {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir au moins 3 chiffres à la suite : ");
        String input = scanner.nextLine();

        scanner.close();

        // Diviser la chaîne en valeurs individuelles
        String[] chiffresEnString = input.split("\\s+");

        if (chiffresEnString.length < 3) {
            System.out.println("Veuillez saisir au moins 3 chiffres.");
        } else {
            // Convertir les valeurs en entiers
            int chiffre1 = Integer.parseInt(chiffresEnString[0]);
            int chiffre2 = Integer.parseInt(chiffresEnString[1]);
            int chiffre3 = Integer.parseInt(chiffresEnString[2]);

            // Afficher le carré de la première valeur
            int carreChiffre1 = chiffre1 * chiffre1;
            System.out.println("Le carré de la première valeur (" + chiffre1 + ") est : " + carreChiffre1);
        }
    }
}
*/
/*
//Exercice 2 : La somme des 2 premières valeurs
package etoiles;
import java.util.Scanner;

public class tableaux {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir au moins 3 chiffres à la suite : ");
        String input = scanner.nextLine();

        scanner.close();

        // Diviser la chaîne en valeurs individuelles
        String[] chiffresEnString = input.split("\\s+");

        if (chiffresEnString.length < 3) {
            System.out.println("Veuillez saisir au moins 3 chiffres.");
        } else {
            // Convertir les valeurs en entiers
            int chiffre1 = Integer.parseInt(chiffresEnString[0]);
            int chiffre2 = Integer.parseInt(chiffresEnString[1]);

            // Afficher la somme des deux premières valeurs
            int somme = chiffre1 + chiffre2;
            System.out.println("La somme des deux premières valeurs (" + chiffre1 + " et " + chiffre2 + ") est : " + somme);
        }
    }
}
*/

/*
//Exercice 3 : La somme de toutes les valeurs
package etoiles;
import java.util.Scanner;

public class tableaux {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir des chiffres séparés par des espaces : ");
        String input = scanner.nextLine();

        scanner.close();

        String[] chiffresEnString = input.split("\\s+");

        int somme = 0;

        for (String chiffreEnString : chiffresEnString) {
            somme += Integer.parseInt(chiffreEnString);
        }

        System.out.println("La somme de toutes les valeurs est : " + somme);
    }
}
*/

/* 
//Exercice 4 : La valeur maximum
package etoiles;
import java.util.Scanner;

public class tableaux {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisissez des valeurs : ");
        String input = scanner.nextLine();

        scanner.close();

        String[] chiffresEnString = input.split("\\s+");

        int valeurMaximale = Integer.MIN_VALUE;

        for (String chiffreEnString : chiffresEnString) {
            int valeurActuelle = Integer.parseInt(chiffreEnString);
            if (valeurActuelle > valeurMaximale) {
                valeurMaximale = valeurActuelle;
            }
        }

        System.out.println("La valeur maximale est : " + valeurMaximale);
    }
}
*/

/* 
//Exercice 5 : La valeur minimale
package etoiles;
import java.util.Scanner;

public class tableaux {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisissez des valeurs : ");
        String input = scanner.nextLine();

        scanner.close();

        String[] chiffresEnString = input.split("\\s+");

        int valeurMinimale = Integer.MAX_VALUE;

        for (String chiffreEnString : chiffresEnString) {
            int valeurActuelle = Integer.parseInt(chiffreEnString);
            if (valeurActuelle < valeurMinimale) {
                valeurMinimale = valeurActuelle;
            }
        }

        System.out.println("La valeur minimale est : " + valeurMinimale);
    }
}
*/

/* 
//Exercice 6 : La valeur le plus proche de 0
package etoiles;
import java.util.Scanner;

public class tableaux {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisissez des chiffres : ");
        String input = scanner.nextLine();

        scanner.close();

        String[] chiffresEnString = input.split("\\s+");

        int valeurPlusProcheDeZero = Integer.MAX_VALUE;

        for (String chiffreEnString : chiffresEnString) {
            int valeurActuelle = Integer.parseInt(chiffreEnString);

            if (Math.abs(valeurActuelle) < Math.abs(valeurPlusProcheDeZero)) {
                valeurPlusProcheDeZero = valeurActuelle;
            }
        }

        System.out.println("La valeur la plus proche de 0 est : " + valeurPlusProcheDeZero);
    }
}
*/

package etoiles;
import java.util.Scanner;

public class tableaux {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisissez des chiffres : ");
        String input = scanner.nextLine();

        scanner.close();

        String[] chiffresEnString = input.split("\\s+");

        int valeurPlusProcheDeZero = Integer.MAX_VALUE;

        for (String chiffreEnString : chiffresEnString) {
            int valeurActuelle = Integer.parseInt(chiffreEnString);

            int differenceActuelle = Math.abs(valeurActuelle);

            if (differenceActuelle < Math.abs(valeurPlusProcheDeZero) ||
                (differenceActuelle == Math.abs(valeurPlusProcheDeZero) && valeurActuelle > 0)) {
                valeurPlusProcheDeZero = valeurActuelle;
            }
        }

        System.out.println("La valeur la plus proche de 0 est : " + valeurPlusProcheDeZero);
    }
}


