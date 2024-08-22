Algoritmo sin_titulo
	Definir calificacion Como Entero
	Leer calificacion
	Si calificacion>100 Entonces
		//Calificación incorrecta
		Escribir "La calificacion máxima es 100"
	SiNo
		Si calificacion>=0 Entonces
			//Calificacion correcta
			Si calificacion>=70 Entonces
				Escribir "¡Aprobaste!"
			SiNo
				Escribir "Sigue esforzándote"
			Fin Si
		SiNo
			//Calificacion Incorrecta
			Escribir "La calificicación mínima es 0"
		FinSi
	FinSi
	
FinAlgoritmo
