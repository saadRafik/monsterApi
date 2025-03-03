package monstre.api;

import static org.junit.jupiter.api.Assertions.*;

import com.gachaGame.monsterAPI.domain.ElementsType;
import com.gachaGame.monsterAPI.domain.Monster;
import com.gachaGame.monsterAPI.domain.MonsterAbilities;
import org.junit.jupiter.api.Test;

public class MonsterTest {

    @Test
    public void testAddXpWithoutLevelUp() {
        Monster monster = new Monster(ElementsType.FIRE, 100, 50, 30, 20, 0);        
        monster.addXp(50);
        assertEquals(50, monster.getXp());
    }
    
    @Test
    public void testAddXpWithLevelUp() {
        Monster monster = new Monster(ElementsType.WATER, 100, 50, 30, 20, 90);
        monster.addXp(20);
        assertEquals(10, monster.getXp());
        MonsterAbilities abilities = monster.getMonsterAbilities1();
        assertEquals(40, abilities.getDamage()); 
        assertEquals(110, abilities.getRatio());    
        assertEquals(2, abilities.getCooldown());  
    }
}
