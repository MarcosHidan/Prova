package br.newtonpaiva.com;

class CartaoCredito extends Pagamento {
    private String numCartao;
    private String titularCartao;

    public CartaoCredito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numCartao, String titularCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.titularCartao = titularCartao;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }

    public String imprimirCupomFiscal() {
        return "Data/Hora: " + getDataHoraPagamento() +
                "\nNúmero Pagamento: " + getNumeroPagamento() +
                "\nValor Pago: " + getValorPago() +
                "\nNúmero Cartão: " + numCartao +
                "\nTitular Cartão: " + titularCartao;
    }
}