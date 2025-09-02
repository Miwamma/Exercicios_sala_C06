package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Asteroide;

public class Nave {
    private String nome;
    private double vida;
    private String tipoTiro;

    public Nave(String nome, double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public String getNome() {
        return nome;
    }

    public double getVida() {
        return vida;
    }

    public String getTipoTiro() {
        return tipoTiro;
    }

    public void nave(){
        System.out.println("Nome:" + nome + " Vida: " + vida + " Armamento: " +tipoTiro);
    }

    public void atirar(Asteroide ast){
        System.out.println("Metendo bala no/a " + ast.getNome());
    }
}
