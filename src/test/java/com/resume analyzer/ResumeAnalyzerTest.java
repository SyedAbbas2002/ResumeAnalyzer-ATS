package com.resumeanalyzer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ResumeAnalyzerTest {

    private String resumeText;
    private String jobDescriptionText;

    @BeforeEach
    public void setUp() {
        resumeText = "Java, Python, Machine Learning, SQL";
        jobDescriptionText = "We are looking for someone skilled in Java, Python, and Machine Learning.";
    }

    @Test
    public void testResumeParsing() {
        // Simulate resume text parsing (this could be done more effectively with real PDF input)
        String parsedText = ResumeParser.parseResume("sample_resume.pdf");
        assertNotNull(parsedText, "Parsed resume text should not be null.");
        assertTrue(parsedText.length() > 0, "Parsed resume text should not be empty.");
    }

    @Test
    public void testJobDescriptionMatcher() {
        int matchCount = JobDescriptionMatcher.matchResumeToJobDescription(resumeText, jobDescriptionText);
        assertTrue(matchCount > 0, "Match count should be greater than 0.");
    }

    @Test
    public void testResumeScoreCalculation() {
        int matchCount = 5; // Example match count from JobDescriptionMatcher
        int totalKeywords = 10; // Example total number of keywords in the job description
        int score = ResumeScoreCalculator.calculateScore(matchCount, totalKeywords);
        assertEquals(50, score, "The score should be 50 out of 100 based on the match percentage.");
    }
}
