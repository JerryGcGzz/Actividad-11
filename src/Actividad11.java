
import java.sql.SQLOutput;
import java.util.Scanner;

public class Actividad11 {
    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu(){
        Scanner entrada = new Scanner(System.in);

        int opcion;
        int opcion2;
        int opcion3;
        boolean condicion = false;
        boolean condicion2 = false;

        while(!condicion){
            System.out.println("Bienvenido, este programa sirve para calcular el area o perimetro de una figura geometrica\n"
                    +"1 Calculadora de Area\n"
                    +"2 Calculadora de Perimetro\n"
                    +"0 Cerrar programa\n"
            );
            System.out.println("Selecione la opción de calculadora que desea utilzar: ");
            opcion = entrada.nextInt();
            condicion2 = false;

            while(!condicion2){
                switch (opcion) {
                    case 0:
                        System.out.println("Cerrando programa...");
                        return;
                    case 1:
                        System.out.println("Esta en el modo de calculadora de Area");
                        System.out.println("Eliga alguna de las siguientes figuras geometricas: \n"
                                + "1 Circulo\n"
                                + "2 Triangulo\n"
                                + "3 Rectangulo\n"
                                + "0 Salir\n"
                        );
                        System.out.println("Eliga una opcion: ");
                        opcion2 = entrada.nextInt();

                        switch (opcion2) {
                            case 0:
                                System.out.println("Regresando al Menú principal...");
                                System.out.println();
                                condicion2 = true;
                                break;

                            case 1:
                                Circle ejemplo1 = new Circle();
                                System.out.println("Ingrese el valor del radio del circulo: ");
                                ejemplo1.setRadio(entrada.nextDouble());
                                System.out.println("Area del circulo: "+ejemplo1.getArea());
                                System.out.println("Para continuar en el programa presione 1 y para salir del programa presione 0");
                                opcion3 = entrada.nextInt();

                                if(opcion3 == 1){
                                    System.out.println("Regresando al menu de seleccion de figuras geometricas...");
                                    System.out.println();
                                    break;
                                }else if(opcion3 == 0){
                                    System.out.println("Cerrando Programa...");
                                    return;
                                }

                            case 2:
                                Triangle ejemplo2 = new Triangle();
                                System.out.println("Ingrese el valor de un lado del triangulo equilatero: ");
                                ejemplo2.setLado(entrada.nextDouble());
                                System.out.println("Area del triangulo: "+ejemplo2.getArea());
                                System.out.println("Para continuar en el programa presione 1 y para salir del programa presione 0");
                                opcion3 = entrada.nextInt();

                                if(opcion3 == 1){
                                    System.out.println("Regresando al menu de seleccion de figuras geometricas...");
                                    System.out.println();
                                    break;
                                }else if(opcion3 == 0){
                                    System.out.println("Cerrando Programa...");
                                    return;
                                }

                            case 3:
                                Rectangle ejemplo3 = new Rectangle();
                                System.out.println("Ingrese el valor del primer lado: ");
                                ejemplo3.setLado1(entrada.nextDouble());
                                System.out.println("Ingrese el valor del segundo lado: ");
                                ejemplo3.setLado2(entrada.nextDouble());
                                System.out.println("Area del rectangulo: "+ejemplo3.getArea());
                                System.out.println("Para continuar en el programa presione 1 y para salir del programa presione 0");
                                opcion3 = entrada.nextInt();

                                if(opcion3 == 1){
                                    System.out.println("Regresando al menu de seleccion de figuras geometricas...");
                                    System.out.println();
                                    break;
                                }else if(opcion3 == 0){
                                    System.out.println("Cerrando Programa...");
                                    return;
                                }
                        }
                        break;

                    case 2:
                        System.out.println("Esta en el modo de calculadora de Perimetro");
                        System.out.println("Eliga alguna de las siguientes figuras geometricas: \n"
                                + "1 Circulo\n"
                                + "2 Triangulo\n"
                                + "3 Rectangulo\n"
                                + "0 Salir\n"
                        );
                        System.out.println("Eliga una opcion: ");
                        opcion2 = entrada.nextInt();

                        switch (opcion2) {
                            case 0:
                                System.out.println("Regresando al Menú principal...");
                                System.out.println();
                                condicion2 = true;
                                break;

                            case 1:
                                Circle ejemplo1 = new Circle();
                                System.out.println("Ingrese el valor del radio del circulo: ");
                                ejemplo1.setRadio(entrada.nextDouble());
                                System.out.println("Perimetro del circulo: "+ejemplo1.getPerimeter());
                                System.out.println("Para continuar en el programa presione 1 y para salir del programa presione 0");
                                opcion3 = entrada.nextInt();

                                if(opcion3 == 1){
                                    System.out.println("Regresando al menu de seleccion de figuras geometricas...");
                                    System.out.println();
                                    break;
                                }else if(opcion3 == 0){
                                    System.out.println("Cerrando Programa...");
                                    return;
                                }

                            case 2:
                                Triangle ejemplo2 = new Triangle();
                                System.out.println("Ingrese el valor de un lado del triangulo equilatero: ");
                                ejemplo2.setLado(entrada.nextDouble());
                                System.out.println("Perimetro del triangulo: "+ejemplo2.getPerimeter());
                                System.out.println("Para continuar en el programa presione 1 y para salir del programa presione 0");
                                opcion3 = entrada.nextInt();

                                if(opcion3 == 1){
                                    System.out.println("Regresando al menu de seleccion de figuras geometricas...");
                                    System.out.println();
                                    break;
                                }else if(opcion3 == 0){
                                    System.out.println("Cerrando Programa...");
                                    return;
                                }

                            case 3:
                                Rectangle ejemplo3 = new Rectangle();
                                System.out.println("Ingrese el valor del primer lado: ");
                                ejemplo3.setLado1(entrada.nextDouble());
                                System.out.println("Ingrese el valor del segundo lado: ");
                                ejemplo3.setLado2(entrada.nextDouble());
                                System.out.println("Perimetro del rectangulo: "+ejemplo3.getPerimeter());
                                System.out.println("Para continuar en el programa presione 1 y para salir del programa presione 0");
                                opcion3 = entrada.nextInt();

                                if(opcion3 == 1){
                                    System.out.println("Regresando al menu de seleccion de figuras geometricas...");
                                    System.out.println();
                                    break;
                                }else if(opcion3 == 0){
                                    System.out.println("Cerrando Programa...");
                                    return;
                                }
                        }
                        break;
                }
            }

        }

    }
}


