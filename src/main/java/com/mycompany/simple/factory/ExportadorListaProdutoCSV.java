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
public class ExportadorListaProdutoCSV extends AbstractExportadorListaProduto {

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
        return "\n";
    }

    @Override
    public String fecharLinha() {
        return "";
    }

    @Override
    public String fecharLinhaTitulos() {
        return "";
    }

    @Override
    public void addNewColuna(Function<Produto, Object> obtemValorColuna, String titulo) {
        addColuna(new ColunaCSV(obtemValorColuna,titulo));    }

}

