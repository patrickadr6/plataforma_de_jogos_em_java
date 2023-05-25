public class Jogador extends Pessoa {
    private String login;
    private int totalHorasJogado;

    public Jogador(String nome, int idade, String genero, String login) {
        super(nome, idade, genero);
        this.login = login;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotalHorasJogado() {
        return totalHorasJogado;
    }
    public void setTotalHorasJogado(int totalHorasJogado) {
        this.totalHorasJogado = totalHorasJogado;
    }
}
