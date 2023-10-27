package lab3_p1_erickhernandez;

import java.util.Scanner;

public class Lab3_P1_ErickHernandez {

    public static void main(String[] args) {
        Scanner link = new Scanner(System.in);

        int opcionMenu = 1;

        while (opcionMenu > 0 && opcionMenu < 4) {
            System.out.println("Ingrese una opcion del 1 al 3, otro numero finalizara el programa");
            opcionMenu = link.nextInt();

            switch (opcionMenu) {
                case 1: {
                    System.out.println("Diferencia: ");
                    int diferencia = link.nextInt();

                    System.out.println("Inicial: ");
                    int inicio = link.nextInt();

                    System.out.println("Cantidad: ");
                    int cantidad = link.nextInt();

                    int series = inicio;
                    int suma = diferencia;

                    for (int i = 0; i < cantidad - 1; i++) {
                        System.out.print(series + ", ");
                        series += suma;
                        suma++;

                    }

                    System.out.print(series);
                    System.out.println("");

                    System.out.println("Que numero desea ver mas adelante en la sucesion?");
                    int sucesion = link.nextInt();

                    for (int i = 0; i < sucesion - 1; i++) {
                        inicio += diferencia;
                        diferencia++;

                    }

                    System.out.println(inicio);
                    System.out.println("");

                    break;

                }

                case 2: {

                    System.out.println("Ingrese que modo de pelea pokemon desea: ");
                    System.out.println("1.- Hasta la muerte");
                    System.out.println("2.- Por rondas");

                    int modoPelea = link.nextInt();

                    System.out.println("");
                    System.out.println("Estadisticas de los pokemones");
                    System.out.println("Sylveon Vida: 280 - Ataque: 80 - Defensa: 15%");
                    System.out.println("Gyarados Vida: 300 - Ataque: 50 - Defensa: 10%");
                    System.out.println("Giratina Vida: 300 - Ataque: 70 - Defensa: 25%");
                    System.out.println("Dragonite Vida: 250 - Ataque: 75 - Defensa: 20%");
                    System.out.println("");

                    System.out.println("Ingrese una pelea determinada");
                    System.out.println("1. Sylveon vs Dragonite");
                    System.out.println("2. Gyarados vs Giratina");
                    System.out.println("3. Dragonite vs Giratina");
                    System.out.println("4. Giratina vs Sylveon");

                    int opcionPelea = link.nextInt();
                    System.out.println("");
                    int ronda = 1;

                    switch (opcionPelea) {
                        case 1: {

                            float vida1 = 280;
                            float vida2 = 250;

                            int ataque1 = 80;
                            int ataque2 = 75;

                            if (modoPelea == 1) {

                                while (vida1 > 0 || vida2 > 0) {

                                    System.out.println("---------------Ronda " + ronda + "---------------");

                                    System.out.println("Vida de pokemon 1: " + vida1);
                                    System.out.println("Vida de pokemon 2: " + vida2);
                                    System.out.println("");

                                    System.out.println("Pokemon 1 ha atacado!");
                                    vida1 = (float) (vida1 + ataque2 * 0.15 - ataque2);

                                    if (vida1 <= 0) {

                                        System.out.println("");
                                        System.out.println("Vida de pokemon 1: " + 0);
                                        System.out.println("Vida de pokemon 2: " + vida2);
                                        System.out.println("");

                                        System.out.println("********* Fin de la batalla *********");
                                        System.out.println("Pokemon 2 ha ganado!");
                                        System.out.println("");
                                        break;
                                    }

                                    System.out.println("Pokemon 2 ha atacado!");
                                    vida2 = (float) (vida2 + ataque1 * 0.2 - ataque1);

                                    if (vida2 <= 0) {

                                        System.out.println("");
                                        System.out.println("Vida de pokemon 1: " + vida1);
                                        System.out.println("Vida de pokemon 2: " + 0);
                                        System.out.println("");

                                        System.out.println("********* Fin de la batalla *********");
                                        System.out.println("Pokemon 1 ha ganado!");
                                        System.out.println("");
                                        break;
                                    }

                                    System.out.println("");
                                    System.out.println("Vida de pokemon 1: " + vida1);
                                    System.out.println("Vida de pokemon 2: " + vida2);

                                    ronda++;

                                }

                            } else if (modoPelea == 2) {

                                System.out.println("Ingrese el numero de rondas que desea jugar (1-10): ");
                                int numeroRondas = link.nextInt();

                                for (int i = 0; i < numeroRondas; i++) {

                                    if (numeroRondas < 1 || numeroRondas > 10) {
                                        System.out.println("Numero de rondas invalido");
                                        break;
                                    }

                                    System.out.println("---------------Ronda " + ronda + "---------------");

                                    System.out.println("Vida de pokemon 1: " + vida1);
                                    System.out.println("Vida de pokemon 2: " + vida2);
                                    System.out.println("");

                                    System.out.println("Pokemon 1 ha atacado!");
                                    vida1 = (float) (vida1 + ataque2 * 0.15 - ataque2);

                                    if (vida1 <= 0) {

                                        vida1 = 0;

                                        System.out.println("");
                                        System.out.println("No se puede llegar al numero de rondas deseado");

                                        System.out.println("");
                                        System.out.println("Vida de pokemon 1: " + vida1);
                                        System.out.println("Vida de pokemon 2: " + vida2);

                                        break;
                                    }

                                    System.out.println("Pokemon 2 ha atacado!");
                                    vida2 = (float) (vida2 + ataque1 * 0.2 - ataque1);

                                    if (vida2 <= 0) {

                                        vida2 = 0;

                                        System.out.println("");
                                        System.out.println("No se puede llegar al numero de rondas deseado");

                                        System.out.println("");
                                        System.out.println("Vida de pokemon 1: " + vida1);
                                        System.out.println("Vida de pokemon 2: " + vida2);

                                        break;
                                    }

                                    System.out.println("");
                                    System.out.println("Vida de pokemon 1: " + vida1);
                                    System.out.println("Vida de pokemon 2: " + vida2);

                                    ronda++;

                                }

                                if (vida1 > vida2) {

                                    System.out.println("");
                                    System.out.println("********* Fin de la batalla *********");
                                    System.out.println("Pokemon 1 ha ganado!");
                                    System.out.println("");
                                } else {

                                    System.out.println("");
                                    System.out.println("********* Fin de la batalla *********");
                                    System.out.println("Pokemon 2 ha ganado!");
                                    System.out.println("");
                                }

                            }

                            break;

                        }

                        case 2: {

                            float vida1 = 300;
                            float vida2 = 300;

                            int ataque1 = 50;
                            int ataque2 = 70;

                            if (modoPelea == 1) {

                                while (vida1 > 0 || vida2 > 0) {

                                    System.out.println("---------------Ronda " + ronda + "---------------");

                                    System.out.println("Vida de pokemon 1: " + vida1);
                                    System.out.println("Vida de pokemon 2: " + vida2);
                                    System.out.println("");

                                    System.out.println("Pokemon 1 ha atacado!");
                                    vida1 = (float) (vida1 + ataque2 * 0.1 - ataque2);

                                    if (vida1 <= 0) {

                                        System.out.println("");
                                        System.out.println("Vida de pokemon 1: " + 0);
                                        System.out.println("Vida de pokemon 2: " + vida2);
                                        System.out.println("");

                                        System.out.println("********* Fin de la batalla *********");
                                        System.out.println("Pokemon 2 ha ganado!");
                                        System.out.println("");
                                        break;
                                    }

                                    System.out.println("Pokemon 2 ha atacado!");
                                    vida2 = (float) (vida2 + ataque1 * 0.25 - ataque1);

                                    if (vida2 <= 0) {

                                        System.out.println("");
                                        System.out.println("Vida de pokemon 1: " + vida1);
                                        System.out.println("Vida de pokemon 2: " + 0);
                                        System.out.println("");

                                        System.out.println("********* Fin de la batalla *********");
                                        System.out.println("Pokemon 1 ha ganado!");
                                        System.out.println("");
                                        break;
                                    }

                                    System.out.println("");
                                    System.out.println("Vida de pokemon 1: " + vida1);
                                    System.out.println("Vida de pokemon 2: " + vida2);

                                    ronda++;

                                }

                            } else if (modoPelea == 2) {

                                System.out.println("Ingrese el numero de rondas que desea jugar: ");
                                int numeroRondas = link.nextInt();

                                for (int i = 0; i < numeroRondas; i++) {

                                    if (numeroRondas < 1 || numeroRondas > 10) {
                                        System.out.println("Numero de rondas invalido");
                                        break;
                                    }

                                    System.out.println("---------------Ronda " + ronda + "---------------");

                                    System.out.println("Vida de pokemon 1: " + vida1);
                                    System.out.println("Vida de pokemon 2: " + vida2);
                                    System.out.println("");

                                    System.out.println("Pokemon 1 ha atacado!");
                                    vida1 = (float) (vida1 + ataque2 * 0.1 - ataque2);

                                    if (vida1 <= 0) {

                                        vida1 = 0;

                                        System.out.println("");
                                        System.out.println("No se puede llegar al numero de rondas deseado");

                                        System.out.println("");
                                        System.out.println("Vida de pokemon 1: " + vida1);
                                        System.out.println("Vida de pokemon 2: " + vida2);

                                        break;
                                    }

                                    System.out.println("Pokemon 2 ha atacado!");
                                    vida2 = (float) (vida2 + ataque1 * 0.25 - ataque1);

                                    if (vida2 <= 0) {

                                        vida2 = 0;

                                        System.out.println("");
                                        System.out.println("No se puede llegar al numero de rondas deseado");

                                        System.out.println("");
                                        System.out.println("Vida de pokemon 1: " + vida1);
                                        System.out.println("Vida de pokemon 2: " + vida2);

                                        break;
                                    }

                                    System.out.println("");
                                    System.out.println("Vida de pokemon 1: " + vida1);
                                    System.out.println("Vida de pokemon 2: " + vida2);

                                    ronda++;

                                }

                                if (vida1 > vida2) {

                                    System.out.println("");
                                    System.out.println("********* Fin de la batalla *********");
                                    System.out.println("Pokemon 1 ha ganado!");
                                    System.out.println("");
                                } else {

                                    System.out.println("");
                                    System.out.println("********* Fin de la batalla *********");
                                    System.out.println("Pokemon 2 ha ganado!");
                                    System.out.println("");
                                }

                            }

                            break;

                        }

                        case 3: {

                            float vida1 = 250;
                            float vida2 = 300;

                            int ataque1 = 75;
                            int ataque2 = 70;

                            if (modoPelea == 1) {

                                while (vida1 > 0 || vida2 > 0) {

                                    System.out.println("---------------Ronda " + ronda + "---------------");

                                    System.out.println("Vida de pokemon 1: " + vida1);
                                    System.out.println("Vida de pokemon 2: " + vida2);
                                    System.out.println("");

                                    System.out.println("Pokemon 1 ha atacado!");
                                    vida1 = (float) (vida1 + ataque2 * 0.2 - ataque2);

                                    if (vida1 <= 0) {

                                        System.out.println("");
                                        System.out.println("Vida de pokemon 1: " + 0);
                                        System.out.println("Vida de pokemon 2: " + vida2);
                                        System.out.println("");

                                        System.out.println("********* Fin de la batalla *********");
                                        System.out.println("Pokemon 2 ha ganado!");
                                        System.out.println("");
                                        break;
                                    }

                                    System.out.println("Pokemon 2 ha atacado!");
                                    vida2 = (float) (vida2 + ataque1 * 0.25 - ataque1);

                                    if (vida2 <= 0) {

                                        System.out.println("");
                                        System.out.println("Vida de pokemon 1: " + vida1);
                                        System.out.println("Vida de pokemon 2: " + 0);
                                        System.out.println("");

                                        System.out.println("********* Fin de la batalla *********");
                                        System.out.println("Pokemon 1 ha ganado!");
                                        System.out.println("");
                                        break;
                                    }

                                    System.out.println("");
                                    System.out.println("Vida de pokemon 1: " + vida1);
                                    System.out.println("Vida de pokemon 2: " + vida2);

                                    ronda++;

                                }

                            } else if (modoPelea == 2) {

                                System.out.println("Ingrese el numero de rondas que desea jugar: ");
                                int numeroRondas = link.nextInt();

                                for (int i = 0; i < numeroRondas; i++) {

                                    if (numeroRondas < 1 || numeroRondas > 10) {
                                        System.out.println("Numero de rondas invalido");
                                        break;
                                    }

                                    System.out.println("---------------Ronda " + ronda + "---------------");

                                    System.out.println("Vida de pokemon 1: " + vida1);
                                    System.out.println("Vida de pokemon 2: " + vida2);
                                    System.out.println("");

                                    System.out.println("Pokemon 1 ha atacado!");
                                    vida1 = (float) (vida1 + ataque2 * 0.2 - ataque2);

                                    if (vida1 <= 0) {

                                        vida1 = 0;

                                        System.out.println("");
                                        System.out.println("No se puede llegar al numero de rondas deseado");

                                        System.out.println("");
                                        System.out.println("Vida de pokemon 1: " + vida1);
                                        System.out.println("Vida de pokemon 2: " + vida2);

                                        break;
                                    }

                                    System.out.println("Pokemon 2 ha atacado!");
                                    vida2 = (float) (vida2 + ataque1 * 0.25 - ataque1);

                                    if (vida2 <= 0) {

                                        vida2 = 0;

                                        System.out.println("");
                                        System.out.println("No se puede llegar al numero de rondas deseado");

                                        System.out.println("");
                                        System.out.println("Vida de pokemon 1: " + vida1);
                                        System.out.println("Vida de pokemon 2: " + vida2);

                                        break;
                                    }

                                    System.out.println("");
                                    System.out.println("Vida de pokemon 1: " + vida1);
                                    System.out.println("Vida de pokemon 2: " + vida2);

                                    ronda++;

                                }

                                if (vida1 > vida2) {

                                    System.out.println("");
                                    System.out.println("********* Fin de la batalla *********");
                                    System.out.println("Pokemon 1 ha ganado!");
                                    System.out.println("");
                                } else {

                                    System.out.println("");
                                    System.out.println("********* Fin de la batalla *********");
                                    System.out.println("Pokemon 2 ha ganado!");
                                    System.out.println("");
                                }

                            }

                            break;

                        }

                        case 4: {

                            float vida1 = 300;
                            float vida2 = 280;

                            int ataque1 = 70;
                            int ataque2 = 80;

                            if (modoPelea == 1) {

                                while (vida1 > 0 || vida2 > 0) {

                                    System.out.println("---------------Ronda " + ronda + "---------------");

                                    System.out.println("Vida de pokemon 1: " + vida1);
                                    System.out.println("Vida de pokemon 2: " + vida2);
                                    System.out.println("");

                                    System.out.println("Pokemon 1 ha atacado!");
                                    vida1 = (float) (vida1 + ataque2 * 0.25 - ataque2);

                                    if (vida1 <= 0) {

                                        System.out.println("");
                                        System.out.println("Vida de pokemon 1: " + 0);
                                        System.out.println("Vida de pokemon 2: " + vida2);
                                        System.out.println("");

                                        System.out.println("********* Fin de la batalla *********");
                                        System.out.println("Pokemon 2 ha ganado!");
                                        System.out.println("");
                                        break;
                                    }

                                    System.out.println("Pokemon 2 ha atacado!");
                                    vida2 = (float) (vida2 + ataque1 * 0.15 - ataque1);

                                    if (vida2 <= 0) {

                                        System.out.println("");
                                        System.out.println("Vida de pokemon 1: " + vida1);
                                        System.out.println("Vida de pokemon 2: " + 0);
                                        System.out.println("");

                                        System.out.println("********* Fin de la batalla *********");
                                        System.out.println("Pokemon 1 ha ganado!");
                                        System.out.println("");
                                        break;
                                    }

                                    System.out.println("");
                                    System.out.println("Vida de pokemon 1: " + vida1);
                                    System.out.println("Vida de pokemon 2: " + vida2);

                                    ronda++;

                                }

                            } else if (modoPelea == 2) {

                                System.out.println("Ingrese el numero de rondas que desea jugar: ");
                                int numeroRondas = link.nextInt();

                                for (int i = 0; i < numeroRondas; i++) {

                                    if (numeroRondas < 1 || numeroRondas > 10) {
                                        System.out.println("Numero de rondas invalido");
                                        break;
                                    }

                                    System.out.println("---------------Ronda " + ronda + "---------------");

                                    System.out.println("Vida de pokemon 1: " + vida1);
                                    System.out.println("Vida de pokemon 2: " + vida2);
                                    System.out.println("");

                                    System.out.println("Pokemon 1 ha atacado!");
                                    vida1 = (float) (vida1 + ataque2 * 0.25 - ataque2);

                                    if (vida1 <= 0) {

                                        vida1 = 0;

                                        System.out.println("");
                                        System.out.println("No se puede llegar al numero de rondas deseado");

                                        System.out.println("");
                                        System.out.println("Vida de pokemon 1: " + vida1);
                                        System.out.println("Vida de pokemon 2: " + vida2);

                                        break;
                                    }

                                    System.out.println("Pokemon 2 ha atacado!");
                                    vida2 = (float) (vida2 + ataque1 * 0.15 - ataque1);

                                    if (vida2 <= 0) {

                                        vida2 = 0;

                                        System.out.println("");
                                        System.out.println("No se puede llegar al numero de rondas deseado");

                                        System.out.println("");
                                        System.out.println("Vida de pokemon 1: " + vida1);
                                        System.out.println("Vida de pokemon 2: " + vida2);

                                        break;
                                    }

                                    System.out.println("");
                                    System.out.println("Vida de pokemon 1: " + vida1);
                                    System.out.println("Vida de pokemon 2: " + vida2);

                                    ronda++;

                                }

                                if (vida1 > vida2) {

                                    System.out.println("");
                                    System.out.println("********* Fin de la batalla *********");
                                    System.out.println("Pokemon 1 ha ganado!");
                                    System.out.println("");
                                } else {

                                    System.out.println("");
                                    System.out.println("********* Fin de la batalla *********");
                                    System.out.println("Pokemon 2 ha ganado!");
                                    System.out.println("");
                                }

                            }

                            break;

                        }

                    }

                    break;

                }

                case 3: {

                    int n;

                    while (true) {
                        System.out.println("Ingresa un numero impar y mayor o igual a 7");
                        n = link.nextInt();

                        if (n >= 7 && n % 2 != 0) {
                            break;
                        } else {
                            System.out.println("Numero Invalido!");
                        }
                    }
                    
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n; j++ ) {
                            if(i==1 || i == n){
                                System.out.print("* ");
                            }else if (j == 1 || j == n) {
                                System.out.print("* ");
                            }else if (j == n / 2 + 1) {
                                System.out.print("| ");
                            }else if (i == j) {
                                System.out.print("< ");
                            }else if (i + j == n + 1) {
                                System.out.print("< ");
                            }else {
                                System.out.print("  ");
                            }
                            
                        }
                        
                        System.out.println("");
                        
                    }

                    System.out.println("");
                    System.out.println("");

                    break;

                }

                default: {
                    System.out.println("Fin del programa");
                    break;

                }
            }
        }
    }

}
