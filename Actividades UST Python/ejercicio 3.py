import random

posicionActual = 0
dado = 0

while posicionActual <= 100:
    print("\n Nuevo turno, pocisión actual" ,posicionActual, )
    print("Que ruede el dado")
    dado = random.randint(1,6)
    print("Avanzas" ,dado,)
    print("Salio el " ,dado, "y avanzas " ,dado,)
    print("Pulsa enter para continuar")
    input()
    posicionActual = posicionActual + dado
    
    print("\n")

    if posicionActual == 3:
        print("Subes a al lugar 60")
        posicionActual =60

    elif posicionActual == 6:
        print("Subes al lugar 47")
        posicionActual =47

    elif posicionActual == 32:
        print("Subes al lugar 53")
        posicionActual =53

    elif posicionActual == 45:
        print("Subes al lugar 86")
        posicionActual =86
    
    elif posicionActual == 50:
        print("Ops, bajas al lugar 13")
        posicionActual =13

    elif posicionActual == 51:
        print("Subes al lugar 94")
        posicionActual =94

    elif posicionActual == 61:
        print("Subes al lugar 83")
        posicionActual =83

    elif posicionActual == 68:
        print("Ops, bajas al lugar 55")
        posicionActual =55

    elif posicionActual == 81:
        print("Ops, bajas al lugar 43")
        posicionActual =43

    elif posicionActual == 93:
        print("Ops, bajas al lugar 43")
        posicionActual =43

    elif posicionActual == 98:
        print("Ops, bajas al lugar 36")
        posicionActual =36

        
print("Ganaste")