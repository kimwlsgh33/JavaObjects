package chat;

import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args){
        // 클라이언트 소켓 생성
        Socket socket = new Socket();

        // 표준 입력 받기
        Scanner sc = new Scanner(System.in);

        InputStream is = null; // 바이트 스트림
        InputStreamReader isr = null; // 문자 스트림
        BufferedReader br = null; // 버퍼

        OutputStream os = null; // 바이트 스트림
        OutputStreamWriter osw = null; // 문자 스트림
        PrintWriter pw = null; // 소켓 출력 객체

        try {
            // localhost에 6077번 포트로 연결
            socket.connect(new InetSocketAddress(InetAddress.getLocalHost(), 6077));
            // 표준 출력으로 연결 성공 메시지 출력
            System.out.println("[client] connected");

            while(true){
                //================================================================================================
                // 소켓으로부터 입력 스트림을 얻음 ( 서버가 보낸 데이터를 읽음 )
                //================================================================================================
                is = socket.getInputStream(); // 바이트 스트림 읽어옴
                isr = new InputStreamReader(is, "UTF-8"); // 문자 스트림으로 변환
                br = new BufferedReader(isr); // 버퍼에 저장


                //================================================================================================
                // 소켓으로부터 출력 스트림을 얻음 ( 서버에 데이터를 보냄 )
                //================================================================================================
                os = socket.getOutputStream(); // 바이트 스트림 읽어옴
                osw = new OutputStreamWriter(os, "UTF-8"); // 문자 스트림으로 변환
                pw = new PrintWriter(osw, true); // 소켓 출력 객체 생성

                System.out.print(">>");
                String data = sc.nextLine(); // 키보드로부터 입력 받음

                // exit 입력 시 종료
                if("exit".equals(data)){
                    System.out.println("[client] closed by client");
                    break;
                }

                pw.println(data); // 서버로 데이터 전송

                data = br.readLine(); // 서버로부터 데이터 수신
                System.out.println("<<" + data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(socket != null && !socket.isClosed()){
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            sc.close();
        }
    }
}
