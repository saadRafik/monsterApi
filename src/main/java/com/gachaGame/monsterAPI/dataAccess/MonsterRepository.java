package com.gachaGame.monsterAPI.dataAccess;

import com.gachaGame.monsterAPI.domain.Monster;
import com.gachaGame.monsterAPI.domain.ElementsType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MonsterRepository extends MongoRepository<Monster, String> {
    List<Monster> findByElement(ElementsType element);
    List<Monster> findByXpGreaterThan(int xp);
    List<Monster> findByHpGreaterThan(int hp);
}
