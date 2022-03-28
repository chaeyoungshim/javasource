package io;

import java.io.File;

public class FileEx2 {
	public static void main(String[] args) {
		// 디렉토리가 존재하는지
		if(args.length!=1) {
			System.out.println("사용법 : java FileEx2 디렉토리명");
			System.exit(0);
		}
		
		File f = new File(args[0]); // c:\temp
		
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}
		
		File[] files = f.listFiles();
		for(File f1:files) {			
			System.out.println(f1.isDirectory()?"["+f1.getName()+"]":f1.getName());
		}
		

	}
}













