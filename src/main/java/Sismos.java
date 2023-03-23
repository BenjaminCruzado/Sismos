import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Sismos {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner entrada = new Scanner(System.in);
        double[][] arreglo = new double[7][10];
        while(true){
            System.out.println("1 LLena Arreglo");
            System.out.println("2 Mostrar Arreglo");
            System.out.println("3 Buscar Mayor Sismo");
            System.out.println("4 Contar Sismos mayor o igual a 5");
            System.out.println("5 Enviar SMS");
            System.out.println("6 Salir");
            System.out.println("Ingrese el numero de la opcion que desea: ");
            int opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    llenarArreglo(arreglo);
                    break;
                case 2:
                    mostrarArreglo(arreglo);
                    break;
                case 3:
                    buscarMayorSismo(arreglo);
                    break;
                case 4:
                    contarSismos(arreglo);
                    break;
                case 5:
                    enviarSMS(arreglo);
                    break;
                case 6:
                    System.exit(0);

            }

        }
    }
    public static void llenarArreglo(double[][] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[0].length; j++) {
                arreglo[i][j] = numAleatorio();
            }
        }
    }
    public static double numAleatorio(){
        double num = (Math.random()*10);
        return num;

    }
    public static void mostrarArreglo(double[][]arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i][0] + " " + arreglo[i][1] + " " + arreglo[i][2] + " " + arreglo[i][3] + " " + arreglo[i][4] + " " + arreglo[i][5] + " "+ arreglo[i][6] + " " + arreglo[i][7] + " " + arreglo[i][8] + " " + arreglo[i][9]);
        }
    }
    public static void buscarMayorSismo(double[][]arreglo){
        double mayorSismo = 0.0;
        for (int i = 0; i < arreglo.length ; i++) {
            for (int j = 1; j < arreglo[0].length; j++) {
                if (arreglo[i][j] >= mayorSismo) {
                    mayorSismo = arreglo[i][j];
                }
            }
        }
        System.out.println(mayorSismo);
    }
    public static void contarSismos(double[][]arreglo){
        int contarSismos = 0;
        for (int i = 0; i < arreglo.length ; i++) {
            for (int j = 0; j < arreglo[0].length; j++) {
                if (arreglo[i][j] >= 5.0) {
                    contarSismos++;
                }
            }
        }System.out.println(contarSismos);
    }
    public static void enviarSMS(double[][]arreglo){
        for (int i = 0; i < arreglo.length ; i++) {
            for (int j = 0; j < arreglo[0].length; j++) {
                if (arreglo[i][j] >= 7.0) {
                    System.out.println("Alerta!!! se debe evacuar zona costera!");
                }
            }
        }
    }
}
