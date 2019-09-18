/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derec
 */
public class NDEncryptionAdapter implements IEncryption {
    public NDEncryptionAdapter(){};
    @Override
    public String encrypt(String msj, String key){
        NDAlgorithm nd = new NDAlgorithm();
        String answer = nd.encrypt(msj, key.charAt(0), key.charAt(1));
        return answer;
        
    }
}
