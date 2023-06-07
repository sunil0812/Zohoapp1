package com.Zohoapp1.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class Zohoemailserviceimpl implements Zohomailservice {

	@Autowired
	JavaMailSender sender;
	
	@Override
	public void emailsend(String to, String des, String text) {

		SimpleMailMessage content = new SimpleMailMessage();
		
		content.setTo(to);
		content.setSubject(des);
		content.setText(text);
		
		
		sender.send(content);
	}

}
