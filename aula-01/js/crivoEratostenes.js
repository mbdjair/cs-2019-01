function crivoEratostenes(a, n) {
    if (n <= 1) {
        throw new RangeError("Argumento n fora do intervalo");
    }

    if (!(a instanceof Array)) {
        throw new TypeError("Tipo errado para o argumento a");
    }

    if (a.length !== n) {
        throw new RangeError("Tamanho iválido para a");
    }

    let i = 2;
    const limite = Math.abs(Math.sqrt(n));
    while (i <= limite) {
        if (!(a[i] instanceof Number)) {
            throw new TypeError("Tipo errado para o argumento a[" + i + "]");
        }

        if (a[i] !== 0) {
            new RangeError("Valor invalido para a[" + i + "]");
        }

        let multiplo = i + i;
        while  (multiplo <= n) {
            a[multiplo] = 1;
            multiplo = multiplo + i;
        }

        i = i + 1;
    }
}