Algoritmo Compatacion_Precios
	Definir precio, precio_por_paquete,resultado,descuento, precio_por_promocion Como Real
	Escribir "Ingresa en orden el precio y descuento del producto"
	Leer precio, descuento
	precio_por_paquete<-(precio*2)/3
	precio_por_promocion<-precio*(1-descuento/100)

	Escribir "Tu producto con promocion seria", precio_por_promocion
	Escribir "El precio del producto por paquete seria",precio_por_paquete
FinAlgoritmo
