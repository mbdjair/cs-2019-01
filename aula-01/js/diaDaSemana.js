function diaDaSemana(dia, mes, ano) {
    if (typeof dia !== "number") {
        throw new TypeError("argumento dia com tipo errado");
    }

    if (typeof mes !== "number") {
        throw new TypeError("argumento mes com tipo errado");
    }

    if (typeof ano !== "number") {
        throw new TypeError("argumento ano com tipo errado");
    }


    if (isDiaInvalido(dia)) {
        throw new RangeError("valor inválido para dia");
    }

    if (isMesInvalido(mes)) {
        throw new RangeError("valor inválido para mes");
    }

    if (isAnoInvalido(ano)) {
        throw new RangeError("valor invalido para ano");
    }

    if (isDataInvalida(dia, mes, ano)) {
        throw new RangeError("data inválida");
    }

    let m = mes;
    let a = ano;
    if (m === 1 || m === 2) {
        m = m + 12;
        a--;
    }

    let s = dia + 2 * m + 3 * (m + 1) / 5 + a + a / 4 - a / 100 + a / 400;
    return s % 7;
}

function isDiaInvalido(d) {
    if (typeof d !== "number") {
        throw new TypeError("argumento d com tipo errado");
    }

    return d < 1 || d > 31;
}

function isAnoBissexto(ano) {
    if (typeof ano !== "number") {
        throw new TypeError("argumento ano com tipo errado");
    }

    return ano % 4 === 0 && ano % 100 !== 0 || ano % 400 === 0;
}

function isDataInvalida(d, m, a) {
    if (typeof d !== "number") {
        throw new TypeError("argumento d com tipo errado");
    }

    if (typeof m !== "number") {
        throw new TypeError("argumento com tipo errado");
    }

    if (typeof a !== "number") {
        throw new TypeError("argumento com tipo errado");
    }

    if (m === 2) {
        if (isAnoBissexto(a)) {
            return d < 1 || d > 29;
        }

        return d < 1 || d > 28;
    }

    if (m === 4 || m === 6 || m === 9 || m === 11) {
        return d < 1 || d > 30;
    }

    return d < 1 || d > 31;
}

function isMesInvalido(m) {
    if (typeof m !== "number") {
        throw new TypeError("argumento com tipo errado");
    }

    return m < 1 || m > 12;
}

function isAnoInvalido(a) {
    if (typeof a !== "number") {
        throw new TypeError("argumento com tipo errado");
    }

    return a < 1753;
}