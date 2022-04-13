
package com.mycompany.lab1;
import java.util.Scanner;
public class Lab1 {

    public static void main(String[] args) {
        //indice 2: hola mundo
        /**
        System.out.println("Hello World!");
        **/
        
        //indice 3: escribir nombre
        /**
        Scanner entrada=new Scanner(System.in);
        String nombre;
        System.out.print("Registre su nombre: ");
        nombre=entrada.nextLine();
        System.out.print("Hola "+nombre);
        **/
        
        //indice 4:apellido y edad
        /**
        Scanner entrada=new Scanner(System.in);
        String nombre;
        int edad;
        System.out.print("Registre su nombre: ");
        nombre=entrada.nextLine();
        System.out.print("Registre su edad: ");
        edad=entrada.nextInt();
        System.out.println("El alumno "+nombre+" tiene "+edad+" años");
        **/
        
        //indice 5:3nombres y 3edades
        String nomb1,nomb2,nomb3;
        int edad1,edad2,edad3;
        Scanner entrada;
        
        entrada=new Scanner(System.in);
        System.out.print("Registre nombre: ");
        nomb1=entrada.nextLine();
        System.out.print("Registre edad: ");
        edad1=entrada.nextInt();
        
        entrada=new Scanner(System.in);
        System.out.print("\nRegistre nombre: ");
        nomb2=entrada.nextLine();
        System.out.print("Registre edad: ");
        edad2=entrada.nextInt();
        
        entrada=new Scanner(System.in);
        System.out.print("\nRegistre nombre: ");
        nomb3=entrada.nextLine();
        System.out.print("Registre edad: ");
        edad3=entrada.nextInt();
        
        System.out.printf("%-20s %-20d\n",nomb1,edad1);
        System.out.printf("%-20s %-20d\n",nomb2,edad2);
        System.out.printf("%-20s %-20d\n",nomb3,edad3);
        
    }
}
