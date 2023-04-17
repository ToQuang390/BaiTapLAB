package Lab;

import java.util.Scanner;

public class HangSanhSu extends HangHoa {
	private String loaiNguyenLieu;

	public HangSanhSu() {
		super();
		this.loaiNguyenLieu = "Com";
	}

	public HangSanhSu(String MaHang, String Tenhang, String Nhasanxuat, int Gia, String loaiNguyenLieu) {
		super(MaHang, Tenhang, Nhasanxuat, Gia);
		this.loaiNguyenLieu = loaiNguyenLieu;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ma Hang:");
		this.maHang = sc.nextLine();
		System.out.println("Ten Hang:");
		this.tenHang = sc.nextLine();
		System.out.println("Nha San Xuat: ");
		this.nhaSanXuat = sc.nextLine();
		System.out.println("Gia: ");
		this.gia = sc.nextInt();
		sc.nextLine();
		System.out.println("Loai Nguyen Lieu:");
		this.loaiNguyenLieu = sc.nextLine();

	}

	public String toString() {
		// TODO Auto-generated method stub
		return "Ma hang:" + this.maHang + "\n" + "Ten hang:" + this.tenHang + "\n" + "Nha san xuat:" + this.nhaSanXuat
				+ "\n" + "Gia:" + this.gia + "Loai nguyen lieu:" + this.loaiNguyenLieu;
	}
}
