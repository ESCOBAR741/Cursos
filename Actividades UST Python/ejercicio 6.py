def ingresarNumero():
  print("Ingresa un número: ")
  numeroNuevo = int(input())
  return numeroNuevo
  
def ingresarNumeroNoCero():
  otroNumero = ingresarNumero()

  while otroNumero == 0:
    print("\nDebes ingresar un número diferente de cero")
    print("Inténtalo nuevamente")
    otroNumero = ingresarNumero()

  return otroNumero

def sumar():
  sumando1 = ingresarNumero()
  sumando2 = ingresarNumero()
  suma = sumando1 + sumando2
  print("El resultado de sumar", sumando1, "con", sumando2, "es:", suma)

def restar(minuendo, sustraendo):
  resta = minuendo - sustraendo
  print("El resultado de restar", minuendo, "con", sustraendo, "es: ", resta)

def multiplicar(factor1, factor2):
  producto = factor1 * factor2
  return producto

def dividir():
  dividendo = ingresarNumero()
  divisor = ingresarNumeroNoCero()
  cuociente = dividendo / divisor
  return cuociente

def menu():
  print("1.- Sumar")
  print("2.- Restar")
  print("3.- Multiplicar")
  print("4.- Dividir")
  print("5.- Salir")

  print("Ingresa una opcion: ")
  opcion = int(input())

  while opcion <1 or opcion >5:
    print("La opción ingresada no es válida")
    print("Por favor, inténtalo nuevamente: ")
    print(">> Ingresa tu opción: ")
    opcion = int(input())

  return opcion

seleccion = 0

while seleccion != 5:
  seleccion = menu()
  if seleccion == 1:
    sumar()
  elif seleccion == 2:
    aux1 = ingresarNumero()
    aux2 = ingresarNumero()
    restar(aux1, aux2)
  elif seleccion == 3:
    f1 = ingresarNumero()
    f2 = ingresarNumero()
    producto = multiplicar(f1, f2)
    print("El producto de la multiplicación es: ", producto)
  elif seleccion == 4:
    print("El resultado de la división es:", dividir())