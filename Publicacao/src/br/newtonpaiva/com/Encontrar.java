package br.newtonpaiva.com;

import javax.swing.JOptionPane;

public class Encontrar {
    public static void main(String[] args) {
        AchadoPerdido itemAchado = new AchadoPerdido("Chave", "Chave encontrada em frente à loja", "Rua Principal", "chave.jpg", "Objeto pessoal", "Disponível");

        String tituloBuscado = JOptionPane.showInputDialog("Insira o título a ser buscado:");

        String resultadoBusca = itemAchado.buscarTitulo(tituloBuscado);
        if (!resultadoBusca.equals("Não encontrado")) {
            JOptionPane.showMessageDialog(null, "Item encontrado!\n" + resultadoBusca);
        } else {
            JOptionPane.showMessageDialog(null, "Item não encontrado!");
        }

        itemAchado.visualizaDetalhes();
    }
}