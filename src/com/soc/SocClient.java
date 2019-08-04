package com.soc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SocClient {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		String ip = "localhost";//server port number and ip here, since using same machine  we use here localhost as it is ip of same machine.
		int port = 9999; //0-1023 to 65535
		Socket s = new Socket(ip ,port);
		
        String str = "socket programming";
        
        
        OutputStreamWriter os= new OutputStreamWriter(s.getOutputStream());
        PrintWriter out = new PrintWriter(os);
       // out.write(str);
        out.println(str);
        os.flush();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String nickName = br.readLine();

		System.out.println("C:Server Data:"+ nickName);
		
		
		
	}

}
