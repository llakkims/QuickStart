package com.cap.spring;

import org.springframework.beans.factory.annotation.Autowired;

import com.cap.spring.domain.Encryption;
import com.cap.spring.domain.Messaging;

public class Communication {

	private Messaging messaging;
	private Encryption encryption;
	
	@Autowired
	public void Communication(Encryption encrypt) {
		encryption =  encrypt;
	}
	
	
	public Messaging getMessaging() {
		return messaging;
	}
	
	
	public void setMessaging(Messaging messaging) {
		this.messaging = messaging;
	}
	public Encryption getEncryption() {
		return encryption;
	}
	public void setEncryption(Encryption encryption) {
		this.encryption = encryption;
	}
	
	public void communicate()
	{
		encryption.encryptData();
		//messaging.sendMessage();
	}
	
}
