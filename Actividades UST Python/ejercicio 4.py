def mimenu():
  print("\n")
  print(" Menú Principal ")
  print("1.- Solicitar un saludo")
  print("2.- Cerrar programa")
  print("Ingresa tu opción: ")


opcion = 0
nombre = ""
sistema_activo = True

while sistema_activo == True:
  mimenu()
  opcion = int(input())

  if opcion == 1:
    nombre = input("Dime como te llamas: ")
    print("Que bueno es tenerte de regreso ", nombre)

  elif opcion == 2:
    print("Cerrando el programa")
    sistema_activo = False

  else:
    print("La opcion ingresada no es válida, inténtalo nuevamente")

print("Programa cerrado")