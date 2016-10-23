package fcu.iecs.oop.tiida;

public class NissanTiida {
	public void tiida(int n) {
		int a, i, j;
		for (a = 1; a <= n; a++) { // LOOP幾次
			for (i = 1; i <= a; i++) { // 幾行
				for (j = 0; j < a; j++) { // 印幾個
					System.out.print('*');
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
	}

}
