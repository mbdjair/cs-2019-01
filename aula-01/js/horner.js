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