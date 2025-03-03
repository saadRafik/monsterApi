package com.gachaGame.monsterAPI.domain;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Document(collection = "monsterAbilities")
@Getter
@Setter
public class MonsterAbilities {
    @Id
    private String id;
    private int damage;
    private int ratio;
    private int cooldown;
    private int upgradeLevel;
    private final int maxUpgradeLevel = 10;
    
    @CreatedDate 
    private LocalDateTime createdAt;
    
    @LastModifiedDate
    private LocalDateTime updatedAt;
    
    public MonsterAbilities(int damage, int ratio, int cooldown) {
        this.damage = damage;
        this.ratio = ratio;
        this.cooldown = cooldown;
        this.upgradeLevel = 0;
    }

    public void increaseDamage(int amount) {
        this.damage += amount;
    }

    public void increaseRatio(int amount) {
        this.ratio += amount;
    }
    
    public void decreaseCooldown(int amount) {
        this.cooldown -= amount;
    }
}