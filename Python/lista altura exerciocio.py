#criar lista de alturas 
a = int(input("Pessoas para calcular as médias: "))
altura = []
alturas = ''
#adiciona sempre 1 a numero de alturas
for n in range(1,a+1):
    
    alturas = float(input(f"Altura {n}/{a}:"))
    
    #adiciona sempre 1 altura a lista
    altura.append(alturas)
   
print(f'Alturas: {altura}')


#adiciona alturas no total

print(f'Total: {sum(altura)}')

#calcula a media
media = sum(altura)/len(altura)

print(f'Média = {media:,.2f}')