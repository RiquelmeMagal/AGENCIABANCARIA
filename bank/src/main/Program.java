package main;

import java.util.Locale;

import entities.AgenciaBancaria;
import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		AgenciaBancaria agencia = new AgenciaBancaria(1);

        ContaBancaria conta1 = new ContaBancaria(101, "Titular 1", 1000.0);
        ContaBancaria conta2 = new ContaBancaria(102, "Titular 2", 1500.0);

        agencia.adicionarConta(conta1);
        agencia.adicionarConta(conta2);

        agencia.realizarDeposito(101, 500.0);
        agencia.realizarSaque(102, 200.0);
	}

}
