/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ezequiel.mavenproject3.Villano;

import ezequiel.mavenproject3.Game;

/**
 *
 * @author bayro
 */

public class Duende extends Game implements Villano{
    
   public void Atacar(){
        System.out.println("Tiene la habilidad de Atacar");
    }
}