estados = ["SP","RJ","MG","SC"] 
for estado in estados:
    print(estado)
    
p = int(input("numeros de produtos para inserir: "))
estoque = []
produto = ''
for n in range(1,p+1):
    produto = int(input(f"prduto{n}/{p}:"))
    estoque.append(produto)
print(f'quantidade de produtos: {estoque}')
print(f'Total: {sum(estoque)}')
media = sum(estoque)/len(estoque)
print(f'Média = {media:,.2f}')