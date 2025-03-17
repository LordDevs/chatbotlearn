from Animals import *

dog = Dog()

dog.legs
dog.ears
dog.type
dog.age
dog.name


cat = Cat()

cat.legs
cat.ears
cat.type
cat.age
cat.name


from oopgame.Enemy import *

enemy = Enemy()

enemy.type_of_enemy = 'the unknowns'

print(f'{enemy.type_of_enemy} has {enemy.health_points} health points And can do attack of {enemy.attack_damage}')