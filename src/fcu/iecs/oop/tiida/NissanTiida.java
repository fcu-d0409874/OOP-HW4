package fcu.iecs.oop.tiida;

public class NissanTiida {
	public void tiida(int n) {
		int a, i, j;
		for (a = 1; a <= n; a++) { // LOOP�X��
			for (i = 1; i <= a; i++) { // �X��
				for (j = 0; j < a; j++) { // �L�X��
					System.out.print('*');
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
	}

}
