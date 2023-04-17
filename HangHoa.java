package Lab;

import java.util.Scanner;

public class HangHoa {
	protected String maHang;
	protected String tenHang;
	protected String nhaSanXuat;
	protected int gia;

	public HangHoa() {
		this.maHang = "Null";
		this.tenHang = "Null";
		this.nhaSanXuat = "Null";
		this.gia = 0;
	}

	public HangHoa(String maHang, String tenHang, String nhaSanXuat, int gia) {

		this.maHang = maHang;
		this.tenHang = tenHang;
		this.nhaSanXuat = nhaSanXuat;
		this.gia = gia;
	}

	public String getMaHang() {
		return maHang;
	}

	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public String getNhaSanXuat() {
		return nhaSanXuat;
	}

	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}

	public int getGia() {
		return gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ma Hang: ");
		this.maHang = sc.nextLine();
		System.out.println("Ten hang:");
		this.tenHang = sc.nextLine();
		System.out.println("Nha san xuat");
		this.nhaSanXuat = sc.nextLine();
		System.out.println("Gia");
		this.gia = sc.nextInt();
	}

	public String toString() {
		// TODO Auto-generated method stub
		return "Ma hang=" + this.maHang + "\t" + "Ten hang" + this.tenHang + "\t" + "Nha san xuat" + this.nhaSanXuat
				+ "\t" + "Gia" + this.gia;
	}

}
