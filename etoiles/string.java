/*
//Exercice 1 : Combien de 'e' dans notre chaine de charactère ?
package etoiles;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisissez une chaine de caractère de votre choix: ");
        String input = scanner.nextLine();
        
        scanner.close();

        int compteurdeE = compterE(input);

        System.out.println("Le nombre de 'e' dans votre chaîne de caractère est : " + compteurdeE);
    }

    public static int compterE(String chainedecaractere) {
        int count = 0;

        for (int i = 0; i < chainedecaractere.length(); i++) {
            char caractereActuel = Character.toLowerCase(chainedecaractere.charAt(i));

            if (caractereActuel == 'e') {
                count++;
            }
        }

        return count;
    }
}
*/

/*
//Exercice 2 : Affichage verticale
package etoiles;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisissez un texte : ");
        String texte = scanner.nextLine();

        scanner.close();

        affichageVertical(texte);
    }

    public static void affichageVertical(String texte) {
        for (int i = 0; i < texte.length(); i++) {
            System.out.println(texte.charAt(i));
        }
    }
}
*/

/*
//Exercice 3 : Retour à la ligne
package etoiles;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisissez un texte : ");
        String input = scanner.nextLine();

        scanner.close();

        retourAlaLigne(input);
    }

    public static void retourAlaLigne(String chaine) {
        for (int i = 0; i < chaine.length(); i++) {
            char caractereActuel = chaine.charAt(i);

            if (caractereActuel == ' ') {
                System.out.println();
            } else {
                System.out.print(caractereActuel);
            }
        }

        System.out.println();
    }
}
*/

/* 
//Exercice 4 : Afficher une lettre sur deux

package etoiles;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisissez un texte : ");
        String input = scanner.nextLine();

        scanner.close();

        afficherUneLettreSurDeux(input);
    }

    public static void afficherUneLettreSurDeux(String chaine) {
        for (int i = 0; i < chaine.length(); i += 2) {
            System.out.print(chaine.charAt(i));
        }
    }
}
*/

 /* 
//Exercice 5 : La phrase en verlant
package etoiles;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une chaîne de caractères : ");
        String chaine = scanner.nextLine();

        for (int i = chaine.length() - 1; i >= 0; i--) {
            System.out.print(chaine.charAt(i));
        }

        scanner.close();
    }
}
*/

package etoiles;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir une phrase : ");
        String phrase = scanner.nextLine();

        scanner.close();

        int consonnes = compterCaracteres(phrase, "bcdfghjklmnpqrstvwxyz");
        int voyelles = compterCaracteres(phrase, "aeiou");

        System.out.println("Nombre de consonnes : " + consonnes);
        System.out.println("Nombre de voyelles : " + voyelles);
    }

    public static int compterCaracteres(String phrase, String caracteres) {
        phrase = phrase.toLowerCase();
        int count = 0;

        for (char c : phrase.toCharArray()) {
            if (caracteres.indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }
}


