package br.venson.net.designpatterns.iterator.iterador;

public interface Iterador<T> {
    boolean temProxima();
    T proxima();
}