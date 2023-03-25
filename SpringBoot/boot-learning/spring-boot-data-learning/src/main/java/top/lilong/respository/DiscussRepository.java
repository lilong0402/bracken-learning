package top.lilong.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import top.lilong.damain.Discuss;
import org.springframework.data.domain.Pageable;



import java.util.List;

public interface DiscussRepository extends JpaRepository<Discuss,Integer> {
    /**
     * 查询 author 非空的Discuss 评论集合
     * @return List<Discuss>
     */
//    List<Discuss> findByAuthorNotNull();

    /**
     * 查找id为***的评论的集合
     * @param id
     * @return
     */
    List<Discuss> findByAIdEquals(Integer id);

    /**
     * 查询作者名最后为*的评论集合
     * @param a
     * @return
     */
    List<Discuss> findByAuthorEndsWith(String a);

    /**
     * 查找作者名包含***的评论集合
     * @param author
     * @return
     */
    List <Discuss> findByAuthorContains(String author);
//    List<Discuss> findByAId
    /**
     * 查找作者和id都不为空的评论集合
     * @return
     */
    List<Discuss> findByAuthorNotNullAndAIdIsNotNull();

//    List<Discuss>  findByAIdEqualsAnd

    /**
     * 分页查询
     */
    @Query("SELECT c from t_comment c where c.AId=?1")
//    @Query("SELECT c from t_comment c")
    List<Discuss> getDiscussByPage(Integer AId,Pageable pageable);

    Discuss findByAuthor(String author);
//    List<Discuss> getDiscussesBy
}
