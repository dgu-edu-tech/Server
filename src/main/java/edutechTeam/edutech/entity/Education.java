package edutechTeam.edutech.entity;

import edutechTeam.edutech.entity.Common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Education extends BaseEntity {

    @Column(name = "department", nullable = false)
    private String department;
}
