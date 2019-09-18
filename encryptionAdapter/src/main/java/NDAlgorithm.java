/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derec
 */
public class NDAlgorithm {
    public NDAlgorithm(){
        
    };
    public String encrypt(String msj,char one,char two){
        
        char new1 = (char) (one+3);     //Encriptacion cesarea
        char new2 = (char) (two+3);
        msj = msj.replace(one, new1);
        msj = msj.replace(two, new2);
        System.out.println("ND Encrypted: "+msj);
        return "Encrypted!";
    }
}
