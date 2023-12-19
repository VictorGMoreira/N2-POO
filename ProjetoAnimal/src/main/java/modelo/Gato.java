package modelo;

public class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato faz miau.");
    }

    @Override
    public void movimento() {
        System.out.println("O gato corre ou anda furtivamente.");
    }
}
