package nhat;
import java.util.Enumeration;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Vector;
public class banlaptopManagement {
	Vector list =new Vector();
	public banlaptopManagement(){
		while(true) {
			System.out.println("quan li laptop");
			System.out.println("1.Nhap ");
			System.out.println("2. xem ");
			int n;
			Scanner key =new Scanner(System.in);
			System.out.println("moi ban chon chuc nang");
			n =key.nextInt();
			switch (n) {
			case 1: NhapTT();
			break;
			case 2: InTT();
			break;}
		
	}
		
	}
	public void NhapTT() {
		Scanner key = new Scanner(System.in);
		int sl;
		System.out.println("Nhap so luong laptop=");
		sl =Integer.parseInt(key.nextLine());
		for(int i=1;i<sl;i++) {
			System.out.println("Nhap ma =");
			String mahang=key.nextLine();
			System.out.println("Nhap ten : ");
			String tenhang=key.nextLine();
			System.out.println("Nhap so luong: ");
			int soluong=Integer.parseInt(key.nextLine());
			System.out.println("don gia: ");
			int dongia=Integer.parseInt(key.nextLine());
			System.out.println("he dieu hanh: ");
			String hang=key.nextLine();
			
			banlaptop b = new banlaptop(mahang,tenhang,soluong,dongia,hang);
list.add(b);}
		
	}
	public void InTT() {
		Enumeration top = list.elements();
		int i=1;
		while(top.hasMoreElements()) {
			banlaptop laptop = (banlaptop)top.nextElement();
System.out.println ("Ma  ="+laptop.getMahang()+"  ten mat hang  la "+laptop.getTenhang()+"gia la:"+laptop.getDongia()+"so luong :"+laptop.getSoluong());
	}}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new banlaptopManagement();
}
	}