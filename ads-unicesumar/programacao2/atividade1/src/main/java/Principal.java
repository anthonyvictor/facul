
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Thonny
 */
public class Principal {
    
    public static void main(String[] args) {
        System.out.println("Bem vindo ao sistema de cálculo!");
        menu();
    }

    public static void menu() {
        System.out.println("==================================");
        System.out.println("          Menu principal");
        System.out.println("==================================");

        System.out.println("\nSelecione uma das opções à seguir:");
        System.out.println("\n1: Calcular equação.\n0: Encerrar.");
        
        int sel = 2;
        
        do{
            sel = scanInt();
        }while(sel != 0 && sel != 1);
        
        if(sel == 1){
            calcular();
        }else{
            System.out.println("Encerrando...");
            System.exit(0);
        }
    }

    public static void calcular(){
        System.out.println("==================================");
        System.out.println("            Cálculo");
        System.out.println("==================================");
        
        double a, b, c, x1, x2, dlt, rdlt;
        
        System.out.println("\nFórmula inicial: ax²+bx+c=0");
        
        System.out.println("\nDigite o valor de a");
        a = scanDouble();
        
        System.out.println("\nDigite o valor de b");
        b = scanDouble();
        
        System.out.println("\nDigite o valor de c");
        c = scanDouble();
        
        System.out.println("\nFórmula para encontrar valor de Delta: b² - 4.a.c");       
        dlt = (b * b) - 4 * a * c;
        validaDlt(dlt);
        
        System.out.println("\nFórmula de Bhaskara: (-b ± √∆) / 2.a");
        rdlt = Math.sqrt(dlt);
        
        x1 = (-b + rdlt) / (2 * a);
        x2 = (-b - rdlt) / (2 * a);
        System.out.println("\nValores finais: x1= " + x1 + "  |  x2= " + x2);
        menu();
    }
    
    public static int scanInt() {
        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextInt()) {
            System.out.println("Valor inválido!");
            sc.nextLine();
        }
        return sc.nextInt();
    }

    public static double scanDouble() {
        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextDouble()) {
            System.out.println("Valor inválido!");
            sc.nextLine();
        }
        return sc.nextDouble();
    }
    
    public static void validaDlt(double dlt) throws ArithmeticException{
        try{
            if(dlt < 0){
                throw new ArithmeticException();
            }
        }catch(ArithmeticException e){
            System.out.println("Valor de delta é menor que zero, " +
            "portanto a equação não admite solução real!");
            menu();
        }
    }

}
