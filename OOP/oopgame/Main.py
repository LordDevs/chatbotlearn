from zombie import Zombie
from Ogre import Ogre

zombie = Zombie(10, 2)   # HP=10, dano=2
ogre = Ogre(20, 3)       # HP=20, dano=3

print(f'{zombie.get_type_of_enemy()} has {zombie.health_points} health points and can attack for {zombie.attack_damage}')
print(f'{ogre.get_type_of_enemy()} has {ogre.health_points} health points and can attack for {ogre.attack_damage}')

zombie.talk()
zombie.walk_forward()
zombie.attack()

ogre.talk()
ogre.walk_forward()
ogre.attack()