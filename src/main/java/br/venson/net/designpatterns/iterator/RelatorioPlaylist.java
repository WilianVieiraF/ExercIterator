package br.venson.net.designpatterns.iterator;

import br.venson.net.designpatterns.iterator.iterador.Iterador;

public class RelatorioPlaylist {

    public void resumo(Playlist playlist) {
        Iterador<Faixa> it = playlist.criarIterador();
        int quantidade = 0;
        int totalSegundos = 0;
        while (it.temProxima()) {
            totalSegundos += it.proxima().getDuracaoSegundos();
            quantidade++;
        }
        System.out.printf("Total de faixas: %d | duracao: %d min%n",
                quantidade, totalSegundos / 60);
    }
}