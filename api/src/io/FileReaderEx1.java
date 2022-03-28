package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderEx1 {
	public static void main(String[] args) {
		// 입력 : 파일, 출력 : 화면
		// == InputStream
		try(Reader reader = new FileReader("d:\\temp\\file1.txt");) {
			int ch;
			while((ch=reader.read())!=-1) {
				System.out.println((char)ch);
			}
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e1) {			
			e1.printStackTrace();
		} 

	}
}










