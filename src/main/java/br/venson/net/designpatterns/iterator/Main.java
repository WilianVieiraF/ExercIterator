package br.venson.net.designpatterns.iterator;

import br.venson.net.designpatterns.iterator.iterador.Iterador;

public class Main {

    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.adicionar(new Faixa("Faixa A", "Artista X", 210, true));
        playlist.adicionar(new Faixa("Faixa B", "Artista Y", 180, false));
        playlist.adicionar(new Faixa("Faixa C", "Artista Z", 240, true));

        Player player = new Player();
        Recomendador recomendador = new Recomendador();
        RelatorioPlaylist relatorio = new RelatorioPlaylist();

        relatorio.resumo(playlist);
        recomendador.sugerirFavoritas(playlist);

        System.out.println("Ordem original: " + ordem(playlist));
        player.tocarEmbaralhado(playlist);
        System.out.println("Ordem depois do shuffle: " + ordem(playlist)); // igual à original
    }

    private static String ordem(Playlist playlist) {
        StringBuilder sb = new StringBuilder("[");
        Iterador<Faixa> it = playlist.criarIterador();
        while (it.temProxima()) {
            sb.append(it.proxima());
            if (it.temProxima()) sb.append(", ");
        }
        return sb.append("]").toString();
    }
}