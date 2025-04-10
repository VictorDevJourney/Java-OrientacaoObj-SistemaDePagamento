package br.com.sistemaDePagamento.main;

import br.com.sistemaDePagamento.estrutura.CartaoDeCredito;
import br.com.sistemaDePagamento.estrutura.Pix;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        CartaoDeCredito cartao = new CartaoDeCredito("1234-5678-9123-4567", "Victor", "04/27");
        Pix pix = new Pix("MinhaChavePix@exemplo.com");

        System.out.println("Digite o valor do pagamento com Cartão de crédito");
        double valorCartao = scanner.nextDouble();
        cartao.processarPagamento(valorCartao);
        System.out.println(cartao.detalhesDoPagamento());

        System.out.println("Digite o valor do pagamento com Pix");
        double valorPix = scanner.nextDouble();
        pix.processarPagamento(valorPix);
        System.out.println(pix.detalhesDoPagamento());

        scanner.close();
    }
}
