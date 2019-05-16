/**
* Realiza o produto dos argumentos fornecidos
*
* @param n
*
* @returns {number}
*
* @throws {TypeError} Se o argumento não for um número.
* @throws {RangeError} Se o argumento for menor que zero.
*/
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