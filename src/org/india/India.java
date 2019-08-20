package org.india;

import org.tamilnadu.Tamilnadu; //type class name Tamilnadu inside class and ctrl+space bar, then delete class name.

public class India extends Tamilnadu {
	public void India() {
		System.out.println("Indian Languages");
	}

	public static void main(String[] args) {
		India I = new India();
		I.India();
		I.tamilLanguage();
		I.malayalam();
		I.telugu();

	}
}
