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
public class Principal {

    public static void main(String[] args) {
        final List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(1,"TV", "LG", "1234-a", 1200));
        produtos.add(new Produto(2,"Geladeira", "Electrolux", "Delux",400));
        produtos.add(new Produto(3,"Notebook", "Asus", "Predator", 850));

        ExportadorListaProduto exportadorPadrao = ExportadorListaProduto.newInstance();
        System.out.println("Lista de Produtos em HTML\n");
        exportadorPadrao.addNewColuna(Principal::precoComDesconto,"Preço com desconto");
        System.out.println(exportadorPadrao.exportar(produtos));


        ExportadorListaProduto exportadorMarkdown = ExportadorListaProduto.newInstance("md");
        System.out.println("Lista de Produtos em Markdown\n");
        exportadorMarkdown.addNewColuna(Principal::precoComDesconto,"Preço com desconto");
        System.out.println(exportadorMarkdown.exportar(produtos));


        ExportadorListaProduto exportadorCSV = ExportadorListaProduto.newInstance("csv");
        System.out.println("Lista de Produtos em CSV\n");
        exportadorCSV.addNewColuna(Principal::precoComDesconto,"Preço com desconto");
        System.out.println(exportadorCSV.exportar(produtos));
    }
    private static double precoComDesconto(Produto produto){
        return produto.getPreco()*0.9;
    }
}
