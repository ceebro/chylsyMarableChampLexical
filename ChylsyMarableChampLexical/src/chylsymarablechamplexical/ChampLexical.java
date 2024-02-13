/** Required package class namespace */
package chylsymarablechamplexical;

/**
 * Catégories.java - Les mots qui composent mon champ lexical
 *
 * @author Chylsy Marable
 * @since 12-Feb-2024
 */
public class ChampLexical {

    // mes catégories de mots sont des 'arrays' qui garde les mots dans des
    // indexes entre 0 à 15 (il y a 16 éléments dans chacun)
    public static String[] nomsCommuns = new String[16];
    public static String[] verbes = new String[16];
    public static String[] adjectifs = new String[16];
    public static String[] langages = new String[16];
    public static String[] émotions = new String[16];
    public static String[] matérielsInformatiques = new String[16];

    /**
     * Default constructor, set class properties
     */
    public ChampLexical() {

        inscrireLesMots();
    }

    /**
     * La méthode suivante inscrit les mots de mon champ lexical selon les les
     * catégories en haut (cette méthode inscrit les noms communs)
     */
    public static void inscrireLesMots() {

        inscrireLesNomsCommuns();
        inscrireLesVerbes();
        inscrireLesAdjectifs();
        inscrireLesLangages();
        inscrireLesÉmotions();
        inscrireLesMatérielsInformatiques();
    }

    /**
     * Cette méthode inscrit les noms communs de mon champ lexical
     */
    public static void inscrireLesNomsCommuns() {

        nomsCommuns[0] = "Noms Communs:              ";
        nomsCommuns[1] = "navigateur                 ";
        // [1] traduction: 'browser'
        nomsCommuns[2] = "serveur                    ";
        nomsCommuns[3] = "site web                   ";
        nomsCommuns[4] = "codage                     ";
        nomsCommuns[5] = "laboratoire                ";
        nomsCommuns[6] = "intelligence artificielle  ";
        nomsCommuns[7] = "données                    ";
        nomsCommuns[8] = "mathématiques              ";
        nomsCommuns[9] = "fonction                   ";
        nomsCommuns[10] = "variable                   ";
        nomsCommuns[11] = "jeux vidéo                 ";
        nomsCommuns[12] = "logiciel                   ";
        // [12] traduction: 'software'
        nomsCommuns[13] = "langage                    ";
        nomsCommuns[14] = "console                    ";
        nomsCommuns[15] = "application                ";
    }

    /**
     * La méthode suivante inscrit les verbes de mon champ lexical
     */
    public static void inscrireLesVerbes() {

        verbes[0] = "Verbes:        ";
        verbes[1] = "taper          ";
        verbes[2] = "résoudre       ";
        verbes[3] = "analyser       ";
        verbes[4] = "apprendre      ";
        verbes[5] = "construire     ";
        verbes[6] = "brancher       ";
        verbes[7] = "insérer        ";
        verbes[8] = "interpréter    ";
        verbes[9] = "développer     ";
        verbes[10] = "enregistrer    ";
        verbes[11] = "programmer     ";
        verbes[12] = "évaluer        ";
        verbes[13] = "coder          ";
        verbes[14] = "discuter       ";
        verbes[15] = "vérifier       ";
    }

    /**
     * Ça inscrit les adjectifs de mon champ lexical
     */
    public static void inscrireLesAdjectifs() {

        adjectifs[0] = "Adjectifs:      ";
        adjectifs[1] = "analytique      ";
        adjectifs[2] = "critique        ";
        adjectifs[3] = "précise         ";
        adjectifs[4] = "distinct        ";
        adjectifs[5] = "complèxe        ";
        adjectifs[6] = "acharné         ";  // définition simple: difficile
        adjectifs[7] = "pénible         ";
        adjectifs[8] = "algorithmique   ";
        adjectifs[9] = "méticuleux      ";
        adjectifs[10] = "profitable      ";
        adjectifs[11] = "bizarre         ";
        adjectifs[12] = "futuriste       ";
        adjectifs[13] = "avant-garde     "; // traduction: 'at the forefront'
        adjectifs[14] = "novateur        ";
        adjectifs[15] = "omniprésent     ";
    }

    /**
     * Ça inscrit les langages de programmation de mon champ lexical (les noms
     * propres)
     */
    public static void inscrireLesLangages() {

        langages[0] = "Langages:    ";
        langages[1] = "Java         ";
        // [1] la langage qui est utilisée en CS30S, CS40S,
        // [1] et en CS42SAP 
        langages[2] = "C#           ";  // la langage qui est utilisée en CS20S
        langages[3] = "Python       ";  // utilisé dans Instagram, Spotify, et Netflix
        langages[4] = "HTML         ";
        langages[5] = "CSS          ";
        langages[6] = "JavaScript   ";  // HTML, CSS, et JavaScript sont utilisés
        // pour développer des site webs
        langages[7] = "Lua          ";  // la langage primare de Roblox
        langages[8] = "Ruby         ";
        langages[9] = "Kotlin       ";  // utilisé dans les systèmes d'Android
        langages[10] = "PHP          ";
        langages[11] = "Scala        ";
        langages[12] = "C++          ";  // la langage de Windows, CSGO, et Adobe
        // Photoshop
        langages[13] = "Assembly     ";
        langages[14] = "Go           ";
        langages[15] = "Swift        ";  // utilisé dans les systèmes d'Apple
    }

    /**
     * Une catégorie que j'ai choisi sont des émotions que la science
     * informatique incitent souvent
     */
    public static void inscrireLesÉmotions() {

        émotions[0] = "Émotions:    ";
        émotions[1] = "colère       ";
        émotions[2] = "agitation    ";
        émotions[3] = "souci        ";  // définition simple: s'inquieter
        émotions[4] = "enrichissant ";
        émotions[5] = "bonheur      ";
        émotions[6] = "agonissant   ";
        émotions[7] = "intense      ";
        émotions[8] = "vivifiant    ";  // définition simple: rafrachîssant
        émotions[9] = "amusant      ";
        émotions[10] = "satisfiant   ";
        émotions[11] = "exigeant     "; // définition simple: fatigant
        émotions[12] = "déroutant    "; // définition simple: confondant
        émotions[13] = "stimulant    ";
        émotions[14] = "énervant     ";
        émotions[15] = "exaspérant   ";
    }

    /**
     * Une autre catégorie que j'ai choisi sont des matériels ou du hardware
     * associés à la technologie
     */
    public static void inscrireLesMatérielsInformatiques() {

        matérielsInformatiques[0] = "Matériels Informatiques:   ";
        matérielsInformatiques[1] = "ordinateur                 ";
        matérielsInformatiques[2] = "clavier                    ";
        matérielsInformatiques[3] = "souris                     ";
        matérielsInformatiques[4] = "calculatrice               ";
        matérielsInformatiques[5] = "écran                      ";
        matérielsInformatiques[6] = "casque                     ";
        // [6] synonyme pour: écouteurs
        matérielsInformatiques[7] = "microphone                 ";
        matérielsInformatiques[8] = "portable                   ";
        // [8] ceci peut faire référence à une
        // [8] ordinateur ou une téléphone
        matérielsInformatiques[9] = "carte mémoire              ";
        matérielsInformatiques[10] = "fils                       ";
        matérielsInformatiques[11] = "câbles                     ";
        matérielsInformatiques[12] = "routeur                    ";
        matérielsInformatiques[13] = "toupie                     ";
        // [13] synonyme pour: routeur
        matérielsInformatiques[14] = "imprimante                 ";
        matérielsInformatiques[15] = "téléphone                  " + "\n";
    }
}
