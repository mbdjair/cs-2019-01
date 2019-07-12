// Path para a requisição (URL)
const PATH = "http://localhost:8080/extenso?number=";

/**
 * Método excutado toda vez que o input "numero" tem o valor alterado,
 * Envia uma request para o servidor, e ao receber respota a insere dentro
 * da span resultado
 */
function solicitaNumeroExtenso() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState === 4 && this.status === 200) {

                document.getElementById("resultado")
                    .innerHTML = xhttp.responseText;
        }
    };

    let numero = document.getElementById("numero").value;

    xhttp.open("GET", PATH + numero, true);
    xhttp.send();
}
