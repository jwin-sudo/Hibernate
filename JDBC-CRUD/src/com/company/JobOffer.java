package com.company;

public class JobOffer {
    Integer sid;
    String jobTitle;
    String jobDescription;
    String companyName;
    Double packagePerAnnum;
    String contact;

    public JobOffer() { }

    JobOffer(Integer sid,String jobTitle,String jobDescription,String companyName,Double packagePerAnnum, String contact){
        this.sid=sid;
        this.jobTitle = jobTitle;
        this.jobDescription=jobDescription;
        this.companyName=companyName;
        this.packagePerAnnum=packagePerAnnum;
        this.contact = contact;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Double getPackagePerAnnum() {
        return packagePerAnnum;
    }

    public void setPackagePerAnnum(Double packagePerAnnum) {
        this.packagePerAnnum = packagePerAnnum;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String toString(){
        String output ="Sid:"+sid;
        output +="\nJob Title:"+jobTitle;
        output +="\nDescription:"+jobDescription;
        output +="\nCompany Name:"+companyName;
        output +="\nPackage:"+packagePerAnnum;
        output +="\nContact:" + contact;

        return output;
    }
}
