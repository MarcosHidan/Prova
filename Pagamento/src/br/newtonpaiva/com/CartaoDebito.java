package br.newtonpaiva.com;

class CartaoDebito extends Pagamento {
    private String numCartao;

    public CartaoDebito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String imprimirCupomFiscal() {
        return "Data/Hora: " + getDataHoraPagamento() +
                "\nNúmero Pagamento: " + getNumeroPagamento() +
                "\nValor Pago: " + getValorPago() +
                "\nNúmero Cartão: " + numCartao;
    }
}