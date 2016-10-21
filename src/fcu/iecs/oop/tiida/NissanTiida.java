package fcu.iecs.oop.tiida;

public class NissanTiida {
	public void tiida(int n) {
		int a, i, j;
		for (a = 0; a <= n; a++)
			for (i = 1; i < n; i++) {
				for (j = 1; j < a; j++) {
					System.out.print('*');
				}
				System.out.print("\n");
			}
	}

}
