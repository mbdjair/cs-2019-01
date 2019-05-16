function logaritimoNatural(n, k) {
    if (!(n instanceof Number)) {
        throw new TypeError("Tipo errado para o argumento n");
    }

    if (!(k instanceof Number)) {
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