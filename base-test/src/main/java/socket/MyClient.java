package socket;

import java.io.*;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost", 8888);
            //打开输出流，发送消息
            OutputStream ops = socket.getOutputStream();//输出流
            PrintWriter pw = new PrintWriter(ops);//包装为打印流
            pw.write("你好，用户登陆了");
            pw.flush();
            socket.shutdownOutput();//关闭输出流
            //打开输入流  读取消息
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String info = null;
            while ((info = br.readLine()) != null) {
                System.out.println("我是客户端，服务端说" + info);
            }
            //关闭资源
            ops.close();
            pw.close();
            is.close();
            br.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
