
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

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

    public void encrypt(String msj,String key){ 
        String type = loadConfig();
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
    
    
    public String loadConfig(){
        try{
            Properties config = new Properties();
            InputStream configInput = new FileInputStream("conF.conf");
            config.load(configInput);
            System.out.println(config.getProperty("algoritmo"));
            return config.getProperty("algoritmo");
        } catch(Exception e){
            System.out.println("Error cargando configuración\n" + e.getMessage());
            return "Error" + e;
        }
    }
}
