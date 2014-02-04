package edu.app.services;

import javax.ejb.Remote;

@Remote
public interface TranslatorServiceRemote {
	
	String translate(String french);

}
