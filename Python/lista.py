'''Lista '''
nome = list("SENAC")

'''print(nome)'''

numeros = list(range(1,16))

'''print(numeros)'''

frutas = ["maçã","uva","banana"]

'''print(frutas)'''

'''Adiciona ao final lista'''

frutas.append("morango")

'''print(frutas)'''

'''Insert adiciona a lista na posição indicada'''

frutas.insert(1,"melão")

'''print(frutas)'''

'''adiciona item automaticamente ao final da lista'''

frutas.extend(["abacate","uva"])

'''print(frutas)'''

'''apaga a ultima adição da lista'''

frutas.pop(6) 

'''print(frutas)'''

'''remove o intem nomeado'''

frutas.remove("banana")

'''print(frutas)'''

'''Lista notas'''

notas = ["1","2","3","4"]

print(notas)

'''sorted organiza em ordem cresente'''

print(sorted(notas))

'''sorted organiza em ordem decresente'''

print(sorted(notas, reverse = True))

'''sort organiza em ordem alfabética'''

frutas.sort()

print(frutas)

'''sort organiza em ordem alfabética'''

frutas.sort(reverse = True)

print(frutas)

