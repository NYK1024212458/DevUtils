package afkt.project.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;

/**
 * detail: 便签图片资源
 */
@Entity
public class NotePicture {

    @Id
    private Long   id;
    @NotNull
    private String picture;
    private Long   noteId;


    @Generated(hash = 1669203543)
    public NotePicture(Long id, @NotNull String picture, Long noteId) {
        this.id = id;
        this.picture = picture;
        this.noteId = noteId;
    }

    @Generated(hash = 1572647509)
    public NotePicture() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPicture() {
        return this.picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Long getNoteId() {
        return this.noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }
}