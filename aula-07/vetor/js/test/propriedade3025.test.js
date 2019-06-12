const propriedade3025 = require("../propriedade3025");

test("3025 satisfaz", () => {
    expect(propriedade3025(3025)).toBe(true);
});

test("3024 nao satisfaz", () => {
    expect(propriedade3025(3024)).toBe(false);
});

test("argumento nao numerico", () => {
    expect(() => { propriedade3025("abcd"); }).toThrow(TypeError);
});

test("valor negativo fora da faixa", () => {
    expect(() => { propriedade3025(-1); }).toThrow(RangeError);
});

test("valor com mais de 4 digitos fora da faixa", () => {
    expect(() => propriedade3025(10000)).toThrow(RangeError);
});

test("valor deve ser inteiro", () => {
    expect(() => propriedade3025(10.3)).toThrow(RangeError);
});