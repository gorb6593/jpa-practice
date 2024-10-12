package jpabook.jpashop;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jpabook.jpashop.entity.Hello;
import jpabook.jpashop.entity.QHello;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


import static org.assertj.core.api.Assertions.*;

@Transactional
@SpringBootTest
class JpashopApplicationTests {

	@Autowired
	EntityManager em;


	@Test
	void contextLoads() {
		Hello hello = new Hello();
		em.persist(hello);

//		JPAQueryFactory query = new JPAQueryFactory(em);
//		QHello qHello = new QHello("h");
//
//		Hello result = query
//				.selectFrom(qHello)
//				.fetchOne();
//
//		assertThat(result).isEqualTo(hello);

	}

}
