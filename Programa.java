package Programa;

import java.util.Scanner;

/**
 *
 * @author na_th
 */
public class Programa {

    public static void main(String[] args) {
        Scanner sig = new Scanner(System.in);
        System.out.println("       Bienvenido a doce     ");
        System.out.println("Usted podrá escoger entre: ");
        System.out.println("1. Área del circulo.");
            System.out.println("2. Nombre completo.");
            System.out.println("3. Tabla de multiplicar.");
            System.out.println("4. División.");
            System.out.println("5. Par o impar.");
            System.out.println("6. Edad.");
            System.out.println("7. Meses.");
            System.out.println("8. Multiplicación.");
            System.out.println("9. Serie Fibonacci.");
            System.out.println("10. Cuadrado.");
            System.out.println("11. Potencia.");
            System.out.println("12. Adivina el número.");
  int option = sig.nextInt();
        while (option < 12 || option > 12) {
            System.out.println("1. Área del circulo.");
            System.out.println("2. Nombre completo.");
            System.out.println("3. Tabla de multiplicar.");
            System.out.println("4. División.");
            System.out.println("5. Par o impar.");
            System.out.println("6. Edad.");
            System.out.println("7. Meses.");
            System.out.println("8. Multiplicación.");
            System.out.println("9. Serie Fibonacci.");
            System.out.println("10. Cuadrado.");
            System.out.println("11. Potencia.");
            System.out.println("12. Adivina el número.");
            option = sig.nextInt() ;
            switch (option) {
                case 1:
                    System.out.println("Usted quiere hallar el área del circulo.");
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Ingrese el radio");
                    int radio = sig.nextInt();
                    //se aplica la formula general para hallar el area y remplazar r por el que se le asigne 
                    double A = 0;
                    A = Math.pow(radio, 2) * Math.PI;
                    System.out.println("Area del circulo:" + A + "");
                    break;
                case 2:
                    System.out.println("Usted quiere ver su nombre completo.");
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Ingrese su nombre");// se ingresa el nombre 
                    String nombre = sig.nextLine();//guarda el nombre 
                    System.out.println("Ingrese su apellido");//se ingresa el apellido
                    String apellido = sig.nextLine(); // guarda el apellido 
                    System.out.println("Su nombre completo es: " + nombre + " " + apellido);
                    break;
                case 3:
                    System.out.println("Ingrese el número de la tabla de multiplicar que desea observar.");
                    System.out.println("Ingrese un número");
                    int num = sig.nextInt();
                    System.out.println("Usted quiere ver la tabla del " + num);
                    for (int i = 0; i <= 10; i += 1) {
                        int a = num * i;
                        System.out.println(num + "*" + i + "=" + a);
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el dividendo");
                    float divd = sig.nextFloat();
                    System.out.println("Ingrese el divisor");
                    float divs = sig.nextFloat();
                    float re2 = divd / divs;
                    //System.out.println(divd+"/"+divs+"="+re);
                    System.out.println("    " + divd);
                    System.out.println("  /  " + divs);
                    System.out.println("_____________");
                    System.out.println("    " + re2);
                    break;
                case 5:
                    System.out.println("Usted quiere identificar sí el número que ingrese es par o impar.");
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Ingrese el número");
                    int nur = sig.nextInt();
                    int resi = nur % 2;
                    if (resi == 0 || nur == 0) {
                        System.out.println("Es par");
                    } else {
                        System.out.println("Es impar");
                    }

                    break;
                case 6:
                    System.out.println("ingrese el año de nacimiento");
                    int año = sig.nextInt();

                    int edad = 2019 - año;
                    if (edad >= 18) {
                        System.out.println("Es mayor de edad y su edad es " + edad);

                    } else {
                        System.out.println("Es menor de edad y su edad es " + edad);
                    }
                    break;
                case 7:
                    System.out.println("Numero del mes");
                    int numm = sig.nextInt();
                    if (numm > 0 && numm < 13) {
                        switch (numm) {
                            case 0:
                                System.out.println("Enero");
                                break;
                            case 1:
                                System.out.println("Febrero");
                                break;
                            case 2:
                                System.out.println("Marzo");
                                break;
                            case 3:
                                System.out.println("Abril");
                                break;
                            case 4:
                                System.out.println("Mayo");
                                break;
                            case 5:
                                System.out.println("Junio");
                                break;
                            case 6:
                                System.out.println("Julio");
                                break;
                            case 7:
                                System.out.println("Agosto");
                                break;
                            case 8:
                                System.out.println("Septiembre");
                                break;
                            case 9:
                                System.out.println("Octubre");
                                break;
                            case 10:
                                System.out.println("Noviembre");
                                break;
                            default:
                                System.out.println("Diciembre");
                                break;
                        }

                    } else {
                        System.out.println("El número del mes debe ser > 0 y 13<");
                    }

                    break;
                case 8:
                   
                    System.out.println( "Usted quiere sumar el primer factor tantas veces el segundo.");
			System.out.println("------------------------------------------------------------");
			System.out.println("Ingrese el primer factor");
			int f1 = sig.nextInt();
			System.out.println( "Ingrese el segundo factor");
			int f2 = sig.nextInt();
			int res =0;
			int contador = 0;
			do{
				res = res + f1;
				contador =contador + 1;
				System.out.println(res-f1 +"+"+f1+ "=" +res);
                         }while (contador ==f2);
			System.out.println( "La multiplicación de los factores es igual a:"); 
			System.out.println( res);
                    break;
                case 9:
                    System.out.println("Usted quiere saber el proceso y resultado de la iteración que ingrese.");
                    System.out.println("-----------------------------------------------------------------------");
                    System.out.println("Ingrese la posición de la serie de Fibonnacci que desea observar");
                    int fib = sig.nextInt();
                    int cont = 1;
                    int re = 0;
                    int red = 0;
                    System.out.println("    " + re);
                    System.out.println("    " + cont);
                    for (cont = 1; cont <= fib - 2; cont += 1) {
                        red = re + cont;
                        System.out.println(re + "+" + cont + "=" + red);
                        re = cont;
                        cont = red;
                    }
                    System.out.println("La iteración " + fib + " es igual al número " + red + ".");
                    break;
                case 10:
                    System.out.println("Usted quiere crear un cuadrado.");
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Ingrese el lado del cuadrado:");
                    int lado = sig.nextInt();
                    System.out.println("Ingrese un caracter:");
                    sig.nextLine();
                    String carac = sig.nextLine();
                    if (lado > 0) {
                        for (int cont1 = 1; cont1 <= lado; cont1 += 1) {
                            String cadena = "";
                            for (int cont2 = 1; cont2 <= lado; cont2 += 1) {
                                if (cont1 == 1 || cont1 == lado || cont2 == 1 || cont2 == lado) {
                                    cadena = cadena + " " + carac;
                                } else {
                                    cadena = cadena + "  ";
                                }
                            }
                            System.out.println(cadena);
                        }
                    }
                    break;
                case 11:
                    System.out.println("Usted quiere hallar la potencia de un número por medio de sumas.");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Ingrese la base:");
                    int base = sig.nextInt();
                    System.out.println("Ingrese el exponente:");
                    int exponente = sig.nextInt();
                    int tado;
                    int parcial;
                    String pott = "";
                    if (exponente < 0 || base < 0) {
                        System.out.println("No es posible");
                    } else {
                        switch (exponente) {
                            case 0:
                                tado = 1;
                                break;
                            case 1:
                                tado = base;
                                break;
                            default:
                                if (base == 1) {
                                    tado = 1;
                                } else {
                                    tado = base;
                                }
                                parcial = base;
                                for (int i = 2; i <= exponente; i += 1) {
                                    for (int j = 2; j <= base; j += 1) {
                                        tado = tado + parcial;
                                        pott = pott + "+" + parcial;
                                        System.out.println(base + "" + pott + "=" + tado);
                                    }
                                    parcial = tado;

                                }
                                break;

                        }

                        System.out.println(tado);
                    }
                    break;
                case 12:

                    System.out.println("Usted quiere adivinar el número secreto.");
                    System.out.println("-------------------------------------------------------");
                    int intentos = 30;
                    int secre = (int) (Math.random() * 80) + 20;
                    System.out.println("-Adivine un número entre el 20 y el 100.");
                    //escribir "-Tiene 30 intentos para adivinarlo."
                    int divo = sig.nextInt();
                    while (divo < 20 || divo > 100) {
                        System.out.println("No!");
                        System.out.println("El número se encuentra entre el 20 y el 100");
                        divo = sig.nextInt();
                    }

                    while (divo != secre || intentos == 1) {
                        if (divo > secre) {
                            System.out.println("El número secreto es menor");
                        } else {
                            System.out.println("El número secreto es mayor");
                        }

                        intentos = intentos - 1;
                        //escribir "Le quedan ", intentos ," intentos"
                        divo = sig.nextInt();
                    }
                    int finalin = 30 - intentos;
                    if (divo == secre) {
                        System.out.println("Adivinó el número en " + finalin + " intentos.");
                    }
                    System.out.println(" El número secreto era: " + secre + "");

                    break;

                default:
                    System.out.println("\"¡Error! acción inválida.\"");
                    System.out.println("Ingrese una opción del 1 al 12");
                    break;
            }
         
        }
        

    }
}
