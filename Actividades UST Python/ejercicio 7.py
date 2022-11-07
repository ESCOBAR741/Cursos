#len() retorna todo el Array
# lista.append(elemento)
#lechuga = ["a","b","c"]
#lechuga.append("d")
#print(lechuga) ["a","b","c","d"]

#del lista [indice] delete
#del lechuga[0]
#print(lechuga) ["b", "c", "d"]

import random

balas= [1,0,0,0,0]
continuar = True
opcion = 0
nombres = []
numeroJugador= 1

print("Ingresa los jugadores")
while continuar == True:
      print("Ingresa el nombre del jugador" ,numeroJugador, " :" )
      
      nombreNuevo=input("Ingresa un nombre ")
      nombres.append(nombreNuevo)
      print("Agregas otro nombre? s/n")
      opcion = input()
      if opcion == "n":
       continuar = False
      numeroJugador = numeroJugador + 1

indice = 0
indiceBala =0

while len(nombres) >1:
    print("Es tu turno de " ,nombres[indice])
    print("Presiona el gatillo ",nombres[indice])
    input()

    indiceBala = random.randint(0, len(balas)-1)
    if balas(indiceBala) ==1:
       print("¡BANG!...")
       print("Un jugador menos")
       del nombres[indice]
       balas = [1,0,0,0,0]
       print("Quedan " ,balas, " balas")
    else:
        print("CLICK")
        indice = indice +1
        del balas[indiceBala]
        print("Quedan " ,balas, " balas")
        if indice >= len(nombres):
            indice = 0
print("El ganador es " ,nombres[0])