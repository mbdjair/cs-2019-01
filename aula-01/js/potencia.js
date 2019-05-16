import {produto} from "./produto";

/**
* Realiza a potencia do primeiro pelo segundo argumento
*
* @param x
* @param y
*
* @returns {number}
*
* @throws {TypeError} Se qualquer um dos argumentos não for um número.
* @throws {RangeError} Se o qualquer argumento for menor que zero.
*/
function potencia(x, y) {
    if (typeof x !== "number") {
        throw new TypeError("Tipo errado para o argumento x");
    }

    if (typeof y !== "number") {
        throw new TypeError("Tipo errado para o argumento y");
    }

    if (x < 0) {
        throw new RangeError("Argumento x fora do intervalo");
    }

    if (y < 0) {
        throw new RangeError("Argumento y fora do intervalo");
    }

    let potencia = 1;
    let i = 1;
    while (i <= y) {
        potencia = produto(potencia, x);
        i = i + 1;
    }

    return potencia;
}