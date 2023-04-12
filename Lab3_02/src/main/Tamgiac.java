package main;

public class Tamgiac extends Diem {
	Diem A=new Diem();
	Diem B=new Diem();
	Diem C=new Diem();
	public Tamgiac() {
		
	}
	public void NhapDiemTamGiac() {
		System.out.println("Tọa đô điểm A: ");
		A.Nhapdiem();
		System.out.println("Tọa đô điểm B: ");
		B.Nhapdiem();
		System.out.println("Tọa đô điểm C: ");
		C.Nhapdiem();
	}

	public void InDiemTamgiac() {
		System.out.println("Tọa đô điểm A: ");
		A.InDiem();
		System.out.println("Tọa đô điểm B: ");
		B.InDiem();
		System.out.println("Tọa đô điểm C: ");
		C.InDiem();
	}

	public boolean Kiemtra() {
		if (A.x != B.x || A.x != C.x || B.x != C.x || A.y != B.y || A.y != C.y || B.y != C.y) {
			// Kiểm tra xem tọa độ 3 điểm có hợp lệ không
			double ab = Math.sqrt(Math.pow(B.x - A.x, 2) + Math.pow(B.y - A.y, 2));
			double bc = Math.sqrt(Math.pow(C.x - B.x, 2) + Math.pow(C.y - B.y, 2));
			double ca = Math.sqrt(Math.pow(A.x - C.x, 2) + Math.pow(A.y - C.y, 2));

			if (ab + bc > ca && bc + ca > ab && ca + ab > bc) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public void Chuvitamgiac() {
		if (A.x != B.x || A.x != C.x || B.x != C.x || A.y != B.y || A.y != C.y || B.y != C.y) {
			double ab = Math.sqrt(Math.pow(B.x - A.x, 2) + Math.pow(B.y - A.y, 2));
			double bc = Math.sqrt(Math.pow(C.x - B.x, 2) + Math.pow(C.y - B.y, 2));
			double ca = Math.sqrt(Math.pow(A.x - C.x, 2) + Math.pow(A.y - C.y, 2));
			double chuvi = ab + bc + ca;
			if (ab + bc > ca && bc + ca > ab && ca + ab > bc) {
				System.out.println("Chu vi tam giác : " + chuvi);
			} else
				System.out.println("Không tính được chu vi");
		}
	}

	public void DienTichtamGiac() {
		if (A.x != B.x || A.x != C.x || B.x != C.x || A.y != B.y || A.y != C.y || B.y != C.y) {
			double ab = Math.sqrt(Math.pow(B.x - A.x, 2) + Math.pow(B.y - A.y, 2));
			double bc = Math.sqrt(Math.pow(C.x - B.x, 2) + Math.pow(C.y - B.y, 2));
			double ca = Math.sqrt(Math.pow(A.x - C.x, 2) + Math.pow(A.y - C.y, 2));
			double p = (ab + bc + ca) / 2;
			double S = Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));
			if (ab + bc > ca && bc + ca > ab && ca + ab > bc) {
				System.out.println("Diện tích tam giác : " + S);
			} else
				System.out.println("Không tính được diện tích");
		}
	}

}
