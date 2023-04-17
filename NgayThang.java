package Lab;

import java.util.Scanner;

public class NgayThang {
	private int ngay;
	private int thang;
	private int nam;

	public NgayThang() {
		this.ngay = 1;
		this.thang = 1;
		this.nam = 1;
	}

	public NgayThang(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ngay:");
		this.ngay = sc.nextInt();
		System.out.println("Nhap thang:");
		this.thang = sc.nextInt();


		System.out.println("Nhap nam: ");
		this.nam =sc.nextInt();

	}

	public String toString() {
		// TODO Auto-generated method stub
		return "Ngay=" + this.getNgay() + "Thang=" + this.getNgay() + "Nam=" + this.getNam();
	}

}
