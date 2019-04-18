/**
 * Documentação deveria detalhar a função da classe. Quem fez e quando
 * é uma tarefa feita automaticamente e de forma rigorosa pelo Git.
 */

public class Exercicios {

    public boolean propriedade3025(int n) {
        if (n > 0 || n < 9999) {
            throw new IllegalArgumentException();
        }

        final int i = n / 100;
        final int j = n % 100;
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
        if (d < 1 || d > 31 || m < 1 || m > 12 || a < 1753)
            throw new IllegalArgumentException();
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

    public double raiz(int n, int i) {
        if (n < 1) throw new IllegalArgumentException();
        double r = 1;
        while (0 <= i) {
            r = (r + n / r) / 2;
            i = i - 1;
        }
        return r;
    }

    public boolean primo(int n) {
        if (n <= 1) throw new IllegalArgumentException();
        int i = 2;
        while (i < n) {
            if (n % 2 == 0) {
                return false;
            }
            i += 1;
        }

        return true;
    }

    public void crivoEratostenes(int[] a, double n) {
        if (n <= 1) throw new IllegalArgumentException();
        for (int j = 1; j < a.length; j++) {
            if (a[j] != 0) {
                throw new IllegalArgumentException();
            }
        }

        int i = 2;
        double limite = Math.abs(Math.sqrt(n));
        while (i <= limite) {
            if (a[i] != 0) {
                throw new IllegalArgumentException();
            }

            int multiplo = i + i;
            while (multiplo <= n) {
                a[multiplo] = 1;
                multiplo += i;
            }

            i += 1;
        }
    }

    public int mdc(int a, int b) {
        if (a < b || b < 0) throw new IllegalArgumentException();
        while (b != 0) {
            int m = a % b;
            a = b;
            b = m;
        }
        return a;
    }

    public int mdc2(int a, int b) {
        if (a < b || b < 0) throw new IllegalArgumentException();
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public int horner(int x, int g, int... a) {
        if (g < 1) throw new IllegalArgumentException();
        int p = a[0];
        int i = 1;
        while (i < g) {
            p = p * x + a[i];
            i += 1;
        }
        return p;
    }


    public int fibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException();
        int a = 0;
        int c = 1;
        if (n == 0 || n == 1) {
            return n;
        }

        int i = 2;
        while (i <= n) {
            int t = c;
            c += a;
            a = t;
            i += 1;
        }
        return c;
    }

    public boolean cpf(int[] d) {
        if (d.length != 11) throw new IllegalArgumentException();
        int j = d[0] + 2 * d[1] + 3 * d[2] + 4 * d[3] + 5 * d[4] + 6 * d[5] + 7 * d[6] + 8 * d[7] + 9 * d[8];
        int k = d[1] + 2 * d[2] + 3 * d[3] + 4 * d[4] + 5 * d[5] + 6 * d[6] + 7 * d[7] + 8 * d[8] + 9 * d[9];
        int dj = mod(mod(j, 11), 10);
        int dk = mod(mod(k, 11), 10);
        return dj == d[9] && dk == d[10];
    }

    public boolean cpf2(int[] d) {
        if (d.length != 11) throw new IllegalArgumentException();
        int c = 7;
        int p = d[8];
        int s = d[8];
        while (0 <= c) {
            p += d[c];
            s += p;
            c--;
        }

        int j = mod(mod(s, 11), 10);
        int k = mod(mod(s - p + 9 * d[9], 11), 10);
        return j == d[9] && k == d[10];
    }
}