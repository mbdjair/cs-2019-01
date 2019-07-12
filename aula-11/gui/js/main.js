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
    xhttp.open("GET", obtemUrlRequest(primeiraData, segundaData), true);
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
function obtemUrlRequest(primeiraData, segundaData) {
    const encodePrimeiraData = encodeURIComponent(primeiraData);
    const encodeSegundaData = encodeURIComponent(segundaData);
    return `${PATH}firstDate=${encodePrimeiraData}&secondDate=${encodeSegundaData}`;
}

/**
 * Aplica o valor do dia de hoje aos campos de data
 *
 */
function dataCorrente() {
    document.getElementById("primeiraData").valueAsDate = new Date();
    document.getElementById("segundaData").valueAsDate = new Date();
}

/**
 * Formata a entrada de yyyy-MM-dd para dd/MM/yyyy
 * 
 * @param {string} data no formato yyyy-MM-dd que será formatada
 * @return {string} data formata dd/MM/yyyy
 */
function formataData(data) {
    if (typeof data !== 'string'){
        throw TypeError("Argumento inválido");
    }
    if( !/^\d{4}-\d{2}-\d{2}$/.test(data)){
        throw Error("data no formato inválido");
    }
        let [a, m, d] = data.split("-");

    return `${d}/${m}/${a}`;
}

module.exports = {
    formataData: formataData,
    obtemUrlRequest: obtemUrlRequest
};
