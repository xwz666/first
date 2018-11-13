package com.xwz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

	public static void main(String[] args) throws IOException {
		
		//创建服务器端Socket并绑定端口(1024-25535之间)
		ServerSocket serverSocket = new ServerSocket(6666);
		//创建Socket对象调用acept方法监听
		Socket socket = serverSocket.accept();
		//获取输入流读取客户端信息
		InputStream is = socket.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String info = null;
		while((info=br.readLine())!=null){
			System.out.println("我是服务器,客户端说"+info);
		}
		socket.shutdownInput();
		
		//获取输出流相应客户端信息
		
		OutputStream os = socket.getOutputStream();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
		bw.write("欢迎您！");
		bw.flush();
		
		bw.close();
		os.close();
		br.close();
		is.close();
		socket.close();
		serverSocket.close();
	}
}
