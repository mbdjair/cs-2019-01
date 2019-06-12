const mdc2 = require("../mdc2.js");

test("esperado", () => {
    expect(mdc2(6, 3)).toBe(3);
});

test("parametro nao numerico", () => {
    expect(() => { mdc2("a", 1); }).toThrow(TypeError);
});

test("primeiro parametro fora da faixa", () => {
    expect(() => { mdc2(6, -1); }).toThrow(RangeError);
});

test("segundo parametro fora da faixa", () => {
    expect(() => { mdc2(0, 2); }).toThrow(RangeError);
});