var elemento = "usuario";
var accion = "";
var codigo = "";

function inicializar(e){
	elemento = e;
	document.getElementById("btn-insertar").innerText = "Nuevo " + elemento
	document.getElementById("elemento").value = elemento;
	$('#bt-'+elemento+'s').addClass('filtro_admin__boton--active');
	$("input").attr("spellcheck", "false");

}

function mostrarElemento(e){
	elemento = e;
	document.getElementById("btn-insertar").innerText = "Nuevo " + elemento;
	document.getElementById("btn-confirmar").value = elemento;
	document.getElementById("elemento").value = elemento;
	document.getElementById("tabla").value = e;
	document.getElementById("mostrarTabla").submit();
}

function insertar() {
	accion = "insertando";
	codigo = "nuevo";
	actualizarVariables();
	$(".form-nuevo-elemento").css('display', '');
	document.getElementById("fila-insertar").style.display = 'none';
	document.getElementById("fila-confirmar").style.display = '';
	comprobarCampos();
}

function cancelar() {
	accion = "";
	codigo = "";
	actualizarVariables();
	$(".form-nuevo-elemento").css('display', 'none');
	document.getElementById("fila-insertar").style.display = '';
	document.getElementById("fila-confirmar").style.display = 'none';
	$(".input-elemento").val('');
}

function comprobarCampos() {
	var vacio = false;
	$("#form-nuevo-" + elemento + " > td > .input-elemento ").each(
			function(index) {
				if ($(this).val() == '')
					vacio = true;
			});
	document.getElementById("btn-confirmar").disabled = vacio;
}

function editar(e) {
	accion = "editando";
	codigo = e;
	actualizarVariables();
	document.getElementById("editar-" + elemento + "-" + e).style.display = 'none';
	document.getElementById("conf-canc-editar-" + elemento + "-" + e).style.display = '';

	$("." + elemento + "-" + e + " > td > input").each(function(index) {
		$(this).prop("disabled", false);
		$(this).prop("className", "label-tabla__input");
	});

	$("." + elemento + "-" + e + " > td > select").each(function(index) {
		$(this).prop("disabled", false);
		$(this).prop("className", "label-tabla__select");
	});

	$("." + elemento + "-" + e + " > td > input[type='checkbox']").each(function(index) {
		$(this).attr("onclick", "");
	});
	
	document.getElementById("btn-insertar").disabled = true;
}

function reiniciarPass(c){
	codigo = c;
	accion = "pass";
	$("#modalPass").modal();
}

function confirmarPass(c){
	confirmar(codigo);
}


function cancelarEditar(e) {
	accion = "";
	el = elemento;
	actualizarVariables();
	location.reload();
}

function confirmar(c) {
	codigo = c;
	document.getElementById("accion").value = accion;
	document.getElementById("elemento").value = elemento;
	document.getElementById("codigo").value = codigo;
	document.getElementById("form-confirmar").submit();
}

function actualizarVariables(){
	document.getElementById("accion").value = accion;
	document.getElementById("elemento").value = elemento;
	document.getElementById("codigo").value = codigo;
}
