/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alunos
 */
public class Veterinario {
    public void examinar(Animal animal) {
        System.out.println("O veterinário está examinando o animal:");
        System.out.println("Nome: " + animal.getNome());
        System.out.println("Idade: " + animal.getIdade() + " anos");
        animal.emitirSom();
        animal.movimento();
        System.out.println();
    }
}