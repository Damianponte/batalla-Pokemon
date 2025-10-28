import java.util.Scanner;
//buscamos funcion para:
//imprimir el estado de un pokemon, valores actuales del pokemon
//pedir al usuario que ataque realiza
//Realizar un ataque. Le pasas a la función el daño de ataque,
// la vida del enemigo y su defensa, y devuelves cuanta vida le queda después del ataque.
public class pokemonbattle {
    public static void estado(String nombre, int vida,int mp, int ataque,int danhoAtaqueSpe,int defensa){
       System.out.println("Datos del pokemon" + nombre);
       System.out.println(nombre + " tiene" + vida + "puntos de vida");
       System.out.println(nombre + " tiene" + ataque  + "puntos de ataque");
       System.out.println(nombre + " tiene" + danhoAtaqueSpe + "puntos de ataque especial");
       System.out.println(nombre + " tiene" + defensa  + "puntos de defensa");
       System.out.println(nombre + " tiene" + mp + "puntos de poder mágico");








    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Charmander//
        String Pokemon1 = "Charmander";
        int vidaCharmander = 54;
        int MpCharmander = 15;
        int ataqueCharmander = 12;
        int defCharmander = 7;
        String ataqueNormalCharmander = "Golpe";
        String ataqueEspCharmander = "Ascuas";
        int dañoEspCharmander = 19;
        int MpAtaquespecialCharmander = 10;

        //Bulbasaur//
        String Pokemon2 = "Bulbasaur";
        int vidaBulbasaur = 54;
        int MpBulbasaur = 24;
        int ataqueBulbasaur = 15;
        int defBulbasaur = 6;
        String ataqueNormalBulbasaur = "Látigo cepa";
        String ataqueEspBulbasaur = "Hoja afilada";
        int dañoEspBulbasaur = 17;
        int MpAtaquespecialBulbasaur = 8;

        System.out.println("¡Batalla Pokémon entre " + Pokemon1 + " VS " + Pokemon2 + "!");
        //String nombre, int vida,int mp, int ataque,int danhoAtaqueSpe,int defensa)
        estado(Pokemon1,vidaCharmander, MpCharmander,ataqueCharmander,dañoEspCharmander,defCharmander);
        estado(Pokemon2,vidaBulbasaur, MpBulbasaur,ataqueBulbasaur,dañoEspBulbasaur,defBulbasaur);

        boolean turnoCharmander = true;

        while (vidaCharmander > 0 && vidaBulbasaur > 0) {
            //enpieza el turno de charmander// cambiamos al final del bucle//
            if (turnoCharmander) {
                //Charmander
                System.out.println("\nEs el turno de " + Pokemon1);
                System.out.println("1. Ataque normal (" + ataqueNormalCharmander + ") → " + ataqueCharmander + " daño");
                System.out.println("2. Ataque especial (" + ataqueEspCharmander + ") → " + dañoEspCharmander + " daño, cuesta " + MpAtaquespecialCharmander + " MP");
                System.out.println("MP actual: " + MpCharmander);
                int eleccion = entrada.nextInt();
                //si elejimos 1, atacara normal, elejimos 2 atacara con ataque especial si tiene//
                if (eleccion == 1) {
                    int daño = Math.max(ataqueCharmander - defBulbasaur, 0);
                    vidaBulbasaur -= daño;
                    System.out.println(Pokemon1 + " usa " + ataqueNormalCharmander + " e inflige " + daño + " puntos de daño.");
                } else if (eleccion == 2) {
                    if (MpCharmander >= MpAtaquespecialCharmander) {
                        MpCharmander -= MpAtaquespecialCharmander;
                        int daño = Math.max(dañoEspCharmander - defBulbasaur, 0);
                        vidaBulbasaur -= daño;
                        System.out.println(Pokemon1 + " usa " + ataqueEspCharmander + " e inflige " + daño + " puntos de daño.");
                    } else {
                        System.out.println(Pokemon1 + " no tiene suficiente MP para usar " + ataqueEspCharmander + "!");
                    }
                }

                System.out.println(Pokemon2 + " tiene " + vidaBulbasaur + " de vida restante.");
                //negamos el comando de turnocharmander para cambiar de turno de pokemon.
                turnoCharmander = !turnoCharmander;

            } else
            {
                //bulbasaur//
                System.out.println("\nEs el turno de " + Pokemon2);
                System.out.println("1. Ataque normal (" + ataqueNormalBulbasaur + ") → " + ataqueBulbasaur + " daño");
                System.out.println("2. Ataque especial (" + ataqueEspBulbasaur + ") → " + dañoEspBulbasaur + " daño, cuesta " + MpAtaquespecialBulbasaur + " MP");
                System.out.println("MP actual: " + MpBulbasaur);
                int eleccion = entrada.nextInt();

                if (eleccion == 1)
                {
                    int daño = Math.max(ataqueBulbasaur - defCharmander, 0);
                    vidaCharmander -= daño;
                    System.out.println(Pokemon2 + " usa " + ataqueNormalBulbasaur + " e inflige " + daño + " puntos de daño.");
                } else if (eleccion == 2)
                {
                    if (MpBulbasaur >= MpAtaquespecialBulbasaur)
                    {
                        MpBulbasaur -= MpAtaquespecialBulbasaur;
                        int daño = Math.max(dañoEspBulbasaur - defCharmander, 0);
                        vidaCharmander -= daño;
                        System.out.println(Pokemon2 + " usa " + ataqueEspBulbasaur + " e inflige " + daño + " puntos de daño.");
                    } else
                    {
                        System.out.println(Pokemon2 + " no tiene suficiente MP para usar " + ataqueEspBulbasaur + "!");
                    }
                }

                System.out.println(Pokemon1 + " tiene " + vidaCharmander + " de vida restante.");
                turnoCharmander = true;
            }
        }
            //buscamos la condicion final para el ganador, la vida de charmander o de bulbasaur llegue a cero
        if (vidaCharmander <= 0 && vidaBulbasaur <= 0)
        {

        } else if (vidaCharmander <= 0) {
            System.out.println( Pokemon2 + " gana la batalla!");
        } else {
            System.out.println( Pokemon1 + " gana la batalla!");
        }


    }
}