const cpf2 = require("../cpf2.js");

test("satisfaz", () => {
    expect(cpf2("16705436506")).toBe(true);
});

test("nao satisfaz", () => {
    expect(cpf2("12345678910")).toBe(false);
});

test("parametro nao é string", () => {
    expect(() => { cpf2(1234); }).toThrow(TypeError);
});

test("numero de digitos diferente", () => {
    expect(() => { cpf2("123456789123"); }).toThrow(RangeError);
});