metros = float(input("Digite uma distância em metros: "))

unidades = {
    "Km": 1000,
    "Hm": 100,
    "Dam": 10,
    "dm": 0.1,
    "cm": 0.01,
    "mm": 0.001,
}

print(f"A distância de {metros}m corresponde a:")
for unidade, fator in unidades.items():
    valor= metros / fator
    print(f"{valor}{unidade}")