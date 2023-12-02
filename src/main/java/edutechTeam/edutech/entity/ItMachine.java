package edutechTeam.edutech.entity;

import edutechTeam.edutech.entity.Common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItMachine extends BaseEntity {

    @Column(name = "applicant", nullable = false)
    private String applicant;

}
