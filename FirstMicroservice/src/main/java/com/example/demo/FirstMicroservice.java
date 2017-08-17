package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="firstmicroservice")
public class FirstMicroservice {
	
	@Id
	public String id;
	public String title;
	
	public FirstMicroservice() {
			
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
