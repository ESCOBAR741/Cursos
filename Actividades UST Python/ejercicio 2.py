mes = int(input("Ingrese el mes en número  "))
dia = int(input("Ingrese el dia del mes en número  "))


if mes ==1 and dia <= 19:
    print("Capricornio")
else:
    if dia >=20 and dia <= 31:
        print("Acuario")

if mes ==2 and dia <= 18:
    print("Acuario")
else:
    if dia >=19 and dia <= 31:
        print("Picis")

if mes ==3 and dia <= 20:
    print("Picis")
else:
    if dia >=21 and dia <= 31:
        print("Aries")
    
if mes ==4 and dia <= 20:
    print("Aries")
else:
    if dia >=21 and dia <= 31:
        print("Tauro")

if mes ==5:
    print("Mayo")
else:
    if dia >=21 and dia <= 31:
        print("Tauro")
    
if mes ==6:
    print("Junio")
if mes ==7:
    print("Julio")
if mes ==8:
    print("Agosto")
if mes ==9:
    print("Septiembre")
if mes ==10:
    print("Octubre")
if mes ==11:
    print("Noviembre")
if mes ==12:
    print("Diciembre")