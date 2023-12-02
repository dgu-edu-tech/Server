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
public class Government extends BaseEntity {

    @Column(name = "department", nullable = false)
    private String department;

}
