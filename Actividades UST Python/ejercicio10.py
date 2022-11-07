import statistics

kilometrajeVehiculo = 5000
InspeccionTecninca = 5000
Revision = 20000
listaGastoAuto = []
agregarKilometraje = 0
opcion = 0
sistem_activo = True


def calcularGastoPorAuto(kilometrajeVehiculo, InspeccionTecninca, Revision):
    if kilometrajeVehiculo == InspeccionTecninca:
        print("Total gastastado en la revisión >", Revision)
    return Revision


def calcularGastoTotal(listaGastoAuto, opcion, sistem_activo):
    opcion
    sistem_activo
    while sistem_activo == 1:
        opcion = int(input("¿Desea agregar otro kilometraje? 1 >"))

        if opcion == 1:
            agregarKilometraje = int(input("Agregar kilometraje >"))
            listaGastoAuto.append(agregarKilometraje)
            print("Lista Kilometraje Autos  ==", listaGastoAuto)
        elif opcion == 10:
            print("Resultado del contador lista >", listaGastoAuto.count)
            break
    return listaGastoAuto


def retornarMenor(listaGastoAuto):
    print("Menor valor de la lista > ", listaGastoAuto.index(min(listaGastoAuto)))
    return listaGastoAuto


def retornarMayor(listaGastoAuto):
    print("Mayor valor de la lista > ", listaGastoAuto.index(max(listaGastoAuto)))
    return listaGastoAuto


def calcularPromedio(listaGastoAuto):
    mean = statistics.mean(listaGastoAuto)
    print("media aritmética lista >", mean)
    return mean


calcularGastoPorAuto(kilometrajeVehiculo, InspeccionTecninca, Revision)
calcularGastoTotal(listaGastoAuto, opcion, sistem_activo)
retornarMayor(listaGastoAuto)
retornarMenor(listaGastoAuto)
calcularPromedio(listaGastoAuto)