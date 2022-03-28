package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx3 {
	public static void main(String[] args) {
		//입력 : 키보드, 출력 : 화면
//		InputStream in = System.in;
//		OutputStream out = System.out;
//		
//		try {
//			int input = in.read();
//			out.write(input);
//		} catch (IOException e) {			
//			e.printStackTrace();
//		} finally {
//			try {
//				in.close();
//				out.close();
//			} catch (IOException e) {				
//				e.printStackTrace();
//			}
//		}
			
		
		try(InputStream in = System.in;
			OutputStream out = System.out) {
			int input = in.read();
			out.write(input);
		} catch (IOException e) {			
			e.printStackTrace();
		} 
	}
}








