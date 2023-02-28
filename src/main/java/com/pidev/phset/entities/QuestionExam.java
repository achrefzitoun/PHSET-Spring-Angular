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
public class QuestionExam implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idQuestExam;
    String textQuestExam;
    @Enumerated(EnumType.STRING)
    Technology technology;

    @ManyToOne
    Exam exam;

    @OneToOne
    ReponseExam reponseExam;
}