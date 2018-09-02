public class Carro {

	public int passageiros = 0;
	public double gasolina = 0.0, kms = 0.0;

	public final int passageirosMax = 2;
	public final double gasolinaMax = 10;

	public void show() {
		System.out.println("Passageiros: " + passageiros + "\t" + "Gasolina: " + gasolina + "\t" + "Kilometragem: " + kms);
	}

	public boolean in() {
		boolean r;
		if (this.passageiros<passageirosMax) {
			this.passageiros++;
			r = true;
		} else {
			r = false;
		}
	return r;
	}

	public boolean out() {
		boolean r;
		if (this.passageiros<=passageirosMax && this.passageiros>0) {
			this.passageiros--;
			r = true;
		} else {
			r = false;
		}
	return r;
	}

	public void fuel(double f) {
		if (this.gasolina<gasolinaMax) {
			this.gasolina+=f;
			if (this.gasolina>gasolinaMax) {
				this.gasolina = gasolinaMax;
			}
		System.out.println("done");
		}
	}

	public boolean drive(double d) {
		boolean r;
		double gg = this.gasolina - (d/gasolinaMax);
		if (passageiros>0) {
			if (gg>=0) {
			this.kms += d;
			this.gasolina = gg;
			System.out.println("done");
			r = true;
			} else {
				System.out.println("fail: gasolina insuficiente");
				r = false;
			}
		} else {
			System.out.println("fail: não há ninguém no carro");
			r = false;
		}
	return r;
	} 
}