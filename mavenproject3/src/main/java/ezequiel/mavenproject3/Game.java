/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ezequiel.mavenproject3;

import java.util.List;


public abstract class Game {
    private List<personaje> personajes;
    
    private String nombre;
    private String descripcion;
    private long tamaño;
    private int poder;
    private int vida;
    
    

    public void funciones(){
        System.out.print("desplazarse");
        System.out.println("MostrarVida");
        System.out.print("MostrarPoder");   
    }
}