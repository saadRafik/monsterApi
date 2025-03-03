package com.gachaGame.monsterAPI.controllers;

import com.gachaGame.monsterAPI.domain.Monster;
import com.gachaGame.monsterAPI.domain.ElementsType;
import com.gachaGame.monsterAPI.services.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/monsters")
public class MonsterController {

    private final MonsterService monsterService;

    @Autowired
    public MonsterController(MonsterService monsterService) {
        this.monsterService = monsterService;
    }

    /**
     * @param id
     * @param xp 
     * @return
     */
    @PostMapping("/{id}/xp")
    public Monster addXpToMonster(@PathVariable("id") String id, @RequestParam("xp") int xp) {
        Monster monster = new Monster(ElementsType.FIRE, 100, 50, 30, 20, 0);
        monsterService.addXp(monster, xp);
        return monster;
    }
}
