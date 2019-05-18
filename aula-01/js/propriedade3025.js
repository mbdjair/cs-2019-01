/**
 * Verifica se n satisfaz a propriedade 3025.
 * @param {Number} n parametro a ser verificada
 * @throws {Error} caso parametro seja null ou undefined
 * @throws {TypeError} caso parametro não seja um número
 * @throws {RangeError} caso parametro seja menor que 0 ou maior que 999
 * @throws {RangeError} caso parametro não seja um número inteiro
 * @returns {boolean} true se o argumento fornecido satisfaz a propriedade 3025 caso contrario false
 */
function propriedade3025(n) {
    if (typeof n !== "number") {
        throw new TypeError("argumento com tipo errado");
    }

    if (n % 1 !== 0) {
        throw new RangeError("argumento com tipo errado");
    }

    if (n < 0 || n > 9999) {
        throw new RangeError("argumento fora da faixa");
    }

    const i = Math.floor(n / 100);
    const j = n % 100;
    const soma = i + j;

    return (soma * soma) === n;
}

module.exports = propriedade3025;