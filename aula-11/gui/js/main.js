// Path para a requisição (URL)
const PATH = "http://localhost:8080/diferencaData?";
/**
 * Solicita o diferença de dias e atualiza na view
 *
 */
function atualizaDiaDaSemana() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            let dds = xhttp.responseText;
            document.getElementById("resultado").innerHTML = dds;
        }
    };

    let primeiraDataInput = document.getElementById("primeiraData").value;
    let primeiraData = formataData(primeiraDataInput);
    let segundaDataInput = document.getElementById("segundaData").value;
    let segundaData = formataData(segundaDataInput);
    xhttp.open("GET", obtemUrlRequest(primeiraData,segundaData), true);
    xhttp.send();
}

/**
 * Obter url que será usada para realizar a requisição
 * @param {string} primeiraData primeira data no formato dd/MM/aaaa
 *  que fará parte da url
 * @param {string} segundaData segunda data no formato dd/MM/aaaa
 *  que fará parte da url
 * @return {string} url montada com as duas datas
 */
function obtemUrlRequest(primeiraData, segundaData){
    const encodePrimeiraData = encodeURIComponent(primeiraData)
    const encodeSegundaData = encodeURIComponent(segundaData)
    return `${PATH}firstDate=${encodePrimeiraData}&secondDate=${encodeSegundaData}`;
}

/**
 * Aplica o valor do dia de hoje aos campos de data
 *
 */
function dataCorrente() {
    document.getElementById("data").valueAsDate = new Date();
}

/**
 * Garante que o dia ou o Mes estarão no formato correto
 * @param {number} n que é o numero que representa o dia ou mes
 * @return {string} dia ou mes formatado com duas casas decimais
 */
function formataDiaOuMes(n) {
    return ("00" + n).substr(-2, 2);
}

/**
 * Garante que ano estará no formato correto
 * @param {number} n que é o numero que representa o ano
 * @return {string} ano formatado com quatro casas decimais
 */
function formataAno(n) {
    return ("0000" + n).substr(-4, 4);
}

/**
 * Formata a entrada de yyyy-MM-dd para dd/MM/yyyy
 * 
 * @param {string} data no formato yyyy-MM-dd que será formatada
 * @return {string} data formata dd/MM/yyyy
 */
function formataData(data) {
    let [a, m, d] = data.split("-");

    let dia = formataDiaOuMes(d);
    let mes = formataDiaOuMes(m);
    let ano = formataAno(a);

    return `${d}/${m}/${a}`;
}

module.exports = {
    formataData: formataData,
    obtemUrlRequest: obtemUrlRequest
};
