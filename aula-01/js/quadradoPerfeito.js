function quadradoPerfeito(n) {
    if (n < 1) {
        throw new RangeError("Argumento n fora do intervalo");
    }

    let i = 1;
    let s = 1;
    while (s < n) {
        i = i + 2;
        s = s + i;
    }

    return s === n;
}