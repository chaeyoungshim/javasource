package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx3 {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("d:\\temp\\hold.mp4");
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("d:\\temp\\hold_copy.mp4");
			BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			
			int data;
			while((data=bis.read())!=-1) {
				bos.write(data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}




