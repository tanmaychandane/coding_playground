#strings
print("Gold and Silver")
print("Gold \nSilver")
print("Gold \" Silver") # \ is escape character
print("Gold \ Silver") #this will display a warning
phrase = "King Seiko"
print(phrase)
print(phrase+ " is cool")
print(phrase.lower())
print(phrase.upper())
print(phrase.isupper())
print(phrase.upper().isupper())
print(len(phrase))
print(phrase[0])
print(phrase.index("e"))
print(phrase.index("Seik"))
#print(phrase.index("R")) #R not present in string
print(phrase.replace("King", "Grand"))
