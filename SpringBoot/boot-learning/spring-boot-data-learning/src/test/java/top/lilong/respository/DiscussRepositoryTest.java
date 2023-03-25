package top.lilong.respository;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import top.lilong.damain.Discuss;

import java.util.List;
import java.util.Optional;


@SpringBootTest
public class DiscussRepositoryTest {

    @Resource
    private DiscussRepository discussRepository;

//    @Test
//    void findByAuthorNotNull(){
//        List<Discuss> list = discussRepository.findByAuthorNotNull();
//        list.forEach(System.out::println);
//    }

    @Test
    void findByAIdEqual(){
        List<Discuss> list = discussRepository.findByAIdEquals(1);
        list.forEach(System.out::println);
    }
    @Test
    void findByAuthorAndAIdIsNotNull(){
        discussRepository.findByAuthorNotNullAndAIdIsNotNull().forEach(System.out::println);
    }
    @Test
    void findByAuthorEndsWith(){
        discussRepository.findByAuthorEndsWith("y").forEach(System.out::println);
    }
    @Test
    void findByAuthorC(){
        discussRepository.findByAuthorContains("y").forEach(System.out::println);
    }

    @Test
    /**
     * 使用 JpaResposity 方法名关键字进行查询
     */
    void selectComment(){
        Optional<Discuss> optional = discussRepository.findById(1);
        optional.ifPresent(System.out::println);
//        boolean present = optional.isPresent();
//        if (present){
//            Discuss discuss = optional.get();
//            System.out.println(discuss);
//        }
    }
//    @Test
//    void getDiscussByPage(){
////        PageRequest pageable =PageRequest.of(0,3);
//
//        Pageable pageable = PageRequest.of(0, 3);
//        List<Discuss> discussByPage = discussRepository.getDiscussByPage(pageable);
//        discussByPage.forEach(System.out::println);
//    }
    @Test
    void findByAuthor(){
        Discuss zs = discussRepository.findByAuthor("张三");
        System.out.println(zs);
    }
}