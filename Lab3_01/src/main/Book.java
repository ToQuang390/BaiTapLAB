package main;

import java.util.Scanner;

public class Book {
	private String ma;
	private String ten;
	private String tg;
	private int Trang;
	private int tap;
	private int gia;

	public Book() {

	}

	public Book(String ma, String ten, String tg, int trang, int tap, int gia) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.tg = tg;
		Trang = trang;
		this.tap = tap;
		this.gia = gia;
	}

	public void AddBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ma:");
		String ma = sc.nextLine();
		System.out.println("Ten:");
		String ten = sc.nextLine();
		System.out.println("Tac gia:");
		String tg = sc.nextLine();
		System.out.println("Trang:");
		int trang = sc.nextInt();
		System.out.println("Tap:");
		int tap = sc.nextInt();
		System.out.println("Gia:");
		int gia = sc.nextInt();
	}

	public void insach() {
		System.out.println("Ma: " + this.ma + "\t" + "ten: " + this.ten + "tg: " + this.tg + "Trang: " + this.Trang
				+ "tap: " + this.tap + "gia: " + this.gia);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
   Book book =new Book();
   int vt=0;
   Book [] Arrbook=new Book[10];
   while(true) {
	   book.AddBook();
	   Arrbook[vt]=book;
	   vt++;
	   System.out.println("Bấm y de tiep tuc");
	   String y=sc.nextLine();
	   if(y==y) {
		   break;
	   }
	   	
		}
   System.out.println("Danh sach cuon sach: ");
   for(int i=0;i<vt;i++) {
	   System.out.println(Arrbook[i]);
   }
	}
}
