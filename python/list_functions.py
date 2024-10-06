lucky_numbers = [100, 4, 8, 15, 16, 23, 42]
friends = ["Kevin", "Karen", "Oscar", "Jim", "Oscar", "Taby"]
print(friends)

friends.extend(lucky_numbers)
print(friends)
friends = ["Kevin", "Karen", "Oscar", "Jim", "Oscar", "Taby"]
friends.append("Creed")
print(friends)
friends.insert(1, "Kelly")
print(friends)
friends.remove("Jim")
print(friends)
#friends.clear() #clears the list.
print(friends)
friends.pop() # removes last element from list
print(friends)
print(friends.index("Oscar"))
#print(friends.index("Mike"))#will show error mike does not exist
print(friends.count("Oscar"))
friends.sort()
print(friends)
lucky_numbers.sort()
print(lucky_numbers)
lucky_numbers.reverse()
print(lucky_numbers)
friends2 = friends.copy()
print(friends)
print(friends2)
