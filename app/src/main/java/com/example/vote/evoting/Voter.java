package com.example.vote.evoting;



public class Voter {
    private String voterName;
    private String voterNo;
    private String voterAadhar;
    public Voter( String voterName, String voterNo, String voterAadhar)
    {

        ;
        this.voterName = voterName;
        this.voterNo = voterNo;
        this.voterAadhar = voterAadhar;



    }

    public void setVoterAadhar(String voterAadhar) {
        this.voterAadhar = voterAadhar;
    }

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }

    public void setVoterNo(String voterNo) {
        this.voterNo = voterNo;
    }

    public String getVoterName() {
        return voterName;
    }

    public String getVoterNo() {
        return voterNo;
    }

    public String getVoterAadhar() {
        return voterAadhar;
    }


}
