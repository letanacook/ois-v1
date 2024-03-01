public class Gravitacija {
    public static void main(String[] args) {
        System.out.println("OIS je zakon!");
    }
	public static void izpis(double visina) {
		System.out.printf("Gravitacijski pospesek na %.2f km nadmorske visine je
		%.2f m/s^2\n", visina, izracunGravitacije(visina * 1000));
	}
}
