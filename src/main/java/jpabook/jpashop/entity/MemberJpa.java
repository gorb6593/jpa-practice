package jpabook.jpashop.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id", "username", "age"})
public class MemberJpa {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;
    private String username;
    private int age;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private TeamJpa teamJpa;

    public void changeTeam(TeamJpa teamJpa) {
        this.teamJpa = teamJpa;
    }

}
