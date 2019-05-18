/**
 * Aproxima raizes de uma equação polinomial
 * @param {Number} x variável para obter uma aproximação
 * @param {Number} g tamanho do polinômio
 * @param {Number} a coeficientes do polinômio
 * @throws {RangeError} caso g seja menor que 1
 * @throws {Error} caso g seja null ou undefined
 * @throws {TypeError} caso x ou g não seja um numero, ou a não seja Array
 * @returns {Number} retorna o valor calculado pelo método de horner
 */

function horner(x, g, a) {
    if (!Array.isArray(a)) {
        throw new TypeError("Tipo errado para o argumento a");
    }

    if (typeof x !== "number") {
        throw new TypeError("Tipo errado para o argumento x");
    }

    if (typeof g !== "number") {
        throw new TypeError("Tipo errado para o argumento g");
    }

    if (g < 1) {
        throw new RangeError("Argumento g fora da faixa");
    }

    let p = a[0];
    let i = 1;
    while (i < g) {
        p = p * x + a[i];
        i = i + 1;
    }

    return p;
}

module.exports = horner;