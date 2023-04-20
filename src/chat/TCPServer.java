package chat;

import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
    public static final int PORT = 6077;

    public static void main(String[] args){
        // 소켓
        // 1. 네트워크를 통해 들어오는 요청을 기다림
        // 2. 요청을 처리하고, 응답
        // 3. 팩토리에서 방화벽에 적합한 소켓을 생성
        ServerSocket serverSocket = null;

        // 입력 스트림
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        // 출력 스트림
        OutputStream os = null;
        OutputStreamWriter osw = null;
        PrintWriter pw = null;

        // 표준 입력 스트림(키보드)을 연결
        // Scanner : 정규식을 사용해서 기본 유형과 문자열을 분석 할 수 있게 해준다.
        Scanner sc = new Scanner(System.in);

        try {
           // 서버 소켓 생성
           serverSocket = new ServerSocket();

            InetAddress ia = InetAddress.getLocalHost();
            String localhost = ia.getHostAddress();

            System.out.println("[server] binding " + localhost + ":" + PORT);

            // 서버 소켓에 바인딩 (IP, PORT) - 값에 의존시킨다.
            serverSocket.bind(new InetSocketAddress(localhost, PORT));

            // accept : 클라이언트의 연결 요청을 기다림
            Socket socket = serverSocket.accept();

            // 클라이언트의 연결 요청을 받으면, 소켓을 생성
            InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();

            System.out.println("[server] connected by client[" + isa.getHostName() + "]");

            // 무한 반복
            while(true){
                //================================================================================================
                // Socket 입력스트림 가져옴(주) - 클라이언트가 보낸 데이터를 읽음
                //================================================================================================
                is = socket.getInputStream();

                // 바이트 스트림 읽고, 문자 스트림으로 변환 ( 필요한 것보다 많이 읽어서 버퍼에 저장 )
                isr = new InputStreamReader(is, "UTF-8");

                // 문자 스트림에서 텍스트를 읽고, 버퍼에 저장 (버퍼링)
                br = new BufferedReader(isr);

                //================================================================================================
                // Socket 출력스트림 가져옴(주) - 클라이언트에게 데이터를 보냄
                //================================================================================================
                os = socket.getOutputStream();

                // 문자 스트림 읽고, 바이트 스트림으로 변환 ( 필요한 것보다 많이 읽어서 버퍼에 저장 )
                osw = new OutputStreamWriter(os, "UTF-8");

                // 객체를 포맷팅해서 출력
                pw = new PrintWriter(osw, true);


                //================================================================================================
                //
                //================================================================================================
                String buffer = null;
                buffer = br.readLine(); // ..blocking 되면서 기다리는중, connect가 들어오면 blocking이 풀림
                if(buffer == null){
                    // 정상종료 : remote socket이 close()
                    // 메소드를 통해서 정상적으로 소켓을 닫은 경우
                    System.out.println("[server] closed by client");
                    break;
                }

                System.out.println("[server] received : " + buffer);
                // 클라이언트에게, 받은 메시지를 다시 보냄
                pw.println(buffer);
            }
        } catch(IOException ioe) {
           ioe.printStackTrace();
        } finally {
            try {
                if (serverSocket != null && !serverSocket.isClosed()) {
                    serverSocket.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            // 자원 정리
            sc.close();
        }
    }
}
