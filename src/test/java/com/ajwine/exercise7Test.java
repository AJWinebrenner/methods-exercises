package com.ajwine;

import org.junit.jupiter.api.Test;

import static com.ajwine.Exercise_7.getSentenceSize;
import static org.assertj.core.api.Assertions.assertThat;

class Exercise_7Test {
    @Test
    void getSentenceSizeTest() {
        // Given
        String sentence = "I am an example sentence.";
        // When
        int actual = getSentenceSize(sentence);
        // Then
        int expected = 5;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canReturnZero() {
        // Given
        String sentence = "";
        // When
        int actual = getSentenceSize(sentence);
        // Then
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canHandleTrailingSpaces() {
        // Given
        String sentence = "   I am an example sentence.   ";
        // When
        int actual = getSentenceSize(sentence);
        // Then
        int expected = 5;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canHandleNull() {
        // When
        int actual = getSentenceSize(null);
        // Then
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }
}