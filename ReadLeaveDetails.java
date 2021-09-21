package com.java.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ReadLeaveDetails {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("c:/files/leave.txt");
			ObjectInputStream objin = new ObjectInputStream(fin);
			LeaveDetails leave = (LeaveDetails)objin.readObject();
			System.out.println(leave);
			objin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
