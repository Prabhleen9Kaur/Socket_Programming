package com.soc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocServer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		System.out.println("Server is started");
//		String ip = "localhost";
//		int port = 9999; //0-1023 to 65535
		ServerSocket ss = new ServerSocket(9999);
		
		System.out.println("S:Server is waiting for client");
		Socket s = ss.accept();
		System.out.println("S:Server is connected");
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = br.readLine();// to receive data and print
		
		System.out.println("S:Client Data:"+ str);
		String nickName = str.substring(0,3);
		OutputStreamWriter os= new OutputStreamWriter(s.getOutputStream()); // to send data
        PrintWriter out = new PrintWriter(os);
      
        out.println(nickName);
        os.flush();
        
        System.out.println("S:Data sent from Server to Client");
		
			}

}
