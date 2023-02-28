package com.pidev.phset.services;

import com.pidev.phset.entities.*;
import com.pidev.phset.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaqAndTrainingServices implements IFaqAndTrainingServices {

    @Autowired ICertificateRepository certificateRepository;
    @Autowired
    ITrainingOpinionRepository trainingOpinionRepository;
    @Autowired ICourseRepository courseRepository;
    @Autowired IExamRepository examRepository;
    @Autowired IQuestionExamRepository questionExamRepository;
    @Autowired IQuestionFAQRepository questionFAQRepository;
    @Autowired IReponseExamRepository reponseExamRepository;
    @Autowired IReponseFAQRepository reponseFAQRepository;
    @Autowired ITagRepository tagRepository;
    @Autowired ITopicRepository topicRepository;
    @Autowired ITrainingRepository trainingRepository;

    /////////// ***** TrainingOpinion ***** ///////////

    @Override
    public TrainingOpinion addTrainingOpinion(TrainingOpinion trainingOpinion) {
        return trainingOpinionRepository.save(trainingOpinion);
    }

    @Override
    public TrainingOpinion updateTrainingOpinion(TrainingOpinion trainingOpinion) {
        return trainingOpinionRepository.save(trainingOpinion);
    }

    @Override
    public void removeTrainingOpinion(Integer idTrainingOpinion) {
        trainingOpinionRepository.deleteById(idTrainingOpinion);
    }

    @Override
    public TrainingOpinion retrieveTrainingOpinion(Integer idTrainingOpinion) {
        return trainingOpinionRepository.findById(idTrainingOpinion).orElse(null);
    }

    @Override
    public List<TrainingOpinion> retrieveAllTrainingOpinions() {
        return (List<TrainingOpinion>) trainingOpinionRepository.findAll();
    }

    /////////// ***** CERTIFICATE ***** ///////////

    @Override
    public Certificate addCertificate(Certificate certificate) {
        return certificateRepository.save(certificate);
    }

    @Override
    public Certificate updateCertificate(Certificate certificate) {
        return certificateRepository.save(certificate);
    }

    @Override
    public void removeCertificate(Integer idCertif) {
        certificateRepository.deleteById(idCertif);
    }

    @Override
    public Certificate retrieveCertificate(Integer idCertif) {
        return certificateRepository.findById(idCertif).orElse(null);
    }

    @Override
    public List<Certificate> retrieveAllCertificates() {
        return (List<Certificate>) certificateRepository.findAll();
    }

    /////////// ***** COURSE ***** ///////////

    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void removeCourse(Integer idCourse) {
        courseRepository.deleteById(idCourse);
    }

    @Override
    public Course retrieveCourse(Integer idCourse) {
        return courseRepository.findById(idCourse).orElse(null);
    }

    @Override
    public List<Course> retrieveAllCourses() {
        return (List<Course>) courseRepository.findAll();
    }

    /////////// ***** EXAM ***** ///////////

    @Override
    public Exam addExam(Exam exam) {
        return examRepository.save(exam);
    }

    @Override
    public Exam updateExam(Exam exam) {
        return examRepository.save(exam);
    }

    @Override
    public void removeExam(Integer idExam) {
        examRepository.deleteById(idExam);
    }

    @Override
    public Exam retrieveExam(Integer idExam) {
        return examRepository.findById(idExam).orElse(null);
    }

    @Override
    public List<Exam> retrieveAllExams() {
        return (List<Exam>) examRepository.findAll();
    }

    /////////// ***** QUESTIONEXAM ***** ///////////

    @Override
    public QuestionExam addQuestionExam(QuestionExam questionExam) {
        return questionExamRepository.save(questionExam);
    }

    @Override
    public QuestionExam updateQuestionExam(QuestionExam questionExam) {
        return questionExamRepository.save(questionExam);
    }

    @Override
    public void removeQuestionExam(Integer idQuestionExam) {
        questionExamRepository.deleteById(idQuestionExam);
    }

    @Override
    public QuestionExam retrieveQuestionExam(Integer idQuestionExam) {
        return questionExamRepository.findById(idQuestionExam).orElse(null);
    }

    @Override
    public List<QuestionExam> retrieveAllQuestionExam() {
        return (List<QuestionExam>) questionExamRepository.findAll();
    }

    /////////// ***** QUESTIONFAQ ***** ///////////

    @Override
    public QuestionFAQ addQuestionFAQ(QuestionFAQ questionFAQ) {
        return questionFAQRepository.save(questionFAQ);
    }

    @Override
    public QuestionFAQ updateQuestionFAQ(QuestionFAQ questionFAQ) {
        return questionFAQRepository.save(questionFAQ);
    }

    @Override
    public void removeQuestionFAQ(Integer idFAQ) {
        questionFAQRepository.deleteById(idFAQ);
    }

    @Override
    public QuestionFAQ retrieveQuestionFAQ(Integer idFAQ) {
        return questionFAQRepository.findById(idFAQ).orElse(null);
    }

    @Override
    public List<QuestionFAQ> retrieveAllQuestionFAQs() {
        return (List<QuestionFAQ>) questionFAQRepository.findAll();
    }

    /////////// ***** REPONSEEXAM ***** ///////////

    @Override
    public ReponseExam addReponseExam(ReponseExam reponseExam) {
        return reponseExamRepository.save(reponseExam);
    }

    @Override
    public ReponseExam updateReponseExam(ReponseExam reponseExam) {
        return reponseExamRepository.save(reponseExam);
    }

    @Override
    public void removeReponseExam(Integer idreponseExam) {
        reponseExamRepository.deleteById(idreponseExam);
    }

    @Override
    public ReponseExam retrieveReponseExam(Integer idreponseExam) {
        return reponseExamRepository.findById(idreponseExam).orElse(null);
    }

    @Override
    public List<ReponseExam> retrieveAllReponseExam() {
        return (List<ReponseExam>) reponseExamRepository.findAll();
    }

    /////////// ***** REPONSEFAQ ***** ///////////

    @Override
    public ReponseFAQ addReponseFAQ(ReponseFAQ reponseFAQ) {
        return reponseFAQRepository.save(reponseFAQ);
    }

    @Override
    public ReponseFAQ updateReponseFAQ(ReponseFAQ reponseFAQ) {
        return reponseFAQRepository.save(reponseFAQ);
    }

    @Override
    public void removeReponseFAQ(Integer idReponseFAQ) {
        reponseFAQRepository.deleteById(idReponseFAQ);
    }

    @Override
    public ReponseFAQ retrieveReponseFAQ(Integer idReponseFAQ) {
        return reponseFAQRepository.findById(idReponseFAQ).orElse(null);
    }

    @Override
    public List<ReponseFAQ> retrieveAllReponseFAQs() {
        return (List<ReponseFAQ>) reponseFAQRepository.findAll();
    }

    /////////// ***** TAG ***** ///////////

    @Override
    public Tag addTag(Tag tag) {
        return tagRepository.save(tag);
    }

    @Override
    public Tag updateTag(Tag tag) {
        return tagRepository.save(tag);
    }

    @Override
    public void removeTag(Integer idTag) {
        tagRepository.deleteById(idTag);
    }

    @Override
    public Tag retrieveTag(Integer idTag) {
        return tagRepository.findById(idTag).orElse(null);
    }

    @Override
    public List<Tag> retrieveAllTags() {
        return (List<Tag>) tagRepository.findAll();
    }

    /////////// ***** TOPIC ***** ///////////

    @Override
    public Topic addTopic(Topic topic) {
        return topicRepository.save(topic);
    }

    @Override
    public Topic updateTopic(Topic topic) {
        return topicRepository.save(topic);
    }

    @Override
    public void removeTopic(Integer idTopic) {
        topicRepository.deleteById(idTopic);
    }

    @Override
    public Topic retrieveTopic(Integer idTopic) {
        return topicRepository.findById(idTopic).orElse(null);
    }

    @Override
    public List<Topic> retrieveAllTopics() {
        return (List<Topic>) topicRepository.findAll();
    }

    /////////// ***** TRAINING ***** ///////////

    @Override
    public Training addTraining(Training training) {
        return trainingRepository.save(training);
    }

    @Override
    public Training updateTraining(Training training) {
        return trainingRepository.save(training);
    }

    @Override
    public void removeTraining(Integer idTraining) {
        trainingRepository.deleteById(idTraining);
    }

    @Override
    public Training retrieveTraining(Integer idTraining) {
        return trainingRepository.findById(idTraining).orElse(null);
    }

    @Override
    public List<Training> retrieveAllTrainings() {
        return (List<Training>) trainingRepository.findAll();
    }
}
