import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {

        Usuario union = new Usuario();

        int option = options();
        while(option < 5){
            switch (option){

                case 1:{
                    darTurno();

                    System.out.println("La cantidad de turnos que tiene disponibles son: "+darTurno());
                    lector.nextLine();
                    System.out.println(Arrays.asList());//para mostrar la lista del arreglo

                    break;
                }

                case 2:{
                    union.mostrarTurno();
                }

                case 3:{


                }

                case 4:{
                    union.deleteTurn();
                }

            }
        }
    }

    public static int options() {
        System.out.println("Digite 1. Dar turno");
        System.out.println("Digite 2. Mostrar turno actual");
        System.out.println("Digite 3. Pasar turno");
        System.out.println("Digite 4. Eliminar turno actual y seguir");

        int menu = lector.nextInt();
        lector.nextLine();
        return menu;
    }

    public static int darTurno(){

        System.out.println("Ingrese cuantas personas llegaron");
        int numPersonas = lector.nextInt();
        lector.nextLine();
        return numPersonas;

    }
}