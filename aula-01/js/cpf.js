import { mod } from "./mod";
function cpf(d) {
    if (!(d instanceof Array)) {
        throw new TypeError("Tipo errado para o argumento d");
    }

    if (d.length !== 11) {
        return false;
    }

    const j = d[0] + 2 * d[1] + 3 * d[2] + 4 * d[3] + 5 * d[4] + 6 * d[5] + 7 * d[6] + 8 * d[7] + 9 * d[8];
    const k = d[1] + 2 * d[2] + 3 * d[3] + 4 * d[4] + 5 * d[5] + 6 * d[6] + 7 * d[7] + 8 * d[8] + 9 * d[9];
    const dj = mod(mod(j, 11), 10);
    const dk = mod(mod(k, 11), 10);

    return dj === d[9] && dk === d[10];
}