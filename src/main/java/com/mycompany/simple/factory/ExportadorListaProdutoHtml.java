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
public class ExportadorListaProdutoHtml extends AbstractExportadorListaProduto {

    @Override
    public String abrirTabela() {
        return "<table>\n";
    }

    @Override
    public String fecharTabela() {
        return "</table>\n";
    }

    @Override
    public String abrirLinha() {
        return "  <tr>";
    }

    @Override
    public String fecharLinha() {
        return "</tr>\n";
    }

    @Override
    public String fecharLinhaTitulos() {
        return "";
    }

    @Override
    public void addNewColuna(Function<Produto, Object> obtemValorColuna, String titulo) {
        addColuna(new ColunaHTML(obtemValorColuna,titulo));
    }

}
