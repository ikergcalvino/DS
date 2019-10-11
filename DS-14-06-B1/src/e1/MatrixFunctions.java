package e1;

import java.util.*;

public class MatrixFunctions {
	public static int max(int[][] a) {
		int mayor = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > mayor) {
					mayor = a[i][j];
				}
			}
		}
		return mayor;
	}

	public static int rowSum(int[][] a, int row) {
		int sum = 0;
		for (int i = 0; i < a[row].length; i++) {
			sum += a[row][i];
		}
		return sum;
	}

	public static int columnSum(int[][] a, int colum) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i].length > colum) {
				sum += a[i][colum];
			}
		}
		return sum;
	}

	public static int[] allRowSums(int[][] a) {
		int[] rowSum = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			rowSum[i] = 0;
			for (int j = 0; j < a[i].length; j++) {
				rowSum[i] += a[i][j];
			}
		}
		return rowSum;
	}

	public static int[] allColumnSums(int[][] a) {
		int numColumnas = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i].length > numColumnas) {
				numColumnas = a[i].length;
			}
		}
		int[] columnSum = new int[numColumnas];
		for (int i = 0; i < numColumnas; i++) {
			columnSum[i] = columnSum(a, i);
		}
		return columnSum;
	}

	public static boolean isRowMagic(int[][] a) {
		int[] sum;
		sum = allRowSums(a);
		for (int i = 0; i < (sum.length - 1); i++) {
			if (sum[i] != sum[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static boolean isColumnMagic(int[][] a) {
		int[] sum;
		sum = allColumnSums(a);
		for (int i = 0; i < (sum.length - 1); i++) {
			if (sum[i] != sum[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static boolean isSquare(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			if (a.length != a[i].length) {
				return false;
			}
		}
		return true;
	}

	public static boolean isMagic(int[][] a) {
		boolean resultado = false;
		int d1 = 0;
		int d2 = 0;
		int columnas[];
		columnas = allColumnSums(a);
		if (isSquare(a) && isRowMagic(a) && isColumnMagic(a)) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					if ((i + j) == (a.length - 1)) {
						d2 += a[i][j];
					}
					if (i == j) {
						d1 += a[i][j];
					}
				}
			}
			if ((d1 == d2) && (d2 == columnSum(a, 0)) && (rowSum(a, 0) == columnSum(a, 0))) {
				resultado = true;
			}
		}
		return resultado;
	}

	public static boolean isSequence(int[][] a) {
		if (isSquare(a)) {
			int rowSum[];
			int sum = 0;
			int sum2 = 0;
			rowSum = allRowSums(a);
			for (int i = 0; i < rowSum.length; i++) {
				sum = sum + rowSum[i];
			}
			for (int i = (a.length * a.length); i > 0; i--) {
				sum2 = sum2 + i;
			}
			if (sum == sum2) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}