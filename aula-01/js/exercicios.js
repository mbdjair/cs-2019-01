function mdc(m, n) {
    if (typeof m !== "number") {
        throw new TypeError("Tipo errado para o argumento m");
    }

    if (typeof n !== "number") {
        throw new TypeError("Tipo errado para o argumento n");
    }

    if (m < n) {
        throw new TypeError("Tipo errado para o argumento m");
    }

    if (n < 0) {
        throw new TypeError("Tipo errado para o argumento n");
    }

    let a = m;
    let b = n;
    while (b !== 0) {
        const t = a % b;
        a = b;
        b = t;
    }

    return a;
}

function primo(n) {
    if (typeof n !== "number") {
        throw new TypeError("Tipo errado para o argumento n");
    }

    if (n <= 1) {
        throw new RangeError("Argumento n fora do intervalo");
    }

    let i = 2;
    while (i < n) {
        if (n % 2 === 0) {
            return false;
        }

        i = i + 1;
    }

    return true;
}

function mdc2(m, n) {
    if (typeof m !== "number") {
        throw new TypeError("Tipo errado para o argumento m");
    }

    if (typeof n !== "number") {
        throw new TypeError("Tipo errado para o argumento n");
    }

    if (m < n) {
        throw new TypeError("Tipo errado para o argumento m");
    }

    if (n < 0) {
        throw new TypeError("Tipo errado para o argumento n");
    }

    let a = m;
    let b = n;
    while (a !== b) {
        if (a > b) {
            a = a - b;
        } else {
            b = b - a;
        }
    }

    return a;
}

function mod(x, y) {
    if (typeof x !== "number") {
        throw new TypeError("Tipo inválido para argumento x");
    }

    if (typeof y !== "number") {
        throw new TypeError("Tipo inválido para argumento y");
    }

    if (y < 0) {
        throw new RangeError("Argumento y fora do intervalo");
    }

    if (x <= 0) {
        throw new RangeError("Argumento x fora do intervalo");
    }

    let s = x;
    while (s >= y) {
        s = s - y;
    }

    return s;
}

function produto(a, b) {
    if (typeof a !== "number") {
        throw new TypeError("Tipo errado para o argumento a");
    }


    if (typeof b !== "number") {
        throw new TypeError("tipo errado para o argumento b");
    }

    if (a < 0) {
        throw new RangeError("Argumento a fora do intervalo");
    }
    if (b < 0) {
        throw new RangeError("Argumento b fora do intervalo");
    }

    const bMenorA = b < a;
    const totalParcelas = !bMenorA ? a : b;
    const parcela = !bMenorA ? b : a;
    let i = 1;
    let s = 0;
    while (i <= totalParcelas) {
        s += parcela;
        i++;
    }

    return s;
}

function pi(n) {
    if (typeof n !== "number") {
        throw new TypeError("Tipo errado para o argumento n");
    }

    if (n < 1) {
        throw new RangeError("Argumento n fora do intervalo");
    }

    let i = 1;
    let s = -1;
    let d = -1;
    let p = 0;

    while (i <= n) {
        d = d + 2;
        s = s * -1;
        p = p + (4 * s) / d;
        i = i + 1;
    }

    return p;
}

function potencia(x, y) {
    if (typeof x !== "number") {
        throw new TypeError("Tipo errado para o argumento x");
    }

    if (typeof y !== "number") {
        throw new TypeError("Tipo errado para o argumento y");
    }

    if (x < 0) {
        throw new RangeError("Argumento x fora do intervalo");
    }

    if (y < 0) {
        throw new RangeError("Argumento y fora do intervalo");
    }

    let potencia = 1;
    let i = 1;
    while (i <= y) {
        potencia = produto(potencia, x);
        i = i + 1;
    }

    return potencia;
}

function propriedade3025(n) {
    if (typeof n !== "number") {
        throw new TypeError("argumento com tipo errado");
    }

    if (n < 100 || n > 999) {
        throw new RangeError("argumento fora da faixa");
    }

    let c = (n / 100 | 0);
    let du = n % 100;
    let d = (du / 10 | 0);
    let u = du % 10;

    return Math.pow(c, 3) + Math.pow(d, 3) + Math.pow(u, 3) === n;
}

function propriedade3025(n) {
    if (typeof n !== "number") {
        throw new TypeError("argumento com tipo errado");
    }

    if (n < 0 || n > 9999) {
        throw new RangeError("argumento fora da faixa");
    }

    const i = Math.floor(n / 100);
    const j = n % 100;
    const soma = i + j;

    return (soma * soma) === n;
}

function quadradoPerfeito(n) {
    if (n < 1) {
        throw new RangeError("Argumento n fora do intervalo");
    }

    let i = 1;
    let s = 1;
    while (s < n) {
        i = i + 2;
        s = s + i;
    }

    return s === n;
}

function raiz(n, j) {
    if (typeof n !== "number") {
        throw new TypeError("Tipo errado para o argumento n");
    }


    if (typeof n !== "number") {
        throw new TypeError("Tipo errado para o argumento j");
    }

    if (n < 1) {
        throw new RangeError("Argumento n fora do intervalo");
    }

    let i = j;
    let r = 1;
    while ((0 <= i)) {
        r = (r + n / r) / 2;
        i = i - 1;
    }

    return r;
}

function razaoAurea(x, y, k) {

    if (typeof x !== "number") {
        throw new TypeError("Tipo errado para o argumento x");
    }

    if (typeof y !== "number") {
        throw new TypeError("Tipo errado para o argumento y");
    }

    if (typeof k !== "number") {
        throw new TypeError("Tipo errado para o argumento k");
    }

    if (x < 0) {
        throw new RangeError("Argumento x fora do intervalo");
    }
    if (y <= x) {
        throw new RangeError("Argumento y fora do intervalo");
    }

    if (k <= 0) {
        throw new RangeError("Argumento k fora do intervalo");
    }

    let c = y;
    let a = x;
    let i = 1;
    while (k >= i) {
        let t = c;
        c = c + a;
        a = t;
        i = i + 1;
    }

    return c / a;
}

function somaNaturais(n) {
    if (typeof n !== "number") {
        throw new TypeError("Tipo errado para argumento n");
    }

    if (n < 1) {
        throw new RangeError("Argumento n fora do intervalo");
    }

    let i = 2;
    let s = 1;
    while (i <= n) {
        s = s + i;
        i = i + 1;
    }

    return s;
}

function cpf(d) {
    if (!(d instanceof Array)) {
        throw new TypeError("Tipo errado para o argumento d");
    }

    if (d.length !== 11) {
        return false;
    }

    const j = d[0] + 2 * d[1] + 3 * d[2] + 4 * d[3] + 5 * d[4] + 6 * d[5] + 7 * d[6] + 8 * d[7] + 9 * d[8];
    const k = d[1] + 2 * d[2] + 3 * d[3] + 4 * d[4] + 5 * d[5] + 6 * d[6] + 7 * d[7] + 8 * d[8] + 9 * d[9];
    const dj = mod(mod(j, 11), 10);
    const dk = mod(mod(k, 11), 10);

    return dj === d[9] && dk === d[10];
}

function cpf2(d) {

    if (!(d instanceof Array)) {
        throw new TypeError("Tipo errado para o argumento d");
    }

    if (d.length !== 11) {
        return false;
    }

    let c = 7;
    let p = d[8];
    let s = d[8];
    while (0 <= c) {
        p = p + d[c];
        s = s + p;
        c = c - 1;
    }

    const j = mod(mod(s, 11), 10);
    const k = mod(mod(s - p + 9 * d[9], 11), 10);

    return j === d[9] && k === d[10];
}

function crivoEratostenes(a, n) {
    if (n <= 1) {
        throw new RangeError("Argumento n fora do intervalo");
    }

    if (!(a instanceof Array)) {
        throw new TypeError("Tipo errado para o argumento a");
    }

    if (a.length !== n) {
        throw new RangeError("Tamanho iválido para a");
    }

    let i = 2;
    const limite = Math.abs(Math.sqrt(n));
    while (i <= limite) {
        if (typeof a[i] !== "number") {
            throw new TypeError("Tipo errado para o argumento a[" + i + "]");
        }

        if (a[i] !== 0) {
            new RangeError("Valor invalido para a[" + i + "]");
        }

        let multiplo = i + i;
        while (multiplo <= n) {
            a[multiplo] = 1;
            multiplo = multiplo + i;
        }

        i = i + 1;
    }
}

function diaDaSemana(dia, mes, ano) {
    if (typeof dia !== "number") {
        throw new TypeError("argumento dia com tipo errado");
    }

    if (typeof mes !== "number") {
        throw new TypeError("argumento mes com tipo errado");
    }

    if (typeof ano !== "number") {
        throw new TypeError("argumento ano com tipo errado");
    }


    if (this.isDiaInvalido(dia)) {
        throw new RangeError("valor inválido para dia");
    }

    if (this.isMesInvalido(mes)) {
        throw new RangeError("valor inválido para mes");
    }

    if (this.isAnoInvalido(ano)) {
        throw new RangeError("valor invalido para ano");
    }

    if (this.isDataInvalida(dia, mes, ano)) {
        throw new RangeError("data inválida");
    }

    let m = mes;
    let a = ano;
    if (m === 1 || m === 2) {
        m = m + 12;
        a--;
    }

    let s = dia + 2 * m + 3 * (m + 1) / 5 + a + a / 4 - a / 100 + a / 400;
    return s % 7;
}

function isDiaInvalido(d) {
    if (typeof d !== "number") {
        throw new TypeError("argumento d com tipo errado");
    }

    return d < 1 || d > 31;
}

function isAnoBissexto(ano) {
    if (typeof ano !== "number") {
        throw new TypeError("argumento ano com tipo errado");
    }

    return ano % 4 === 0 && ano % 100 !== 0 || ano % 400 === 0;
}

function isDataInvalida(d, m, a) {
    if (typeof d !== "number") {
        throw new TypeError("argumento d com tipo errado");
    }

    if (typeof m !== "number") {
        throw new TypeError("argumento com tipo errado");
    }

    if (typeof a !== "number") {
        throw new TypeError("argumento com tipo errado");
    }

    if (m === 2) {
        if (this.isAnoBissexto(a)) {
            return d < 1 || d > 29;
        }

        return d < 1 || d > 28;
    }

    if (m === 4 || m === 6 || m === 9 || m === 11) {
        return d < 1 || d > 30;
    }

    return d < 1 || d > 31;
}

function isMesInvalido(m) {
    if (typeof m !== "number") {
        throw new TypeError("argumento com tipo errado");
    }

    return m < 1 || m > 12;
}

function isAnoInvalido(a) {
    if (typeof a !== "number") {
        throw new TypeError("argumento com tipo errado");
    }

    return a < 1753;
}

function fatorial(n) {
    if (typeof n !== "number") {
        throw new TypeError("argumento n com tipo errado");
    }

    if (n < 1) {
        throw new RangeError("Argumento n fora do intervalo");;
    }

    let i = 2;
    let f = 1;
    while (i <= n) {
        f = f * i;
        i = i + 1;
    }

    return f;
}

function fibonacci(n) {
    if (typeof n !== "number") {
        throw new TypeError("Tipo errado para o argumento n");
    }

    if (n < 0) {
        throw new RangeError("o valor de n deve ser maior ou igual a 0");
    }
    let a = 0;
    let c = 1;
    if (n === 0 || n === 1) {
        return n;
    }

    let i = 2;
    while (i <= n) {
        const t = c;
        c = c + a;
        a = t;
        i = i + 1;
    }

    return c;
}

function horner(x, g, a) {

    if (!(a instanceof Array)) {
        throw new TypeError("Tipo errado para o argumento a");
    }


    if (typeof x !== "number") {
        throw new TypeError("Tipo errado para o argumento x");
    }

    if (typeof g !== "number") {
        throw new TypeError("Tipo errado para o argumento g");
    }

    if (g < 1) {
        throw new RangeError("Argumento g fora da faixa");
    }

    let p = a[0];
    let i = 1;
    while (i < g) {
        p = p * x + a[i];
        i = i + 1;
    }

    return p;
}

function logaritimoNatural(n, k) {
    if (typeof n !== "number") {
        throw new TypeError("Tipo errado para o argumento n");
    }

    if (typeof k !== "number") {
        throw new TypeError("Tipo errado para o argumento k");
    }

    if (n < 1) {
        throw new RangeError("Argumento n fora do intervalo");
    }

    if (k < 2) {
        throw new RangeError("Argumento k fora do intervalo");
    }

    let i = 2;
    let e = n + 1;
    let numerador = n;
    let denominador = 1;
    while (k >= i) {
        numerador = numerador * numerador;
        denominador = denominador * i;
        e = e + numerador / denominador;
        i = i + 1;
    }

    return e;
}