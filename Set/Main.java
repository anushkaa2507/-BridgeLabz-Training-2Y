package com.set;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        InsurancePolicySystem system = new InsurancePolicySystem();

        InsurancePolicy p1 = new InsurancePolicy("P101", "Alice",
                LocalDate.now().plusDays(10), "Health", 5000);

        InsurancePolicy p2 = new InsurancePolicy("P102", "Bob",
                LocalDate.now().plusDays(40), "Auto", 3000);

        InsurancePolicy p3 = new InsurancePolicy("P103", "Charlie",
                LocalDate.now().plusDays(5), "Home", 4500);

        InsurancePolicy p4 = new InsurancePolicy("P101", "Alice Duplicate",
                LocalDate.now().plusDays(60), "Health", 5000);
        system.addPolicy(p1);
        system.addPolicy(p2);
        system.addPolicy(p3);
        system.addPolicy(p4);

        system.showAllPolicies();
        system.showExpiringSoon();
        system.showByCoverage("Health");

        List<InsurancePolicy> list = Arrays.asList(p1, p2, p3, p4);
        system.findDuplicates(list);

        system.performanceTest();
    }
}