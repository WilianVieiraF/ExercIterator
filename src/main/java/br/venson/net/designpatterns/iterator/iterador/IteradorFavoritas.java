package br.venson.net.designpatterns.iterator.iterador;

import java.util.ArrayList;
import java.util.List;

import br.venson.net.designpatterns.iterator.Faixa;

public class IteradorFavoritas extends IteradorSequencial<Faixa> {

    public IteradorFavoritas(List<Faixa> origem) {
        super(soFavoritas(origem));
    }

    private static List<Faixa> soFavoritas(List<Faixa> origem) {
        List<Faixa> favoritas = new ArrayList<>();
        for (Faixa f : origem) {
            if (f.isFavorita()) {
                favoritas.add(f);
            }
        }
        return favoritas;
    }
}