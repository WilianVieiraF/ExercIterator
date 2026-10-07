package br.venson.net.designpatterns.iterator;

import br.venson.net.designpatterns.iterator.iterador.Iterador;

public class Player {

    public void tocarTudo(Playlist playlist) {
        tocar(playlist.criarIterador(), "Tocando");
    }

    public void tocarEmbaralhado(Playlist playlist) {
        tocar(playlist.criarIteradorEmbaralhado(), "Tocando (shuffle)");
    }

    private void tocar(Iterador<Faixa> it, String prefixo) {
        while (it.temProxima()) {
            System.out.println(prefixo + ": " + it.proxima());
        }
    }
}