// Call the dataTables jQuery plugin
$(document).ready(function() {

cargarUsuarios();
$('#tablaUsuarios').DataTable();

});

async function cargarUsuarios() {
    
            const request = await fetch('/api/usuarios', {
                method: 'GET',
                headers: {
                'Accept':'application/json',
                'Content-Type':'application/json'
            },
        });

                const usuarios = await request.json();
                console.log(usuarios);

                let listadoHTML = '';
                for (let usuario of usuarios) {
                    let usuarioHTML = `
                        <tr>
                            <td>${usuario.id}</td>
                            <td>${usuario.userName}</td>
                            <td>${usuario.password}</td>
                            <td>
                                <a href="#" class="btn btn-danger btn-circle btn-sm">
                                    <i class="fas fa-trash"></i>
                                </a>
                            </td>
                        </tr>`;
                    listadoHTML += usuarioHTML;
                }

                document.querySelector('#tablaUsuarios tbody').innerHTML = listadoHTML;
        
}


