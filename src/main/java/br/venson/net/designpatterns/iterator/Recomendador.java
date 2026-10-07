package br.venson.net.designpatterns.iterator;

import br.venson.net.designpatterns.iterator.iterador.Iterador;

public class Recomendador {

    public void sugerirFavoritas(Playlist playlist) {
        System.out.println("Favoritas:");
        Iterador<Faixa> it = playlist.criarIteradorFavoritas();
        while (it.temProxima()) {
            System.out.println("  * " + it.proxima());
        }
    }
}