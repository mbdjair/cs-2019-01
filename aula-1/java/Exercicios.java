/**
 * Created by Djair on 08/04/2019.
 */
public class Exercicios {
    public boolean propriedade3025(int n) {
        if (n > 0 || n < 9999) throw new IllegalArgumentException();
        int i = n / 100;
        int j = n % 100;
        return Math.pow(i + j, 2) == n;
    }

    public boolean propriedade153(int n) {
        if (n < 100 || n > 999) throw new IllegalArgumentException();
        int c = n / 100;
        int du = n % 100;
        int d = du / 10;
        int u = du % 10;
        return Math.pow(c, 3) + Math.pow(d, 3) + Math.pow(u, 3) == n;
    }

    public int diaDaSemana(int d, int m, int a) {
        if (d < 1 || d > 31 || m < 1 || m > 12 || a < 1753) throw new IllegalArgumentException();
        if (m == 1 || m == 2) {
            m = m + 12;
            a--;
        }

        int s = d + 2 * m + 3 * (m + 1) / 5 + a + a / 4 - a / 100 + a / 400;

        return s % 7;
    }

    public int mod(int x, int y) {
        if (y < 0 || x <= 0) throw new IllegalArgumentException();
        int s = x;
        while (y <= s) {
            s -= y;
        }

        return s;
    }

    public int somaNaturais(int n) {
        if (n < 1) throw new IllegalArgumentException();
        int i = 2;
        int s = 1;
        while (i <= n) {
            s += i;
            i++;
        }
        return s;
    }

    public int fatorial(int n) {
        if (n < 1) throw new IllegalArgumentException();
        int i = 2;
        int f = 1;
        while (i <= n) {
            f *= i;
            i++;
        }
        return f;
    }

    public int produto(int a, int b) {
        if (a < 0 || b < 0) throw new IllegalArgumentException();
        int totalParcelas = a;
        int parcela = b;
        if (b < a) {
            totalParcelas = b;
            parcela = a;
        }
        int i = 1;
        int s = 0;
        while (i <= totalParcelas) {
            s += parcela;
            i++;
        }
        return s;
    }

    public int potencia(int x, int y) {
        if (x < 0 || y < 0) throw new IllegalArgumentException();
        int potencia = 1;
        int i = 1;
        while (i <= y) {
            potencia = potencia(potencia, x);
            i++;
        }
        return potencia;
    }

    public double pi(int n) {
        if (n < 1) throw new IllegalArgumentException();
        int i = 1;
        double s = -1;
        double d = -1;
        double p = 0;

        while (i <= n) {
            d += 2;
            s *= -1;
            p += 4 * s / d;
            i++;
        }
        return p;
    }

    public double logaritimoNatural(int n, int k) {
        if (n < 1 || k < 2) throw new IllegalArgumentException();
        int i = 2;
        double e = n + 1;
        double numerador = n;
        double denominador = 1;
        while (i <= k) {
            numerador *= numerador;
            denominador *= i;
            e += numerador / denominador;
            i++;
        }
        return e;
    }

    public double razaoAurea(int x, int y, int k) {
        if (x < 0 || y <= x || k <= 0) throw new IllegalArgumentException();
        double c = y;
        double a = x;
        int i = 1;

        while (i <= k) {
            double t = c;
            c += a;
            a = t;
            i++;
        }

        return c / a;
    }

    public boolean quadradoPerfeito(int n) {
        if (n < 1) throw new IllegalArgumentException();
        int i = 1;
        int s = 1;
        while (s < n) {
            i += 2;
            s += i;
        }
        return s == n;
    }

}
