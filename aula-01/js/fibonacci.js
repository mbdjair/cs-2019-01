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