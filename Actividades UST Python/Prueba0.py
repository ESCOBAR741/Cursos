
everyone = 0
everyone10 = 0
tens13 = 0
mature17 = 0
adults18 = 0
rp = 0
saldoPuntos = 0

Totaleveryone = 0
Totaleveryone10 = 0
Totaltens13 = 0
Totalmature17 = 0
Totaladults18 = 0
Totalrp = 0
TotalsaldoPuntos = 0

menu = 0
opcion = 0

#Los valores son base a mayor >=
PUNTOSBASE = 10000
PUNTOSJUEGOEVERYONE = 4500
PUNTOSADOLECENTES = 6000
PUNTOSADULTOS = 3500

def calcularPuntos():
    global everyone
    global mature17
    global rp
    
    global Totaladults18
    global Totaleveryone
    global Totaltens13
    
    nombre = input("Ingrese su nombre ")
    print("Bienvenido " ,nombre)
    
    everyone = int(input("¿Cuántos juegos clasificación E posee? ")) * PUNTOSJUEGOEVERYONE
    tens13 = int(input("¿Cuántos juegos clasificación T posee? "))  * PUNTOSADOLECENTES
    mature17 = int(input("¿Cuántos juegos clasificación M posee? "))
    adults18 = int(input("¿Cuántos juegos clasificación AO posee? "))
    rp = int(input("¿Cuántos juegos clasificación RP posee? "))
    
    Totaleveryone = everyone * PUNTOSJUEGOEVERYONE
    Totaltens13 = tens13 * PUNTOSADOLECENTES
    print(Totaleveryone)
    print(Totaltens13)
    
    if adults18 <= tens13:
        Totaladults18 = adults18 * 3500
        print(Totaladults18)
    else:
        print("ao no es valida " ,Totaladults18)
        Totaladults18 = Totaladults18 + PUNTOSBASE
         
        
    #print(" aaaa" ,everyone, tens13)

    
    

    
def menu():
    print("\n cat "" aux.")
    print("Pulse 10 para salir del menu")

while opcion != 10:
    menu()
    opcion = int(input())
    sistema_activo = False

    if opcion == 0:
        print("cataux")
        calcularPuntos()

    elif opcion == 10:
        print("Nos vemos luego ;)")