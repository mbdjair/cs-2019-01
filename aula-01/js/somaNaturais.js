function somaNaturais(n) {
    if (!(n instanceof Number)) {
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