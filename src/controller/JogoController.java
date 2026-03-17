package controller;

import model.*;
import service.RankingService;
import view.JogoView;

public class JogoController {

    private JogoView view;
    private RankingService ranking;

    public JogoController() {
        view = new JogoView();
        ranking = new RankingService();
    }

    public void iniciarJogo() {

        String nome = view.pedirNome();
        boolean continuarJogando = true;

        while (continuarJogando) {

            CartolaProxy cartola = new CartolaProxy();
            boolean acertou = false;

            while (!acertou) {
                int palpite = view.pedirPalpite();
                String resposta = cartola.tentarAdivinhar(palpite);

                view.mostrarMensagem(resposta);

                if (resposta.contains("Acertou")) {
                    acertou = true;

                    Jogador jogador = new Jogador(nome, cartola.getTentativas());
                    ranking.adicionarJogador(jogador);

                    view.mostrarRanking(ranking.getTop5());
                }
            }

            // Perguntar se quer jogar novamente
            boolean jogarNovamente = view.perguntarJogarNovamente();

            if (!jogarNovamente) {
                continuarJogando = false;
            } else {
                // Perguntar se quer trocar jogador
                boolean trocar = view.perguntarTrocarUsuario();
                if (trocar) {
                    nome = view.pedirNome();
                }
            }
        }

        view.mostrarMensagem("\n👋 Obrigado por jogar!");
    }
}