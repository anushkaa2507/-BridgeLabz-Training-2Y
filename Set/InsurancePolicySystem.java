package com.set;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class InsurancePolicySystem {

    private HashSet<InsurancePolicy> hashSet = new HashSet<>();
    private LinkedHashSet<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
    private TreeSet<InsurancePolicy> treeSet = new TreeSet<>();

    public void addPolicy(InsurancePolicy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    public void showAllPolicies() {
        
        for (InsurancePolicy p : hashSet)
            System.out.println(p);
    }

    public void showExpiringSoon() {
        LocalDate today = LocalDate.now();

        for (InsurancePolicy p : treeSet) {
            long days = ChronoUnit.DAYS.between(today, p.getExpiryDate());
            if (days >= 0 && days <= 30)
                System.out.println(p);
        }
    }

    
    public void showByCoverage(String type) {
        
        for (InsurancePolicy p : hashSet)
            if (p.getCoverageType().equalsIgnoreCase(type))
                System.out.println(p);
    }

    // Display duplicates from input list
    public void findDuplicates(List<InsurancePolicy> list) {
        HashSet<String> seen = new HashSet<>();

        for (InsurancePolicy p : list) {
            if (!seen.add(p.getPolicyNumber()))
                System.out.println("Duplicate Found: " + p);
        }
    }

    public void performanceTest() {
        System.out.println("\n--- PERFORMANCE TEST ---");

        int n = 50000;
        ArrayList<InsurancePolicy> tempList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            tempList.add(new InsurancePolicy(
                    "P" + i,
                    "Name" + i,
                    LocalDate.now().plusDays(i % 365),
                    "Auto",
                    1000 + i));
        }

        long start, end;

        // HashSet
        start = System.currentTimeMillis();
        new HashSet<>(tempList);
        end = System.currentTimeMillis();
        System.out.println("HashSet Insert Time: " + (end - start) + " ms");

        // LinkedHashSet
        start = System.currentTimeMillis();
        new LinkedHashSet<>(tempList);
        end = System.currentTimeMillis();
        System.out.println("LinkedHashSet Insert Time: " + (end - start) + " ms");

        // TreeSet
        start = System.currentTimeMillis();
        new TreeSet<>(tempList);
        end = System.currentTimeMillis();
        System.out.println("TreeSet Insert Time: " + (end - start) + " ms");
    }
}