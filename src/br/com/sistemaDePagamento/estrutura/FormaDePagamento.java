package br.com.sistemaDePagamento.estrutura;

public abstract class FormaDePagamento implements  Pagamento{
    protected double valor;

    public double getValor() {
        return valor;
    }

    public abstract String detalhesDoPagamento();


    @Override
    public double processarPagamento(double valor) {
        return this.valor;
    }
}
