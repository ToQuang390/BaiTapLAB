package main;

import java.util.Scanner;

public class DuongTron extends Diem {
	private int r;
    Diem tam=new Diem();
    public DuongTron() {
    	super();
    	this.r=0;
    }
	public DuongTron(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}

	public void Nhapdt() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap bán kính r:");
		this.r=sc.nextInt();
		System.out.println("Nhap toa do tâm: ");
		tam.Nhapdiem();
	}
	public void Indt() {
		System.out.println("R:"+this.r);
		System.out.println("Toa do diem tam :");
		tam.InDiem();
	}
	public void ChuVidt() {
		float cv=(float)Math.PI*2*r;
		System.out.println("Chu vi đường tròn="+cv);
		
	}
	public void Dientichdt() {
		float dt=(float)((float)Math.PI*Math.pow(r, 2));
		System.out.println("Diện tích đường tròn ="+dt);
	}
	
	
}
