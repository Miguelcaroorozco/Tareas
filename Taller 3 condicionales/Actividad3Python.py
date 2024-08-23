Nombre = input("Ingrese su nombre: ")
Apellido = input("Ingrese su apellido: ")
edad = int(input("Ingrese su edad: "))
sexo = input("Ingrese su sexo \nM(Masculino) o F(Femenino) :")
print(Nombre+" "+Apellido)
if(edad>=18):
    print("Usted es mayor de edad")
else:
    print("Usted es menor de edad")
if(sexo=="M"):
    print("Usted es hombre")
else:
    print("Usted es Mujer")