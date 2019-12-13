package com.Sofia.ind.lab.task6;


import com.sun.corba.se.spi.activation.Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
/*
public class Chat{
    public static void main (String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(9000);

        while (true) {
            Socket socket = serverSocket.accept();
            new Thread(() -> {
                BufferedReader reader = null;
                try {
                    reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                while (true) {
                    if (reader.ready()) {
                        System.out.println("Hello World");
                        String msg = null;
                        try {
                            msg = reader.readLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println(msg);
                    } else Thread.sleep();
                }
            }).start();
        }
    }


}


public class Chat{
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        int portNumber = 8000;
        try{
            serverSocket = new ServerSocket(portNumber);
            acceptClients();
        } catch (IOException e){
            System.err.println("Невозможно подключться к порту " + portNumber);
            System.exit(1);
        }
    }

    public static void acceptClients() {
        clients = new ArrayList<ClientThread>();
        while(true){
            try{
                Socket socket = serverSocket.accept();
                CLient
            }catch(IOException e){
                System.out.println("Ошибка");
            }
        }
    }

}

 */

public class Chat{
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(8000);
            Socket s = ss.accept();

            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String msgin = "", msgout = "";

            while(!msgin.equals("end")){
                msgin = din.readUTF();
                System.out.println(msgin);
                msgout = br.readLine();
                dout.writeUTF(msgout);
                dout.flush();
            }
            s.close();
        }catch(Exception e){

        }
    }
}