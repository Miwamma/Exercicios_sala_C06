package br.inatel.cdg.inimigo;

public class Asteroide {
    private String nome;
    private String tipoAsteroide;

    public Asteroide(String nome, String tipoAsteroide) {
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
    }

    public String getNome() {
        return nome;
    }

    public void Asteroide(){
        System.out.println("Nome: " + nome + " Tipo de asteroide: " + tipoAsteroide);
    }

    public void destruir(){
        System.out.println("BOOOOM!!!!!");
    }
}
