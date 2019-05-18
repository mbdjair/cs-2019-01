/**
 * Realiza mdc dos argumentos fornecidos
 * @param {Number} m número inteiro que será utilizado para o mdc
 * @param {Number} n número inteiro que será utilizado para o mdc
 * @returns {Number} valor mdc
 * @throws {TypeError} Se qualquer um dos argumentos não for um número.
 * @throws {RangeError} caso n seja menor que 0 ou n seja maior que m
 */

function mdc2(m, n) {
    if (typeof m !== "number") {
        throw new TypeError("Tipo errado para o argumento m");
    }

    if (typeof n !== "number") {
        throw new TypeError("Tipo errado para o argumento n");
    }

    if (m < n) {
        throw new RangeError("Parâmetro m fora do range");
    }

    if (n < 0) {
        throw new RangeError("Parâmetro n fora do range");
    }

    let a = m;
    let b = n;
    while (a !== b) {
        if (a > b) {
            a = a - b;
        } else {
            b = b - a;
        }
    }

    return a;
}

module.exports = mdc2;