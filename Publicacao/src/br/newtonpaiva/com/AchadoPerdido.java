package br.newtonpaiva.com;

import javax.swing.JOptionPane;

class AchadoPerdido {
    private String titulo;
    private String descricao;
    private String localAchado;
    private String foto;
    private String tipo;
    private String status;

    public AchadoPerdido(String titulo, String descricao, String localAchado, String foto, String tipo, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.localAchado = localAchado;
        this.foto = foto;
        this.tipo = tipo;
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocalAchado() {
        return localAchado;
    }

    public void setLocalAchado(String localAchado) {
        this.localAchado = localAchado;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String buscarTitulo(String tituloBuscado) {
        if (titulo.equalsIgnoreCase(tituloBuscado)) {
            return "Título: " + titulo + "\nDescrição: " + descricao + "\nLocal Achado: " + localAchado;
        } else {
            return "Não encontrado";
        }
    }

    public void visualizaDetalhes() {
        JOptionPane.showMessageDialog(null, "Título: " + titulo +
                "\nFoto: " + foto +
                "\nLocal Achado: " + localAchado +
                "\nTipo: " + tipo +
                "\nStatus: " + status);
    }
}