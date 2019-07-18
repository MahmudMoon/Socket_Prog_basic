/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket_programming_basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 
 *
 * @author moon
 */
public class Client {
 
    public static void main(String[] args){
       
        try{ 
              System.out.println("New Client Initialized");
              Socket socket = new Socket("localhost",8090);
              InputStreamReader isr = new InputStreamReader(System.in);
              BufferedReader rb = new BufferedReader(isr);
              String input  = rb.readLine();
              PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
              pw.println(input);
           
              BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
              String sec = br.readLine();
              
              System.out.println("Server Said: "+sec);
             
        }catch(Exception e){
            
        }
      
    }
    
}
