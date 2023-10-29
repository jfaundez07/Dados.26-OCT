import java.util.Scanner;
public class Menu {

    public void menuJuego(){

        int continuar = 0;
        String seleccion;

        do {

            opcionesMenu();
            seleccion = new Scanner(System.in).next();

            switch (seleccion){

                case "0":
                    continuar = 1;
                    break;
                case "1":
                    SimularLanzamiento simularLanzamiento = new SimularLanzamiento();
                    simularLanzamiento.jugar();
                    break;
                default:
                    System.out.println("\nOpcion no valida");
                    break;
            }

        } while (continuar != 1);
    }

    private void opcionesMenu(){
        System.out.println("\n#----Juego de dados----#");
        System.out.println("[0] Salir\n[1] Jugar\nEleccion: ");
    }
}
