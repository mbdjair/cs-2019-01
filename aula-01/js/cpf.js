const mod  = require("./mod");

function stringToIntArray(text) {
    let intArray = [];
    for (let i = 0; i < text.length; i++) {
        intArray[i] = parseInt(text[i]);
    }
    return intArray;
}

/**
 * Algoritmo que retorna se o CPF é válido
 * @param {Number} n CPF a ser verificado
 * @returns {boolean} caso CPF seja valido retorna true, caso contrário false
 * @throws {RangeError} caso n não tenha 11 dígitos
 * @throws {TypeError} caso entrada não seja uma string
 */

function cpf(n) {
    if (typeof n != "string") {
        throw new TypeError("Tipo errado para o argumento n");
    }

    if (n.length !== 11) {
        throw new RangeError("n precisa conter 11 dígitos");
    }


    const a = stringToIntArray(n);
    const j = a[0] + 2 * a[1] + 3 * a[2] + 4 * a[3] + 5 * a[4] + 6 * a[5] + 7 * a[6] + 8 * a[7] + 9 * a[8];
    const k = a[1] + 2 * a[2] + 3 * a[3] + 4 * a[4] + 5 * a[5] + 6 * a[6] + 7 * a[7] + 8 * a[8] + 9 * a[9];
    const dj = mod(mod(j, 11), 10);
    const dk = mod(mod(k, 11), 10);

    return dj === a[9] && dk === a[10];
}

module.exports = cpf;