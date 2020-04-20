package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MySocket {
    public static void main(String[] args) {
        try {
            //创建服务端socket,绑定端口，并监听此端口
            ServerSocket serverSocket = new ServerSocket(8888);
            //调用accpet方法阻塞监听
            System.out.println("服务端启动，开始监听，等待客户端连接");
            Socket socket = serverSocket.accept();
            //获取流(字节输入流)
//            InputStream is = socket.getInputStream();
            //转换为字符输入流
//            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            //为输入流添加缓冲
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String info = null;
            while((info=br.readLine())!=null){
                System.out.println("我是服务端，客户端说"+info);
            }
                //4. 获取输出流, 响应客户端的请求
                OutputStream os = socket.getOutputStream();
                PrintWriter pw = new PrintWriter(os);
                pw.write("欢迎您!");
                pw.flush();//调用flush()方法将缓冲输出

                //5. 关闭资源
                pw.close();
                os.close();
                br.close();
//                isr.close();
//                is.close();
                socket.close();
                serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
