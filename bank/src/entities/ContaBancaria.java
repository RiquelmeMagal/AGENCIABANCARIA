package entities;

public class ContaBancaria {
	
	private Integer conta;
	private String nome;
	private Double saldo;
	
	public ContaBancaria() {
		
	}

	public ContaBancaria(Integer conta, String nome, Double saldo) {
		this.conta = conta;
		this.nome = nome;
		this.saldo = saldo;
	}

	public Integer getConta() {
		return conta;
	}

	public void setConta(Integer conta) {
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	
	public void depositar(double valor) {
	    double saldoAntigo = saldo;
	    saldo = saldo + valor;
	    System.out.println("Saldo antigo de R$" + saldoAntigo + ", saldo novo R$" + String.format("%.2f", saldo));
	}
	
	
	public void sacar(double valor) {
	    if (saldo >= valor) {
	        saldo -= valor;
	        System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
	    } else {
	        System.out.println("Saldo insuficiente para sacar!");
	    }
	}
}
