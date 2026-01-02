package org.neuronnote.neuronnote.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "flashcard")
public class note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username; // Link flashcard to the authenticated user

    @Column(nullable = false)
    private String question;

    @Column(columnDefinition = "TEXT")
    private String answer;

    // Spaced repetition fields
    private int interval;       // in days
    private int easeFactor;     // ease factor for scheduling
    private int repetition;     // number of times reviewed
    private LocalDateTime nextReviewDate;

    // Constructors
    public note() {}

    public note(String username, String question, String answer, int interval, int easeFactor, int repetition, LocalDateTime nextReviewDate) {
        this.username = username;
        this.question = question;
        this.answer = answer;
        this.interval = interval;
        this.easeFactor = easeFactor;
        this.repetition = repetition;
        this.nextReviewDate = nextReviewDate;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getQuestion() { return question; }
    public void setQuestion(String question) { this.question = question; }

    public String getAnswer() { return answer; }
    public void setAnswer(String answer) { this.answer = answer; }

    public int getInterval() { return interval; }
    public void setInterval(int interval) { this.interval = interval; }

    public int getEaseFactor() { return easeFactor; }
    public void setEaseFactor(int easeFactor) { this.easeFactor = easeFactor; }

    public int getRepetition() { return repetition; }
    public void setRepetition(int repetition) { this.repetition = repetition; }

    public LocalDateTime getNextReviewDate() { return nextReviewDate; }
    public void setNextReviewDate(LocalDateTime nextReviewDate) { this.nextReviewDate = nextReviewDate; }
}
