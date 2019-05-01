import {mod} from './mod'

function cpf2(d) {

    if (!(d instanceof Array)) {
        throw new TypeError("Tipo errado para o argumento d");
    }

    if (d.length !== 11) {
        return false;
    }

    let c = 7;
    let p = d[8];
    let s = d[8];
    while (0 <= c) {
        p = p + d[c];
        s = s + p;
        c = c - 1;
    }

    const j = mod(mod(s, 11), 10);
    const k = mod(mod(s - p + 9 * d[9], 11), 10);

    return j === d[9] && k === d[10];
}