//13020200039_Nuralam_sabtu/19 maret jam 04.30
import java.util.Scanner;

class Waktu{
	public static void main(String [] args){
		Scanner masukan = new Scanner(System.in);
		
		int jam, menit, detik, konversi;

		System.out.print("Masukkan Detik yang ingin Dikonversi : ");
		konversi = masukan.nextInt();

		jam = konversi/3600;
		menit = (konversi%3600)/60;
		detik = (konversi%3600)%60;

		System.out.println("konversi dari : "+ konversi + " detik, adalah : ");
		System.out.println(jam+" jam : "+menit+"menit : "+detik+"detik");	
	}
}