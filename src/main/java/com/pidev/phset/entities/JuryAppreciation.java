package com.pidev.phset.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class JuryAppreciation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idJuryAppreciation;
    Integer note;
    String comment;
    @Enumerated(EnumType.STRING)
    Result result;

    @OneToOne(mappedBy = "juryAppreciation")
    Interview interview;

}
