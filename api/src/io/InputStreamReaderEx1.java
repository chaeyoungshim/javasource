package io;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * InputStreamReader : 문자 변환 보조 스트림
 * 바이트 스트림 => 문자(char) 기반
 */

public class InputStreamReaderEx1 {
	public static void main(String[] args) {		
		
		try(InputStream in = new FileInputStream("d:\\temp\\file1.txt");
			InputStreamReader reader=new InputStreamReader(in,"ms949");) {			
	
			char cbuf[]=new char[100];
			while(reader.read(cbuf)!=-1) {
				System.out.println(cbuf);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}





