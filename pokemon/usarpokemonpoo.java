import java.util.Scanner;
import java.util.Random;



public class usarpokemonpoo {
    public static Scanner sc = new Scanner(System.in);
    static pokemonpoo pokemonElegido;
    static pokemonpoo pokemonRandom;
    static int miAtaqueElegido;
    static int suAtaqueElegido;
    static int vidaActualRival;
    static int vidaActualMia;
    static int victoriasSeguidas = 0;
    static Random rand = new Random();

    // Pikachu1
    public static pokemonpoo pikachu = new pokemonpoo("electricidad", 100, new int[]{50, 110, 30, 10},new String[]{"impactrueno", "trueno", "golpe bajo", "rayo"}, "amarillo", "Pikachu");

    // Charizard
    public static pokemonpoo charizard = new pokemonpoo("fuego/volador", 150, new int[]{60, 100, 80, 120}, new String[]{"lanzallamas", "golpe aéreo", "tajo aéreo", "anillo ígneo"}, "naranja", "Charizard");

    // Bulbasaur
    public static pokemonpoo bulbasaur = new pokemonpoo("planta/veneno", 90, new int[]{40, 50, 70, 90},new String[]{"latigazo", "rayo solar", "hoja afilada", "bomba lodo"}, "verde", "Bulbasaur");

    // Squirtle
    public static pokemonpoo squirtle = new pokemonpoo("agua", 80, new int[]{30, 40, 50, 70},new String[]{"pistola agua", "burbuja", "cascada", "hidropulso"}, "azul", "Squirtle");

    // Jigglypuff

    public static pokemonpoo jigglypuff = new pokemonpoo("normal/hada", 70, new int[]{20, 60, 30, 90},new String[]{"canto", "rayo hielo", "puño sombra", "doble bofetón"}, "rosa", "Jigglypuff");

    // Gengar
    public static pokemonpoo gengar = new pokemonpoo("fantasma/veneno", 120, new int[]{70, 130, 50, 110},new String[]{"bola sombra", "psíquico", "puño fuego", "puño trueno"}, "morado", "Gengar");

    // Snorlax
    public static pokemonpoo snorlax = new pokemonpoo("normal", 200,new int[]{90, 60, 50, 10},new String[]{"golpe cuerpo", "hiper rayo", "descanso", "terremoto"}, "azul/gris", "Snorlax");

    // Dragonite
    public static pokemonpoo dragonite = new pokemonpoo("dragón/volador", 180, new int[]{100, 120, 80, 150},new String[]{"hiper rayo", "pulso dragón", "golpe aéreo", "puño trueno"}, "naranja", "Dragonite");

    // Lucario
    public static pokemonpoo lucario = new pokemonpoo("lucha/acero", 140,new int[]{80, 90, 70, 100},new String[]{"esfera aural", "puño meteoro", "a bocajarro", "velocidad extrema"}, "azul", "Lucario");

    // Eevee
    public static pokemonpoo eevee = new pokemonpoo("normal", 60, new int[]{30, 40, 50, 60}, new String[]{"mordisco", "rapidez", "ataque arena","deseo"}, "marrón", "Eevee");

    public static pokemonpoo[] arrayPokemonParaElegir = {pikachu,charizard,squirtle,bulbasaur,jigglypuff,gengar,snorlax,dragonite,lucario,eevee};

    // main

    public static void main(String[] args) {

        inicioPokemon();
        elegirPokemon();
        introCombate();
        
        
    }

    public static void inicioPokemon() {
        System.out.println();
        System.out.println("                               .::.                           ");
        System.out.println("                              .;:**'                          ");
        System.out.println("                              `                               ");
        System.out.println("  .:XHHHHk.              db.   .;;.     dH  MX                ");
        System.out.println("oMMMMMMMMMMM       ~MM  dMMP :MMMMMR   MMM  MR      ~MRMN     ");
        System.out.println("QMMMMMb  'MMX       MMMMMMP !MX' :M~   MMM MMM  .oo. XMMM 'MMM");
        System.out.println("  `MMMM.  )M> :X!Hk. MMMM   XMM.o'  .  MMMMMMM X?XMMM MMM>!MMP");
        System.out.println("   'MMMb.dM! XM M'?M MMMMMX.`MMMMMMMM~ MM MMM XM `' MX MMXXMM ");
        System.out.println("    ~MMMMM~ XMM. .XM XM`'MMMb.~*?**~ .MMX M t MMbooMM XMMMMMP ");
        System.out.println("     ?MMM>  YMMMMMM! MM   `?MMRb.    `MM   !L'MMMMM XM IMMM   ");
        System.out.println("      MMMX   'MMMM'  MM       ~%:           !Mh.''' dMI IMMP  ");
        System.out.println("      'MMM.                                             IMX   ");
        System.out.println("       ~M!M                                             IM    ");
        System.out.println();
        System.out.println();
        System.out.println(" +-----------------------------------------------------------+");
        System.out.println(" |                                                           |");
        System.out.println(" |       1.INICIAR PARTIDA                  2.SALIR          |");
        System.out.println(" |                                                           |");
        System.out.println(" +-----------------------------------------------------------+");
        int seleccionarInicioOSalir = 0;
        
        while (true) {
            seleccionarInicioOSalir = sc.nextInt();
            sc.nextLine();
            if (seleccionarInicioOSalir==1) {
                tutorial();
                break;
                

            } else if (seleccionarInicioOSalir!=1 && seleccionarInicioOSalir!=2) {
                System.out.println("EY ASH ELIGE SOLO ENTRE 1 Y 2");
                
            } else {
                System.out.println("HASTA PRONTO !!!");
            }
        }        
    }
    public static void tutorial() {
        System.out.println("┌────────────────────────────────────────────────────────────┐");
        System.out.println("│                                                            │");
        System.out.println("│          ¡Bienvenido al mundo de Pokémon, ASH!             │");
        System.out.println("│                                                            │");
        System.out.println("│  En esta aventura, tu objetivo será enfrentarte a tres     │");
        System.out.println("│  Pokémon al azar en intensos combates. Pero primero,       │");
        System.out.println("│  tendrás que elegir a tu fiel compañero Pokémon.           │");
        System.out.println("│                                                            │");
        System.out.println("│  Cada Pokémon tiene habilidades únicas, así que elige      │");
        System.out.println("│  sabiamente. Una vez listo, te enfrentarás a tres combates │");
        System.out.println("│  consecutivos. Usa tus movimientos con estrategia, porque  │");
        System.out.println("│  cada victoria te llevará más cerca del gran premio:       │");
        System.out.println("│                                                            │");
        System.out.println("│                ¡UNA MEDALLA DE ENTRENADOR!                 │");
        System.out.println("│                                                            │");
        System.out.println("│  ¿Estás listo para demostrar que eres el mejor,            │");
        System.out.println("│  como nadie más lo fue? ¡Elige a tu Pokémon                │");
        System.out.println("│  y comienza la aventura!                                   │");
        System.out.println("│                                                            │");
        System.out.println("└────────────────────────────────────────────────────────────┘");

    }
    public static void elegirPokemon() {
        System.out.println();
        System.out.println("┌────────────────────────────────────────────────────────────┐");
        System.out.println("│                                                            │");
        System.out.println("│   EMPECEMOS ELIGIENDO TU POKEMON, ES TU PRIMER DESAFÍO     │");
        System.out.println("│                                                            │");
        System.out.println("└────────────────────────────────────────────────────────────┘");
        int seleccionPokemonUsuario = 0;
        
        while (true) {
            for (int i = 1; i <= arrayPokemonParaElegir.length; i++) {
                System.out.println(i+" "+arrayPokemonParaElegir[i-1].getNombre().toUpperCase());
            }
            System.out.println();
            seleccionPokemonUsuario = sc.nextInt();
            sc.nextLine();
            if (seleccionPokemonUsuario<1||seleccionPokemonUsuario>arrayPokemonParaElegir.length) {
                System.out.println("NO SE HA PODIDO ENCONTRAR AL POKEMON NUMERO " + seleccionPokemonUsuario);
                System.out.println("REINICIA EL JUEGO POR ESPABILAO");
            }else{
                pokemonElegido = arrayPokemonParaElegir[seleccionPokemonUsuario - 1];
                System.out.println();
                System.out.println("ENHORABUENA HAS RECIBIDO A " + arrayPokemonParaElegir[seleccionPokemonUsuario-1].getNombre().toUpperCase());
                System.out.println();
                break;
            }
        }
    }
    public static void introCombate() {
        int aceptarCombate = 0;
        while (true) {
            System.out.println("AHORA OS TOCA DEMOSTRAR LO QUE VALEIS             ");
            System.out.println(  "A TI Y A TU "+ pokemonElegido.getNombre().toUpperCase() +".                  ");
            System.out.println("EMPECEMOS POR VER QUIEN ES VUESTRO PRIMER CONTRINCANTE             ");
            System.out.println();
            int numeroAleatorio = rand.nextInt(arrayPokemonParaElegir.length);
            pokemonRandom = arrayPokemonParaElegir[numeroAleatorio];
            System.out.println("HACIENDO SORTEO...");
            System.out.println("HACIENDO SORTEO...");
            System.out.println("HACIENDO SORTEO...");
            System.out.println("TU CONTRINCANTE ES " + pokemonRandom.getNombre().toUpperCase() + " (O.O)");
            System.out.println();
            System.out.println("ESTAS LISTO ??");
            System.out.println("1. SI        2.NO");
            System.out.println();
            aceptarCombate = sc.nextInt();
            sc.nextLine();

            if (aceptarCombate==1) {
                vidaActualRival= pokemonRandom.getVida();
                vidaActualMia = pokemonElegido.getVida();
                System.out.println("PUES QUE COMIENCE EL COMBATE !!!");
                System.out.println();
                System.out.println(" MUSICA EPIQUISIMA DE COMBATE POKEMON ");
                System.out.println();
                if (pokemonElegido.getNombre()=="Pikachu") {
                    pikachuNombreAscii();
                }if (pokemonElegido.getNombre()=="Charizard") {
                    charizardNombreAscii();
                }if (pokemonElegido.getNombre()=="Squirtle") {
                    squirtleNombreAscii();
                }if (pokemonElegido.getNombre()=="Bulbasaur") {
                    bulbasaurNombreAscii();
                }if (pokemonElegido.getNombre()=="Jigglypuff") {
                    jigglypuffNombreAscii();
                }if (pokemonElegido.getNombre()=="Gengar") {
                    gengarNombreAscii();
                }if (pokemonElegido.getNombre()=="Snorlax") {
                    snorlaxNombreAscii();
                }if (pokemonElegido.getNombre()=="Dragonite") {
                    dragoniteNombreAscii();
                }if (pokemonElegido.getNombre()=="Lucario") {
                    lucarioNombreAscii();
                }if (pokemonElegido.getNombre()=="Eevee") {
                    eeveeNombreAscii();
                }
                System.out.println();
                vsAscii();
                System.out.println();
                if (pokemonRandom.getNombre()=="Pikachu") {
                    pikachuNombreAscii();
                }if (pokemonRandom.getNombre()=="Charizard") {
                    charizardNombreAscii();
                }if (pokemonRandom.getNombre()=="Squirtle") {
                    squirtleNombreAscii();
                }if (pokemonRandom.getNombre()=="Bulbasaur") {
                    bulbasaurNombreAscii();
                }if (pokemonRandom.getNombre()=="Jigglypuff") {
                    jigglypuffNombreAscii();
                }if (pokemonRandom.getNombre()=="Gengar") {
                    gengarNombreAscii();
                }if (pokemonRandom.getNombre()=="Snorlax") {
                    snorlaxNombreAscii();
                }if (pokemonRandom.getNombre()=="Dragonite") {
                    dragoniteNombreAscii();
                }if (pokemonRandom.getNombre()=="Lucario") {
                    lucarioNombreAscii();
                }if (pokemonRandom.getNombre()=="Eevee") {
                    eeveeNombreAscii();
                }
                combate();
                break;
            } else if (aceptarCombate!=1 && aceptarCombate!=2) {
                System.out.println("EY ASH ELIGE SOLO ENTRE 1 Y 2");
            } else {
                System.out.println();
                System.out.println("UY AQUI HUELE A CACA TE TENDREMOS QUE CAMBIAR AL ADVERSARIO -_-");
                System.out.println("                $$$$$$$$$$$$$$$$$;");
                System.out.println("         .sd$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$;");
                System.out.println("[bug]  .d$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                System.out.println("      .d$$$$$$$$$$P*\"   `\"*T$$$$$$$$$$$$$$$");
                System.out.println("     s$$$$$$$$$P*             `*T$$$$$$$$$$$");
                System.out.println("    d$$$$$$$$P'                  `*T$$$$$$$P");
                System.out.println("   d$$$$$$$P'                       `T$$$$P");
                System.out.println("  d$$$$$$P'                           `T$P \\");
                System.out.println(" d$$$$$P'                                   \\");
                System.out.println(".$$$$$'                 .*\"*                 .");
                System.out.println(":$$$$;                  .*\"*-.");
                System.out.println("$$$$$'                 /                      `");
                System.out.println("$$$$$.                  .s$$s.    `*.         :");
                System.out.println("$$$$$;                 d$$$$$$b      ;     .s$s.");
                System.out.println("$$$$$$b.              d$$$$$$$$b     ;    d$$$$$b");
                System.out.println("$$$$$$$$$bs._        d$$$$P^^T$$b   /    d$P\"\"\"T$b");
                System.out.println("$$$$$$$$$$$$$$bs+=- .$$P*'    `TP       dP     .`T");
                System.out.println("$$$$$$$$$$$$$$$$P'  :P'    __          /");
                System.out.println("$$$$$$$$$$$$$$$P    $    .'  `.       /`-.    .");
                System.out.println("T$$$$$$$$$$$$$$     :   /      \\     .    `. ");
                System.out.println(" T$$$$$$$$$$$$$        :        ;           \\. ");
                System.out.println("  T*'   `*^$$$$        |+*\"$P*sss*\"  :*\"$P*ss*\"");
                System.out.println(" /         `T$$        |   Tbd$P     :  Tbd$P");
                System.out.println(";  ._        T$        |    T$$P     :   T$P      _._");
                System.out.println("     `\"*+.    T       *\"**--._/       \\   /`. .-*\"   `*.");
                System.out.println("     .*'  `.                  `*       `*---*'          ;");
                System.out.println("    (                              `.                   |");
                System.out.println("                   .'                \\                  ;");
                System.out.println("\\           /     /`*+...___          `-.             .*");
                System.out.println(" `-._   _.+'          `*. __\"\"****------`*-.____.+*\"' ");
                System.out.println("     \"*\"   \\             `. \"\"****------**\"/;");
                System.out.println("            `.         \\   `--..._______...'/");
                System.out.println("              `*--..___.`.                 /");
                System.out.println("                          `*-...______..-*'");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("  =========  ==   ==  =========  =========  ==  ==");
                System.out.println("  =========  ==   ==  ===        ===        ==  ==");
                System.out.println("  =========  ==   ==  =========  =========  ======");
                System.out.println("  ==         ==   ==        ===        ===    ==");
                System.out.println("  ==         =======  =========  =========    ==");
                System.out.println();
                System.out.println();
                System.out.println();


            }
        }
    }
    public static void combate() {
        while (vidaActualMia>0&&vidaActualRival>0) {
            saludContrario();
            tuSalud();
            for (int i = 1; i < 5; i++) {
                System.out.println(i+". " + pokemonElegido.getAtaques()[i-1]+ " " + pokemonElegido.getPotencia()[i-1]);
            }
            atacar();
            ataqueRival();
        }
        if (vidaActualRival<=0) {
            victoriasSeguidas++;
            if (victoriasSeguidas==3) {
                saludContrario();
                tuSalud();
                medalla();
            }else if (victoriasSeguidas<3) {
                saludContrario();
                tuSalud();               
                hasGanadoUna();
                introCombate(); 
            }
        } else if (vidaActualMia<=0) {
            saludContrario();
            tuSalud();
            hasPerdido();
        }
    }
    public static void atacar() {
        int Aleatorio = (int) (Math.random() * 16);
        
        miAtaqueElegido = sc.nextInt();
        sc.nextLine();

        if (Aleatorio == 7) { // critico
            System.out.println(pokemonElegido.getNombre()+ " ha usado "+ pokemonElegido.getAtaques()[miAtaqueElegido-1]+" y ha sido CRÍTICO!");
            vidaActualRival = vidaActualRival-(pokemonElegido.getPotencia()[miAtaqueElegido-1] + 25);
        } else if (Aleatorio == 10) { // esquivado
            System.out.println(pokemonRandom.getNombre()+" ha esquivado el ataque");
        } else { // ataque normal
            System.out.println(pokemonElegido.getNombre()+ " ha usado "+ pokemonElegido.getAtaques()[miAtaqueElegido-1]);
            vidaActualRival = vidaActualRival - pokemonElegido.getPotencia()[miAtaqueElegido-1];

        }



    }
    public static void ataqueRival() {
        int Aleatorio = (int) (Math.random() * 16);
        int ataqueRivalAleatorio = (int) (Math.random() * 3); 

        if (Aleatorio == 7) { // critico
            System.out.println(pokemonRandom.getNombre()+ " ha usado "+ pokemonRandom.getAtaques()[ataqueRivalAleatorio]+" y ha sido CRÍTICO!");
            vidaActualMia = vidaActualMia-(pokemonRandom.getPotencia()[ataqueRivalAleatorio-1] + 25);
        } else if (Aleatorio == 10) { // esquivado
            System.out.println(pokemonElegido.getNombre()+" ha esquivado el ataque");
        } else { // ataque normal
            System.out.println(pokemonRandom.getNombre()+ " ha usado "+ pokemonRandom.getAtaques()[ataqueRivalAleatorio]);
            vidaActualMia = vidaActualMia - pokemonRandom.getPotencia()[ataqueRivalAleatorio];

        }


    }
    public static void tuSalud() {
        if (vidaActualMia == pokemonElegido.getVida()) {
            System.out.println("       "+pokemonElegido.getNombre()+"         ");
            System.out.println("        _------_");
            System.out.println("      /         \\");
            System.out.println("     /           \\");
            System.out.println("    /             \\");
            System.out.println("   /               \\");
            System.out.println("  /        TU SALUD \\           ");
            System.out.println("████████████████████████████████" + vidaActualMia);
            System.out.println();

        }else if (vidaActualMia >= pokemonElegido.getVida()/2 && vidaActualMia < pokemonElegido.getVida()) {
            System.out.println("       "+pokemonElegido.getNombre()+"         ");
            System.out.println("        _------_");
            System.out.println("      /         \\");
            System.out.println("     /           \\");
            System.out.println("    /             \\");
            System.out.println("   /               \\");
            System.out.println("  /        TU SALUD \\           ");           
            System.out.println("███████████████████████        █" + vidaActualMia);
            System.out.println();
        }else if (vidaActualMia >= pokemonElegido.getVida()/4 && vidaActualMia <= pokemonElegido.getVida()/2) {
            System.out.println("       "+pokemonElegido.getNombre()+"         ");
            System.out.println("        _------_");
            System.out.println("      /         \\");
            System.out.println("     /           \\");
            System.out.println("    /             \\");
            System.out.println("   /               \\");
            System.out.println("  /        TU SALUD \\           ");
            System.out.println("████████████████               █" + vidaActualMia);
            System.out.println();
        }else if (vidaActualMia <= pokemonElegido.getVida()/4 && vidaActualMia > 0) {
            System.out.println("       "+pokemonElegido.getNombre()+"         ");
            System.out.println("        _------_");
            System.out.println("      /         \\");
            System.out.println("     /           \\");
            System.out.println("    /             \\");
            System.out.println("   /               \\");
            System.out.println("  /        TU SALUD \\           ");
            System.out.println("███████                        █" + vidaActualMia);
        }else if (vidaActualMia <= 0) {
            System.out.println("       "+pokemonElegido.getNombre()+"         ");
            System.out.println("        _------_");
            System.out.println("      /         \\");
            System.out.println("     /           \\");
            System.out.println("    /             \\");
            System.out.println("   /               \\");
            System.out.println("     TU SALUD HA SIDO         ");
            System.out.println("        DEBILITADA            ");
            System.out.println("█                              █" + 0);

        }
        }
        
        public static void saludContrario() {
            if (vidaActualRival == pokemonRandom.getVida()) {
                System.out.println("                               "+pokemonRandom.getNombre()+"         ");
                System.out.println("                                  _------_");
                System.out.println("                                /         \\");
                System.out.println("                               /           \\");
                System.out.println("                              /             \\");
                System.out.println("                             /               \\");
                System.out.println("                                SALUD RIVAL          ");
                System.out.println("                       ████████████████████████████████" + vidaActualRival);
                System.out.println();
                System.out.println();
                System.out.println();
            } else if (vidaActualRival >= pokemonRandom.getVida()/2 && vidaActualRival < pokemonRandom.getVida()) {
                System.out.println("                               "+pokemonRandom.getNombre()+"         ");
                System.out.println("                                 _------_");
                System.out.println("                               /         \\");
                System.out.println("                              /           \\");
                System.out.println("                             /             \\");
                System.out.println("                            /               \\");
                System.out.println("                               SALUD RIVAL          ");           
                System.out.println("                       ███████████████████████        █" + vidaActualRival);
                System.out.println();
                System.out.println();
                System.out.println();

            }else if (vidaActualRival >= pokemonRandom.getVida()/4 && vidaActualRival <= pokemonRandom.getVida()/2) {
                System.out.println("                               "+pokemonRandom.getNombre()+"         ");
                System.out.println("                                 _------_");
                System.out.println("                               /         \\");
                System.out.println("                              /           \\");
                System.out.println("                             /             \\");
                System.out.println("                            /               \\");
                System.out.println("                              SALUD RIVAL          ");
                System.out.println("                      ████████████████               █" + vidaActualRival);
                System.out.println();
                System.out.println();
                System.out.println();

            }else if (vidaActualRival <= pokemonRandom.getVida()/4 && vidaActualRival > 0) {
                System.out.println("                               "+pokemonRandom.getNombre()+"         ");
                System.out.println("                                _------_");
                System.out.println("                              /         \\");
                System.out.println("                             /           \\");
                System.out.println("                            /             \\");
                System.out.println("                           /               \\");
                System.out.println("                             SALUD RIVAL          ");
                System.out.println("                     ███████                        █" + vidaActualRival);
                System.out.println();
                System.out.println();
                System.out.println();

            }else if (vidaActualRival <= 0) {
                System.out.println("                               "+pokemonRandom.getNombre()+"         ");
                System.out.println("                               _------_");
                System.out.println("                             /         \\");
                System.out.println("                            /           \\");
                System.out.println("                           /             \\");
                System.out.println("                          /               \\");
                System.out.println("                             SALUD RIVAL          ");
                System.out.println("                             DEBILITADA            ");
                System.out.println("                    █                              █" + 0);
                System.out.println();
                System.out.println();
                System.out.println();
                   
            }



    }
    public static void hasPerdido(){
        System.out.println("");
        System.out.println("");
        System.out.println("            ██╗  ██╗ █████╗ ███████╗");
        System.out.println("            ██║  ██║██╔══██╗██╔════╝");
        System.out.println("            ███████║███████║███████╗");
        System.out.println("            ██╔══██║██╔══██║╚════██║");
        System.out.println("            ██║  ██║██║  ██║███████║");
        System.out.println("            ╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝");
        System.out.println("");
        System.out.println("");
        System.out.println("██████╗ ███████╗██████╗ ██████╗ ██╗██████╗  ██████╗");
        System.out.println("██╔══██╗██╔════╝██╔══██╗██╔══██╗██║██╔══██╗██╔═══██╗");
        System.out.println("██████╔╝█████╗  ██████╔╝██║  ██║██║██║  ██║██║   ██║");
        System.out.println("██╔═══╝ ██╔══╝  ██╔══██╗██║  ██║██║██║  ██║██║   ██║");
        System.out.println("██║     ███████╗██║  ██║██████╔╝██║██████╔╝╚██████╔╝");
        System.out.println("╚═╝     ╚══════╝╚═╝  ╚═╝╚═════╝ ╚═╝╚═════╝  ╚═════╝");
        System.out.println("");
        System.out.println("");
                                                              
    }
    public static void hasGanadoUna(){
        System.out.println("");
        System.out.println("");
        System.out.println("██████╗ ███████╗██║     ██╗███████╗██╗██████╗ ███████╗█████╗  ███████╗███████╗");
        System.out.println("██╔════╝██╔════╝██║     ██║██╔════╝██║██╔══██╗██╔══██╗██╔══██╗██╔════╝██╔════╝");
        System.out.println("█████╗  █████╗  ██║     ██║██║     ██║██║  ██║███████║██║  ██║█████╗  ███████╗");
        System.out.println("██╔══╝  ██╔══╝  ██║     ██║██║     ██║██║  ██║██╔══██║██║  ██║██╔══╝  ╚════██║");
        System.out.println("██║     ███████╗███████╗██║╚██████╗██║██████╔╝██║  ██║██████╔╝███████╗███████║");
        System.out.println("╚═╝     ╚══════╝╚══════╝╚═╝ ╚═════╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═════╝ ╚══════╝╚══════╝");
        System.out.println("");
        System.out.println("");
        System.out.println("                    ██╗  ██╗ █████╗ ███████╗");
        System.out.println("                    ██║  ██║██╔══██╗██╔════╝");
        System.out.println("                    ███████║███████║███████╗");
        System.out.println("                    ██╔══██║██╔══██║╚════██║");
        System.out.println("                    ██║  ██║██║  ██║███████║");
        System.out.println("                    ╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝");
        System.out.println("");
        System.out.println("");
        System.out.println("         ██████╗  █████╗ ███╗   ██╗ █████╗ ██████╗  ██████╗");
        System.out.println("        ██╔════╝ ██╔══██╗████╗  ██║██╔══██╗██╔══██╗██╔═══██╗");
        System.out.println("        ██║  ███╗███████║██╔██╗ ██║███████║██║  ██║██║   ██║");
        System.out.println("        ██║   ██║██╔══██║██║╚██╗██║██╔══██║██║  ██║██║   ██║");
        System.out.println("        ╚██████╔╝██║  ██║██║ ╚████║██║  ██║██████╔╝╚██████╔╝");
        System.out.println("         ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝╚═════╝  ╚═════╝");
        System.out.println("");
        System.out.println("");

    }
    public static void medalla(){
        System.out.println("");
        System.out.println("");
        System.out.println("██████╗ ███████╗██║     ██╗███████╗██╗██████╗ ███████╗█████╗  ███████╗███████╗");
        System.out.println("██╔════╝██╔════╝██║     ██║██╔════╝██║██╔══██╗██╔══██╗██╔══██╗██╔════╝██╔════╝");
        System.out.println("█████╗  █████╗  ██║     ██║██║     ██║██║  ██║███████║██║  ██║█████╗  ███████╗");
        System.out.println("██╔══╝  ██╔══╝  ██║     ██║██║     ██║██║  ██║██╔══██║██║  ██║██╔══╝  ╚════██║");
        System.out.println("██║     ███████╗███████╗██║╚██████╗██║██████╔╝██║  ██║██████╔╝███████╗███████║");
        System.out.println("╚═╝     ╚══════╝╚══════╝╚═╝ ╚═════╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═════╝ ╚══════╝╚══════╝");
        System.out.println("");
        System.out.println("");
        System.out.println("  ███████╗███████╗████████╗ █████╗     ███████╗███████╗    ████████╗██╗   ██╗");
        System.out.println("  ██╔════╝██╔════╝╚══██╔══╝██╔══██╗    ██╔════╝██╔════╝    ╚══██╔══╝██║   ██║");
        System.out.println("  █████╗  ███████╗   ██║   ███████║    █████╗  ███████╗       ██║   ██║   ██║");
        System.out.println("  ██╔══╝  ╚════██║   ██║   ██╔══██║    ██╔══╝  ╚════██║       ██║   ██║   ██║");
        System.out.println("  ███████╗███████║   ██║   ██║  ██║    ███████╗███████║       ██║   ╚██████╔╝");
        System.out.println("  ╚══════╝╚══════╝   ╚═╝   ╚═╝  ╚═╝    ╚══════╝╚══════╝       ╚═╝    ╚═════╝");
        System.out.println("");
        System.out.println("");
        System.out.println("    ███╗   ███╗███████╗██████╗  █████╗ ██╗     ██╗      █████╗");
        System.out.println("    ████╗ ████║██╔════╝██╔══██╗██╔══██╗██║     ██║     ██╔══██╗");
        System.out.println("    ██╔████╔██║█████╗  ██║  ██║███████║██║     ██║     ███████║");
        System.out.println("    ██║╚██╔╝██║██╔══╝  ██║  ██║██╔══██║██║     ██║     ██╔══██║");
        System.out.println("    ██║ ╚═╝ ██║███████╗██████╔╝██║  ██║███████╗███████╗██║  ██║");
        System.out.println("    ╚═╝     ╚═╝╚══════╝╚═════╝ ╚═╝  ╚═╝╚══════╝╚══════╝╚═╝  ╚═╝");
        System.out.println("");
        System.out.println("");
        System.out.println("                          _______________");
        System.out.println("                         |@@@@|     |####|");
        System.out.println("                         |@@@@|     |####|");
        System.out.println("                         |@@@@|     |####|");
        System.out.println("                        \\@@@@|     |####/");
        System.out.println("                         \\@@@|     |###/");
        System.out.println("                           `@@|_____|##'");
        System.out.println("                                (O)");
        System.out.println("                             .-'''''-.");
        System.out.println("                           .'  * * *  `.");
        System.out.println("                          :  *       *  :");
        System.out.println("                         :   P  O  K  E  :");
        System.out.println("                         : ~ A W A R D ~ :");
        System.out.println("                          :  *       *  :");
        System.out.println("                           `.  * * *  .'");
        System.out.println("                             `-.....-'");
            

    }
    

    public static void vsAscii() {
        System.out.println();
        System.out.println("            ██╗   ██╗███████╗");
        System.out.println("            ██║   ██║██╔════╝");
        System.out.println("            ██║   ██║███████╗");
        System.out.println("            ╚██╗ ██╔╝╚════██║");
        System.out.println("             ╚████╔╝ ███████║");
        System.out.println("              ╚═══╝  ╚══════╝ ");
        System.out.println();

    }
                  
    public static void pikachuNombreAscii() {
        System.out.println("██████╗ ██╗██╗  ██╗ █████╗  ██████╗██╗  ██╗██╗   ██╗");
        System.out.println("██╔══██╗██║██║ ██╔╝██╔══██╗██╔════╝██║  ██║██║   ██║");
        System.out.println("██████╔╝██║█████╔╝ ███████║██║     ███████║██║   ██║");
        System.out.println("██╔═══╝ ██║██╔═██╗ ██╔══██║██║     ██╔══██║██║   ██║");
        System.out.println("██║     ██║██║  ██╗██║  ██║╚██████╗██║  ██║╚██████╔╝");
        System.out.println("╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝ ╚═════╝ ");
    }
    public static void charizardNombreAscii() {
        System.out.println(" ██████╗██╗  ██╗ █████╗ ██████╗ ██╗███████╗ █████╗ ██████╗ ██████╗ ");
        System.out.println("██╔════╝██║  ██║██╔══██╗██╔══██╗██║╚══███╔╝██╔══██╗██╔══██╗██╔══██╗");
        System.out.println("██║     ███████║███████║██████╔╝██║  ███╔╝ ███████║██████╔╝██║  ██║");
        System.out.println("██║     ██╔══██║██╔══██║██╔══██╗██║ ███╔╝  ██╔══██║██╔══██╗██║  ██║");
        System.out.println("╚██████╗██║  ██║██║  ██║██║  ██║██║███████╗██║  ██║██║  ██║██████╔╝");
        System.out.println(" ╚═════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝");
    }public static void squirtleNombreAscii() {
        System.out.println("███████╗ ██████╗ ██╗   ██╗██╗██████╗ ████████╗██╗     ███████╗ ");
        System.out.println("██╔════╝██╔═══██╗██║   ██║██║██╔══██╗╚══██╔══╝██║     ██╔════╝");
        System.out.println("███████╗██║   ██║██║   ██║██║██████╔╝   ██║   ██║     █████╗");
        System.out.println("╚════██║██║▄▄ ██║██║   ██║██║██╔══██╗   ██║   ██║     ██╔══╝");
        System.out.println("███████║╚██████╔╝╚██████╔╝██║██║  ██║   ██║   ███████╗███████╗");
        System.out.println("╚══════╝ ╚══▀▀═╝  ╚═════╝ ╚═╝╚═╝  ╚═╝   ╚═╝   ╚══════╝╚══════╝");
    }
    public static void bulbasaurNombreAscii() {
        System.out.println("██████╗ ██╗   ██╗██╗     ██████╗  █████╗ ███████╗ █████╗ ██╗   ██╗██████╗");
        System.out.println("██╔══██╗██║   ██║██║     ██╔══██╗██╔══██╗██╔════╝██╔══██╗██║   ██║██╔══██╗");
        System.out.println("██████╔╝██║   ██║██║     ██████╔╝███████║███████╗███████║██║   ██║██████╔╝");
        System.out.println("██╔══██╗██║   ██║██║     ██╔══██╗██╔══██║╚════██║██╔══██║██║   ██║██╔══██╗");
        System.out.println("██████╔╝╚██████╔╝███████╗██████╔╝██║  ██║███████║██║  ██║╚██████╔╝██║  ██║");
        System.out.println("╚═════╝  ╚═════╝ ╚══════╝╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝");
    }
    public static void jigglypuffNombreAscii() {
        System.out.println("     ██╗██╗ ██████╗  ██████╗ ██╗  ██╗   ██╗██████╗ ██╗   ██╗███████╗███████╗");
        System.out.println("     ██║██║██╔════╝ ██╔════╝ ██║  ╚██╗ ██╔╝██╔══██╗██║   ██║██╔════╝██╔════╝");
        System.out.println("     ██║██║██║  ███╗██║  ███╗██║   ╚████╔╝ ██████╔╝██║   ██║█████╗  █████╗");
        System.out.println("██   ██║██║██║   ██║██║   ██║██║    ╚██╔╝  ██╔═══╝ ██║   ██║██╔══╝  ██╔══╝");
        System.out.println("╚█████╔╝██║╚██████╔╝╚██████╔╝███████╗██║   ██║     ╚██████╔╝██║     ██║");
        System.out.println(" ╚════╝ ╚═╝ ╚═════╝  ╚═════╝ ╚══════╝╚═╝   ╚═╝      ╚═════╝ ╚═╝     ╚═╝");
    }
    public static void gengarNombreAscii() {
        System.out.println("██████╗ ███████╗███╗   ██╗ ██████╗  █████╗ ██████╗ ");
        System.out.println("██╔════╝ ██╔════╝████╗  ██║██╔════╝ ██╔══██╗██╔══██╗");
        System.out.println("██║  ███╗█████╗  ██╔██╗ ██║██║  ███╗███████║██████╔╝");
        System.out.println("██║   ██║██╔══╝  ██║╚██╗██║██║   ██║██╔══██║██╔══██╗");
        System.out.println("╚██████╔╝███████╗██║ ╚████║╚██████╔╝██║  ██║██║  ██║");
        System.out.println(" ╚═════╝ ╚══════╝╚═╝  ╚═══╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝");
    }public static void snorlaxNombreAscii() {
        System.out.println("███████╗███╗   ██╗ ██████╗ ██████╗ ██╗      █████╗ ██╗  ██╗ ");
        System.out.println("██╔════╝████╗  ██║██╔═══██╗██╔══██╗██║     ██╔══██╗╚██╗██╔╝");
        System.out.println("███████╗██╔██╗ ██║██║   ██║██████╔╝██║     ███████║ ╚███╔╝");
        System.out.println("╚════██║██║╚██╗██║██║   ██║██╔══██╗██║     ██╔══██║ ██╔██╗ ");
        System.out.println("███████║██║ ╚████║╚██████╔╝██║  ██║███████╗██║  ██║██╔╝ ██╗");
        System.out.println("╚══════╝╚═╝  ╚═══╝ ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝");
    }public static void dragoniteNombreAscii() {
        System.out.println("██████╗ ██████╗  █████╗  ██████╗  ██████╗ ███╗   ██╗██╗████████╗███████╗");
        System.out.println("██╔══██╗██╔══██╗██╔══██╗██╔════╝ ██╔═══██╗████╗  ██║██║╚══██╔══╝██╔════╝");
        System.out.println("██║  ██║██████╔╝███████║██║  ███╗██║   ██║██╔██╗ ██║██║   ██║   █████╗");
        System.out.println("██║  ██║██╔══██╗██╔══██║██║   ██║██║   ██║██║╚██╗██║██║   ██║   ██╔══╝");
        System.out.println("██████╔╝██║  ██║██║  ██║╚██████╔╝╚██████╔╝██║ ╚████║██║   ██║   ███████╗");
        System.out.println("╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═══╝╚═╝   ╚═╝   ╚══════╝");
    }public static void lucarioNombreAscii() {
        System.out.println("██╗     ██╗   ██╗ ██████╗ █████╗ ██████╗ ██╗ ██████╗ ");
        System.out.println("██║     ██║   ██║██╔════╝██╔══██╗██╔══██╗██║██╔═══██╗");
        System.out.println("██║     ██║   ██║██║     ███████║██████╔╝██║██║   ██║");
        System.out.println("██║     ██║   ██║██║     ██╔══██║██╔══██╗██║██║   ██║");
        System.out.println("███████╗╚██████╔╝╚██████╗██║  ██║██║  ██║██║╚██████╔╝");
        System.out.println("╚══════╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝ ╚═════╝");
    }public static void eeveeNombreAscii() {
        System.out.println("███████╗███████╗██╗   ██╗███████╗███████╗");
        System.out.println("██╔════╝██╔════╝██║   ██║██╔════╝██╔════╝");
        System.out.println("█████╗  █████╗  ██║   ██║█████╗  █████╗");
        System.out.println("██╔══╝  ██╔══╝  ╚██╗ ██╔╝██╔══╝  ██╔══╝");
        System.out.println("███████╗███████╗ ╚████╔╝ ███████╗███████╗");
        System.out.println("╚══════╝╚══════╝  ╚═══╝  ╚══════╝╚══════╝");
    }
    

  
  


                                         
    




 
                                                     
    

  
  


                                                                        

 



                                                           
    
    
    
    
    
     
                                                        
    
    
      
  
     
     
                                                                           
     





                                                                          
    

  
  


                                                              
    
    
    
    
    
      
                                                                       
}
