km = float(input("Quantos Km foram percorridos? "))
dias = int(input("Quantos dias o carro foi alugado? "))
preco_total = (dias * 90) + (km * 0.2)
print(f"O total a pagar é R${preco_total:.2f}.")
