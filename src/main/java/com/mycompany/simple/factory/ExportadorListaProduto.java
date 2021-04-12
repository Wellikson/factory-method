/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simple.factory;

import java.util.List;
import java.util.function.Function;

/**
 *
 * @author wellikson
 */
public interface ExportadorListaProduto {

    String abrirTabela();
    String fecharTabela();
    String abrirLinha();
    String fecharLinha();
    String fecharLinhaTitulos();
    String exportar(List<Produto> produtos);

    void addNewColuna(Function<Produto ,Object> obtemValorColuna, String titulo);

    static ExportadorListaProduto newInstance() {
        return newInstance("html");
    }

    static ExportadorListaProduto newInstance(String extensaoArquivoExportacao) {
        switch (extensaoArquivoExportacao) {
            case "html":
                return new ExportadorListaProdutoHtml();
            case "md":
                return new ExportadorListaProdutoMarkdown();
            case "csv":
                return new ExportadorListaProdutoCSV();
            default:
                throw new UnsupportedOperationException("Formato de arquivo não suportado: " + extensaoArquivoExportacao);
        }
    }
}
