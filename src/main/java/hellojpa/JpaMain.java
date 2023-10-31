package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello"); // persistence.xml의 persistence-unit name 가져옴

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            // 멤버 저장하기
//            Member member = new Member();
//            member.setId(2L);
//            member.setName("helloB");
//
//            em.persist(member);

            // 멤버 수정하기
//            Member findMember = em.find(Member.class, 1L);
//            System.out.println("findMember.id = " + findMember.getId());
//            System.out.println("findMember.name = " + findMember.getName());
//            findMember.setName("HelloJPA");

            // 멤버 삭제하기
//            Member findMember = em.find(Member.class, 1L);
//            em.remove(findMember);

//            List<Member> result = em.createQuery("select m from Member as m", Member.class)
//                    .setFirstResult(0)
//                    .setMaxResults(10)
//                    .getResultList();
//
//            for(Member member : result)
//                System.out.println("member = "+ member.getName());

            // 비영속
//            Member member = new Member();
//            member.setId(101L);
//            member.setName("helloJPA");

            // 영속
//            System.out.println("=== Before ===");
//            em.persist(member);
//            System.out.println("=== After ===");
//
//            Member findMember1 = em.find(Member.class, 101L);
//            Member findMember2 = em.find(Member.class, 101L);
//
//            System.out.println("result = " + (findMember1 == findMember2));

//            System.out.println("findMember.id = " + findMember.getId());
//            System.out.println("findMember.name = " + findMember.getName());

//            Member member1 = new Member(150L, "A");
//            Member member2 = new Member(160L, "B");
//
//            em.persist(member1);
//            em.persist(member2);

            Member member = em.find(Member.class, 150L);
            member.setName("2222");

//            em.persist(member);

            System.out.println("==============");

            tx.commit();
        } catch(Exception e){
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
