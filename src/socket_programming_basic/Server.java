/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket_programming_basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author moon
 */
public class Server {
    public static void main(String[] args){
        System.out.println("Waiting.................................");
        try{
             ServerSocket serversocket = new ServerSocket(8090);  //Server is ready with the port
             Socket s_socket = serversocket.accept();              //Keep in this line until it gets any new client
             System.out.println("Waiting for client Message: ");
             InputStreamReader isr = new InputStreamReader(s_socket.getInputStream());
             BufferedReader br = new BufferedReader(isr);
             String line = br.readLine();
             System.out.println("Client Said : "+line);
             PrintWriter pw = new PrintWriter(s_socket.getOutputStream(),true);
             pw.println("Hi From, Server");
        }catch(Exception e ){
            
        }
       
    }
}
