/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simple.factory;

import java.util.function.Function;

/**
 *
 * @author wellikson
 */
public class ExportadorListaProdutoMarkdown extends AbstractExportadorListaProduto {

    @Override
    public String abrirTabela() {
        return "";
    }

    @Override
    public String fecharTabela() {
        return "\n";
    }

    @Override
    public String abrirLinha() {
        return "";
    }

    @Override
    public String fecharLinha() {
        return "\n";
    }

    @Override
    public String fecharLinhaTitulos() {
        StringBuilder sb = new StringBuilder();
        for (Coluna coluna : getColunas()) {
            sb.append(coluna.abrir()+"-----");
        }
        sb.append("\n");
        return sb.toString();
    }

    @Override
    public void addNewColuna(Function<Produto, Object> obtemValorColuna, String titulo) {
        addColuna(new ColunaMarkdown(obtemValorColuna,titulo));
    }

}
