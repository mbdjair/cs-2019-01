const crivoEratostenes = require("../crivoEratostenes.js");

test("satisfaz", () => {
    expect(crivoEratostenes([0, 0, 0, 0, 0, 0, 0, 0, 0], 9)).toEqual([0, 0, 0, 0, 1, 0, 1, 0, 1, 1]);
});

test("argumento nao numerico", () => {
    expect(() => { crivoEratostenes("000000", 6); }).toThrow(TypeError);
});

test("Vetor não está zerado", () => {
    expect(() => { crivoEratostenes([0, 2, 1, -1, 0, 0], 6); }).toThrow(RangeError);
});