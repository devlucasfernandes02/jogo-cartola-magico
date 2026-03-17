package service;

import model.Jogador;
import java.util.*;

public class RankingService {

    private List<Jogador> ranking = new ArrayList<>();

    public void adicionarJogador(Jogador jogador) {
        ranking.add(jogador);
        ranking.sort(Comparator.comparingInt(Jogador::getTentativas));
    }

    public List<Jogador> getTop5() {
        return ranking.subList(0, Math.min(5, ranking.size()));
    }
}