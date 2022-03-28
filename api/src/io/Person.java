package io;

import java.io.Serializable;

public class Person implements Serializable{
	
	// 직렬화 : 인스턴스를 저장, 전송
	// 역직렬화 : 저장된 내용을 다시 복원
	
	// 역직렬화 시 직렬화 된 것과 같은 클래스냐? 구별
	private static final long serialVersionUID = -2806855282281182967L;
	//private static final long serialVersionUID = 1L;
	
	private String name;
	private String job;
	//transient String job; // 이 필드는 직렬화 시키지 않음
	
	public Person(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}	
}



