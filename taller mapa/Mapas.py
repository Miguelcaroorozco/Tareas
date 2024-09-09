class Usuario:
    def __init__(self, nombrecompleto, nickname, clave, tipo, fecha_creacion):
        self.datos = {
            "Nombre completo": nombrecompleto,
            "nickname": nickname,
            "clave": clave,
            "tipo": tipo,
            "fecha_creacion": fecha_creacion
        }

def menu():
    usuarios = []     
    while True:
        opcion = input("Ingrese un número dependiendo de la opción a usar (1-4) \n1)Agregar usuario \n2)Buscar usuario \n3)Eliminar usuario \n0)Salir\n")

        if opcion == "1":
            print("Usted ha eligido la opcion 1)Agregar usuario")
            nombrecompleto = input("Ingrese su nombre completo: ")
            nickname = input("Ingrese su nickname: ")
            clave = input("Ingrese su clave: ")
            tipo = input("Ingrese su tipo (Administrador,Usuario,Nuevo): ")
            fecha_creacion = input("Ingrese la fecha de creación (Año/Mes/Dia): ")
            
            nuevo_usuario = Usuario(nombrecompleto, nickname, clave, tipo, fecha_creacion)
            usuarios.append(nuevo_usuario)
            print("Usuario agregado\n")

        elif opcion == "2":
            print("Usted a elegido la opcion 2)Buscar usuario ")
            nickname = input("Ingrese el nickname del usuario a buscar: ")
            for usuario in usuarios:
                if usuario.datos["nickname"] == nickname:
                    print("Usuario encontrado:", usuario.datos)
                    break
            else:
                print("Nickname no encontrado.")

        elif opcion == "3":
            print("Usted a elegido la opcion 3)Eliminar usuario")
            nickname = input("Ingrese el nickname del usuario a eliminar: ")
            for i, usuario in enumerate(usuarios):
                if usuario.datos["nickname"] == nickname:
                    del usuarios[i]
                    print("Usuario eliminado correctamente\n")
                    break
            else:
                print("Nickname no encontrado\n")

        elif opcion == "0":
            print("Terminando programa")
            break

        else:
            print("Opción inválida, por favor intente de nuevo.\n")
menu()    