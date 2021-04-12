package com.mycompany.simple.factory;

import java.util.function.Function;

 class ColunaHTML extends AbstractColuna {
    public ColunaHTML(Function<Produto, Object> obtemValorColuna, String titulo) {
        super(obtemValorColuna, titulo);
    }

    @Override
    public String abrir() {
        return "<td>";
    }

    @Override
    public String fechar() {
        return "</td>";
    }
}
