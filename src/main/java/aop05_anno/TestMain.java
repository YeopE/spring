package aop05_anno;

import aop01.MembersDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop/aop06.xml");
        MembersDao dao = (MembersDao)ac.getBean("dao");
        dao.insert("홍길동1");
        dao.update("홍길동2");
        dao.delete("홍길동3");
        dao.select("홍길동4");
    }
}
