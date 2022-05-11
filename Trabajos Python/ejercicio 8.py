import random
import os

cartas_cpu = []
cartas_player = []
listapalos = ["Picas","Tréboles","Diamantes","Corazones"]
iconopalos = ["♠","♣","♦","♥"]
cartasEspeciales = ["A", "J", "Q", "K"]
resultadoCartas = []
numeroResultado = 0

def menu():
  print(" Menú Principal ")
  print("1.- Jugar Black Jack")
  print("2.- Cerrar programa")

def sacarCarta():
  global carta_sacada
  global carta_valida
  
  carta_valida = False
  while carta_valida == False:
    carta_sacada = random.randint(1,52)
    carta_valida = True
    for i in cartas_cpu:
      if i == carta_sacada:
        carta_valida = False
    for i in cartas_player:
      if i == carta_sacada:
        carta_valida = False
  return carta_sacada

def numacarta(numero):
  global iconopalos
  global listapalos
  global resultadoCartas
  global numeroResultado

  palos = 0
  while numero-13 > 0:
    palos = palos + 1
    numero = numero - 13
  if numero == 1:
    print("Carta es el As de",listapalos[palos],"(","A",iconopalos[palos],")")
  elif numero == 11:
    print("Carta es el Jota de",listapalos[palos],"(","J",iconopalos[palos],")")
  elif numero == 12:
    print("Carta es la Reina de",listapalos[palos],"(","Q",iconopalos[palos],")")
  elif numero == 13:
    print("Carta es el Rey de",listapalos[palos],"(","K",iconopalos[palos],")")
  else:
    print("Carta es el",numero,"de",listapalos[palos],"(",numero,iconopalos[palos],")")
  
  print("Acumulador " ,numero)
  resultadoCartas == numero
  
def carta():
  global cartas_player
  global cartas_cpu
  global resultadoCartas
  global resultadoCartasPlayer1

  command = 'clear'
  if os.name in ('nt', 'dos'):
      command = 'cls'
  os.system(command)
  cartas_player.append(sacarCarta())
  resultadoCartasPlayer1 = resultadoCartas
  cartas_cpu.append(sacarCarta())
  cartas_player.append(sacarCarta())
  cartas_cpu.append(sacarCarta())

  print("CARTAS CPU: ")
  for i in cartas_cpu:
    numacarta(i)
  print("CARTAS PLAYER: ")
  for i in cartas_player:
    numacarta(i)
    
  sumaCpu = cartas_cpu[0] + cartas_cpu[1]
  print("Suma CPU = " ,sumaCpu)  
  sumaPlayer = cartas_player[0] + cartas_player[1]
  print("Suma Player = " ,sumaPlayer)
  if sumaPlayer > sumaCpu:
      print(">>>Gana Player" ,resultadoCartas)
  else:
      print(">>>Gana CPU" ,resultadoCartas)

opcion = 0
sistema_activo = True

while sistema_activo == True:
  carta()
  input()
  
print("Gracias")