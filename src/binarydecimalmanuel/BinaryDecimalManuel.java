/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarydecimalmanuel;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class BinaryDecimalManuel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;   
	//He eliminado la variable i porque en ningun momento toma valor ni se utiliza
        do {
            //Tambien he puesto que en vez de print normal sea ln para que quede mas bonito.Esto solo es estetica y no he tenido que utilizar nada del debbuging
        System.out.println("Introduzca un número que sea mayor que 0");                                                           
            n = sc.nextInt();
            //Para que el codigo funcione bien he puesto que el while sea sobre el valor de n y no de i.
        } while (n <= 0);
        //Aqui he eliminado el print que habia puesto porque no servia para nada puesto que el metodo void ya printea.
        //Tambien he puesto bien el nombre del metodo
          decBin(n);
        
        
    }


    //Método para pasar de decimal a binario
    public static void decBin(int n) {
        //Aqui he cambiado para que en el if tenga que ser menor absoluto y no menor igual
        if (n < 2) {
            System.out.print(n);
        } else {
            decBin(n / 2);
            //He puesto que printee los restos de la operacion para que asi me pueda dar bien el binario.
            System.out.print(n % 2 );
        }
        
    }
}   
    

