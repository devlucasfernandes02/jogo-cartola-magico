package model;

import java.util.Random;

public class CartolaReal implements Cartola {
    private int numeroSecreto;

    public CartolaReal() {
        this.numeroSecreto = new Random().nextInt(101);
    }

    @Override
    public String tentarAdivinhar(int palpite) {
        if (palpite == numeroSecreto)
            return "🎉 Acertou! O coelho saiu da cartola!";
        else if (palpite < numeroSecreto)
            return "A cartola é 🔼 Maior!";
        else
            return "A cartola é 🔽 Menor!";
    }

    public int getNumeroSecreto() {
        return numeroSecreto;
    }
}