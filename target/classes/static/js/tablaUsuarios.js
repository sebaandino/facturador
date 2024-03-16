// // Call the dataTables jQuery plugin
// $(document).ready(function() {

// cargarUsuarios();
//   $('#tablaUsuarios').DataTable();
// actualizarUsuario();

// });

// function actualizarUsuario(){
// document.getElementById('nombreUsuario').outerHTML = localStorage.user;
// }

// async function verificarSesion() {
//     const token = localStorage.getItem('jwtToken');

//     if (!token) {
//         console.error('Token no encontrado');
//         window.location.href = 'login.html'; // Redirige al usuario a la página de inicio de sesión si no hay token
//         alert('¡Debes iniciar sesión!');
//     }
// }

// async function cargarUsuarios() {
//     const token = localStorage.getItem('jwtToken');

//     if (token) {
//         const headers = getHeaders(token); // Obtiene los encabezados con el token

//         if (Object.keys(headers).length > 0) { // Verifica si hay encabezados válidos
//             const request = await fetch('/api/usuarios', {
//                 method: 'GET',
//                 headers: headers
//             });

//             if (request.ok) {
//                 const usuarios = await request.json();
//                 console.log(usuarios);

//                 let listadoHTML = '';
//                 for (let usuario of usuarios) {
//                     let usuarioHTML = `
//                         <tr>
//                             <td>${usuario.id}</td>
//                             <td>${usuario.user}</td>
//                             <td>${usuario.email}</td>
//                             <td>
//                                 <a href="#" class="btn btn-danger btn-circle btn-sm">
//                                     <i class="fas fa-trash"></i>
//                                 </a>
//                             </td>
//                         </tr>`;
//                     listadoHTML += usuarioHTML;
//                 }

//                 document.querySelector('#tablaUsuarios tbody').innerHTML = listadoHTML;
//             } else {
//                 console.error('Error al obtener los usuarios');
//                 // Manejo de errores si la solicitud no fue exitosa
//             }
//         }
//     }
// }

// verificarSesion(); // Llama a la función de verificación al cargar la página


// function getHeaders(token) {
//     if (token) {
//         return {
//             'Accept': 'application/json',
//             'Content-Type': 'application/json',
//             'Authorization': 'Bearer ' + token
//         };
//     } else {
//         return {};
//     }
// }


