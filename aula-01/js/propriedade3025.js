function propriedade3025(n) {
    if (typeof n !== "number") {
        throw new TypeError("argumento com tipo errado");
    }

    if (n < 100 || n > 999) {
        throw new RangeError("argumento fora da faixa");
    }

    let c = (n / 100 | 0);
    let du = n % 100;
    let d = (du / 10 | 0);
    let u = du % 10;

    return Math.pow(c, 3) + Math.pow(d, 3) + Math.pow(u, 3) === n;
}