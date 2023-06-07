package com.Zohoapp1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Zohoapp1.entity.Lead;
import com.Zohoapp1.repository.Leadrepository;

@Service
public class Leadserviceimpl implements Leadservice {
	
	@Autowired
	Leadrepository leadrepo;

	@Override
	public void savedata(Lead lead) {
		leadrepo.save(lead);
		
	}

	@Override
	public List<Lead> listall() {
		List<Lead> leads = leadrepo.findAll();
		
		return leads;
	}

	@Override
	public void deletelead(long sno) {

		leadrepo.deleteById(sno);
	}

	@Override
	public Lead updatelead(long sno) {

		Optional<Lead> le = leadrepo.findById(sno);
		Lead lead = le.get();
		return lead;
	}

}
