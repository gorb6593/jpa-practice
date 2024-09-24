package jpabook.jpashop.repository;

import jpabook.jpashop.entity.MemberJpa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberJpaRepository extends JpaRepository<MemberJpa, Long> {

}
