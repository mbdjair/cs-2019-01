function propriedade3025(n) {
    if (n !instanceof number) {
        throw new TypeError("argumento fora da faixa");
    }

    if (n < 0 || n > 9999) {
        throw new RangeError("argumento fora da faixa");
    }

    const i = Math.floor(n / 100);
    const j = n % 100;
    const soma = i + j;

    return  (soma * soma) === n;
}