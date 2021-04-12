package com.mycompany.simple.factory;

import java.util.function.Function;

public class ColunaCSV extends AbstractColuna {
    public ColunaCSV(Function<Produto, Object> obtemValorColuna, String titulo) {
        super(obtemValorColuna, titulo);
    }

    @Override
    public String abrir() {
        return "";
    }

    @Override
    public String fechar() {
        return ",";
    }
}
