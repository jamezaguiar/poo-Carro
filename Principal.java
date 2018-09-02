import java.util.Scanner;

public class Principal {

	public static Scanner input = new Scanner (System.in);
	public static void main(String args[]) {

		String help = "\t=======================COMANDOS=======================\n" + 
					  "\tin: Adiciona um passageiro ao carro\n" + 
					  "\tout: Retira um passageiro do carro\n" +
					  "\tfuel: Abastece o carro (Indique quantos litros serão abastecidos)\n" + 
					  "\tdrive: Dirige (Indique a kilometragem para ser percorrida)\n" +
					  "\tshow: Mostra passageiros, gasolina e kilometragem.\n" + 
					  "\t======================================================";

		Carro car = new Carro();

		System.out.println("Carro ligado! (Digite help para ver os comandos)");
		car.show();

		while (true) {
			String comando = input.nextLine();

			if(comando.equals("sair")) {
				System.out.println("Desligando carro...");
				break;
			} else {
				String c[] = comando.split(" ");

				switch(c[0]) {
					case "show":
						car.show();
						break;

					case "help":
						System.out.println(help);
						break;

					case "in":
						if (car.in()) {
							System.out.println("done");
						} else {
							System.out.println("fail: limite de pessoas atingido");
						}
						break;

					case "out":
						if (car.out()) {
							System.out.println("done");
						} else {
							System.out.println("fail: não há ninguém no carro");
						}
						break;

					case "fuel":
						car.fuel(Double.parseDouble(c[1]));
						break;

					case "drive":
						car.drive(Double.parseDouble(c[1]));
						break;
				}
			}
		}
	}
}