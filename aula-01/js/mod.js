/**
* Realiza o cálculo do resto da divisão do primeiro argumento pelo segundo.
*
* @param x
* @param y
*
* @returns {number}
*
* @throws {TypeError} Se qualquer um dos argumentos não for um número.
* @throws {RangeError} Se o primeiro argumento for menor ou igual zero.
* @throws {RangeError} Se o segundo argumento for menor que zero.
*/
function mod(x, y) {
    if (typeof x !== "number") {
        throw new TypeError("Tipo inválido para argumento x");
    }

    if (typeof y !== "number") {
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