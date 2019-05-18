/**
 * Algoritmo que encontra números primos
 * @param {Array} a array de números
 * @param {Number} n maior número a ser checado
 * @throws {TypeError} caso a não seja array, ou algum elemento de a ou n não seja um number
 * @throws {RangeError} caso array tenha tamanho inválido
 * @throws {RangeError} caso array não esteja zerado
 * @returns {Array} retorna o resultado calculado
 */
function crivoEratostenes(a, n) {
    if (n <= 1) {
        throw new RangeError("Argumento n fora do intervalo");
    }

    if (!Array.isArray(a)|| typeof n !== "number" ) {
        throw new TypeError("Tipo errado para o argumento a");
    }

    if (a.length !== n) {
        throw new RangeError("Tamanho iválido para a");
    }

    let i = 0;

    while (i < n) {
        if (typeof a[i] !== "number") {
            throw new TypeError("Tipo errado para o argumento a[" + i + "]");
        }

        if (a[i] !== 0) {
            throw new RangeError("Valor invalido para a[" + i + "]");
        }

        i = i + 1;
    }

    i = 2;
    const limite = Math.abs(Math.sqrt(n));
    while (i <= limite) {
        let multiplo = i + i;
        while (multiplo <= n) {
            a[multiplo] = 1;
            multiplo = multiplo + i;
        }

        i = i + 1;
    }

    return a;
}

module.exports = crivoEratostenes;