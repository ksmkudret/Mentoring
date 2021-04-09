package proje01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kutuphane {

	static List<String> ktpA = new ArrayList<>();
	static List<String> yzrA = new ArrayList<>();
	static List<String> yynY = new ArrayList<>();
	static List<String> ktpF = new ArrayList<>();
	static int secim;

	
	public static void main(String[] args) {
		
		listele();
		do {
			
			System.out.println("\nYUKARIDAKİ LİSTEDEN SEÇİM YAP;\n");
			secim();
		} while (secim!=5);
		
		System.out.println("YİNE BEKLEMİYORUZ...");
	}

	private static void listele() {
		System.out.println("============KİTAP PROGRAMI========");
		System.out.println("\n\t1:Kitap Ekle");
		System.out.println("\t2:Numara ile Kitap Sil");
		System.out.println("\t3:Numara ile Kitap Ara");
		System.out.println("\t4:Tüm Kitapları Listele ");
		System.out.println("\t4:Bitir");

	}

	
	private static void secim() {
		Scanner scan = new Scanner(System.in);
		secim = scan.nextInt();
			if(secim==1) kitapEkle();
			if(secim==2) kitapSil();
			if(secim==3) kitapGoster();
			if(secim==4) tumList();
			
	}
	

//--------------------------------------------------------------------------------------------------------------------------------------
	
	private static void kitapEkle() {//1
		Scanner scan = new Scanner(System.in);
		System.out.println("eklemek istediğiniz kitabın;");
		System.out.print("Adı:");
		String ktpAd=scan.nextLine();
		ktpA.add(ktpAd);
		
		System.out.print("Yazar Adı:");
		String yzrAd=scan.nextLine();
		yzrA.add(yzrAd);
		
		System.out.print("Yayın Yılı: ");
		String yynYil= scan.next();
		yynY.add(yynYil);
		
		System.out.print("Kitap Fiyatı: ");
		String fyt=scan.next();
		ktpF.add(fyt);
		
		
	}

//--------------------------------------------------------------------------------------------------------------------------------------

	private static void kitapSil() {//2
		Scanner scan = new Scanner(System.in);
		System.out.println("------------LİSTEDEN SİLMEK İSTEDİĞİN KİTABI SEÇ----------");
		int count=1001;
		
		System.out.println("\nNO:\tİSİM:\t\t\tYAZAR ADI:   \t\t\tYAYIN YILI:  \tFİYATI:");
		System.out.println("------\t------\t\t\t--------\t\t\t------\t\t------");
		
		for (int i = 0; i < ktpA.size(); i++) {
		
			System.out.println(count+"\t"+ ktpA.get(i)+"\t\t\t"+yzrA.get(i)+"\t\t\t\t"+yynY.get(i)+"\t\t"+ktpF.get(i));
			
			count++;
		}
		
		System.out.println("silmek istediğin kitap no gir ");
		int count2=1001;
		
		int silNo=scan.nextInt()-count2;
		
		if(silNo>=0 && silNo<ktpA.size()) {
			ktpA.remove(silNo);
			yzrA.remove(silNo);
			yynY.remove(silNo);
			ktpF.remove(silNo);
			System.out.println("silme işlemi gerçekleşmiştir");
		}else System.out.println("girdiğiniz numara bulunamadı ");
		
	}

//----------------------------------------------------------------------------------------------------------------------------------------
	
	
	private static void kitapGoster() {//3
		Scanner scan = new Scanner(System.in);
		int count=1001;
		int ktpGoster=scan.nextInt()-count;
		
		System.out.println("görmek istediğiniz kitap numarasını giriniz ");
		
		if(ktpGoster>=0 &&ktpGoster<ktpA.size() ) {
			System.out.println("Seçtiğini kitap: " + (ktpGoster+count)+"\t"+ktpA.get(ktpGoster)+"\t"+yzrA.get(ktpGoster)+"\t"+yynY.get(ktpGoster)+"\t"+ktpF.get(ktpGoster));
		}
}
	
//----------------------------------------------------------------------------------------------------------------------------------------

	
	private static void tumList() { //4
		int count=1001;
		System.out.println("\nNO:\tİSİM:\t\t\tYAZAR ADI:   \t\t\tYAYIN YILI:  \tFİYATI:");
		System.out.println("------\t------\t\t\t--------\t\t\t------\t\t------");
		for (int i = 0; i < ktpA.size(); i++) {
		
			System.out.println(count+"\t"+ ktpA.get(i)+"\t\t\t"+yzrA.get(i)+"\t\t\t\t"+yynY.get(i)+"\t\t"+ktpF.get(i));
			
			count++;
		}
		
	
	}

}