package com.mycompany.simple.factory;

public interface Coluna {

    String getTitulo();
    void setTitulo(String titulo);
    String abrir();
    String fechar();
    String exportarCabecalho();
    String exportarDado(Produto produto);
}
