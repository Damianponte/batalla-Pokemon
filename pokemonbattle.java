import java.util.Scanner;
public class pokemonbattle {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Para cada pokemon, tenéis que definir:

        // Su nombre
        // La vida
        // Los MP
        // El daño de su ataque normal
        // Su defensa
        // El nombre de su ataque especial
        //El daño de su ataque especial
        //El consumo de puntos de su ataque especial


        String Pokemon = "charmander";
        String Pokemon1 = "bulbasaur";
        int vidaCharmander = 54;
        int MpCharmander = 15;
        int ataqueCharmander = 12;

        int defCharmander = 7;
        String ataqueNormal="golpe";
        String AtaqueEsp="Ascuas";
        int dañoEspCharmander = 19;
        int MpAtaquespecialCharmander = 14;

        int vidaBulbasaur = 54;
        int MpBulbasaur = 24;
        int ataqueBulbasaur = 15;
        int ataqueEspBulbasaur = 22;
        int defBulbasaur = 6;

        int dañoEspbulbasaur = 7;
        int MpAtaquespecialbulbasaur = 8;

        System.out.println(" batalla pokemon entre " + Pokemon + " VS " + Pokemon1);


//empezar turnos
        //activar entrada teclado//
        //que ataque debe hacer charmander//
        //mientras charmander ataca bulbasaur defiende//que ataque debe hacer
        boolean esturnopokemon = true;
        while (vidaCharmander > 0 && vidaBulbasaur > 0) {


            if (esturnopokemon == true) {

                System.out.println(" Es el turno de " + Pokemon);
                System.out.println("Dime qué tipo de ataque quieres:");
                System.out.println("Ataque normal, pulsa 1. Hace " + ataqueCharmander + " puntos de daño.");
                System.out.println("Ataque especial, pulsa 2. Hace " + dañoEspCharmander +" puntos de daño.");

                int tipoDeAtaqueElegido = entrada.nextInt();
                //mientras charmander ataca bulbasaur defiende//que ataque debe hacer


                if (tipoDeAtaqueElegido == 1) {
                    // elige el ataque normal. Tengo que hacer el daño del atanque normal. El daño del ataque normal es ataqueCharmander
                    int danhoRealHecho = ataqueCharmander - defBulbasaur;
                    System.out.println(Pokemon + " hace " + danhoRealHecho);
                    vidaBulbasaur = vidaBulbasaur - danhoRealHecho;
                    System.out.println(" A " + Pokemon1 + "le queda " + vidaBulbasaur + " de vida");

                } else {
                    int mp1=MpCharmander-MpAtaquespecialCharmander;
                    boolean MPcharmanderNecesita= (MpCharmander>MpAtaquespecialCharmander);

                    if (mp1>MPcharmanderNecesita) {
                        int daño2 = dañoEspCharmander - defBulbasaur;
                        System.out.println(Pokemon1 + " hace " + daño2);
                        vidaBulbasaur = vidaBulbasaur - daño2;
                        System.out.println("A " + Pokemon1 + "le queda " + vidaBulbasaur + " de vida");

                    }else {
                        System.out.println(Pokemon + " no puede atacar,no tiene mp ");
                    }

                }




                //cambio de turno//
                //ataca bulbasaur//


                else{

                    System.out.println("elije un ataque de bulbasaur");
                    System.out.println(" quieres que 1 : ataque normal " + ataqueBulbasaur);
                    System.out.println(" quieres que 2 : ataque especial " + ataqueEspBulbasaur);
                    int tipoDeAtaqueElegido = entrada.nextInt();
                if (tipoDeAtaqueElegido == 1) {
                    int danhoRealHecho3 = ataqueBulbasaur - ataqueCharmander;
                    System.out.println(Pokemon + "hace" + danhoRealHecho3);
                    vidaCharmander = vidaCharmander - danhoRealHecho3;
                    System.out.println(" A " + Pokemon + " le queda " + vidaCharmander + " de vida ");
                }else{
                    int danhoRealHecho4 = ataqueEspBulbasaur- ataqueCharmander;
                    System.out.println(Pokemon + "hace" + danhoRealHecho4);
                    vidaCharmander = vidaCharmander - danhoRealHecho4;
                    System.out.println(" A " + Pokemon + " le queda " + vidaCharmander + " de vida ");


                }





             }


            }


        }
    }
}