package net.chandol.hanlorem;

import org.junit.Test;

public class LoremTest {

    @Test
    public void testGetSentence() throws Exception {
        String sentence = Lorem.getSentence();
        System.out.println(sentence);

        String sentences1 = Lorem.getSentences(4);
        System.out.println(sentences1);

        String sentences2 = Lorem.getSentences(2, 4);
        System.out.println(sentences2);
    }

    @Test
    public void testGetParagraph() throws Exception {
        String paragraph = Lorem.getParagraph();
        System.out.println(paragraph);

        String paragraphs1 = Lorem.getParagraphs(2);
        System.out.println(paragraphs1);

        String paragraphs2 = Lorem.getParagraphs(2, 4);
        System.out.println(paragraphs2);
    }

    @Test
    public void testGetFirstName() throws Exception {
        String firstName = Lorem.getFirstName();
        System.out.println(firstName);
    }

    @Test
    public void testGetLastName() throws Exception {
        String lastName = Lorem.getLastName();
        System.out.println(lastName);
    }

    @Test
    public void testGetName() throws Exception {
        String name = Lorem.getName();
        System.out.println(name);
    }

    @Test
    public void testGetPhoneNumber(){
        String number = Lorem.getPhoneNumber();
        System.out.println(number);
    }
}