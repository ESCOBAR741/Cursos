window.onload = iniciar;

function iniciar() {
//Boton agregar escucha el Click
    var btnAgregar = document.getElementById("btnAgregar");
    btnAgregar.addEventListener("click", clickBtnAgregar)

//Boton borrar escucha el Click 
            var btnBorrar = document.getElementById("btnBorrar");
            btnBorrar.addEventListener("click", clickBtnBorrar);



//Renderizar la nota
    mostrarNotas();       //Esto es para llamar a la variable de abajo y verla al principio
}

function clickBtnBorrar() {
    localStorage.clear(); // Limpiará todos los datos del localStorage
    mostrarNotas();
}

function clickBtnAgregar() {
//Traemos el txtNota
    var txtNota = document.getElementById("txtNota"); 


//JSON.stringify() Aquí podemos agregar un areglo y esto nos lo transforma a un string y viseversa
    var notas = [];
    if (localStorage.notas) {
    notas = JSON.parse(localStorage.notas);
    }

    notas.push(txtNota.value);
    localStorage.notas = JSON.stringify(notas); //JSON.stringify() Aquí podemos agregar un areglo y esto nos lo transforma a un string y viseversa
    //localStorage es para que los datos no se pierdan al actualizar la página
    mostrarNotas();
}    

    function mostrarNotas() {
//Trae el div Notas
        var divNotas = document.getElementById("divNotas");
//Le asigna las notas desde el localStorage
    var notas = [];
    if (localStorage.notas) {
    notas = JSON.parse(localStorage.notas);
    }
        
    var html = "";
    for (var nota of notas) {       //Es para recorrer cada nota agregada
    html += nota + "<br/>"    

        }
        divNotas.innerHTML = html;                
    
    }
alert(index);