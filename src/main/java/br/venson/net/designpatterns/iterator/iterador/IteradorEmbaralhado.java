package br.venson.net.designpatterns.iterator.iterador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IteradorEmbaralhado<T> extends IteradorSequencial<T> {

    public IteradorEmbaralhado(List<T> origem) {
        super(embaralhada(origem));
    }

    // Embaralha uma CÓPIA: a lista original nunca é tocada.
    private static <T> List<T> embaralhada(List<T> origem) {
        List<T> copia = new ArrayList<>(origem);
        Collections.shuffle(copia);
        return copia;
    }
}