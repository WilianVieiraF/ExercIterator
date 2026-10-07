package br.venson.net.designpatterns.iterator.iterador;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class IteradorSequencial<T> implements Iterador<T> {
    private final List<T> itens;
    private int posicao = 0;

    public IteradorSequencial(List<T> itens) {
        this.itens = Collections.unmodifiableList(itens); // somente leitura
    }

    @Override
    public boolean temProxima() {
        return posicao < itens.size();
    }

    @Override
    public T proxima() {
        if (!temProxima()) {
            throw new NoSuchElementException("Não há mais elementos");
        }
        return itens.get(posicao++);
    }
}