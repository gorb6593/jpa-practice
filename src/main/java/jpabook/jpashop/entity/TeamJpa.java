package jpabook.jpashop.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id", "name"})
public class TeamJpa {

    @Id @GeneratedValue
    @Column(name = "team_id")
    private Long id;
    private String name;

    @OneToMany(mappedBy = "teamJpa")
    private List<MemberJpa> memberJpa = new ArrayList<>();

    public TeamJpa(String name) {
        this.name = name;
    }
}
