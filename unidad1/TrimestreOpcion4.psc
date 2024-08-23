Algoritmo TrimestreOpcion4
	Definir m,trimestre Como Entero
	Leer m
	Si m>=1 y m<=12 Entonces
		trimestre<-trunc(m/4)
		Si trimestre=1 Entonces
			Escribir "Primer trimestre"
		SiNo
			Si trimestre=2 Entonces
				Escribir "Segundo trimestre"
			SiNo
				Si trimestre=3 Entonces
					Escribir "Tercer trimestre"
				SiNo
					Escribir "Cuarto trimestre"
				FinSi
			FinSi
		FinSi
	SiNo
		Escribir "Mes no valido"
	FinSi
FinAlgoritmo
