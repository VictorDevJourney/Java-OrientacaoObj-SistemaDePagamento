package br.com.sistemaDePagamento.estrutura;

public class Pix extends FormaDePagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public String detalhesDoPagamento() {
        return "Chave Pix: " + chavePix + "\nValor: " + valor;
    }

    @Override
    public double processarPagamento(double valor) {
        this.valor = valor;
        System.out.println("Pagamento de R$" + valor + " processado via Pix.");
        return valor;
    }
}
