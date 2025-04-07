package di01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.setName("홍길동");
//        person.setAge(20);
//        //sout
//        System.out.println("이름:" + person.getName());
//        System.out.println("나이:" + person.getAge());

        //스프링이 di01.xml에 설정된 Bean객체들을 생성해 준다.
        ApplicationContext context = new ClassPathXmlApplicationContext("di01/di01.xml");
        //스프링이 생성해준 Bean객체 꺼내오기
        Person person=(Person) context.getBean("person");
        System.out.println("이름:" + person.getName());
        System.out.println("나이:" + person.getAge());

        Person person1 = (Person) context.getBean("person1"); //리턴타입이 object이므로 형변환을 해줘야한다.)
        System.out.println("person1==>" + person1.hashCode());
        System.out.println("이름:" + person1.getName());
        System.out.println("나이:" + person1.getAge());

        //스프링에서는 객체를 싱글톤 객체로 만들어 준다. (새로 생성하는게 아니라 동일한 객체를 꺼내온다.(hashcode()를 출력하면 동일한 것을 확인 가능))
        Person person2 = (Person) context.getBean("person1");
        System.out.println("person2==>" + person2.hashCode());
        System.out.println("이름:" + person2.getName());
        System.out.println("나이:" + person2.getAge());


        MembersController controller =(MembersController)context.getBean("controller");
        controller.service();
    }
}
