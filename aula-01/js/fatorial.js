function fatorial(n) {
    if (typeof n !== "number") {
        throw new TypeError("argumento n com tipo errado");
    }

    if (n < 1) {
        throw new RangeError("Argumento n fora do intervalo");
    }

    let i = 2;
    let f = 1;
    while (i <= n) {
        f = f * i;
        i = i + 1;
    }

    return f;
}