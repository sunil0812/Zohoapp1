package com.Zohoapp1.service;

import java.util.List;

import com.Zohoapp1.entity.Lead;

public interface Leadservice {
	public void savedata(Lead lead);
	public List<Lead> listall();
	public void deletelead(long sno);
	public Lead updatelead(long sno);
	
}
