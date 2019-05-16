function mdc(m, n) {
    if (!(m instanceof Number)) {
        throw new TypeError("Tipo errado para o argumento m");
    }

    if (!(n instanceof Number)) {
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