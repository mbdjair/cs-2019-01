export function mod(x, y) {
    if (!(x instanceof Number)) {
        throw new TypeError("Tipo inválido para argumento x");
    }

    if (!(y instanceof Number)) {
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