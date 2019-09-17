/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class Ataque {
    private String nombre;
    private int alcance;
    private int nivel;
    private int rangoExplosion;
    private int impacto;
    private byte[] image;   //esto no esta en el diagrama
    public Ataque(String name,int alcanceAtaque,int level,int rangoExplotion,int impact,byte[]img){
        this.nombre = name;
        this.alcance = alcanceAtaque;
        this.nivel = level;
        this.rangoExplosion = rangoExplotion;
        this.impacto = impact;
        this.image = img;
    }
}
