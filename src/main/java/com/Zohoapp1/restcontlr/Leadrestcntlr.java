package com.Zohoapp1.restcontlr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Zohoapp1.entity.Lead;
import com.Zohoapp1.repository.Leadrepository;

@RestController
public class Leadrestcntlr {
	
	@Autowired
	private Leadrepository leadrepo;
	
	@GetMapping("/listapi")
	public List<Lead> listall(){
		List<Lead> lead = leadrepo.findAll();
		
		return lead;
	}
	
	@PostMapping("/postapi")
	public void postlead(@RequestBody Lead lead) {
		leadrepo.save(lead);
	}
	
	@PutMapping("/updateapi")
	public void updatelead(@RequestBody Lead lead) {
		leadrepo.save(lead);
	}
	
	@DeleteMapping("/deleteapi/{sno}")
	public void deleteapi(@PathVariable("sno")long sno) {
		
		leadrepo.deleteById(sno);
		
	}
	
	
}
