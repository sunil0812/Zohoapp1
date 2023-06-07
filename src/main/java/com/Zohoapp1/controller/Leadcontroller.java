package com.Zohoapp1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Zohoapp1.entity.Lead;
import com.Zohoapp1.service.Leadservice;
import com.Zohoapp1.utility.Zohomailservice;

@Controller
public class Leadcontroller {
	
	@Autowired
	Leadservice leadserv;
	
	@Autowired
	Zohomailservice zohomail;
	
	@RequestMapping("/Zohocrm")
	public String show() {
		
		return "show";
	}
	
	@RequestMapping("savelead")
	public String show1(Lead lead) {
		leadserv.savedata(lead);
		zohomail.emailsend("sunilkumarack2@gmail.com", "Greetings", "Helloooo Sir!!!");
		return "show";
	}
	
	@RequestMapping("/listall")
	public String show2(Model model) {
		List<Lead> leads = leadserv.listall();
		model.addAttribute("leads", leads);
		return "show1";
	}
	
	@RequestMapping("/deletelead")
	public String show3(@RequestParam("sno")long sno,Model model) {
		
		leadserv.deletelead(sno);
		
		List<Lead> leads = leadserv.listall();
		model.addAttribute("leads", leads);
		return "show1";
	}
	
	@RequestMapping("/updatelead")
	public String show4(@RequestParam("sno")long sno,ModelMap model) {		
		Lead lead = leadserv.updatelead(sno);
		model.addAttribute("lead",lead);
		return "show2";
	}
	
	@RequestMapping("/updatelead1")
	public String show5(Lead lead1,Model model) {
		
		leadserv.savedata(lead1);

		List<Lead> leads = leadserv.listall();
		model.addAttribute("leads", leads);
		
		return "show1";
	}
	
	
	
	
}
