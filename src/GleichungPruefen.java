public class GleichungPruefen {

    public static void main(String[] args) {
        int gültigeBelegungen = 0;

        // Alle kombinationen von A bis H (jeweils 0 bis 9) 

        // prüfen wenn fehlerhaft bei gueltige / gültigeBelegungen!
        for (int A = 0; A <= 9; A++) {
            for (int B = 0; B <= 9; B++) {
                for (int C = 0; C <= 9; C++) {
                    for (int D = 0; D <= 9; D++) {
                        for (int E = 0; E <= 9; E++) {
                            for (int F = 0; F <= 9; F++) {
                                for (int G = 0; G <= 9; G++) {
                                    for (int H = 0; H <= 9; H++) {

                                        int ab = 10 * A + B;
                                        int cd = 10 * C + D;
                                        int ef = 10 * E + F;
                                        int gh = 10 * G + H;

                                        if (ab + cd == ef + gh) {
                                            gültigeBelegungen++;
                                            // optonal: Ausgabe der Lösungen - ggf. mit modulo??? prüfen!
                                            // System.out.printf("A=%d B=%d C=%d D=%d E=%d F=%d G=%d H=%d\n", A, B, C, D, E, F, G, H);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
//Ausgabe vom Gesamtergebnis:
        System.out.println("Anzahl gültiger Belegungen: " + gültigeBelegungen);
    }
}
