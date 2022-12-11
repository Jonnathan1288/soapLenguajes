from zeep import Client

#Creación del cliente..
cliente = Client('http://localhost:8080/ProyectoSoapServer/servicios?WSDL')

#Consumo de la operación hello..
print("Op 1: "+cliente.service.hello("Jonnathan"))

#Consumo de la operación diccionario..
print("Op 2: La busqueda de LAN es > "+cliente.service.diccionario("lan"))

#Consumo de la operación petencia..
print("Op 3: La potencia 2, 5 es > "+str(cliente.service.potencia(2, 5)))

#Consumo de la operación suma..
print("Op 4: La suma entre 25 + 50 es >"+str(cliente.service.suma(25, 50)))

#Consumo de la operación resta..
print("Op 5: La resta entre 30 - 4 es > "+str(cliente.service.resta(30, 4)))

#Consumo de la operación multiplicación..
print("Op 6: La multiplicación entre 4 * 2 es > "+str(cliente.service.multiplicacion(4, 2)))

#Consumo de la operación par Impar..
print("Op 7 > número 3 es: "+str(cliente.service.par_impar(3)))

#Consumo de la login..
if cliente.service.login("Jonnathan", "md3108"):
    print("Login succesful")
else:
    print("User error")