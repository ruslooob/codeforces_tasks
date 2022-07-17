package com.ruslooob.too_large_words_71A;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void tooLargeWordsSolver() {
        assertEquals(List.of("A", "B"), Main.tooLargeWordsSolver(List.of("A", "B")));
    }

    @Test
    void tooLargeWordsSolver1() {
        List<String> given = List.of(
                "word",
                "localization",
                "internationalization",
                "pneumonoultramicroscopicsilicovolcanoconiosis"
        );
        List<String> answer = List.of(
                "word",
                "l10n",
                "i18n",
                "p43s"
        );
        assertEquals(answer, Main.tooLargeWordsSolver(given));
    }
}