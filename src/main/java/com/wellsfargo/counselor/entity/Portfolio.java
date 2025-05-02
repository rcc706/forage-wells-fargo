package main.java.com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String portfolioName;

    protected Portfolio() {

    }

    public Portfolio(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public Long getportfolioId() {
        return portfolioId;
    }

    public String getportfolioName() {
        return portfolioName;
    }

    public void setportfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }
}
