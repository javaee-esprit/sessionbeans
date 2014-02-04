package edu.app.services;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class TranslatorService implements TranslatorServiceRemote, TranslatorServiceLocal {

	@EJB
	private Dictionnary dictionnary;
	
    public TranslatorService() {
    }

	public String translate(String french) {
		String english = dictionnary.getTranslations().get(french);
		//return english!=null?english:"not found";
		if (english != null) {
			return english;
		}else {
		 return "not found";
		}
	}

}
