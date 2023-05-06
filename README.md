# Conexión con la base de datos

En este repositorio se presenta un conjunto de métodos para establecer una conexión con una base de datos MySQL. Además, se utiliza el método de encriptación `aes_encrypt` para guardar contraseñas de manera segura.

Para utilizar estos métodos, es necesario contar con los siguientes requisitos:

- Tener instalado MySQL en el equipo o servidor donde se ejecutará el código.
- Tener acceso a una base de datos MySQL con permisos de lectura y escritura.


## Añadidos

Además, se haceuso del método `aes_encrypt` para encriptar las contraseñas antes de guardarlas en la base de datos. Esto garantiza que las contraseñas no puedan ser obtenidas en caso de que la base de datos sea vulnerada.

`DataBase`
![image](https://user-images.githubusercontent.com/95003267/236593151-8e108e19-a698-46eb-a29b-1f725e443ca3.png)

`Basic conection`
![image](https://user-images.githubusercontent.com/95003267/236592738-95077666-e948-43fa-a37a-402f3d65a472.png)

`Singleton`
![image](https://user-images.githubusercontent.com/95003267/236592817-d037d009-9616-4566-b61b-fb882bb1bb17.png)

`With Resources`
![image](https://user-images.githubusercontent.com/95003267/236592957-0eb006fb-3fdd-4692-b791-e1e3c0eb192c.png)

`Pool`
![image](https://user-images.githubusercontent.com/95003267/236592990-63c0456f-f2d4-40d4-805d-c012ce1332f7.png)
