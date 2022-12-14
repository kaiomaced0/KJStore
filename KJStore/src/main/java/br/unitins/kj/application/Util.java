package br.unitins.kj.application;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

import org.apache.commons.codec.digest.DigestUtils;

public class Util {
	
	public static void main(String[] args) {
		
	}
	
	public static String hash(String pass) {
		return DigestUtils.sha256Hex(DigestUtils.sha256Hex(pass) + DigestUtils.sha256Hex("1") + DigestUtils.sha256Hex(pass) + DigestUtils.sha256Hex("123&112233321123") + DigestUtils.sha256Hex(pass));
	}
	public static void redirect(String page) {
		try {
			FacesContext.
				getCurrentInstance().
				getExternalContext().redirect(page);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void addErrorMessage(String valor) {
		addMessage(valor, FacesMessage.SEVERITY_ERROR);
	}
	
	public static void addInfoMessage(String valor) {
		addMessage(valor, FacesMessage.SEVERITY_INFO);
	}
	
	public static void addWarnMessage(String valor) {
		addMessage(valor, FacesMessage.SEVERITY_WARN);
	}
	
	private static void addMessage(String valor, Severity severity) {
		FacesMessage message = new FacesMessage(
				severity, valor , null);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

}