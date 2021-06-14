import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		System.out.println("Tisztelt Felhasz�l�! Adja meg a felvenni k�v�nt \n�sszeget! ");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
	
		while ((money % 1000) != 0 || money < 0) { 
			System.out.println("Az �n �ltal megadott �sszeg helytelen! \nK�rem adjon meg egy helyes �sszeget!\nAz �sszeg nem lehet 0 vagy negat�v sz�m, illetve olyan sz�m, \namely nem oszthat� 1000 forinttal!");
			                  money = scanner.nextInt();
			                         }
		    if ((money % 1000) == 0 || money > 0) {
		                 System.out.println("Az �n �ltal megadott �sszeg: " + money + "Ft" + "\nA megadott �sszeg az al�bbi c�mletekkel fizethet� ki: ");
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
