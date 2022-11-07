saldo = 30000
girar = 0
depositar = 0
menu = 1
opcion = 0
usuarioDepositar = 0

def menu():
    print("\n Saldo ",saldo," aux.")
    print("Pulse 10 para salir del menu")
    print("Para girar presione 2")
    print("Para Depositar presione 3")
    print("Pulsa Enter para continuar")

def depositarDinero():
    global depositar
    global saldo
    depositar = int(input("Introduce la cantidad a depositar"))
    saldo = saldo + depositar

def girarDinero():
    global girar
    global saldo

    girar = int(input("Dígame la cantidad a girar "))
    if girar > saldo:
        print("No puede girar porque su saldo es menor al monto de destino")
    elif girar <= saldo:
       saldo = girar + saldo
    return girar

while opcion != 10:
    menu()
    opcion = int(input())
    sistema_activo = False

   
#Opciones
    if opcion == 0:
        print("cataux ")
    elif opcion == 2:
        print("Girar dinero a ")
        girarDinero()
    elif opcion == 3:
        print("Depositar dinero a ")
        depositarDinero()
    elif opcion == 10:
        print("Nos vemos luego ")


print("Suerte...   ;)")