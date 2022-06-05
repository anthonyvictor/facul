
import exceptions.QuantidadeDePessoasException;
import java.util.ArrayList;
import java.util.Scanner;
import util.Ferramentas;

/**
 *
 * @author Thonny
 */

public class Principal {
    private static ArrayList<Reserva> reservas = new ArrayList();
    private static ArrayList<Suite> suites = new ArrayList();
    private static int totalHospedes = 0;
    
    public static void menuPrincipal(){
        try{
            System.out.println("\n\nEscolha uma das opções:");
            System.out.println("1 - Nova Reserva");
            System.out.println("0 - Sair do sistema");

            Scanner sc = new Scanner(System.in);

            int opcao = sc.nextInt();
            
            switch (opcao) {
                case 1 -> reservas.add(novaReserva());
                case 0 -> sair();
                default -> throw new Exception();
            }

        }catch(Exception err){
            System.out.println("Selecione uma opção válida!");
            menuPrincipal();
        }
        
    }
    
    public static Suite selecionarSuite(){
        Suite resultado = null;
         try{
             
            System.out.println("\n\nSelecione a Suíte pelo número:");
            
            for(int i = 0; i < suites.size(); i++){
                int num = i + 1;
                System.out.println(num  + " - " + suites.get(i).toString());
            }

            Scanner sc = new Scanner(System.in);

            int opcao = sc.nextInt();
            
            switch (opcao) {
                case 1 -> resultado = suites.get(0);
                case 2 -> resultado = suites.get(1);
                case 3 -> resultado = suites.get(2);
                default -> throw new Exception();
            }

        }catch(Exception err){
            System.out.println("Selecione uma opção válida!");
            menuPrincipal();
        }finally{
             return resultado;
        }
    }
    
    public static ArrayList<Hospede> selecionarHospedes(Suite suite){
        ArrayList<Hospede> resultado = new ArrayList();

            boolean continuar = false; 
            do{
                Hospede hospede = novoHospede();
                
                int quantidadeHospedesAcimaDe2Anos = 0;

                for(Hospede h : resultado){
                    if(h.getIdade() > 2){
                        quantidadeHospedesAcimaDe2Anos++;
                    }
                }

                if(quantidadeHospedesAcimaDe2Anos >= suite.getCapacidade() 
                        && hospede.getIdade() > 2){
                    System.out.println("Impossível adicionar este hóspede, capacidade da suíte não permite!");
                }else{
                    resultado.add(hospede);
                }
                
                int resposta = Ferramentas.scanInt("Deseja cadastrar mais um hóspede? 1 - Sim | 2 - Não");
                if(resposta == 2){
                    continuar = true;
                }
            }while(continuar == false);
            
            return resultado;

    }
    
    public static Hospede novoHospede(){
        
        Hospede resultado = null;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do hóspede:");
        String nome = sc.nextLine();

        System.out.println("Digite o endereço do hóspede:");
        String endereco = sc.nextLine();
        
        int idade = 0;
        do{
            idade = Ferramentas.scanInt("Digite a idade do hóspede:");
        }while(idade < 0);
        
        totalHospedes++;
        resultado = new Hospede(totalHospedes, nome, endereco, idade);
        
        return resultado;
        
    }
    
    public static Reserva novaReserva(){
        Reserva retorno = null;
        try{
            
            Suite suite = selecionarSuite();
            ArrayList<Hospede> hospedes = selecionarHospedes(suite);

            int quantidadeDias = 0;
            do{
                int resposta = Ferramentas.scanInt("Digite a quantidade de dias à serem reservados:");
                quantidadeDias = resposta;
            }while(quantidadeDias < 1);
            
            int resposta = Ferramentas.scanInt("Confirmar reserva? 1 - Sim | 2 - Não");
            
            if(resposta == 1){
                retorno = new Reserva(hospedes, suite, quantidadeDias);
            
                System.out.println("\nReserva criada com sucesso!");
                System.out.println(retorno.toString());
            }
            
        }catch(Exception err){
            System.out.println("Criação da reserva falhou! " + err);
        }finally{
             menuPrincipal();
        }
        
        return retorno;
    }
    
    public static void sair(){
        System.out.println("Bye bye...");
        System.exit(0);
    }
    
    public static void main(String args[]) throws QuantidadeDePessoasException{
        suites.add(new Suite(1, "Comum", 2, 500));
        suites.add(new Suite(2, "Master", 4, 2500));
        suites.add(new Suite(3, "Presidencial", 6, 4500));
        
        menuPrincipal();
    }
}
