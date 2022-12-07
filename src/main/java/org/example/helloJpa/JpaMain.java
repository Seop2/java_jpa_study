package org.example.helloJpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");//데이터베이스당 하나 있어야 됨
        EntityManager em = emf.createEntityManager();//팩토리에서 매니저 불러옴
        //엔티티 매니저를 통해서 작업
        //동작 코드 넣는 곳
        EntityTransaction tx = em.getTransaction();//데이터베이스 모든 변경은 트랜잭션안에서 일어나야 함
        //트랜잭션을 통해 작업의 단위를 결정하므로 작업 결과의 신뢰성이 확보됨
        tx.begin();
        Member member = new Member();
        member.setId(1L);
        member.setName("LeeJinSeop");

        em.persist(member);//member 저장

        tx.commit();//커밋
        em.close();
        emf.close();
    }
}
