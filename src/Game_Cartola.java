import java.util.Random;
import java.util.Scanner;

// Interface
interface Cartola {
    String tentarAdivinhar(int palpite);
}

// Classe real (onde o coelho está escondido)
class CartolaReal implements Cartola {
    private int numeroSecreto;

    public CartolaReal() {
        Random rand = new Random();
        this.numeroSecreto = rand.nextInt(101); // 0 a 100
    }

    @Override
    public String tentarAdivinhar(int palpite) {
        if (palpite == numeroSecreto) {
            return "🎉 Você acertou! O coelho saiu da cartola! 🐇🎩";
        } else if (palpite < numeroSecreto) {
            return "🔼 O número secreto é MAIOR!";
        } else {
            return "🔽 O número secreto é MENOR!";
        }
    }

    public int getNumeroSecreto() {
        return numeroSecreto;
    }
}

// Proxy
class CartolaProxy implements Cartola {
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
            resultado += "\n✨ Você conseguiu em " + tentativas + " tentativas!";
        }

        return resultado;
    }
}

// Classe principal
public class Game_Cartola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cartola cartola = new CartolaProxy();

        System.out.println("🎩 Bem-vindo ao jogo do mágico!");
        System.out.println("🐇 Tente adivinhar onde está o coelho (número de 0 a 100)");

        boolean acertou = false;

        while (!acertou) {
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();

            String resposta = cartola.tentarAdivinhar(palpite);
            System.out.println(resposta);

            if (resposta.contains("acertou")) {
                acertou = true;
            }
        }

        scanner.close();
    }
}