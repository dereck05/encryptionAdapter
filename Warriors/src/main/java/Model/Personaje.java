/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;


public class Personaje implements IPersonaje{
    private String nombre;
    private ArrayList<byte[]> image;        //byte array? 😀👽
    private int vida;
    private int golpesxTiempo;
    private int nivel;
    private int campoAccion;
    private int nivelAparicion;
    private int costo;
    
    
    public Personaje(String nom,ArrayList<byte[]> img,int life,int golpexTiempo,int level, int campo,int nivelAparic,int cost){
        this.nombre = nom;
        this.image = img;
        this.vida = life;
        this.golpesxTiempo =golpexTiempo;
        this.nivel = level;
        this.campoAccion = campo;
        this.nivelAparicion = nivelAparic;
        this.costo = cost;
    }
    
    
    @Override
    public void attack(){
        
    }
    
    @Override
    public void cure(){
        
    }
    
}
