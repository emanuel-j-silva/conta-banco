package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta: ");
        Integer numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite a sua agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        Double saldo = scanner.nextDouble();

        ContaTerminal conta = new ContaTerminal(numero,agencia,nome,saldo);

        String mensagem = "Olá ".concat(conta.getNomeCliente())
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(conta.getAgencia()).concat(", conta ").concat(Integer.toString(conta.getNumero()))
                .concat(" e seu saldo ").concat(Double.toString(conta.getSaldo()))
                .concat("  já está disponível para saque.");

        System.out.println(mensagem);
    }
}