package br.com.sistemaDePagamento.estrutura;

public class CartaoDeCredito extends FormaDePagamento {
    private String numeroDoCartao;
    private String nomeTitular;
    private String dataValidade;

    public CartaoDeCredito(String numeroDoCartao, String nomeTitular, String dataValidade) {
        this.numeroDoCartao = numeroDoCartao;
        this.nomeTitular = nomeTitular;
        this.dataValidade = dataValidade;
    }

    @Override
    public String detalhesDoPagamento() {
        String ultimosQuatroDigitos = numeroDoCartao.substring(numeroDoCartao.length() - 4);
        return "Cartão de crédito: **** **** **** " + ultimosQuatroDigitos + "\nNome: " + nomeTitular + "\nValidade: " + dataValidade + "\nValor: " + valor;
    }

    @Override
    public double processarPagamento(double valor) {
        this.valor = valor;
        System.out.println("Pagamento de R$" + valor + " realizado com o Cartão de crédito");
        return valor;
    }
}
