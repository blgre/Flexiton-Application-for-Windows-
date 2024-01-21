/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import java.util.HashMap;

/**
 *
 * @author akiin
 */
public class userDatabase {
    
     HashMap<String,String> logininfo = new HashMap<String,String>();

    userDatabase(){

        logininfo.put("Antoine","1234");
        logininfo.put("Anakin","1234");
        
    }
    public HashMap getLoginInfo(){
        return logininfo;
    }
}
