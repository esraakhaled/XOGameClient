/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahmed
 */
public class SocketSingleton {
    private static Socket socket;
    public static synchronized Socket getInstanceOf(String ip){
        if(socket==null){
            try {
                socket=new Socket(ip,8080);
            } catch (IOException ex) {
                Logger.getLogger(SocketSingleton.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         return socket;   
}
}
