package com.newdyoung.dao;

import com.newdyoung.pojo.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type ,Long> {
    Type findByName(String name);
}
