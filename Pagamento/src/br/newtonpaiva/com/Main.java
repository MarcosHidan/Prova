package br.newtonpaiva.com;

public class Main {
    public static void main(String[] args) {

        CartaoCredito cartaoCredito = new CartaoCredito("2023-10-05 10:00:00", 1, 100.0, "1234 5678 9012 3456", "João");
        Pix pix = new Pix("2023-10-05 11:00:00", 2, 50.0, "chave-pix-12345");
        CartaoDebito cartaoDebito = new CartaoDebito("2023-10-05 12:00:00", 3, 75.0, "9876 5432 1098 7654");

        System.out.println("Cupom Fiscal Cartão de Crédito:");
        System.out.println(cartaoCredito.imprimirCupomFiscal());

        System.out.println("\nCupom Fiscal Pix:");
        System.out.println(pix.imprimirCupomFiscal());

        System.out.println("\nCupom Fiscal Cartão de Débito:");
        System.out.println(cartaoDebito.imprimirCupomFiscal());
    }
}