function primo(n) {
    if (!(n instanceof Number)) {
        throw new TypeError("Tipo errado para o argumento n");
    }

    if (n <= 1) {
        throw new RangeError("Argumento n fora do intervalo");
    }

    let i = 2;
    while (i < n) {
        if (n % 2 === 0) {
            return false;
        }

        i = i + 1;
    }

    return true;
}