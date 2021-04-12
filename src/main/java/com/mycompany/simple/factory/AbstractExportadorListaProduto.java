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
public abstract class AbstractExportadorListaProduto implements ExportadorListaProduto {
    private List<Coluna>colunas;

    protected List<Coluna> getColunas() {
        return colunas;
    }


    public AbstractExportadorListaProduto() {
       colunas = new ArrayList<>();
       addNewColuna(Produto::getId,"Código");
       addNewColuna(Produto::getDescricao,"Descrição");
       addNewColuna(Produto::getPreco,"Preço");

    }

    protected void addColuna(Coluna coluna) {
        colunas.add(coluna);
    }

    @Override
    public final String exportar(List<Produto> listaProdutos) {
        final StringBuilder sb = new StringBuilder();
        sb.append(abrirTabela());

        sb.append(abrirLinha());
        for(Coluna coluna:colunas){
            sb.append(coluna.exportarCabecalho());
        }
        sb.append(fecharLinha());
        sb.append("\n");
        sb.append(fecharLinhaTitulos());
        gerarLinhasProdutos(sb, listaProdutos);

        sb.append(fecharTabela());
        return sb.toString();
    }

    private void gerarLinhasProdutos(StringBuilder sb, List<Produto> listaProdutos) {
        for (Produto produto : listaProdutos) {
            sb.append(gerarColunasLinha(produto));
        }
    }

    protected String gerarColunasLinha(Produto produto) {
        StringBuilder sb = new StringBuilder();
        sb.append(abrirLinha());
        for (Coluna coluna : colunas) {
            sb.append(coluna.exportarDado(produto));
        }
        sb.append(fecharLinha());
        return sb.toString();
    }
}
