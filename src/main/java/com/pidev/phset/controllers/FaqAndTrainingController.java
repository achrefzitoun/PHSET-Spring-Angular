package com.pidev.phset.controllers;

import com.pidev.phset.entities.*;
import com.pidev.phset.services.IFaqAndTrainingServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/FaqAndTraining")
public class FaqAndTrainingController {
    @Autowired
    IFaqAndTrainingServices faqAndTrainingServices;

    /////////// ***** CERTIFICATE ***** ///////////

    @PostMapping("/Certificate/add")
    public Certificate addCertificate(@RequestBody Certificate certificate) {
        return faqAndTrainingServices.addCertificate(certificate);
    }

    @PutMapping("/Certificate/update")
    public Certificate updateCertificate(@RequestBody Certificate certificate) {
        return faqAndTrainingServices.updateCertificate(certificate);
    }

    @GetMapping("/Certificate/remove/{idCertif}")
    public void removeCertificate(@PathVariable("idCertif") Integer idCertif) {
        faqAndTrainingServices.removeCertificate(idCertif);
    }

    @GetMapping("/Certificate/retrieve/{idCertif}")
    public Certificate retrieveCertificate(@PathVariable("idCertif") Integer idCertif) {
        return faqAndTrainingServices.retrieveCertificate(idCertif);
    }

    @GetMapping("/Certificate/retrieveAll")
    public List<Certificate> retrieveAllCertificates() {
        return faqAndTrainingServices.retrieveAllCertificates();
    }

    /////////// ***** COURSE ***** ///////////

    @PostMapping("/Course/add")
    public Course addCourse(@RequestBody Course course) {
        return faqAndTrainingServices.addCourse(course);
    }

    @PutMapping("/Course/update")
    public Course updateCourse(@RequestBody Course course) {
        return faqAndTrainingServices.updateCourse(course);
    }

    @GetMapping("/Course/remove/{idCourse}")
    public void removeCourse(@PathVariable("idCourse") Integer idCourse) {
        faqAndTrainingServices.removeCourse(idCourse);
    }

    @GetMapping("/Course/retrieve/{idCourse}")
    public Course retrieveCourse(@PathVariable("idCourse") Integer idCourse) {
        return faqAndTrainingServices.retrieveCourse(idCourse);
    }

    @GetMapping("/Course/retrieveAll")
    public List<Course> retrieveAllCourse() {
        return faqAndTrainingServices.retrieveAllCourses();
    }

    /////////// ***** EXAM ***** ///////////

    @PostMapping("/Exam/add")
    public Exam addExam(@RequestBody Exam exam) {
        return faqAndTrainingServices.addExam(exam);
    }

    @PutMapping("/Exam/update")
    public Exam updateExam(@RequestBody Exam exam) {
        return faqAndTrainingServices.updateExam(exam);
    }

    @GetMapping("/Exam/remove/{idExam}")
    public void removeExam(@PathVariable("idExam") Integer idExam) {
        faqAndTrainingServices.removeExam(idExam);
    }

    @GetMapping("/Exam/retrieve/{idExam}")
    public Exam retrieveExam(@PathVariable("idExam") Integer idExam) {
        return faqAndTrainingServices.retrieveExam(idExam);
    }

    @GetMapping("/Exam/retrieveAll")
    public List<Exam> retrieveAllExams() {
        return faqAndTrainingServices.retrieveAllExams();
    }

    /////////// ***** QUESTIONEXAM ***** ///////////

    @PostMapping("/questionExam/add")
    public QuestionExam addQuestionExam(@RequestBody QuestionExam questionExam) {
        return faqAndTrainingServices.addQuestionExam(questionExam);
    }

    @PutMapping("/questionExam/update")
    public QuestionExam updateQuestionExam(@RequestBody QuestionExam questionExam) {
        return faqAndTrainingServices.updateQuestionExam(questionExam);
    }

    @GetMapping("/questionExam/remove/{idQuestionExam}")
    public void removeQuestionExam(@PathVariable("idQuestionExam") Integer idQuestionExam) {
        faqAndTrainingServices.removeQuestionExam(idQuestionExam);
    }

    @GetMapping("/questionExam/retrieve/{idQuestionExam}")
    public QuestionExam retrieveQuestionExam(@PathVariable("idQuestionExam") Integer idQuestionExam) {
        return faqAndTrainingServices.retrieveQuestionExam(idQuestionExam);
    }

    @GetMapping("/questionExam/retrieveAll")
    public List<QuestionExam> retrieveAllQuestionExam() {
        return faqAndTrainingServices.retrieveAllQuestionExam();
    }

    /////////// ***** QUESTIONFAQ ***** ///////////

    @PostMapping("/QuestionFAQ/add")
    public QuestionFAQ addQuestionFAQ(@RequestBody QuestionFAQ questionFAQ) {
        return faqAndTrainingServices.addQuestionFAQ(questionFAQ);
    }

    @PutMapping("/QuestionFAQ/update")
    public QuestionFAQ updateQuestionFAQ(@RequestBody QuestionFAQ questionFAQ) {
        return faqAndTrainingServices.updateQuestionFAQ(questionFAQ);
    }

    @GetMapping("/QuestionFAQ/remove/{idFAQ}")
    public void removeQuestionFAQ(@PathVariable("idFAQ") Integer idFAQ) {
        faqAndTrainingServices.removeQuestionFAQ(idFAQ);
    }

    @GetMapping("/QuestionFAQ/retrieve/{idFAQ}")
    public QuestionFAQ retrieveQuestionFAQ(@PathVariable("idFAQ") Integer idFAQ) {
        return faqAndTrainingServices.retrieveQuestionFAQ(idFAQ);
    }

    @GetMapping("/QuestionFAQ/retrieveAll")
    public List<QuestionFAQ> retrieveAllQuestionFAQs() {
        return faqAndTrainingServices.retrieveAllQuestionFAQs();
    }

    /////////// ***** REPONSEEXAM ***** ///////////

    @PostMapping("/reponseExam/add")
    public ReponseExam addReponseExam(@RequestBody ReponseExam reponseExam) {
        return faqAndTrainingServices.addReponseExam(reponseExam);
    }

    @PutMapping("/reponseExam/update")
    public ReponseExam updateReponseExam(@RequestBody ReponseExam reponseExam) {
        return faqAndTrainingServices.updateReponseExam(reponseExam);
    }

    @GetMapping("/reponseExam/remove/{idReponseExam}")
    public void removeReponseExam(@PathVariable("idReponseExam") Integer idReponseExam) {
        faqAndTrainingServices.removeReponseExam(idReponseExam);
    }

    @GetMapping("/reponseExam/retrieve/{idReponseExam}")
    public ReponseExam retrieveReponseExam(@PathVariable("idReponseExam") Integer idReponseExam) {
        return faqAndTrainingServices.retrieveReponseExam(idReponseExam);
    }

    @GetMapping("/reponseExam/retrieveAll")
    public List<ReponseExam> retrieveAllReponseExam() {
        return faqAndTrainingServices.retrieveAllReponseExam();
    }

    /////////// ***** REPONSEFAQ ***** ///////////

    @PostMapping("/ReponseFAQ/add")
    public ReponseFAQ addReponseFAQ(@RequestBody ReponseFAQ reponseFAQ) {
        return faqAndTrainingServices.addReponseFAQ(reponseFAQ);
    }

    @PutMapping("/ReponseFAQ/update")
    public ReponseFAQ updateReponseFAQ(@RequestBody ReponseFAQ reponseFAQ) {
        return faqAndTrainingServices.updateReponseFAQ(reponseFAQ);
    }

    @GetMapping("/ReponseFAQ/remove/{idReponseFAQ}")
    public void removeReponseFAQ(@PathVariable("idReponseFAQ") Integer idReponseFAQ) {
        faqAndTrainingServices.removeReponseFAQ(idReponseFAQ);
    }

    @GetMapping("/ReponseFAQ/retrieve/{idReponseFAQ}")
    public ReponseFAQ retrieveReponseFAQ(@PathVariable("idReponseFAQ") Integer idReponseFAQ) {
        return faqAndTrainingServices.retrieveReponseFAQ(idReponseFAQ);
    }

    @GetMapping("/ReponseFAQ/retrieveAll")
    public List<ReponseFAQ> retrieveAllReponseFAQs() {
        return faqAndTrainingServices.retrieveAllReponseFAQs();
    }

    /////////// ***** TAG ***** ///////////

    @PostMapping("/Tag/add")
    public Tag addTag(@RequestBody Tag tag) {
        return faqAndTrainingServices.addTag(tag);
    }

    @PutMapping("/Tag/update")
    public Tag updateTag(@RequestBody Tag tag) {
        return faqAndTrainingServices.updateTag(tag);
    }

    @GetMapping("/Tag/remove/{idTag}")
    public void removeTag(@PathVariable("idTag") Integer idTag) {
        faqAndTrainingServices.removeTag(idTag);
    }

    @GetMapping("/Tag/retrieve/{idTag}")
    public Tag retrieveTag(@PathVariable("idTag") Integer idTag) {
        return faqAndTrainingServices.retrieveTag(idTag);
    }

    @GetMapping("/Tag/retrieveAll")
    public List<Tag> retrieveAllTags() {
        return faqAndTrainingServices.retrieveAllTags();
    }

    /////////// ***** TOPIC ***** ///////////

    @PostMapping("/Topic/add")
    public Topic addTopic(@RequestBody Topic topic) {
        return faqAndTrainingServices.addTopic(topic);
    }

    @PutMapping("/Topic/update")
    public Topic updateTopic(@RequestBody Topic topic) {
        return faqAndTrainingServices.updateTopic(topic);
    }

    @GetMapping("/Topic/remove/{idTopic}")
    public void removeTopic(@PathVariable("idTopic") Integer idTopic) {
        faqAndTrainingServices.removeTopic(idTopic);
    }

    @GetMapping("/Topic/retrieve/{idTopic}")
    public Topic retrieveTopic(@PathVariable("idTopic") Integer idTopic) {
        return faqAndTrainingServices.retrieveTopic(idTopic);
    }

    @GetMapping("/Topic/retrieveAll")
    public List<Topic> retrieveAllTopics() {
        return faqAndTrainingServices.retrieveAllTopics();
    }

    /////////// ***** TRAINING ***** ///////////

    @PostMapping("/Training/add")
    public Training addTraining(@RequestBody Training training) {
        return faqAndTrainingServices.addTraining(training);
    }

    @PutMapping("/Training/update")
    public Training updateTraining(@RequestBody Training training) {
        return faqAndTrainingServices.updateTraining(training);
    }

    @GetMapping("/Training/remove/{idTraining}")
    public void removeTraining(@PathVariable("idTraining") Integer idTraining) {
        faqAndTrainingServices.removeTraining(idTraining);
    }

    @GetMapping("/Training/retrieve/{idTraining}")
    public Training retrieveTraining(@PathVariable("idTraining") Integer idTraining) {
        return faqAndTrainingServices.retrieveTraining(idTraining);
    }

    @GetMapping("/Training/retrieveAll")
    public List<Training> retrieveAllTrainings() {
        return faqAndTrainingServices.retrieveAllTrainings();
    }

    /////////// ***** TRAININGOPINION ***** ///////////

    @PostMapping("/TrainingOpinion/add")
    public TrainingOpinion addTrainingOpinion(@RequestBody TrainingOpinion trainingOpinion) {
        return faqAndTrainingServices.addTrainingOpinion(trainingOpinion);
    }

    @PutMapping("/TrainingOpinion/update")
    public TrainingOpinion updateTrainingOpinion(@RequestBody TrainingOpinion trainingOpinion) {
        return faqAndTrainingServices.updateTrainingOpinion(trainingOpinion);
    }

    @GetMapping("/TrainingOpinion/remove/{idTrainingOpinion}")
    public void removeTrainingOpinion(@PathVariable("idTrainingOpinion") Integer idTrainingOpinion) {
        faqAndTrainingServices.removeTrainingOpinion(idTrainingOpinion);
    }

    @GetMapping("/TrainingOpinion/retrieve/{idTrainingOpinion}")
    public TrainingOpinion retrieveTrainingOpinion(@PathVariable("idTrainingOpinion") Integer idTrainingOpinion) {
        return faqAndTrainingServices.retrieveTrainingOpinion(idTrainingOpinion);
    }

    @GetMapping("/TrainingOpinion/retrieveAll")
    public List<TrainingOpinion> retrieveAllTrainingOpinions() {
        return faqAndTrainingServices.retrieveAllTrainingOpinions();
    }


}

