package edutechTeam.edutech.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "it_machine")
public class it_machine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "title", nullable = false)
    private Long title;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "deadline", nullable = false)
    private Date deadline;

    @Column(name = "apply", nullable = false)
    private Integer apply;

    @Column(nullable = false)
    private String applicant;

    @Column
    private String image;


}
