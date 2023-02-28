package com.pidev.phset.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idCours;
    String nameCours;
    String descriptionCours;
    Integer creditCours;
    String professorCours;
    String unit;
    @Enumerated(EnumType.STRING)
    Technology technology;

    @ManyToMany
    Set<Training> trainings;

    @OneToOne
    Exam exam;
}
