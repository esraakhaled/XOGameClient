/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogameclient;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raiaan
 */
public class ConnectToServer implements Runnable{
    Socket mySocket;
    DataInputStream dis ;
    PrintStream ps;
    Thread th;
    public ConnectToServer(String name) {
        try {
            mySocket = new Socket("127.0.0.1", 5005);
            dis = new DataInputStream(mySocket.getInputStream ());
            ps = new PrintStream(mySocket.getOutputStream ());
            ps.println(name);
            String replyMsg = dis.readLine();
            System.out.println(replyMsg);
        } catch (IOException ex) {
            Logger.getLogger(ConnectToServer.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                ps.close();
                dis.close();
                mySocket.close();
            } catch (IOException ex) {
                Logger.getLogger(ConnectToServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void run() {
        while(true){
            try {
                String replyMsg = dis.readLine();
                System.out.println(replyMsg);
            } catch (IOException ex) {
                Logger.getLogger(ConnectToServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
