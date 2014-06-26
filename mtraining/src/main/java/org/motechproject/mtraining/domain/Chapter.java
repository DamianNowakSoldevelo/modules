package org.motechproject.mtraining.domain;

import org.motechproject.mds.annotations.Field;

import java.util.List;

/**
 * Created by kosh on 5/29/14.
 */
public class Chapter extends CourseUnitMetadata {

    @Field
    private List<Lesson> lessons;

    @Field
    private Quiz quiz;

    public Chapter() {
        this(null, null);
    }

    public Chapter(List<Lesson> lessons, Quiz quiz) {
        this.lessons = lessons;
        this.quiz = quiz;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }
}
