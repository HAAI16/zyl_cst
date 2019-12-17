package entity;

import java.io.Serializable;

/**
 * (Blog)实体类
 *
 * @author makejava
 * @since 2019-12-17 20:03:40
 */
public class Blog implements Serializable {
    private static final long serialVersionUID = -47250456475515977L;

    private String id;

    private String title;

    private String content;

    private String date;

    private Integer userid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

}