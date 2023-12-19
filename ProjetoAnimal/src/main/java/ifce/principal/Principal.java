package ifce.principal;

import modelo.Animal;
import modelo.Cachorro;
import modelo.Gato;
import modelo.Passaro;
import modelo.Veterinario;

public class Principal {
    public static void main(String[] args) {
        // Instanciando os animais
        Animal cachorro = new Cachorro("Rex", 3);
        Animal gato = new Gato("Whiskers", 2);
        Animal passaro = new Passaro("Tweetie", 1);

        // Instanciando o veterinário
        Veterinario veterinario = new Veterinario();

        // Examinando os animais
        veterinario.examinar(cachorro);
        veterinario.examinar(gato);
        veterinario.examinar(passaro);
    }
}