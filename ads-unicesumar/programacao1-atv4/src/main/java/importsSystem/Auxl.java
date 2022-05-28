/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package importsSystem;

import java.util.Scanner;

/**
 *
 * @author Thonny
 */
public class Auxl {
/**    CLASSE AUXILIAR PARA PEQUENOS TRECHOS DE TEXTO E MÉTODOS QUE SÃO 
 *     UTILIZADOS COM FREQUÊNCIA ENTRE AS CLASSES.
 *     (SERVE PRINCIPALMENTE PARA ACELERAR O PROCESSO DE DESENVOLVIMENTO, ENCURTANDO NOMES COMUMENTE UTILIZADOS,
 *     E PARA TORNAR O CÓDIGO MAIS LIMPO E MENOR, VISUALMENTE FALANDO.)
 */
    
    public static final String UM = ", digite 1 no teclado, caso contrário, digite qualquer tecla para ";
    
//    PRINTLN
    public static void p(String txt) {
        System.out.println(txt);
    }
    
//    SCANNER
    public static String s() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().toUpperCase();
    }
    
//    SCANNER NEXT DOUBLE
    public static Double sd() {
        Scanner sc = new Scanner(System.in);
        while(!sc.hasNextDouble()) {
            Auxl.p("Valor inválido! Digite novamente:");
            sc.nextLine();
        }
        return sc.nextDouble();
    }
    
//    SCANNER NEXT FLOAT
    public static Float sf() {
        Scanner sc = new Scanner(System.in);
        while(!sc.hasNextFloat()) {
            Auxl.p("Valor inválido! Digite novamente:");
            sc.nextLine();
        }
        return sc.nextFloat();
    }
    
    //    SCANNER NEXT INTEGER
    public static int si() {
        Scanner sc = new Scanner(System.in);
        while(!sc.hasNextInt()) {
            Auxl.p("Valor inválido! Digite novamente:");
            sc.nextLine();
        }
        return sc.nextInt();
    }
}


