package com.set;

import java.time.LocalDate;
import java.util.Objects;

public class InsurancePolicy implements Comparable<InsurancePolicy> {

    private String policyNumber;
    private String holderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;

    public InsurancePolicy(String policyNumber, String holderName,
                           LocalDate expiryDate, String coverageType, double premiumAmount) {

        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() { return policyNumber; }
    public String getHolderName() { return holderName; }
    public LocalDate getExpiryDate() { return expiryDate; }
    public String getCoverageType() { return coverageType; }
    public double getPremiumAmount() { return premiumAmount; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        InsurancePolicy other = (InsurancePolicy) obj;
        return Objects.equals(this.policyNumber, other.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public int compareTo(InsurancePolicy other) {
        int result = this.expiryDate.compareTo(other.expiryDate);
        if (result == 0)
            return this.policyNumber.compareTo(other.policyNumber);
        return result;
    }

    @Override
    public String toString() {
        return "[Policy No: " + policyNumber +
                ", Holder: " + holderName +
                ", Expiry: " + expiryDate +
                ", Type: " + coverageType +
                ", Premium: " + premiumAmount + "]";
    }
}