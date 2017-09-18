package com.example.vote.evoting;

/**
 * Created by Kunal Mhetre on 16/09/2017.
 */
public  class Candidate {

    private String candidateId;
    private String candidateName;
    private String candidateNo;
    private String candidateAdd;
    private String candidateEmail;
    private String candidateDob;

    public Candidate(String id, String name1, String name2, String name3)
    {
    }

    public Candidate(String candidateId, String candidateName, String candidateNo, String candidateAdd, String candidateEmail, String candidateDob)
    {

        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.candidateNo = candidateNo;
        this.candidateAdd = candidateAdd;
        this.candidateEmail = candidateEmail;
        this.candidateDob = candidateDob;


    }

    public String getCandidateId() {
        return candidateId;
    }

    public String getCanditateName() {
        return candidateName;
    }

    public String getNo() {
        return candidateNo;
    }

    public String getCandidateAdd() {
        return candidateAdd;
    }

    public String getCandidateEmail() {
        return candidateEmail;
    }

    public String getCandidateDob() {
        return candidateDob;
    }



}


