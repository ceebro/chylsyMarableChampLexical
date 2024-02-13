/** Required package class namespace */
package chylsymarablechamplexical;

/*
 * ChylsyMarableChampLexical - Ma présentation du champ lexical pour FR42SAP
 * (l'aspect visuel de la tâche) 
 *
 * @author Chylsy Marable
 * @since 12-Feb-2024
 */
public class ChylsyMarableChampLexical {

    // le sujet que j'ai choisi
    public static final String SUJET = "La Technologie et la Science Informatique";

    // vous trouverez les mots de mon champ lexical ici
    static ChampLexical champ = new ChampLexical();

    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_GREEN = "\u001B[32m";

    /**
     * Main method for the project
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        présenterLesCatégories();
    }

    /**
     * Cette méthode présente mon champ lexical dans une manière engageante et
     * créative
     */
    public static void présenterLesCatégories() {

        System.out.println(ANSI_PURPLE + SUJET + "\n" + ANSI_PURPLE);

        System.out.println(ANSI_CYAN
                + champ.nomsCommuns[0]
                + champ.verbes[0]
                + champ.adjectifs[0]
                + champ.émotions[0]
                + champ.matérielsInformatiques[0]
                + ANSI_CYAN
        );

        for (int i = 1; i < 16; i++) {

            System.out.println(ANSI_GREEN
                    + champ.nomsCommuns[i]
                    + champ.verbes[i]
                    + champ.adjectifs[i]
                    + champ.langages[i]
                    + champ.émotions[i]
                    + champ.matérielsInformatiques[i]
                    + ANSI_GREEN
            );
        }
    }
}
