public class Avaliar {
    private Jogador jogador;
    private Jogo jogo;

    public Avaliar(Jogador jogador, Jogo jogo) {
        this.jogador = jogador;
        this.jogo = jogo;
        this.jogador.setExperiencia(this.jogador.getExperiencia() + 1);
        this.jogo.setViews(this.jogo.getViews() + 1);
        this.jogo.setReproduzindo(true);
    }

    public void avaliar() {
        this.jogo.setAvaliacao(5);
    }
    public void avaliar(int nota) {
        this.jogo.setAvaliacao(nota);
    }
    public void avaliar(float porc) {
        int total;
        if (porc <= 20) {
            total = 2;
        } else if (porc <= 50) {
            total = 5;
        } else if (porc <= 80) {
            total = 8;
        } else {
            total = 10;
        }
        this.jogo.setAvaliacao(total);
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    @Override
    public String toString() {
        return "Análise [Jogador=" + this.jogador + ", jogo=" + this.jogo + "]"; 
    }
}
