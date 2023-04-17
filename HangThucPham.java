package Lab;

import java.util.Scanner;

public class HangThucPham extends HangHoa {
	private NgayThang ngaySanXuat;
	private NgayThang ngayHetHan;

	public HangThucPham() {
		ngaySanXuat = new NgayThang();
		ngayHetHan = new NgayThang();

	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ma hang:");
		this.maHang = sc.nextLine();
		System.out.println("Ten hang:");
		this.tenHang = sc.nextLine();
		System.out.println("Nha San Xuat:");
		this.nhaSanXuat = sc.nextLine();
		System.out.println("Gia:");
		this.gia = sc.nextInt();
		System.out.println("-Nhap ngay San Xuat-");
		ngaySanXuat.Nhap();
		System.out.println("-Nhap Ngay Het Han-");
		ngayHetHan.Nhap();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ma hang" + this.maHang + "\n" + "Ten hang" + this.tenHang + "\n" + "Nha San Suat" + this.nhaSanXuat
				+ "\n" + "Gia:" + this.gia + "\n" + "Ngay San Xuat:" + ngaySanXuat + "Ngay Het Han" + ngayHetHan;
	}

}
