
<h1 align="center">🚀 AI-Powered Resume Analyzer & ATS (Applicant Tracking System) 💼</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-blue.svg" />
  <img src="https://img.shields.io/badge/Maven-Build Tool-brightgreen.svg" />
  <img src="https://img.shields.io/badge/PDF Parsing-Apache%20PDFBox-red.svg" />
  <img src="https://img.shields.io/badge/License-MIT-yellow.svg" />
</p>

---

🔍 An intelligent resume screening system built with **Java** to help recruiters automatically **parse, analyze, score, and rank resumes** based on job descriptions. Streamline hiring with this ATS-ready tool powered by keyword-matching logic and PDF text extraction.

---

## ✨ Features

✅ Extracts information from PDF resumes:  
&nbsp;&nbsp;&nbsp;&nbsp;• Name, Email, Phone, Skills, Education, Experience  
✅ Matches resumes against job descriptions  
✅ Generates resume score out of 100  
✅ Clean & modular Java codebase using Maven  
✅ Simple to extend, integrate, or improve with ML

---

## 🛠️ Tech Stack

| Technology      | Description                     |
|----------------|---------------------------------|
| **Java**        | Core programming language       |
| **Apache PDFBox** | PDF parsing & text extraction |
| **Maven**       | Project and dependency manager  |

---

## 📁 Project Structure

```
ResumeAnalyzer-ATS/
├── src/
│   └── main/java/com/resumeanalyzer/
│       ├── Main.java
│       ├── ResumeParser.java
│       ├── ResumeScorer.java
│       └── Utils.java
│
├── data/
│   └── job-description.txt
│
├── output/
│   └── analysis-report.txt
│
├── pom.xml
├── .gitignore
└── README.md
```

---

## ⚙️ How It Works

1. Upload a resume (`.pdf`) into the `resources` folder.
2. Add the job description in `data/job-description.txt`.
3. The program extracts the resume text and matches it to job keywords.
4. It calculates a **score out of 100** based on keyword relevance.
5. Final analysis is printed and saved in `output/`.

---

## 🚀 Getting Started

### 1. Clone this repo
```bash
git clone https://github.com/your-username/ResumeAnalyzer-ATS.git
cd ResumeAnalyzer-ATS
```

### 2. Compile and run
```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.resumeanalyzer.Main"
```

---

## 🧠 Future Enhancements

- 🔗 Add a Web UI with JavaFX or Spring Boot
- 📊 Export PDF/HTML reports
- 🧠 Integrate ML/NLP scoring with OpenNLP or spaCy via JNI
- 📂 Upload multiple resumes and batch-score them

---

## 🙋‍♂️ Contributing

Contributions, ideas, and feature requests are always welcome!  
Feel free to [open an issue](https://github.com/your-username/ResumeAnalyzer-ATS/issues) or submit a pull request.

---

<p align="center">
  Made with ❤️ by <strong>Syed Abbas</strong>
</p>

