const main = require("../main.js");


test("Formata data", () => {
    expect(main.formataData("2019-07-09")).toBe("09/07/2019");
});


test("Formata data não recebendo string", () => {
    expect(()=>main.formataData(1)).toThrow(TypeError);
});


test("Formata data formato errado", () => {
    expect(()=>main.formataData("09/07/2019")).toThrow(Error);
});

test("Obtem url", () => {
    expect(main.obtemUrlRequest("09/07/2019","09/07/2019"))
        .toBe("http://localhost:8080/diferencaData?firstDate=09%2F07%2F2019&"
    +"secondDate=09%2F07%2F2019");
});