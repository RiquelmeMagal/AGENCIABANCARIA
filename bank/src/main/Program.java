package main;

import java.util.Locale;
import java.util.Scanner;

import entities.AgenciaBancaria;
import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		AgenciaBancaria agencia = new AgenciaBancaria(1);
		
		

        while (true) {
        	
            
            System.out.println("Menu:");
            System.out.println("1. Adicionar Conta");
            System.out.println("2. Remover Conta");
            System.out.println("3. Realizar Depósito");
            System.out.println("4. Realizar Saque");
            System.out.println("5. Mostrar Contas");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            
        	
            int opcao = sc.nextInt();
            
            switch (opcao) {
            	case 1:
            		System.out.print("Digite o número da conta: ");
            		int numeroConta = sc.nextInt();
            		System.out.println("Digite o nome do titular: ");
            		sc.nextLine();
            		String nomeTitular = sc.nextLine();
            		System.out.println("Saldo inicial: ");
            		double saldoInicial = sc.nextDouble();
            	
            		ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldoInicial);
            	
            		agencia.adicionarConta(conta);
            		System.out.println("Conta adicionada com sucesso!");
            		break;
            	case 2:
            		System.out.println("Digite o número da conta: ");
            		int numeroContaRemover = sc.nextInt();
            		 ContaBancaria contaRemover = agencia.buscarConta(numeroContaRemover);
                     if (contaRemover != null) {
                         agencia.removerConta(contaRemover);
                         System.out.println("Conta removida com sucesso!");
                     } else {
                         System.out.println("Conta não encontrada.");
                     }
                     break;
            	case 3:
            		System.out.println("Digite o número da conta: ");
            		int numeroContaDepositar = sc.nextInt();
            		sc.nextLine();
            		ContaBancaria contaDeposito = agencia.buscarConta(numeroContaDepositar);
            		
            		double valorDepositar;
            		if (contaDeposito != null) {
            			System.out.println("Digite o valor a depositar: ");
            			valorDepositar = sc.nextDouble();
            			agencia.realizarDeposito(numeroContaDepositar, valorDepositar);
            		} else {
            			System.out.println("Conta não achada.");
            		}
            	case 4:
            		System.out.println("Digite o número da conta: ");
            		int numeroContaSacar = sc.nextInt();
            		sc.nextLine();
            		ContaBancaria contaSacar = agencia.buscarConta(numeroContaSacar);
            		
            		double valorSacar; 
            		if (contaSacar != null) {
            			System.out.println("Digite o valor para sacar: ");
            			valorSacar = sc.nextDouble();
            			agencia.realizarSaque(numeroContaSacar, valorSacar);
            		}
            	case 5:
                        System.out.println("Contas ativas:");
                        for (ContaBancaria contaAtiva : agencia.getContas()) {
                            System.out.println("Número da conta: " + contaAtiva.getConta());
                            System.out.println("Nome do titular: " + contaAtiva.getNome());
                            System.out.println("Saldo: R$" + String.format("%.2f", contaAtiva.getSaldo()));
                            System.out.println("----------------------------");
                        }
                        break;
                    case 6:
                        System.out.println("Encerrando o programa. Até mais!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            		} 
            		
            }
           
        }
        
	}

