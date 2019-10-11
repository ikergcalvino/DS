package e2;

public class Polymers {

	public static String processPolymer(String polymer) {
		StringBuilder poly = new StringBuilder();
		poly.append(polymer);
		if (polymer == null) {
			throw new IllegalArgumentException();
		} else {
			for (int i = 1; i < poly.length(); i++) {
				if (poly.charAt(i) + 32 == poly.charAt(i - 1) || poly.charAt(i) - 32 == poly.charAt(i - 1)) {
					poly.deleteCharAt(i);
					poly.deleteCharAt(i - 1);
					i = 0;
				}
			}
		}
		return poly.toString();
	}

	public static char minProcessedPolymer(String polymer) {
		char minmono = 'a';
		String cpoly = polymer;
		String minpoly = polymer;
		if (polymer == null || polymer == "") {
			throw new IllegalArgumentException();
		} else {
			char[] mono = {	'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z' };
			for (int i = 0; i < 26; i++) {
				cpoly = polymer;
				cpoly = cpoly.replace(mono[i], ' ');
				cpoly = cpoly.replace(mono[i + 26], ' ');
				StringBuilder poly = new StringBuilder();
				poly.append(cpoly);
				for (int j = 0; j < poly.length(); j++) {
					if (poly.charAt(j) == ' ') {
						poly.deleteCharAt(j);
						j = j - 1;
					}
				}
				cpoly = poly.toString();
				cpoly = processPolymer(cpoly);
				if (cpoly.length() < minpoly.length()) {
					minpoly = cpoly;
					minmono = mono[i];
				}
				if (cpoly.length() == minpoly.length()) {
					if (mono[i] < minmono) {
						minmono = mono[i];
					}
				}
			}
		}
		return minmono;
	}
}