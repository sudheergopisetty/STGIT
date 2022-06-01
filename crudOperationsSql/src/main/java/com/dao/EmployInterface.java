package com.dao;

import java.util.List;

import com.model.Employ;

public interface EmployInterface {

	public abstract List<Employ> readAllEmployers();
	public abstract Employ createEmploy(Employ user);
	
	public abstract Employ readByEmployId(int employId);
	public abstract List<Employ> readByEmployName(String mployName);
	public abstract Employ validateEmployIdAndEmployPassword(int EmployId, String Employpassword);
	public abstract Employ updateEmployById(int employId, Employ employ);
	public abstract Employ deleteByEmployId(int employId);
	public abstract Employ deleteByEmployName(String employName);
}
