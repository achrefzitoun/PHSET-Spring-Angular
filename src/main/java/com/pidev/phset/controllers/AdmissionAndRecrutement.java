package com.pidev.phset.controllers;

import com.pidev.phset.entities.*;
import com.pidev.phset.services.IAdmissionAndRecrutementServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/AdmissionAndRecrutement")
public class AdmissionAndRecrutement {

    @Autowired
    IAdmissionAndRecrutementServices admissionAndRecrutementServices;

    //////// ****** CANDIDACY Services ****** ////////

    @PostMapping("/candidacy/add")
    Candidacy addCandidacy(@RequestBody Candidacy candidacy){
        return admissionAndRecrutementServices.addCandidacy(candidacy);
    }

    @PutMapping("/candidacy/update")
    Candidacy updateCandidacy(@RequestBody Candidacy candidacy){
        return admissionAndRecrutementServices.updateCandidacy(candidacy);
    }

    @GetMapping("/candidacy/delete/{id}")
    void removeCandidacy(@PathVariable("id") Integer idcandidacy){
        admissionAndRecrutementServices.removeCandidacy(idcandidacy);
    }

    @GetMapping("/candidacy/retrieve/{id}")
    Candidacy retrieveCandidacy(@PathVariable("id") Integer idcandidacy){   //PathVariable pour indiquer esm variable mnin bch yji f parametre
        return admissionAndRecrutementServices.retrieveCandidacy(idcandidacy);
    }

    @GetMapping("/candidacy/retrieveAll")
    List<Candidacy> retrieveAllCandidacy(){
        return admissionAndRecrutementServices.retrieveAllCandidacy();
    }

    //////// ****** CLASSROOM Services ****** ////////

    @PostMapping("/classroom/add")
    Classroom addClassroom(@RequestBody Classroom classroom){
        return admissionAndRecrutementServices.addClassroom(classroom);
    }

    @PutMapping("/classroom/update")
    Classroom updateClassroom(@RequestBody Classroom classroom){
        return admissionAndRecrutementServices.updateClassroom(classroom);
    }

    @GetMapping("/classroom/delete/{id}")
    void removeClassroom(@PathVariable("id") Integer idClassroom){
        admissionAndRecrutementServices.removeClassroom(idClassroom);
    }

    @GetMapping("/classroom/retrieve/{id}")
    Classroom retrieveClassroom(@PathVariable("id") Integer idClassroom){
        return admissionAndRecrutementServices.retrieveClassroom(idClassroom);
    }

    @GetMapping("/classroom/retrieveAll")
    List<Classroom> retrieveAllClassroom(){
        return admissionAndRecrutementServices.retrieveAllClassroom();
    }

    //////// ****** CLASSState Services ****** ////////
    @PostMapping("/classstate/add")
    ClassState addClassState(@RequestBody ClassState classstate){
        return admissionAndRecrutementServices.addClassState(classstate);
    }

    @PutMapping("/classstate/update")
    ClassState updateClassState(@RequestBody ClassState classstate){
        return admissionAndRecrutementServices.updateClassState(classstate);
    }

    @GetMapping("/classstate/delete/{id}")
    void removeClassState(@PathVariable("id") Integer idClassState){
        admissionAndRecrutementServices.removeClassState(idClassState);
    }

    @GetMapping("/classstate/retrieve/{id}")
    ClassState retrieveClassState(@PathVariable("id") Integer idClassState){
        return admissionAndRecrutementServices.retrieveClassState(idClassState);
    }

    @GetMapping("/classstate/retrieveAll")
    List<ClassState> retrieveAllClassState(){
        return admissionAndRecrutementServices.retrieveAllClassState();
    }

    //////// ****** CRITERIA Services ****** ////////

    @PostMapping("/criteria/add")
    Criteria addCriteria(@RequestBody Criteria criteria){
        return admissionAndRecrutementServices.addCriteria(criteria);
    }

    @PutMapping("/criteria/update")
    Criteria updateCriteria(@RequestBody Criteria criteria){
        return admissionAndRecrutementServices.updateCriteria(criteria);
    }

    @GetMapping("/criteria/delete/{id}")
    void removeCriteria(@PathVariable("id") Integer idCriteria){
        admissionAndRecrutementServices.removeCriteria(idCriteria);
    }

    @GetMapping("/criteria/retrieve/{id}")
    Criteria retrieveCriteria(@PathVariable("id") Integer idCriteria){   //PathVariable pour indiquer esm variable mnin bch yji f parametre
        return admissionAndRecrutementServices.retrieveCriteria(idCriteria);
    }

    @GetMapping("/criteria/retrieveAll")
    List<Criteria> retrieveAllCriteria(){
        return admissionAndRecrutementServices.retrieveAllCriteria();
    }

    //////// ****** INSCRIPTION Services ****** ////////

    @PostMapping("/inscription/add")
    Inscription addInscription(@RequestBody Inscription inscription){
        return admissionAndRecrutementServices.addInscription(inscription);
    }

    @PutMapping("/inscription/update")
    Inscription updateInscription(@RequestBody Inscription inscription){
        return admissionAndRecrutementServices.updateInscription(inscription);
    }

    @GetMapping("/inscription/delete/{id}")
    void removeInscription(@PathVariable("id") Integer idInscription){
        admissionAndRecrutementServices.removeInscription(idInscription);
    }

    @GetMapping("/inscription/retrieve/{id}")
    Inscription retrieveInscription(@PathVariable("id") Integer idInscription){
        return admissionAndRecrutementServices.retrieveInscription(idInscription);
    }

    @GetMapping("/inscription/retrieveAll")
    List<Inscription> retrieveAllInscription(){
        return admissionAndRecrutementServices.retrieveAllInscription();
    }


    //////// ****** INTERVIEW Services ****** ////////

    @PostMapping("/interview/add")
    Interview addInterview(@RequestBody Interview interview){
        return admissionAndRecrutementServices.addInterview(interview);
    }

    @PutMapping("/interview/update")
    Interview updateInterview(@RequestBody Interview interview){
        return admissionAndRecrutementServices.updateInterview(interview);
    }

    @GetMapping("/interview/delete/{id}")
    void removeInterview(@PathVariable("id") Integer idInterview){
        admissionAndRecrutementServices.removeInterview(idInterview);
    }

    @GetMapping("/interview/retrieve/{id}")
    Interview retrieveInterview(@PathVariable("id") Integer idInterview){
        return admissionAndRecrutementServices.retrieveInterview(idInterview);
    }

    @GetMapping("/interview/retrieveAll")
    List<Interview> retrieveAllInterview(){
        return admissionAndRecrutementServices.retrieveAllInterview();
    }


    //////// ****** JURYAPPRECIATION Services ****** ////////

    @PostMapping("/juryAppreciation/add")
    JuryAppreciation addJuryAppreciation(@RequestBody JuryAppreciation juryAppreciation){
        return admissionAndRecrutementServices.addJuryAppreciation(juryAppreciation);
    }

    @PutMapping("/juryAppreciation/update")
    JuryAppreciation updateJuryAppreciation(@RequestBody JuryAppreciation juryAppreciation){
        return admissionAndRecrutementServices.updateJuryAppreciation(juryAppreciation);
    }

    @GetMapping("/juryAppreciation/delete/{id}")
    void removeJuryAppreciation(@PathVariable("id") Integer idJuryAppreciation){
        admissionAndRecrutementServices.removeJuryAppreciation(idJuryAppreciation);
    }

    @GetMapping("/juryAppreciation/retrieve/{id}")
    JuryAppreciation retrieveJuryAppreciation(@PathVariable("id") Integer idJuryAppreciation){   //PathVariable pour indiquer esm variable mnin bch yji f parametre
        return admissionAndRecrutementServices.retrieveJuryAppreciation(idJuryAppreciation);
    }

    @GetMapping("/juryAppreciation/retrieveAll")
    List<JuryAppreciation> retrieveAllJuryAppreciation(){
        return admissionAndRecrutementServices.retrieveAllJuryAppreciation();
    }

    //////// ****** OFFER Services ****** ////////

    @PostMapping("/offer/add")
    Offer addOffer(@RequestBody Offer offer){
        return admissionAndRecrutementServices.addOffer(offer);
    }

    @PutMapping("/offer/update")
    Offer updateOffer(@RequestBody Offer offer){
        return admissionAndRecrutementServices.updateOffer(offer);
    }

    @GetMapping("/offer/delete/{id}")
    void removeOffer(@PathVariable("id") Integer idOffer){
        admissionAndRecrutementServices.removeOffer(idOffer);
    }

    @GetMapping("/offer/retrieve/{id}")
    Offer retrieveOffer(@PathVariable("id") Integer idOffer){   //PathVariable pour indiquer esm variable mnin bch yji f parametre
        return admissionAndRecrutementServices.retrieveOffer(idOffer);
    }

    @GetMapping("/offer/retrieveAll")
    List<Offer> retrieveAllOffer(){
        return admissionAndRecrutementServices.retrieveAllOffer();
    }


}
