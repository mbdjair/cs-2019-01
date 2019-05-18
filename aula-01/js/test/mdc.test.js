const mdc = require("../mdc.js");

test("esperado", () => {
    expect(mdc(6, 3)).toBe(3);
});

test("parametro nao numerico", () => {
    expect(() => { mdc("a", 1); }).toThrow(TypeError);
});

test("primeiro parametro fora da faixa", () => {
    expect(() => { mdc(6, -1); }).toThrow(RangeError);
});

test("segundo parametro fora da faixa", () => {
    expect(() => { mdc(0, 2); }).toThrow(RangeError);
});