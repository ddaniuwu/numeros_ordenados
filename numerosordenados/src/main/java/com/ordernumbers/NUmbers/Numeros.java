package com.ordernumbers.NUmbers;

public class Numeros {
	public void Ordenar() {
		int auxiliar;

		int numbers []= {1,2,8,44,9,26,3,7,33,1,93,417,19,27,14,11,30,4};

		  for(int i = 0; i < numbers.length; i++){
				for(int j=i+1; j < numbers.length; j++){
					if(numbers[i] < numbers[j]){
						auxiliar = numbers[i];
						numbers[i] = numbers[j];
						numbers[j] = auxiliar;
						System.out.print("\n"+ auxiliar);
					}
				}
				
			}
	}
}
