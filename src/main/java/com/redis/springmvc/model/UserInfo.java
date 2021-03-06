package com.redis.springmvc.model;

public class UserInfo {

	private int id;

	private String name;

	private int age;

	private int sex;

	private String add;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", add=" + add + "]";
	}
	
	
	
}
