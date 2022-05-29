listaInventario = []
nombre = ""

def menu():
    print(" Menú Principal ")
    print("1.- Agregar inventario ")
    print("2.- Eliminar Inventario ")
    print("3.- Comprar")
    print("5.- Cerrar programa ")

def inventarioTienda():
    item = str(input(print("Indiqueme el artiiculo a agregar")))
    listaInventario.append(item)
    print("Inventario actual ", listaInventario)
    return listaInventario

def eliminarInventario():
    print("La lista actual es de " ,listaInventario)
    eliminar = int(input(print("Indiqueme el elemento a eliminar")))
    listaInventario.remove(eliminar)
    print("Inventario actual " ,listaInventario)
    return listaInventario

def comprarInventario():
    print("Lista inventario" ,listaInventario)
    seleccion = int(input("Seleccione el inventario en números"))


opcion = 0
sistema_activo = True
while sistema_activo == True:
    menu()
    opcion = int(input())

    if opcion == 1:
        print("Opción 1 > ")
        inventarioTienda()
    elif opcion ==2:
        print("Opcion 2 > ")
        eliminarInventario()
    elif opcion ==3:
        print("Opción 3 > ")
        comprarInventario()
    elif opcion == 5:
        print("Opción 5 > ")
        sistema_activo = False

print("Gracias")