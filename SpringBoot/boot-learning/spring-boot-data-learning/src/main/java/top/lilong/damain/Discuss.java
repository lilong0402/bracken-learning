package top.lilong.damain;

/**
 * @author lilong
 *
 */

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity(name = "t_comment")
public class Discuss {
    /**
     * 设置主键自增策略
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //    @Column
    private String author;
    private String content;
    @Column(name = "a_id")
    private Integer AId;

    private String url;

    public Discuss() {
    }

    public Discuss(Integer id, String author, String content, Integer AId, String url) {
        this.id = id;
        this.author = author;
        this.content = content;
        this.AId = AId;
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getAId() {
        return AId;
    }

    public void setAId(Integer AId) {
        this.AId = AId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Discuss{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", AId=" + AId +
                ", url='" + url + '\'' +
                '}';
    }
}
