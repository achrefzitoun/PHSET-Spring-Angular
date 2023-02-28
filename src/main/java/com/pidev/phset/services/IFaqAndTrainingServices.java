package com.pidev.phset.services;

import com.pidev.phset.entities.*;

import java.util.List;

public interface IFaqAndTrainingServices {

    /////////// ***** TrainingOpinion ***** ///////////

    TrainingOpinion addTrainingOpinion(TrainingOpinion trainingOpinion);
    TrainingOpinion updateTrainingOpinion(TrainingOpinion trainingOpinion);
    void removeTrainingOpinion(Integer idTrainingOpinion);
    TrainingOpinion retrieveTrainingOpinion(Integer idTrainingOpinion);
    List<TrainingOpinion> retrieveAllTrainingOpinions();

    /////////// ***** CERTIFICATE ***** ///////////

    Certificate addCertificate(Certificate certificate);
    Certificate updateCertificate(Certificate certificate);
    void removeCertificate(Integer idCertif);
    Certificate retrieveCertificate(Integer idCertif);
    List<Certificate> retrieveAllCertificates();

    /////////// ***** COURSE ***** ///////////

    Course addCourse(Course course);
    Course updateCourse(Course course);
    void removeCourse(Integer idCourse);
    Course retrieveCourse(Integer idCours);
    List<Course> retrieveAllCourses();

    /////////// ***** EXAM ***** ///////////

    Exam addExam(Exam exam);
    Exam updateExam(Exam exam);
    void removeExam(Integer idExam);
    Exam retrieveExam(Integer idExam);
    List<Exam> retrieveAllExams();

    /////////// ***** QUESTIONEXAM ***** ///////////

    QuestionExam addQuestionExam(QuestionExam XXX);
    QuestionExam updateQuestionExam(QuestionExam XXX);
    void removeQuestionExam(Integer idQuestionExam);
    QuestionExam retrieveQuestionExam(Integer idQuestionExam);
    List<QuestionExam> retrieveAllQuestionExam();

    /////////// ***** QUESTIONFAQ ***** ///////////

    QuestionFAQ addQuestionFAQ(QuestionFAQ questionFAQ);
    QuestionFAQ updateQuestionFAQ(QuestionFAQ questionFAQ);
    void removeQuestionFAQ(Integer idFAQ);
    QuestionFAQ retrieveQuestionFAQ(Integer idFAQ);
    List<QuestionFAQ> retrieveAllQuestionFAQs();

    /////////// ***** REPONSEEXAM ***** ///////////

    ReponseExam addReponseExam(ReponseExam reponseExam);
    ReponseExam updateReponseExam(ReponseExam reponseExam);
    void removeReponseExam(Integer idReponseExam);
    ReponseExam retrieveReponseExam(Integer idReponseExam);
    List<ReponseExam> retrieveAllReponseExam();

    /////////// ***** REPONSEFAQ ***** ///////////

    ReponseFAQ addReponseFAQ(ReponseFAQ reponseFAQ);
    ReponseFAQ updateReponseFAQ(ReponseFAQ reponseFAQ);
    void removeReponseFAQ(Integer idReponseFAQ);
    ReponseFAQ retrieveReponseFAQ(Integer idReponseFAQ);
    List<ReponseFAQ> retrieveAllReponseFAQs();

    /////////// ***** TAG ***** ///////////

    Tag addTag(Tag tag);
    Tag updateTag(Tag tag);
    void removeTag(Integer idTag);
    Tag retrieveTag(Integer idTag);
    List<Tag> retrieveAllTags();

    /////////// ***** TOPIC ***** ///////////

    Topic addTopic(Topic topic);
    Topic updateTopic(Topic topic);
    void removeTopic(Integer idTopic);
    Topic retrieveTopic(Integer idTopic);
    List<Topic> retrieveAllTopics();

    /////////// ***** TRAINING ***** ///////////

    Training addTraining(Training training);
    Training updateTraining(Training training);
    void removeTraining(Integer idTraining);
    Training retrieveTraining(Integer idTraining);
    List<Training> retrieveAllTrainings();
}
