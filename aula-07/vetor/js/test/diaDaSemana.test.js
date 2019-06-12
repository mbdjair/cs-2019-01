const diaDaSemana = require("../diaDaSemana.js");

test("satisfaz", () => {
    expect(diaDaSemana(18, 5 , 2019)).toBe(6);
});

test("dia inválido", () => {
    expect(() => diaDaSemana(32, 5, 2019)).toThrow(RangeError);
});

test("mes inválido", () => {
    expect(() => diaDaSemana(5, 18, 2019)).toThrow(RangeError);
});

test("ano inválido", () => {
    expect(() => diaDaSemana(5, 5, 1752)).toThrow(RangeError);
});