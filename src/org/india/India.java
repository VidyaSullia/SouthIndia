package org.india;

import org.tamilnadu.Tamilnadu; //type class name Tamilnadu inside class and ctrl+space bar, then delete class name.

public class India extends Tamilnadu {
	public void Indian() {
		System.out.println("Indian Languages");
	}
	
	public void India2() {
		System.out.println("2");
	}

	public static void main(String[] args) {
		India I = new India();
		I.Indian();
		I.tamilLanguage();
		I.malayalam();
		I.telugu();

	}
}
