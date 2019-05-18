/**
 * Retorna o fatorial de um número n.
 * @param {Number} n numero que será calculado o fatorial
 * @throws {RangeError} caso o parametro seja menor que 1
 * @throws {TypeError} caso parametro não seja um número
 * @returns {Number} retorna o fatorial de n
 */
function fatorial(n) {
    if (typeof n !== "number") {
        throw new TypeError("argumento n com tipo errado");
    }

    if (n < 1) {
        throw new RangeError("Argumento n fora do intervalo");
    }

    let i = 2;
    let f = 1;
    while (i <= n) {
        f = f * i;
        i = i + 1;
    }

    return f;
}

module.exports = fatorial;