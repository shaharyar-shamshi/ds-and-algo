/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communication;

/**
 *
 * @author shaharyar
 */

import java.io.IOException; 
import java.net.DatagramPacket; 
import java.net.DatagramSocket; 
import java.net.InetAddress; 

public class Communication {

    /**
     * @param args the command line arguments
     * 
     */
    InetAddress ip;
    int port;
   public Communication(InetAddress ip, int port ) {
       this.ip = ip;
       this.port = port;
   }
   public void UDP_sendMessage(String message) {
       try {
             byte [] message_to_send = message.getBytes();
             DatagramSocket ds = new DatagramSocket();
             DatagramPacket DpSend = 
                  new DatagramPacket(message_to_send, message_to_send.length, this.ip, this.port);
                  ds.send(DpSend);
                    ds.close();
        } catch(Exception err) {
           throw new Error(err);
           }
   }
   
}
