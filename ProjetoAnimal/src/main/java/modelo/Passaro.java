package modelo;

public class Passaro extends Animal {
    public Passaro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O pássaro faz piu piu.");
    }

    @Override
    public void movimento() {
        System.out.println("O pássaro voa.");
    }
}
