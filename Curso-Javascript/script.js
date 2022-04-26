window.onload = iniciar;             /*Esto hace que cuando cargue la página web llame a la función inicial*/

function iniciar() {
    var BTNcalcular = document.getElementById(BTNcalcular); /* Busca el documento que se llame BTNcalcular en el html */
    BTNcalcular.addEventListener("click", clickBTNcalcular); /* llama al botón click */
}

function clickBTNcalcular() {
    var txtpeso = document.getElementById("txtPeso");
    var peso = txtpeso.value;                        /* Esto almacenará el valor del texto  */
    
    var txtAltura = document.getElementById("txtAltura");
    var altura = txtaltura.value;
    
    var imc = peso / (altura * altura);
    alert ("Su IMC es: " + Math.round(imc)); /* Math.round redondea el resultado IMC  */
}

