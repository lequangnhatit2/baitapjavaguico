package nhat;

public class banlaptop {
	String mahang;
	String tenhang;
	int dongia;
	int soluong;
	String hang;
	public String getMahang() {
		return mahang;
	}
	public void setMahang(String mahang) {
		this.mahang = mahang;
	}
	public String getTenhang() {
		return tenhang;
	}
	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}
	public int getDongia() {
		return dongia;
	}
	public void setDongia(int dongia) {
		this.dongia = dongia;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public String getHang() {
		return hang;
	}
	public void setHang(String hang) {
		this.hang = hang;
	}
	public banlaptop (String mahang,String tenhang,int dongia,int soluong,String hang) {
		this.mahang=mahang;
		this.tenhang=tenhang;
		this.dongia=dongia;
		this.soluong=soluong;
		this.hang=hang;
	}

}
