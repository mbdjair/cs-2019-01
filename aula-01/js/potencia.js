import {produto} from "./produto";

function potencia(x, y) {
    if (typeof x !== "number") {
        throw new TypeError("Tipo errado para o argumento x");
    }

    if (typeof y !== "number") {
        throw new TypeError("Tipo errado para o argumento y");
    }

    if (x < 0) {
        throw new RangeError("Argumento x fora do intervalo");
    }

    if (y < 0) {
        throw new RangeError("Argumento y fora do intervalo");
    }

    let potencia = 1;
    let i = 1;
    while (i <= y) {
        potencia = produto(potencia, x);
        i = i + 1;
    }

    return potencia;
}