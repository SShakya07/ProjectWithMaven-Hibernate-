package com.map1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="question_details")
public class Question {
	@Id
	private long id;
	private String question;
	
	@OneToMany(mappedBy="question")
	private List<Answer> answere;
	
	public Question(long id, String question, List<Answer> answere) {
		super();
		this.id = id;
		this.question = question;
		this.answere = answere;
	}
	public List<Answer> getAnswere() {
		return answere;
	}
	public void setAnswere(List<Answer> answere) {
		this.answere = answere;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", answere=" + answere + "]";
	}
	
	
	
	
	

}
