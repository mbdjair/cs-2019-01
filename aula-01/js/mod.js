/**
 * Retorna resto da divisão inteira de x por y
 * @param {Number} x dividendo
 * @param {Number} y divisor
 * @throws {RangeError} caso x for menor ou igual 0, ou se y for menor que 0
 * @throws {TypeError} caso algum parametro não seja um numero
 * @returns {Number} o resto da divisão de x por y
 */
function mod(x, y) {
    if (typeof x !== "number") {
        throw new TypeError("Tipo inválido para argumento x");
    }

    if (typeof y !== "number") {
        throw new TypeError("Tipo inválido para argumento y");
    }

    if (x <= 0) {
        throw new RangeError("Argumento x fora do intervalo");
    }

    if (y < 0) {
        throw new RangeError("Argumento y fora do intervalo");
    }

    let s = x;
    while (s >= y) {
        s = s - y;
    }

    return s;
}

module.exports = mod;