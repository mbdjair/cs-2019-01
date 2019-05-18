const fatorial = require("../fatorial.js");

test("Caso classico", () => {
    expect(fatorial(4)).toBe(24);
});

test("valor fora da faixa", () => {
    expect(() => fatorial(0)).toThrow(RangeError);
});

test("argumento nao numerico", () => {
    expect(() => { fatorial("abcd"); }).toThrow(TypeError);
});