package main;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tamgiac tamgiac = new Tamgiac();
		DuongTron Dgtron = new DuongTron();
		int lc = 0;
		while (true) {

			System.out.println("-------Menu-------- ");
			System.out.println("1.Nhập điểm tam giác");
			System.out.println("2.InDiemTamgiac");
			System.out.println("3.Kiemtra()");
			System.out.println("4,Chuvitamgiac");
			System.out.println("5.DienTichtamGiac");
			System.out.println("6.Nhập đường tròn");
			System.out.println("7.In đường tròn");
			System.out.println("8.Chu vi đường tròn");
			System.out.println("9.Diện tích đường tròn");
			System.out.println("0.Thoát");
			System.out.println("Nhập lựa chọn");
			lc = sc.nextInt();
			sc.nextLine();
			switch (lc) {
			case 1:
				tamgiac.NhapDiemTamGiac();
				break;
			case 2:
				tamgiac.InDiemTamgiac();
				break;
			case 3:
				tamgiac.Kiemtra();
				break;
			case 4:
				tamgiac.Chuvitamgiac();
				break;
			case 5:
				tamgiac.DienTichtamGiac();
				break;
			case 6:
				Dgtron.Nhapdt();
				break;
			case 7:
				Dgtron.Indt();
				break;
			case 8:
				Dgtron.ChuVidt();
				break;
			case 9:
				Dgtron.Dientichdt();
				break;
			case 0:
				break;
			default:
				System.out.println("Nhập lại");
			}
		}
	}

}
