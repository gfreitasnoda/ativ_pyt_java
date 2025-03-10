cigarros_por_dia = int(input("Quantos cigarros você fuma por dia? "))
anos_fumando = int(input("Há quantos anos você fuma? "))
tempo_perdido = (cigarros_por_dia * anos_fumando * 365 * 10) / 1440
print(f"Você perdeu aproximadamente {tempo_perdido:.2f} dias de vida fumando.")
