/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simple.factory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wellikson
 */
public class ExportadorListaProdutoMarkdown extends AbstractExportadorListaProduto {

    private static final String SEPARADOR_LN = "-";
    private static final String SEPARADOR_COL = "|";

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
        List<String> valores = new ArrayList<>();
        for (int i = 0; i < TITULOS_COLUNAS.size(); i++) {
            valores.add("-----");
        }
        return gerarColunasLinha(valores);
    }

    @Override
    public String abrirColuna(String valor) {
        return valor;
    }

    @Override
    public String fecharColuna() {
        return " " + SEPARADOR_COL;
    }
}
