/**
* Verifica se o argumento é ou não primo
*
* @param n
*
* @returns {boolean}
*
* @throws {TypeError} Se o argumento não for um número.
* @throws {RangeError} Se o argumento menor ou igual a 1.
*/
function primo(n) {
    if (typeof n !== "number") {
        throw new TypeError("Tipo errado para o argumento n");
    }

    if (n <= 1) {
        throw new RangeError("Argumento n fora do intervalo");
    }

    let i = 2;
    while (i < n) {
        if (n % 2 === 0) {
            return false;
        }

        i = i + 1;
    }

    return true;
}