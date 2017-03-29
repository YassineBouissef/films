package com.dbg.model.user;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1443030971354997994L;

	private Integer id;

	private Integer name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getName() {
		return name;
	}

	public void setName(Integer name) {
		this.name = name;
	}

}
