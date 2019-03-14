package com.chain.bottle.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
    private String name;
	
	@Column(nullable = false)
    private Integer age;
	
	@Column(nullable = false)
	private Date createTime;
	
	public User() {
		
	}
	
	public User(String name, Integer age, Date createTime) {
		this.name = name;
		this.age = age;
		this.createTime = createTime;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}
	
    public Date getCreateTime() {
        return createTime;
    }

	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
