package modelo;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro faz au au.");
    }

    @Override
    public void movimento() {
        System.out.println("O cachorro corre.");
    }
}