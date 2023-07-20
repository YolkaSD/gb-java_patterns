package org.example.structural.decorator;

public class JuniorDeveloper implements Developer{
    @Override
    public String makeJob() {
        return writeCode();
    }

    private String writeCode() {
        return "Пишу код.";
    }
}
