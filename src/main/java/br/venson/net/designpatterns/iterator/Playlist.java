package br.venson.net.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

import br.venson.net.designpatterns.iterator.iterador.Agregado;
import br.venson.net.designpatterns.iterator.iterador.Iterador;
import br.venson.net.designpatterns.iterator.iterador.IteradorEmbaralhado;
import br.venson.net.designpatterns.iterator.iterador.IteradorFavoritas;
import br.venson.net.designpatterns.iterator.iterador.IteradorSequencial;

public class Playlist implements Agregado<Faixa> {
    private final List<Faixa> faixas = new ArrayList<>();

    public void adicionar(Faixa faixa) {
        faixas.add(faixa);
    }

    @Override
    public Iterador<Faixa> criarIterador() {
        return new IteradorSequencial<>(faixas);
    }

    public Iterador<Faixa> criarIteradorEmbaralhado() {
        return new IteradorEmbaralhado<>(faixas);
    }

    public Iterador<Faixa> criarIteradorFavoritas() {
        return new IteradorFavoritas(faixas);
    }
}