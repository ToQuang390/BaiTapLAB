package main;

import java.util.Scanner;

public class Diem {
    int x,y;
  public Diem() {
	  
  }
	public Diem(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public void Nhapdiem() {
		Scanner sc=new Scanner(System.in);
		System.out.println("x=");
		int x1=sc.nextInt();
		this.x=x1;
		System.out.println("y=");
		int y1=sc.nextInt();
		this.y=y1;
	}
	public void InDiem() {
		System.out.println("x="+this.x+"\t"+"y="+this.y);
	}
}

