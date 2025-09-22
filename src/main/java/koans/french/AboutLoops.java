package koans.french;

public class AboutLoops {
    /**
     * # Première boucle
     * 
     * Écris une méthode 'helloNTimes' avec un paramètre entier 'times', qui affiche 'Hello' dans la console 'times' fois.
     * 
     * ---------   INDICES   --------------
     * 
     * Pour exécuter du code plusieurs fois, tu peux utiliser une boucle 'while'.
     * Une boucle 'while' ressemble beaucoup à une instruction 'if', sauf que son bloc de code va se faire exécuter encore et encore tant que la condition reste vraie. Ex:
     * 
     *     int times = 3;
     *     while (times > 0) {
     *         // Cela va prendre 3 exécutions de ce boc de code avant que la condition ne devienne fausse.
     *         // Donc Java va l'exécuter 3 fois, puis va passer au reste du code.
     *         System.out.println("Toujours en train d'exécuter");
     *         // On peut modifier la valeur d'une variable existente. Nous en profitons ici.
     *         times = times -1;
     *     }
     * 
     * Note 3: comme pour un 'if', à l'intérieur des accolades d'un 'while', tu peux mettre tout le code que tu veux, et même d'autres 'while', ou des 'if' !.
     * 
     * -------------------------------
     * 
     * Résultat attendu:
     * 
     * helloNTimes(2) devrait afficher:
     * 
     * Hello
     * Hello
     * 
     */


     /**
     * # Afficher où nous sommes dans une boucle
     * 
     * Écris une méthode 'displayNumbers' avec un paramètre entier 'n', qui affiche les nombres entre 1 et 'n'.
     * 
     * -------------------------------
     * 
     * Résultat attendu:
     * 
     * displayNumbers(3) devrait afficher:
     * 
     * 1
     * 2
     * 3
     * 
     */


     /**
     * # Compter à l'envers
     * 
     * Écris une méthode 'displayReverseNumbers' avec un paramètre entier 'n', qui affiche les nombres entre 1 et 'n', en ordre inverse.
     * 
     * -------------------------------
     * 
     * Résultat attendu:
     * 
     * displayReverseNumbers(3) devrait afficher:
     * 
     * 3
     * 2
     * 1
     * 
     */


     /**
     * # Multiples de 7
     * 
     * Écris une méthode 'sevens' avec un paramètre entier 'n', qui affiche tous les multiples de 7 entre 1 et n.
     * 
     * -------------------------------
     * 
     * Résultat attendu:
     * 
     * sevens(30) devrait afficher:
     * 
     * 7
     * 14
     * 21
     * 28
     * 
     */


     /**
     * # Multiple de 7 ou 8
     * 
     * Écris une méthode 'sevensOrEights' avec un paramètre entier 'n', qui affiche tous les multiples de 7 ou 8 entre 1 et n.
     * 
     * ---------   INDICES   --------------
     * 
     * Réutilise la méthode 'isMultiple' dans la class 'AboutMoreMethods'. Pour utiliser une méthode dans une autre classe, écris le nom de la classe, puis un '.' devant l'appel de la méthode. Ex:
     * 
     *     AboutConsoleAndVariables.sayHelloInConsole();  // Va afficher 'Hello!' dans la console
     *                  ^          ^          ^
     *          nom de classe    point   appel de méthode
     * 
     * -------------------------------
     * 
     * Résultat attendu:
     * 
     * sevensOrEights(20) devrait afficher:
     * 
     * 7
     * 8
     * 14
     * 16
     * 
     */

}
