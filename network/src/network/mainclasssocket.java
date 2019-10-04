package network;
import java.net.ServerSocket;
import java.net.Socket;

public class mainclasssocket {
	public static void main(String[] args) {
		
		Socket socket = null;
		
		try {
			socket = new Socket("localhost",9000);
			System.out.println("소켓 생성 완료 "); // 클라이언트 맞을 준비 완료
			
			System.out.println("클라이언트 연결 완료 ");
			System.out.println("socket: "+socket);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (socket != null) {socket.close();}
				//if (sck != null) {socket.close();}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
