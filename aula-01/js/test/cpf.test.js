const cpf = require("../cpf.js");

test("satisfaz", () => {
    expect(cpf("16705436506")).toBe(true);
});

test("nao satisfaz", () => {
    expect(cpf("12345678910")).toBe(false);
});

test("parametro nao é string", () => {
    expect(() => { cpf(1234); }).toThrow(TypeError);
});

test("numero de digitos diferente", () => {
    expect(() => { cpf("123456789123"); }).toThrow(RangeError);
});