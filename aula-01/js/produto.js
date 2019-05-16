/**
* Realiza o produto dos argumentos fornecidos
*
* @param m
* @param n
*
* @returns {number}
*
* @throws {TypeError} Se qualquer um dos argumentos não for um número.
* @throws {RangeError} Se o qualquer argumento for menor que zero.
*/
export function produto(a, b) {
    if (typeof a !== "number") {
        throw new TypeError("Tipo errado para o argumento a");
    }


    if (typeof b !== "number") {
        throw new TypeError("tipo errado para o argumento b");
    }

    if (a < 0) {
        throw new RangeError("Argumento a fora do intervalo");
    }
    if (b < 0) {
        throw new RangeError("Argumento b fora do intervalo");
    }

    const bMenorA = b < a;
    const totalParcelas = !bMenorA ? a : b;
    const parcela = !bMenorA ? b : a;
    let i = 1;
    let s = 0;
    while (i <= totalParcelas) {
        s += parcela;
        i++;
    }

    return s;
}