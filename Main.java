package Lab;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	private ArrayList<HangHoa> dsHH;
	private TreeMap<String ,HangHoa> map;


	public Main() {
		dsHH = new ArrayList<HangHoa>();
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.Nhap Hang Dien May");
			System.out.println("2.Nhap Hang Thuc Pham");
			System.out.println("3.Nhap Hang Sanh su");
			int lc = sc.nextInt();
			if (lc == 1) {
				HangDienMay hangdienmay = new HangDienMay();
				hangdienmay.nhap();
				dsHH.add(hangdienmay);
				HangDienMay[] hdt=new HangDienMay[1000];
			} else if (lc == 2) {
				HangThucPham hangthucpham = new HangThucPham();
				hangthucpham.nhap();
				dsHH.add(hangthucpham);
				;
			} else if (lc == 3) {
				HangSanhSu hangsanhsu = new HangSanhSu();
				hangsanhsu.nhap();
				dsHH.add(hangsanhsu);	

			} else {
				System.out.println("Nhap khong dung");
			}
			System.out.println("Nhap 0 de thoat:  ");
			int e = sc.nextInt();
			if (e == 0) {
				break;
			}
		}
	}

	public void InDSHang() {

		for(HangHoa x:dsHH) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main();
		while (true) {
			System.out.println("-Nhap lua chon- ");
			System.out.println("1.Nhap Danh Sach");
			System.out.println("2.In danh sach");
			System.out.println("0.Thoat");
			int c = sc.nextInt();
			if (c == 1) {
				m.nhap();
			} 
			else if (c == 2) {
				m.InDSHang();
			}

		}
	}

}
// Gửi bạn xem code của mình ->(Không làm bài mà đòi có ăn á bạn !!!)-ấn vào nó lưu lịch sử xem đó! Thanks!!!
