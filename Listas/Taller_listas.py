a = []
l = list()
l.append("Angie")
l.append("Diego")
l.append("Alejandro")
Opcion = input("Ingrese la opcion: \n1.Crear persona \n2.Eliminar persona \n3.listar personas \n4.Buscar persona \n")
if(Opcion == "1"):
    print(l)
    p1=input("Ingrese una persona a la lista: ")
    l.append(p1)
    print(l)
if(Opcion=="2"):
    print(l)
    R=input("Ingrese la persona que quiere remover: ")
    l.remove(R)
    print(l)
if(Opcion=="3"):
    print(l)
if(Opcion=="4"):
    print(l)
    B=input("Ingrese la persona que quiere buscar: ")
    if B in l:
        print("La persona que busca esta en la lista")
    else:
        print("La persona que busca no esta en la lista")