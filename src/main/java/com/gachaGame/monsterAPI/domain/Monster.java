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
    private MonsterAbilities monsterAbilities1;
    private MonsterAbilities monsterAbilities2;
    private MonsterAbilities monsterAbilities3;
    @CreatedDate 
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime updatedAt;

    public Monster(ElementsType element, int healPoints, int attackPoints, int defendPoints, int speedPoints, int xp) {
        this.element = element;
        this.healPoints = healPoints;
        this.attackPoints = attackPoints;
        this.defendPoints = defendPoints;
        this.speedPoints = speedPoints;
        this.xp = xp;
        this.monsterAbilities1 = new MonsterAbilities(30, 100, 3);
        this.monsterAbilities2 = new MonsterAbilities(20, 150, 4);
        this.monsterAbilities3 = new MonsterAbilities(50, 50, 5);
    }
    
    /**
     * @param xpGained
     */
    public void addXp(int xpGained) {
        this.xp += xpGained;
        
        if (this.xp >= 100) {
            this.monsterAbilities1.increaseDamage(10);
            this.monsterAbilities1.increaseRatio(10);
            this.monsterAbilities1.decreaseCooldown(1);
            
            this.monsterAbilities2.increaseDamage(10);
            this.monsterAbilities2.increaseRatio(10);
            this.monsterAbilities2.decreaseCooldown(1);
            
            this.monsterAbilities3.increaseDamage(10);
            this.monsterAbilities3.increaseRatio(10);
            this.monsterAbilities3.decreaseCooldown(1);
            
            this.xp -= 100;
        }
    }
}
