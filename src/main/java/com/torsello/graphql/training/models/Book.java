package com.torsello.graphql.training.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Book {
	
	@Id
	private String isn;
	private String title;
	private String publisher;
	private String[] author;
	private String publishedDate;

}
