package com.example.calc;

import org.springframework.stereotype.Component;

@Component
public class JustADemoPOJO 
{

	private int vId;
	private String vMsg;
	
	
	public int getvId() {
		return vId;
	}
	public void setvId(int vId) {
		this.vId = vId;
	}
	public String getvMsg() {
		return vMsg;
	}
	public void setvMsg(String vMsg) {
		this.vMsg = vMsg;
	}
	
	

	
	
}
