package com.gachaGame.monsterAPI.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Document(collection = "monster")
@Getter
@Setter
public class Monster {
    @Id
    private String id;
    private ElementsType element;
    private int healPoints;
    private int attackPoints;
    private int defendPoints;
    private int speedPoints;
    private int xp;
    private MonsterAbilities monsterAbilities;

    @CreatedDate 
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime updatedAt;

    public Monster(String monsterCategory) {
        if(monsterCategory=="Assassin"){
            this.element = ElementsType.FIRE;
            this.healPoints = 100;  
            this.attackPoints = 200;
            this.defendPoints = 50;
            this.speedPoints = 150;
            this.xp = 0;
            this.monsterAbilities = new MonsterAbilities(100, 120, 20);
            this.monsterAbilities = new MonsterAbilities(1000, 180, 60);
            this.monsterAbilities = new MonsterAbilities(20, 100, 1);
        }
        if(monsterCategory=="Tank"){
            this.element = ElementsType.Earth;
            this.healPoints = 250;  
            this.attackPoints = 50;
            this.defendPoints = 200;
            this.speedPoints = 30;
            this.xp = 0;
            this.monsterAbilities = new MonsterAbilities(30, 120, 20);
            this.monsterAbilities = new MonsterAbilities(2000, 200, 45);
            this.monsterAbilities = new MonsterAbilities(15, 100, 1);
        }
    }
    
    /**
     * @param xpGained
     */
    public void addXp(int xpGained) {
        this.xp += xpGained;
        
        if (this.xp >= 100) {
            this.monsterAbilities.increaseDamage(10);
            this.monsterAbilities.increaseRatio(10);
            this.monsterAbilities.decreaseCooldown(1);
            
            this.monsterAbilities.increaseDamage(10);
            this.monsterAbilities.increaseRatio(10);
            this.monsterAbilities.decreaseCooldown(1);
            
            this.monsterAbilities.increaseDamage(10);
            this.monsterAbilities.increaseRatio(10);
            this.monsterAbilities.decreaseCooldown(1);
            
            this.xp -= 100;
        }
    }
}
