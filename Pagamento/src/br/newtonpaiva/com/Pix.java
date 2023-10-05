package br.newtonpaiva.com;

class Pix extends Pagamento {
    private String chavePix;

    public Pix(String dataHoraPagamento, int numeroPagamento, double valorPago, String chavePix) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String imprimirCupomFiscal() {
        return "Data/Hora: " + getDataHoraPagamento() +
                "\nNúmero Pagamento: " + getNumeroPagamento() +
                "\nValor Pago: " + getValorPago() +
                "\nChave Pix: " + chavePix;
    }
}