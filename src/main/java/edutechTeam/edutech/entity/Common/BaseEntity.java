package edutechTeam.edutech.entity.Common;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.w3c.dom.Text;

import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "deadline", nullable = false)
    private String deadline;

    @Column(name = "apply", nullable = false)
    private Integer apply;

    @Column(name = "image")
    private String image;
}
