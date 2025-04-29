package com.resumeanalyzer;

import java.util.Arrays;
import java.util.List;

public class JobDescriptionMatcher {

    public static int matchResumeToJobDescription(String resumeText, String jobDescriptionText) {
        // Simple keyword matching logic: count the number of matching words between resume and job description
        List<String> resumeWords = Arrays.asList(resumeText.split("\\s+"));
        List<String> jobDescriptionWords = Arrays.asList(jobDescriptionText.split("\\s+"));

        int matchCount = 0;
        for (String word : resumeWords) {
            if (jobDescriptionWords.contains(word)) {
                matchCount++;
            }
        }

        return matchCount;
    }

    public static void main(String[] args) {
        String resumeText = "Java, Python, Machine Learning, SQL";
        String jobDescriptionText = "We are looking for someone skilled in Java, Python, and Machine Learning.";

        int score = matchResumeToJobDescription(resumeText, jobDescriptionText);
        System.out.println("Match Score: " + score);
    }
}
