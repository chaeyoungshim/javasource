<%@page import="java.net.URLEncoder"%>
<%@page import="java.util.UUID"%>
<%@page import="java.io.File"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	//request에서 upload 요청이 있는지 확인
	boolean isMultipart = ServletFileUpload.isMultipartContent(request); //jsp만의 가지고 있는 request

	if(isMultipart) { //얘가 참이라면
		
		//전송된 파일을 디스크에 저장하기 위한 객체
		DiskFileItemFactory factory = new DiskFileItemFactory();

		// Create a new file upload handler
		ServletFileUpload upload = new ServletFileUpload(factory);

		// Parse the request
		List<FileItem> items = upload.parseRequest(request);
		
		
		//폼 or 파일 데이터인지 구분
		String fieldName = "", fileName="", value="";
		Iterator<FileItem> iter = items.iterator();
		while (iter.hasNext()) {
		    FileItem item = iter.next();
		
		    if (item.isFormField()) { // type = text,password.. 이런 애들 지칭
		        fieldName = item.getFieldName();
		   		value = item.getString("utf-8");
		   		out.print("<h3>일반 데이터</h3>");
		   		out.print(fieldName + " : " + value + "<br>");
		    } else {
		    	fieldName = item.getFieldName();
		    	fileName = item.getName();
		    	long size = item.getSize();
		    	
		    	out.print("<h3>파일 데이터</h3>");
		   		out.print(fieldName + " : " + fileName + " - " + size + "<br>");
		   		
		   		//서버에 파일 저장
		   		//동일한 파일명이 들어올 경우(다른 사용자들에게 각각) => 중복되지 않은 고유의 값을 파일명에 추가
		   		if(!fileName.isEmpty()) {
		   			String path = "d:\\upload";
		   			
		   			UUID uuid = UUID.randomUUID(); //고유의 키 값을 생성해줌
		   			
		   			File uploadFile = new File(path+"\\"+uuid.toString()+"_"+fileName);
		   			
		   			item.write(uploadFile); //여기가 저장하는 코드
		   			
		   			
		   			// 파일명에 특수문자가 존재할 때 파일명이 깨지는 것을 방지
		   			String encodeName = URLEncoder.encode(uploadFile.getName(), "utf-8");
		   			
		   			
		   			out.print("<p>");
		   			out.print("<a href='download.jsp?fileName=" + encodeName+"'>"+fileName+"</a>");   
		   			out.print("</p>");
		   		}
		   		
		    }
		}
	}
%>
