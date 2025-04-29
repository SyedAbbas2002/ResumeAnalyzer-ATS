package com.resumeanalyzer;

public class ResumeScoreCalculator {

    public static int calculateScore(int matchCount, int totalKeywords) {
        return (int) ((matchCount / (double) totalKeywords) * 100);
    }

    public static void main(String[] args) {
        int matchCount = 5; // Example match count from JobDescriptionMatcher
        int totalKeywords = 10; // Example total number of keywords in the job description

        int score = calculateScore(matchCount, totalKeywords);
        System.out.println("Resume Score: " + score + " out of 100");
    }
}
