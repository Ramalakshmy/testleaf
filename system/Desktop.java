package org.system;

public class Desktop extends Computer {
	//desktopSize()
	public void desktopSize() {
		System.out.println("desltop Size");
	} 
	public static void main(String[] args) {
		Desktop obj=new Desktop();
		obj.computerModel();
		obj.desktopSize();
	}

}
