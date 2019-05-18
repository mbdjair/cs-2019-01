/**
 * Calcula o n-esimo número de Fibonacci
 * @param {Number} n variável a ser calculada
 * @throws {RangeError} caso parametro seja menor que zero
 * @throws {TypeError} caso parametro não seja um número ou não seja inteiro
 * @returns {Number} n-esimo número de Fibonacci
 */
function fibonacci(n) {

    if (typeof n !== "number" || n%1 !== 0) {
        throw new TypeError("Tipo errado para o argumento n");
    }

    if (n < 0) {
        throw new RangeError("o valor de n deve ser maior ou igual a 0");
    }

    let a = 0;
    let c = 1;
    if (n === 0 || n === 1) {
        return n;
    }

    let i = 2;
    while (i <= n) {
        let t = c;
        c = c + a;
        a = t;
        i = i + 1;
    }

    return c;
}

module.exports = fibonacci;