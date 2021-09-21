package com.java.test;

import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteLeaveDetails {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("c:/files/leave.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			LeaveDetails leave = new LeaveDetails(1, "Aishwarya", 1026159);
			objout.writeObject(leave);
			objout.close();
			fout.close();
			System.out.println("File Copied Successfully!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}

