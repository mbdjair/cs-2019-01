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