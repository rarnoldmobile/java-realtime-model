package com.test.example.model;

public class IncomingData {
	public int id;
	public int x;
	public int y;
	
	public IncomingData(int startId, int startX, int startY) {
		id = startId;
		x = startX;
		y = startY;
	}
	
	public void setId(int newValue) {
		id = newValue;
	}
	
	public void setX(int newValue) {
		x = newValue;
	}
	
	public void setY(int newValue) {
		y = newValue;
	}
}
