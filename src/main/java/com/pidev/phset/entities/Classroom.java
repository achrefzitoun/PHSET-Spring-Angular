package com.pidev.phset.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Classroom implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idClass;
    String nameClass;
    Integer capacityClass;
    @Enumerated(EnumType.STRING)
    BlocEsprit blocEsprit;


    @OneToMany(mappedBy = "classroom")
    List<Interview>interviews;

    @ManyToOne
    Event event;

    @OneToMany(mappedBy = "classroom")
    Set<ClassState> classStates;
}
