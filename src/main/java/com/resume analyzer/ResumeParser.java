package com.resumeanalyzer;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class ResumeParser {

    public static String parseResume(String filePath) {
        String text = "";
        try {
            PDDocument document = PDDocument.load(new File(filePath));
            PDFTextStripper stripper = new PDFTextStripper();
            text = stripper.getText(document);
            document.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    public static void main(String[] args) {
        String resumeText = parseResume("sample_resume.pdf");
        System.out.println("Resume Content: \n" + resumeText);
    }
}
