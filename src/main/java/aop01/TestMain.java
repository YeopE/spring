package aop01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop/aop01.xml");
        MembersDao dao = (MembersDao)ac.getBean("membersDao"); //부모객체
        //MembersDaoImpl dao = (MembersDaoImpl)ac.getBean("membersDao"); //자식객체 ClassCastException(형변환 에러가 뜬다.)
        dao.insert("홍길동1");
        dao.update("홍길동2");
        dao.delete("홍길동3");
        dao.select("홍길동4");
    }
}
