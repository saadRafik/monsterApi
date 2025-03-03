package com.gachaGame.monsterAPI.services;

import com.gachaGame.monsterAPI.domain.Monster;
import org.springframework.stereotype.Service;

@Service
public class MonsterService {
    /**
     * @param monster
     * @param xpGained
     */
    public void addXp(Monster monster, int xpGained) {
        if (monster != null) {
            monster.addXp(xpGained);
        }
    }
}
