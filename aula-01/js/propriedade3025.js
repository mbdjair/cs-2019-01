function propriedade3025(n) {
    if (typeof n !== "number") {
        throw new TypeError("argumento com tipo errado");
    }


    if (n % 1 !== 0) {
        throw new RangeError("argumento com tipo errado");
    }

    if (n < 0 || n > 9999) {
        throw new RangeError("argumento fora da faixa");
    }

    const i = Math.floor(n / 100);
    const j = n % 100;
    const soma = i + j;

    return (soma * soma) === n;
}

module.exports = propriedade3025;