/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derec
 */
public class EncryptionObj {
    IEncryption algorithm;
    
    public EncryptionObj(){};
    
    public void encrypt(String type,String msj,String key){
        
        if(type.equals("AES")){
            algorithm= new AESAlgorithm();
            String res = algorithm.encrypt(msj, key);
            System.out.println("AES Encrypted: "+res);
        }
        if(type.equals("ND")){
            algorithm= new NDEncryptionAdapter();
            String res = algorithm.encrypt(msj, key);
            System.out.println(res);
        }
    }
}
