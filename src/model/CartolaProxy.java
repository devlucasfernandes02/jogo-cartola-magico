package model;

public class CartolaProxy implements Cartola {
    private CartolaReal cartolaReal;
    private int tentativas;

    public CartolaProxy() {
        this.cartolaReal = new CartolaReal();
        this.tentativas = 0;
    }

    @Override
    public String tentarAdivinhar(int palpite) {
        tentativas++;
        String resultado = cartolaReal.tentarAdivinhar(palpite);

        if (palpite == cartolaReal.getNumeroSecreto()) {
            resultado += "\n✨ Tentativas: " + tentativas;
        }

        return resultado;
    }

    public int getTentativas() {
        return tentativas;
    }
}