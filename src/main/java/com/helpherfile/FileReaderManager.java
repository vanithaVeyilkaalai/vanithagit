package com.helpherfile;

import java.io.IOException;

public class FileReaderManager {
	
	
	//PSDP
	//Private
	
	private  FileReaderManager() {
		

	}
	//static
	public static FileReaderManager getInstance_FRM() {
     		FileReaderManager frm=new FileReaderManager();
     		return frm;

	}	
    //non static
	public Con_Reader getInstance_CRM() throws Throwable {
		Con_Reader reader=new Con_Reader();
		return reader;
	}







}


