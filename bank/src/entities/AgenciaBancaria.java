package entities;

import java.util.ArrayList;
import java.util.List;

public class AgenciaBancaria {
	private Integer agencia;
	
	private List<ContaBancaria> contas = new ArrayList<>();
	
	public AgenciaBancaria() {
		
	}
	
	public AgenciaBancaria(Integer agencia) {
		super();
		this.agencia = agencia;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public List<ContaBancaria> getContas() {
		return contas;
	}

	public void adicionarConta(ContaBancaria conta) {
		contas.add(conta);
	}
	
	public void removerConta(ContaBancaria conta) {
		contas.remove(conta);	
	}

	
	public ContaBancaria buscarConta(int numeroConta) {
		for (ContaBancaria conta : contas) {
			if (conta.getConta() == numeroConta) {
				return conta;
			}				
		}
		return null;	
	}
	
	public void realizarSaque(int numeroConta, double valor) {
		ContaBancaria conta = buscarConta(numeroConta);
		if (conta != null) {
			conta.sacar(valor);
		} else {
			System.out.println("Esta conta não foi encontrada.");
		}
	}
	
	public void realizarDeposito(int numeroConta, double valor) {
		ContaBancaria conta = buscarConta(numeroConta);
		if (conta != null) {
			conta.depositar(valor);
		} else {
			System.out.println("Esta conta não foi encontrada.");
		}
	}
	
}