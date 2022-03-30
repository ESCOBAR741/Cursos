def mimenu ():
    print("/n")
    print("Menú principal")
    print("1.- Solicitar un saludo")
    print("2.- Cerrar función")
    print("3.- Ingresa tu opción:")

opcion = 0
nombre = ""

while opcion != 2:
    mimenu()
    opcion = int(input())
    sistema_activo = False

    if opcion == 1:
        nombre = input("Dime como te llamas ")
        print("Que bueno es tenerte de regreso ", nombre)

    elif opcion == 2:
        print("Programa cerrado")

    else:
        print("La opción ingresada no es válida, intentelo de nuevo")