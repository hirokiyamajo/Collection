package practice;

import java.time.LocalDate;

public class Task implements Comparable<Task>{
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
	

	
	@Override
	public int compareTo(Task other) {
		return this.datetime.compareTo(other.datetime);
	}
	
}
