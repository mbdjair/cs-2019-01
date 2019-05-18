const fibonacci = require("../fibonacci.js");

test("satisfaz", () => {
    expect(fibonacci(7)).toBe(13);
});

test("parametro nao numerico", () => {
    expect(() => { fibonacci("abcd"); }).toThrow(TypeError);
});

test("parametro real", () => {
    expect(() => fibonacci(10.3)).toThrow(TypeError);
});

test("parametro negativo", () => {
    expect(() => { fibonacci(-1); }).toThrow(RangeError);
});