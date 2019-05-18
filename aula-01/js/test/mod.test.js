const mod = require("../mod.js");

test("satisfaz", () => {
    expect(mod(9, 3)).toBe(0);
});

test("y inválido", () => {
    expect(() => { mod(5, -1); }).toThrow(RangeError);
});

test("x inválido", () => {
    expect(() => { mod(-1, 3); }).toThrow(RangeError);
});

test("parametro nao numerico", () => {
    expect(() => { mod("abcd", 2); }).toThrow(TypeError);
});