package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class BufferedReaderEx1 {
	public static void main(String[] args) {
		
		//BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:\\temp\\file1.txt"))
		try(//Reader in = new FileReader("d:\\temp\\file1.txt");
			InputStreamReader in = new InputStreamReader(new FileInputStream("d:\\temp\\file1.txt"), "ms949");	
			BufferedReader bis = new BufferedReader(in);
			Writer out = new FileWriter("d:\\temp\\output2.txt");
			BufferedWriter bos = new BufferedWriter(out);) {	
			
			String str=null;
			while((str=bis.readLine())!=null) {
				bos.write(str);
				bos.newLine(); //엔터
			}
			
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e1) {			
			e1.printStackTrace();
		}
		
		
		

	}
}



