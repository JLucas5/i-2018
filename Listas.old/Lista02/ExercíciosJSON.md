## Exercícios JSON 
 
#### 1- Quais são os valores (“literais”) admitidos em JSON? Não confunda com aqueles escritos entre aspas (sequências de caracteres). 
  São adimitidos valores como: **String, Number, Object, Array, True, False e null.**

#### 2- Qual é o MIME type para arquivo contendo dados no formato JSON? 
  O MIME Type do JSON é application/json.
  
#### 3- Você consegue identificar o problema no arquivo JSON abaixo?  
  No campo "null", o valor correto a se atribuir seria null e não nil.  
  
#### 4- Qual seria um possível arquivo JSON contendo dados correspondentes a uma instância de um objeto da classe Bicycle? 

type Bicycle {  
    "cadence": null,   
    "gear": null,  
    "speed": null  
}  

#### 5- Qual seria a representação em JSON de um objeto contendo as seguintes propriedades (e valores correspondentes)? Propriedades seguem em negrito.  

a. lista de **cidades**: Goiânia e Trindade;  
b. **salada**: alface;  
c. **altura**: 2,3;  
d. **sabor** preferido: (nenhum valor fornecido para esta propriedade);  

{  
    "cidades": ["Goiânia", "Trindade"],   
    "salada": "alface",  
    "altura": 2.3,  
    "sabor": null  
}  


#### 6- Exercite os serviços oferecidos por esse portal. 


