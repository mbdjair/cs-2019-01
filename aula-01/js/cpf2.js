const mod = require("./mod");

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

function cpf2(n) {

    if (typeof n != "string") {
        throw new TypeError("Tipo errado para o argumento n");
    }

    if (n.length !== 11) {
        throw new RangeError("n precisa pode conter 11 dígitos");
    }

    const a = stringToIntArray(n);
    let c = 7;
    let p = a[8];
    let s = a[8];
    while (0 <= c) {
        p = p + a[c];
        s = s + p;
        c = c - 1;
    }

    const j = mod(mod(s, 11), 10);
    const k = mod(mod(s - p + 9 * a[9], 11), 10);

    return j === a[9] && k === a[10];
}

module.exports = cpf2;