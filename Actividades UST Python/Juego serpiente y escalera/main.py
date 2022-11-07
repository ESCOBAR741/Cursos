import turtle as tw
import random

posicionActual = 0
dado = 0
casilla = 33
tortuga = tw.Turtle()

def moverTortuga():
  global tortuga
  global posicionActual
  global casilla

  if posicionActual == 10 or posicionActual == 11 or posicionActual == 30 or posicionActual == 31 or posicionActual == 50 or posicionActual == 51 or posicionActual == 70 or posicionActual == 71 or posicionActual == 90 or posicionActual == 91:
    tortuga.left(90)
  elif posicionActual == 20 or posicionActual == 21 or posicionActual == 40 or posicionActual == 41 or posicionActual == 60 or posicionActual == 61 or posicionActual == 80 or posicionActual == 81:
    tortuga.right(90)
  tortuga.forward(casilla)
  
def serpientesyescaleras():
  global posicionActual
  global tortuga
  global casilla

  #Escalera
  if posicionActual == 3:
    print("Subes a la Casilla 60")
    posicionActual = 60
    tortuga.goto (tortuga.xcor()-2*casilla, tortuga.ycor()+5*casilla)
    tortuga.left(180)


  elif posicionActual == 6:
    print("Subes a la Casilla 47")
    posicionActual = 47
    tortuga.goto(tortuga.xcor()+casilla, tortuga.ycor()+4*casilla)
  
  elif posicionActual == 32:
    print("Subes a la Casilla 32")
    tortuga.goto(tortuga.xcor()-casilla, tortuga.ycor()+2*casilla)

  elif posicionActual == 45:
    print("Subes a la Casilla 86")
    posicionActual = 86
    tortuga.goto(tortuga.xcor()+casilla, tortuga.ycor()+4*casilla)
  
  elif posicionActual == 51:
    print("Subes a la Casilla 94")
    posicionActual = 94
    tortuga.goto(tortuga.xcor()-3*casilla, tortuga.ycor()+4*casilla)
    tortuga.left(90)

  elif posicionActual == 61:
    print("Subes a la Casilla 83")
    posicionActual = 83
    tortuga.goto(tortuga.xcor()+2*casilla, tortuga.ycor()+2*casilla)
    tortuga.right(90)
  
#Serpiente
  elif posicionActual == 50:
    print("Bajas a la Casilla 13")
    posicionActual = 13
  elif posicionActual == 68:
    print("Bajas a la Casilla 55")
    posicionActual == 55
  elif posicionActual == 81:
    print("Bajas a la Casilla 16")
    posicionActual = 16
  elif posicionActual == 93:
    print("Bajas a la Casilla 43")
    posicionActual = 43
  elif posicionActual == 98:
    print("Bajas a la Casilla 36")
    posicionActual =36
  
# configuramos el mapa de tortugas
tw.bgpic( "sye.png" )
screen = tw.Screen()
screen.setup( 400, 400 ) 
screen.title( "Actividad 0" )

# creamos una tortuga
tortuga.shape( 'turtle' )
tortuga.setheading( 90 )
tortuga.speed( 2 )

# la preparamos para dibujar
tortuga.pensize( 4 )

# dibujamos
tortuga.penup()
tortuga.goto( -180, -150 )
#tortuga.pendown()

tortuga.right( 90 )
tortuga.penup()

while posicionActual < 100:
  print("Estas en" ,posicionActual," aux." )
  print("Pulsa Enter")
  input()
  dado = random.randint(1,6)
  print("\n Avanzas" ,dado, " Casillas" )
  
  while dado > 0:
    dado = dado -1
    moverTortuga()
    posicionActual = posicionActual +1
    
  serpientesyescaleras()
print("Ganaste")