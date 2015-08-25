package com.hometask; 

import java.io.*;
import java.util.StringTokenizer;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;

public class iPhonePageBean implements Serializable {
	private String name;
	private String picURL;
	private String display;
	private String LTE;
	private int price;
	private String finalPrice;
	private String number;
	
	public void setName(String name) throws IOException {
		this.name = name;
		
		int i;
		FileInputStream fin;
		String buffer = "";
		
		try {
			fin = new FileInputStream("C:\\Users\\Sergey\\Documents\\NetBeansProjects\\iPhoneShop\\src\\java\\" + name + ".txt");
		} catch (FileNotFoundException e) { 
			e.printStackTrace(); 
			return;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			return;
		}
		
		// ������ ������� �����, ���� �� ���������� ������ EOF
		
		do {
			i = fin.read();
			
			if (i != -1)
				buffer += (char)i;
		} while(i != -1);
		
		fin.close();
		
		StringTokenizer tok = new StringTokenizer(buffer);
		String[] temp = { "", "", "", ""};
		
		i = 0;
		
		while(tok.hasMoreElements()) {
			temp[i] = tok.nextToken();
			++i;
		}
		
		this.setPicURL(temp[0]);
		this.setLTE(temp[1]);
		this.setDisplay(temp[2]);
		this.setPrice(Integer.parseInt(temp[3]));
		this.setFinalPrice("0");
		this.setNumber("0");
	}
	public String getName() {
		return name;
	}
	
	public void setPicURL(String picURL) {
		this.picURL = picURL;
	}
	public String getPicURL() {
		return picURL;
	}
	
	public void setLTE(String LTE) {
		this.LTE = LTE;
	}
	public String getLTE() {
		return LTE;
	}
	
	public void setDisplay(String display) {
		this.display = display;
	}
	public String getDisplay() {
		return display;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setFinalPrice(String finalPrice) {
		this.finalPrice = finalPrice;
	}
	public String getFinalPrice() {
		return finalPrice;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	public String getNumber() {
		return number;
	}
}