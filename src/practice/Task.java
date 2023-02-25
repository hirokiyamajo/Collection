package practice;

import java.time.LocalDate;

public class Task {
	LocalDate datetime;
	String content;
	
	public Task(LocalDate datetime, String content) {
		this.datetime = datetime;
		this.content = content;
	}
	
	public LocalDate getDatetime() {
		return this.datetime;
	}
	
	public String getContent() {
		return this.content;
	}
		
	
}
