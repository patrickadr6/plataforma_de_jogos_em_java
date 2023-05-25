import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(new Jogador("Patrick", 21, "M", "Patriqueishons"));
        jogadores.add(new Jogador("Michael", 22, "M", "Mikelovin"));

        List<Jogo> jogos = new ArrayList<>();
        jogos.add(new Jogo("Minecraft"));
        jogos.add(new Jogo("Pacman"));
        jogos.add(new Jogo("Civilization"));
        jogos.add(new Jogo("Campo Minado"));

        System.out.println("Jogos:");
        for (Jogo jogo : jogos) {
            System.out.println(jogo.getTitulo());
        }
        System.out.println("\n");

        System.out.println("Jogadores:");
        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }

        System.out.println("\n");
        System.out.println("->Avaliação--------------");
        // criar lista para os objetos das avaliações
        Avaliar analise[] = new Avaliar[5];
        // nova análise no índice 0
        analise[0] = new Avaliar(jogadores.get(0), jogos.get(0));
        analise[0].avaliar();
        System.out.println(analise[0].toString());

        analise[1] = new Avaliar(jogadores.get(0), jogos.get(2));
        analise[1].avaliar(35.0f);
        System.out.println(analise[1].toString());

        analise[2] = new Avaliar(jogadores.get(1), jogos.get(3));
        analise[2].avaliar(9);
        System.out.println(analise[2].toString());

        analise[3] = new Avaliar(jogadores.get(0), jogos.get(3));
        analise[3].avaliar();
        System.out.println(analise[3].toString());
    }
}