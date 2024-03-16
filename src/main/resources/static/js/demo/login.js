 document.getElementById('iniciarSesionForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Evitar el comportamiento por defecto del formulario

    // Obtener los valores del formulario
    var user = document.getElementById('txtUsuario').value;
    var password = document.getElementById('txtContra').value;

    // Crear el objeto de credenciales
    var credenciales = {
        user: user,
        password: password
    };

    // Enviar la solicitud POST a la API REST para iniciar sesión
    fetch('/api/usuarios/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(credenciales)
    })
    .then(response => {
        if (response.ok) {
            // Si la respuesta es exitosa, recibir el token JWT
            return response.text(); // Suponiendo que el token JWT es devuelto como texto en la respuesta
        } else {
            throw new Error('Error al iniciar sesión');
        }
    })
    .then(token => {
        // Almacenar el token JWT en el almacenamiento local (puedes usar localStorage o sessionStorage)
        localStorage.setItem('jwtToken', token);
        localStorage.setItem('user',user);
         // Almacenar el token en localStorage

        // Redirigir a otra página después del inicio de sesión exitoso
        window.location.href = '/index.html';
    })
    .catch(error => {
        // Manejar errores si ocurren durante el inicio de sesión
        console.error('Error al iniciar sesión:', error);
        // Puedes mostrar un mensaje de error o realizar otra acción
    });
});