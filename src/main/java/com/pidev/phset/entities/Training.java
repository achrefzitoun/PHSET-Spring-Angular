package com.pidev.phset.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Training implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idTraining;
    String titleTraining;
    String descriptionTraining;
    String durationTraining;
    @JsonIgnore
    Technology subjectTraining;
    @Enumerated(EnumType.STRING)
    LVL levelTraining;
    Float priceTraining;
    @JsonIgnore
    Integer stateTraining = 0;
    @Enumerated(EnumType.STRING)
    TypeTraining typeTraining;

    @OneToMany(mappedBy = "training")
    //@JsonIgnore
    Set<TrainingOpinion> trainingOpinions;

    @OneToMany(mappedBy = "training")
    //@JsonIgnore
    Set<Course> courses;

    @ManyToOne
    Account account;
}
