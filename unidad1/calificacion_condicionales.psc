Algoritmo sin_titulo
	Definir calificacion Como Entero
	Leer calificacion
	Si calificacion>100 Entonces
		//Calificaci�n incorrecta
		Escribir "La calificacion m�xima es 100"
	SiNo
		Si calificacion>=0 Entonces
			//Calificacion correcta
			Si calificacion>=70 Entonces
				Escribir "�Aprobaste!"
			SiNo
				Escribir "Sigue esforz�ndote"
			Fin Si
		SiNo
			//Calificacion Incorrecta
			Escribir "La calificicaci�n m�nima es 0"
		FinSi
	FinSi
	
FinAlgoritmo
