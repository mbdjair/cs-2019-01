function pi(n) {
    if (!(n instanceof Number)) {
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