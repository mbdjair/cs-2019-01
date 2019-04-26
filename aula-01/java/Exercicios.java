/**
 * Classe que engloba todos os objetos de exercícios da aula01
 */

public class Exercicios {

    public boolean propriedade3025(final int n) {
        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("O valor de \"n\" é inválido");
        }

        final int i = n / 100;
        final int j = n % 100;

        return Math.pow(i + j, 2) == n;
    }

    public boolean propriedade153(final int n) {
        if (n < 100 || n > 999) {
            throw new IllegalArgumentException("O valor de \"n\" é inválido");
        }

        final int c = n / 100;
        final int du = n % 100;
        final int d = du / 10;
        final int u = du % 10;

        return Math.pow(c, 3) + Math.pow(d, 3) + Math.pow(u, 3) == n;
    }

    public int diaDaSemana(final int dia, final int mes, final int ano) {
        if (isDiaInvalido(dia)) {
            throw new IllegalArgumentException("dia inválido");
        }

        if (isMesInvalido(mes)) {
            throw new IllegalArgumentException("mes inválido");
        }

        if (isAnoInvalido(ano)) {
            throw new IllegalArgumentException("ano invalido");
        }

        if (isDataInvalida(dia, mes, ano)) {
            throw new IllegalArgumentException("data inválida");
        }

        int m = mes;
        int a = ano;
        if (m == 1 || m == 2) {
            m = m + 12;
            a--;
        }

        int s = dia + 2 * m + 3 * (m + 1) / 5 + a + a / 4 - a / 100 + a / 400;

        return s % 7;
    }

    private boolean isDiaInvalido(int d) {
        return d < 1 || d > 31;
    }

    boolean isAnoBissexto(final int ano) {
        return ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0;
    }

    private boolean isDataInvalida(final int d, final int m, final int a) {
        if (m == 2) {
            if (isAnoBissexto(a)) {
                return d < 1 || d > 29;
            }

            return d < 1 || d > 28;
        }

        if (m == 4 || m == 6 || m == 9 || m == 11) {
            return d < 1 || d > 30;
        }

        return d < 1 || d > 31;
    }


    private boolean isMesInvalido(final int m) {

        return m < 1 || m > 12;
    }

    private boolean isAnoInvalido(final int a) {

        return a < 1753;
    }

    public int mod(final int x, final int y) {
        if (y < 0) {
            throw new IllegalArgumentException("valor de y inválido");
        }

        if (x <= 0) {
            throw new IllegalArgumentException("valor de x inválido");
        }

        int s = x;
        while (s >= y) {
            s = s - y;
        }

        return s;
    }

    public int somaNaturais(final int n) {
        if (n < 1) {
            throw new IllegalArgumentException("valor de n inválido");
        }

        int i = 2;
        int s = 1;
        while (i <= n) {
            s = s + i;
            i = i + 1;
        }

        return s;
    }

    public int fatorial(final int n) {
        if (n < 1) {
            throw new IllegalArgumentException("valor de n inválido");
        }

        int i = 2;
        int f = 1;
        while (i <= n) {
            f = f * i;
            i = i + 1;
        }

        return f;
    }

    public int produto(final int a, final int b) {
        if (a < 0) {
            throw new IllegalArgumentException("valor de a inválido");
        }

        if (b < 0) {
            throw new IllegalArgumentException("valor de b inválido");
        }

        final boolean bMenorA = b < a;
        final int totalParcelas = !bMenorA ? a : b;
        int parcela = !bMenorA ? b : a;
        int i = 1;
        int s = 0;
        while (i <= totalParcelas) {
            s += parcela;
            i++;
        }

        return s;
    }

    public int potencia(final int x, final int y) {
        if (x < 0) {
            throw new IllegalArgumentException("valor de x inválido");
        }

        if (y < 0) {
            throw new IllegalArgumentException("valor de y inválido");
        }

        int potencia = 1;
        int i = 1;
        while (i <= y) {
            potencia = produto(potencia, x);
            i = i + 1;
        }

        return potencia;
    }

    public double pi(final int n) {
        if (n < 1) {
            throw new IllegalArgumentException("valor de n inválido");
        }

        int i = 1;
        double s = -1;
        double d = -1;
        double p = 0;

        while (i <= n) {
            d = d + 2;
            s = s * -1;
            p = p + (4 * s) / d;
            i = i + 1;
        }

        return p;
    }

    public double logaritimoNatural(final int n, final int k) {
        if (n < 1) {
            throw new IllegalArgumentException("valor de n inválido");
        }

        if (k < 2) {
            throw new IllegalArgumentException("valor de k inválido");
        }

        int i = 2;
        double e = n + 1;
        double numerador = n;
        double denominador = 1;
        while (i <= k) {
            numerador = numerador * numerador;
            denominador = denominador * i;
            e = e + numerador / denominador;
            i = i + 1;
        }

        return e;
    }

    public double razaoAurea(final int x, final int y, final int k) {
        if (x < 0) {
            throw new IllegalArgumentException("valor de x inválido");
        }

        if (y <= x) {
            throw new IllegalArgumentException("y deve ser menor que x");
        }

        if (k <= 0) {
            throw new IllegalArgumentException("valor de k inválido");
        }

        double c = y;
        double a = x;
        int i = 1;
        while (i <= k) {
            double t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }

        return c / a;
    }

    public boolean quadradoPerfeito(final int n) {
        if (n < 1) {
            throw new IllegalArgumentException("valor de n inválido");
        }

        int i = 1;
        int s = 1;
        while (s < n) {
            i = i + 2;
            s = s + i;
        }

        return s == n;
    }

    public double raiz(final int n, final int j) {
        if (n < 1) {
            throw new IllegalArgumentException("valor de n inválido");
        }

        int i = j;
        double r = 1;
        while (0 <= i) {
            r = (r + n / r) / 2;
            i = i - 1;
        }

        return r;
    }

    public boolean primo(final int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("valor de n inválido");
        }

        int i = 2;
        while (i < n) {
            if (n % 2 == 0) {
                return false;
            }

            i = i + 1;
        }

        return true;
    }

    public void crivoEratostenes(final int[] a, final double n) {
        if (n <= 1) {
            throw new IllegalArgumentException("valor de n deve ser maior que 1");
        }

        if (a == null) {
            throw new IllegalArgumentException("a não pode ser nulo");
        }

        if (a.length != n) {
            throw new IllegalArgumentException("n deve ser o tamanho do vetor a");
        }

        for (int j = 0; j < a.length; j++) {
            if (a[j] != 0) {
                throw new IllegalArgumentException("não são permitidos elemento diferentes de 0 como a[" + j + "]");
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
                multiplo = multiplo + i;
            }

            i = i + 1;
        }

    }

    public int mdc(final int m, final int n) {
        if (m < n) {
            throw new IllegalArgumentException("O valor de a deve ser maior ou igual a b");
        }

        if (n < 0) {
            throw new IllegalArgumentException("O valor de b deve ser maior ou igual a 0");
        }

        int a = m;
        int b = n;
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }

        return a;
    }

    public int mdc2(final int m, final int n) {
        if (m < n) {
            throw new IllegalArgumentException("O valor de a deve ser maior ou igual a b");
        }

        if (n < 0) {
            throw new IllegalArgumentException("O valor de b deve ser maior ou igual a 0");
        }

        int a = m;
        int b = n;
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }

        }

        return a;
    }

    public int horner(final int x, final int g, final int... a) {
        if (g < 1) {
            throw new IllegalArgumentException("o valor de g deve ser maior ou igual a 1");
        }

        if (a == null) {
            throw new IllegalArgumentException("o valor de a não pode ser null");
        }

        int p = a[0];
        int i = 1;
        while (i < g) {
            p = p * x + a[i];
            i = i + 1;
        }

        return p;
    }


    public int fibonacci(final int n) {
        if (n < 0) {
            throw new IllegalArgumentException("o valor de n deve ser maior ou igual a 0");
        }

        int a = 0;
        int c = 1;
        if (n == 0 || n == 1) {
            return n;
        }

        int i = 2;
        while (i <= n) {
            int t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }

        return c;
    }

    public boolean cpf(final int[] d) {
        if (d.length != 11) {
            return false;
        }

        int j = d[0] + 2 * d[1] + 3 * d[2] + 4 * d[3] + 5 * d[4] + 6 * d[5] + 7 * d[6] + 8 * d[7] + 9 * d[8];
        int k = d[1] + 2 * d[2] + 3 * d[3] + 4 * d[4] + 5 * d[5] + 6 * d[6] + 7 * d[7] + 8 * d[8] + 9 * d[9];
        int dj = mod(mod(j, 11), 10);
        int dk = mod(mod(k, 11), 10);

        return dj == d[9] && dk == d[10];
    }

    public boolean cpf2(final int[] d) {
        if (d.length != 11) {
            return false;
        }

        int c = 7;
        int p = d[8];
        int s = d[8];
        while (0 <= c) {
            p = p + d[c];
            s = s + p;
            c = c - 1;
        }

        int j = mod(mod(s, 11), 10);
        int k = mod(mod(s - p + 9 * d[9], 11), 10);

        return j == d[9] && k == d[10];
    }
}