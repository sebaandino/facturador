// Call the dataTables jQuery plugin
$(document).ready(function() {

cargarClientes();
  $('#tablaClientes').DataTable();
});

async function cargarClientes(){

const request = await fetch('/api/all',{
method: 'GET',
headers:{
    'Accept':'application/json',
    'Content-Type':'application/json'
},
});
const Clientes = await request.json();
console.log(Clientes);


let listadoHTML ='';
for(let cliente of Clientes){
let clienteHTML = ' <tr><td>'+cliente.id+'</td><td>'+cliente.nombre+'</td><td>'+cliente.apellido+'</td><td>'+cliente.dni+'</td><td>'+cliente.localidad+'</td><td><a href="#" onclick="{$eliminarCliente(cliente.id)}"  class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a> </td></tr>';
listadoHTML += clienteHTML;
}
document.querySelector('#tablaClientes tbody').innerHTML = listadoHTML;
}

async function eliminarCliente(id){
  const request = await fetch('/api/delete/{id}',{
    method: 'DELETE',
    headers:{
        'Accept':'application/json',
        'Content-Type':'application/json'
    },
    });
}