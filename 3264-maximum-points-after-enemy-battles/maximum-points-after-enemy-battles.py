class Solution:
    def maximumPoints(self, enemyEnergies: List[int], currentEnergy: int) -> int:

        enemyEnergies.sort()
        visited=set()
        total_points=0
        min_val=0
        if currentEnergy < enemyEnergies[0]:
            return 0
        

        for j in enemyEnergies[1:]:
            currentEnergy+=j

        return currentEnergy//enemyEnergies[0]

        
        


        