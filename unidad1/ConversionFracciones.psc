Algoritmo ConversionFracciones
	//Realiza un algoritmo que a partir del dividendo 
	//y divisor indicados por el usuario, genere la 
	//representación de la fracción impropia a su
	//representación en fracción mixta
	//EJEMPLOS
	//Entrada
	//10	   9       1	   5		6           0
	//3        2       2       1        0           3
	//Salida
	//3 1/3    4 1/2   1/2     5        Imposible   0
	Definir a,b,c,k Como Entero
	Leer a,b
	Si a=0 Entonces
		Escribir 0
	SiNo
		Si b=0 Entonces
			Escribir "Imposible"
		SiNo
			k<-a%b
			//c<-(a-k)/b
			c<-trunc(a/b)
			Si c==0 Entonces
				escribir k,"/",b
			SiNo
				si k=0
					escribir c
				sino
					Escribir c," " k "/" b
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
