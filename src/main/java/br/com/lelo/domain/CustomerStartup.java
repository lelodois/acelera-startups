package br.com.lelo.domain;

import javax.persistence.Entity;

@Entity
public class CustomerStartup extends Customer {

    private boolean findInvestiments;

    private String mentoring;

    public boolean isFindInvestiments() {
        return findInvestiments;
    }

    public void setFindInvestiments(boolean findInvestiments) {
        this.findInvestiments = findInvestiments;
    }

    public String getMentoring() {
        return mentoring;
    }

    public void setMentoring(String mentoring) {
        this.mentoring = mentoring;
    }
}
