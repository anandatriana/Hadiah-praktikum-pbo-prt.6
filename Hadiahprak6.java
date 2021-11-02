import java.util.Scanner;

class pln{
	Scanner input = new Scanner(System.in);
	String nama, alamat;
	char blok;
	int tipe;
	double bayar,harga,kembalian;
	
	void data(){
		System.out.print("Nama : ");
		nama = input.nextLine();
		System.out.print("Alamat : ");
		alamat = input.nextLine();
		System.out.print("Blok(A/B) : ");
		blok = input.next().charAt(0);
		System.out.print("Tipe Rumah(36/37) : ");
		tipe = input.nextInt();
	
	}
	
	void harga(){
		if(tipe==36){
			if(blok=='A'){
				harga=500000;
				System.out.println("Harga = Rp. "+harga);
			} else if(blok=='B'){ 
				harga=300000;
				System.out.println("Harga = Rp. "+harga);
			} else {
				System.out.println("Salah Input Ki !!!!!");
			}
		} else if(tipe==37){
			if(blok=='A'){
				harga=800000;
				System.out.println("Harga = Rp. "+harga);
			} else if(blok=='B'){ 
				harga=600000;
				System.out.println("Harga = Rp. "+harga);
			} else {
				System.out.println("Salah Input ki !!!!!");
			}
		} else {
			System.out.println("Salah Input Ki !!!!!");
		}
	} 

	double bayar(){
		System.out.print("Bayar = Rp. ");
		bayar=input.nextDouble();
		return kembalian=bayar-harga;
	}
}

public class Hadiahprak6{
	public static void main (String[] args){
		pln listrik = new pln();
		listrik.data();
		listrik.harga();
		System.out.println("Kembalian = Rp. " +listrik.bayar());
	}
}