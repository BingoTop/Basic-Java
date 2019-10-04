package filestream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;



public class mainclass {
	public static void main(String[] args) {
		
		try {
			OutputStream output = new FileOutputStream("/home/jaewon/output.txt");
			String str = "텍스트 파일 작성 테스트";
			byte[] by = str.getBytes();
			//System.out.println("by"+by);
			output.write(by);
		}catch (Exception e) {
			e.getStackTrace();
		}
	
	
	try {
		File file = new File("/home/jaewon/output.txt");
		
		FileReader file_reader = new FileReader(file);
		int cur = 0;
		while((cur = file_reader.read()) != -1 ) {
			//System.out.println(cur);
			System.out.print((char)cur);
		}
		file_reader.close();
	}catch (FileNotFoundException e) {
		e.getStackTrace();
	}catch (IOException e) {
		e.getStackTrace();
	}
	

}
	}

