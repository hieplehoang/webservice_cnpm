package com.nhuocquy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="friend")
public class Friend {
	@Id
	@GeneratedValue
	private long idFriend;
	private String name;

	public Friend() {
	}

	public Friend(long idFriend, String name) {
		super();
		this.idFriend = idFriend;
		this.name = name;
	}

	public long getIdFriend() {
		return idFriend;
	}

	public void setIdFriend(long idFriend) {
		this.idFriend = idFriend;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
