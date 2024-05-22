Este repositorio contiene una aplicación de gestión de usuarios desarrollada en Java, que permite a los usuarios autenticarse mediante un nombre de usuario y contraseña, y acceder a diferentes funcionalidades según su rol. Los roles de usuario se almacenan en una base de datos MySQL y se cargan dinámicamente en la aplicación. La interfaz gráfica de la aplicación se ha implementado utilizando Java Swing, y la manipulación de datos se realiza mediante JPAController, respetando el modelo de capas.

Funcionalidades

Autenticación de Usuario
Ingreso de Credenciales: El usuario debe ingresar su nombre de usuario y contraseña.
Selección de Rol: Los roles disponibles se cargan dinámicamente desde la base de datos.
Validación: El sistema valida las credenciales y el rol del usuario.

Ventana del Administrador
Si el usuario tiene el rol de "Administrador", puede acceder a una ventana con las siguientes funcionalidades:
Visualización de Usuarios: Muestra una tabla con el nombre, ID y rol de todos los usuarios en la base de datos.
Crear Usuario: Permite añadir nuevos usuarios a la base de datos.
Eliminar Usuario: Permite eliminar usuarios existentes.
Editar Usuario: Permite modificar los detalles de usuarios existentes.
Recargar Tabla: Actualiza la tabla para reflejar cualquier cambio en la base de datos.
Salir: Cierra la aplicación.

Ventana del Usuario
Si el usuario tiene el rol de "User", puede acceder a una ventana con las siguientes funcionalidades:
Visualización de Usuarios: Muestra una tabla con el nombre, ID y rol de todos los usuarios en la base de datos.
Recargar Tabla: Actualiza la tabla para reflejar cualquier cambio en la base de datos.
Salir: Cierra la aplicación.

Tecnologías Utilizadas
Java: Lenguaje de programación principal.
Java Swing: Para la interfaz gráfica.
MySQL: Base de datos relacional para almacenar usuarios y roles.
JPAController: Para la manipulación de datos y persistencia.
Programación Orientada a Objetos: Para una estructura de código modular y mantenible.
Modelo de Capas: Separación lógica de la presentación, lógica de negocio y acceso a datos.

Instrucciones de Instalación
Clonar el Repositorio:
git clone https://github.com/tu_usuario/java-user-management-system.git
Configurar la Base de Datos:
Crear una base de datos en MySQL.
Importar el esquema y los datos iniciales desde el archivo database.sql proporcionado en el repositorio.

Configurar el Proyecto en tu IDE:
Importar el proyecto en tu IDE favorito (Eclipse, IntelliJ IDEA, NetBeans, etc.).
Configurar las dependencias necesarias para JPA y MySQL.

Ejecutar la Aplicación:
Compilar y ejecutar el proyecto desde tu IDE.

Ejemplo de Uso
Inicio de Sesión: Iniciar la aplicación y proporcionar el nombre de usuario y contraseña.
Selección de Rol: Elegir el rol deseado (cargado dinámicamente desde la base de datos).
Acceso a Funcionalidades:
Si el rol es "Administrador", se abrirá una ventana con opciones para gestionar usuarios.
Si el rol es "User", se abrirá una ventana con opciones limitadas a recargar la tabla y salir.
Capturas de Pantalla
Incluir capturas de pantalla de la interfaz de usuario aquí.

Contribuciones
Las contribuciones son bienvenidas. Para proponer cambios, por favor, sigue estos pasos:

Haz un fork del proyecto.
Crea una nueva rama (git checkout -b feature/nueva-funcionalidad).
Realiza los cambios necesarios y commitea (git commit -am 'Añadir nueva funcionalidad').
Haz push a la rama (git push origin feature/nueva-funcionalidad).
Abre un Pull Request.

Licencia
Este proyecto está licenciado bajo la Licencia MIT. Para más detalles, consulta el archivo LICENSE.

Contacto
Para cualquier pregunta o comentario, por favor, abre un issue en GitHub o contacta al mantenedor del proyecto a través de stivenpaez09@gmail.com
