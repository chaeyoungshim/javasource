package io;

import java.io.File;
import java.io.IOException;

public class FileEx1 {
	public static void main(String[] args) throws IOException {
		//파일 객체 생성  
		// \t, \n
		File f1 = new File("c:\\temp\\test1.txt");
		File f2 = new File("c:\\temp","test1.txt");
		File dir = new File("c:\\temp");
		File f3 = new File(dir,"test1.txt");
		
		
		//파일명
		String fileName = f1.getName();
		System.out.println("경로를 제외한 파일명 : "+fileName); // test1.txt
		//확장자를 제외한 파일명
		int pos = fileName.lastIndexOf(".");
		System.out.println("확장자를 제외한 파일명 : "+fileName.substring(0, pos));
		System.out.println("확장자 : "+fileName.substring(pos+1));
		
		System.out.println();
		
		//경로를 포함한 파일명
		System.out.println("경로를 포함한 파일명 : "+f1.getPath());
		System.out.println("파일의 절대경로 : "+f1.getAbsolutePath());
		System.out.println("파일의 정규경로 : "+f1.getCanonicalPath());
		System.out.println("파일이 속해있는 부모경로 : "+f1.getParent());
		
		System.out.println();
		System.out.println("File.pathSeparator - "+File.pathSeparator);
		System.out.println("File.pathSeparatorChar - "+File.pathSeparatorChar);
		System.out.println("File.separator - "+File.separator);
		System.out.println("File.separatorChar - "+File.separatorChar);
		
		

	}
}















