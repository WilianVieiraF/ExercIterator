package br.venson.net.designpatterns.iterator.iterador;

public interface Agregado<T> {
    Iterador<T> criarIterador();
}