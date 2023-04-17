package Lab;

import java.util.Scanner;

public class HangDienMay extends HangHoa {
	private String thoiGianBaoHang;
	private String dienAp;
	private String congSuat;

	public HangDienMay() {
		super();
		this.thoiGianBaoHang = "null";
		this.dienAp = "null";
		this.congSuat = "null";

	}

	public HangDienMay(String maHang, String tenHang, String nhaSanXuat, int gia, String thoiGianBaoHang, String dienAp,
			String congSuat) {
		super(maHang, tenHang, nhaSanXuat, gia);
		this.thoiGianBaoHang = thoiGianBaoHang;
		this.dienAp = dienAp;
		this.congSuat = congSuat;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ma Hang:");
		this.maHang = sc.nextLine();
		System.out.println("Ten Hang: ");
		this.tenHang = sc.nextLine();
		System.out.println("Nha San Xuat: ");
		this.nhaSanXuat = sc.nextLine();
		System.out.println("Gia: ");
		this.gia = sc.nextInt();
		sc.nextLine();
		System.out.println("Thoi gian bao hang:");
		this.thoiGianBaoHang = sc.nextLine();
		System.out.println("Dien ap: ");
		this.dienAp = sc.nextLine();
		System.out.println("Cong suat: ");
		this.congSuat = sc.nextLine();
	}

	public String toString() {
		// TODO Auto-generated method stub
		return "Ma hang" + this.maHang + "\n" + "Ten hang" + this.tenHang + "\n" + "Nha San Suat" + this.nhaSanXuat
				+ "\n" + "Gia:" + this.gia + "\n" + "Thoi gian bao hanh:" + this.thoiGianBaoHang + "\n" + "Dien Ap"
				+ this.dienAp + "\n" + "Cong suat:" + this.congSuat;
	}

}
