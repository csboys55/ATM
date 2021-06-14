import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		System.out.println("Tisztelt Felhaszáló! Adja meg a felvenni kívánt \nösszeget! ");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
	
		while ((money % 1000) != 0 || money < 0) { 
			System.out.println("Az Ön által megadott összeg helytelen! \nKérem adjon meg egy helyes összeget!\nAz összeg nem lehet 0 vagy negatív szám, illetve olyan szám, \namely nem osztható 1000 forinttal!");
			                  money = scanner.nextInt();
			                         }
		    if ((money % 1000) == 0 || money > 0) {
		                 System.out.println("Az Ön által megadott összeg: " + money + "Ft" + "\nA megadott összeg az alábbi címletekkel fizethetõ ki: ");
		            }
			                  
		int[] cimletek = {20000, 10000, 5000, 2000, 1000};
		int remaining = money;
		int[] eredmeny;
		int[] pieces = new int[cimletek.length];
		for (int i=0; i<cimletek.length; i++) {
			           pieces[i] = remaining/cimletek[i];
			           remaining= remaining%cimletek[i];	           
			           System.out.println("         - " + pieces[i] + " db " + cimletek[i] + " Ft-os." );
				      }
			           

	}

}
