Algoritmo TrimestreOpcion2
	Definir m Como Entero
	Leer m
	Si m>=1 y m<=3 Entonces
		Escribir "Primer trimestre"
	SiNo
		Si m>=4 y m<=6 Entonces
			Escribir "Segundo trimestre"
		SiNo
			Si m>=7 y m<=9 Entonces
				Escribir "Tercer trimestre"
			SiNo
				Si m>=10 y m<=12 Entonces
					Escribir "Cuarto trimestre"
				SiNo
					Escribir "Mes no valido"
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
