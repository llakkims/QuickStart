package com.cap.spring.domain.impl;

import com.cap.spring.domain.Messaging;

public class ActiveMQMessaging implements Messaging{
	
	public void sendMessage()
	{
		System.out.println("Sending Message .........");
	}

}
