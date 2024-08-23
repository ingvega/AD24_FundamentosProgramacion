Algoritmo TrimestreOpcion3
	Definir m Como Entero
	Leer m
	Si m<1 Entonces
		Escribir "Mes no valido"
	SiNo
		Si m<4 Entonces
			Escribir "Primer trimestre"
		SiNo
			Si m<7 Entonces
				Escribir "Segundo trimestre"
			SiNo
				Si m<10 Entonces
					Escribir "Tercer trimestre"
				SiNo
					Si m<13 Entonces
						Escribir "Cuarto trimestre"
					SiNo
						Escribir "Mes no valido"
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
