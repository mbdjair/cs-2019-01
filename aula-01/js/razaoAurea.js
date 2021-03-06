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