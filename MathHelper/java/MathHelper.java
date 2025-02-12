package MathHelper.java;

public class MathHelper {
    public boolean maior;

    public MathHelper() {
    }

    public static int numeroSeguinte(int numero) {
        return numero + 1;
    }

    public static double soma(double v1, double v2) {
        return v1 + v2;
    }

    public static double subtracao(double v1, double v2) {
        return v1 - v2;
    }

    public static double multiplicacao(double v1, double v2) {
        return v1 * v2;
    }

    public static double divisao(double v1, double v2) {
        return v1 / v2;
    }

    public static double media(double v1, double v2) {
        return (v1 + v2) / 2.0;
    }

    public static String juntarNome(String nome, String apelido) {
        return nome + " " + apelido;
    }

    public static int maior(int[] numeros) {
        int nmaior = 0;
        int[] var2 = numeros;
        int var3 = numeros.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int numero = var2[var4];
            if (nmaior < numero) {
                nmaior = numero;
            }
        }

        return nmaior;
    }
}