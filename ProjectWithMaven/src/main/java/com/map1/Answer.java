package com.map1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Answer {
	@Id
	private long id;
	private String answer;
	
	@ManyToOne
	private Question question;
	
	
	
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + "]";
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Answer(long id, String answer, Question question) {
		super();
		this.id = id;
		this.answer = answer;
		this.question = question;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	

}
