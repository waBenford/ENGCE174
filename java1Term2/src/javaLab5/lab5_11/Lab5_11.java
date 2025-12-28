package javaLab5.lab5_11;
import java.util.Scanner;

class Document {
    protected String title;

    public Document(String title) {
        this.title = title;
    }

    public void displayDetails() {
        System.out.println("Document: " + title);
    }
}

class TextDocument extends Document {
    protected int wordCount;

    public TextDocument(String title, int wordCount) {
        super(title);
        this.wordCount = wordCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Text: " + title + ", Words: " + wordCount);
    }
}

class PDFDocument extends Document {
    protected int pageCount;

    public PDFDocument(String title, int pageCount) {
        super(title);
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("PDF: " + title + ", Pages: " + pageCount);
    }

    public int getPageCount() {
        return pageCount;
    }
}

public class Lab5_11 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        System.out.println("TextDocument 1");
        String t1Title = getValue.nextLine();
        int t1Words = Integer.parseInt(getValue.nextLine());
        TextDocument td1 = new TextDocument(t1Title, t1Words);

        System.out.println("PDFDocument 1");
        String p1Title = getValue.nextLine();
        int p1Pages = Integer.parseInt(getValue.nextLine());
        PDFDocument pd1 = new PDFDocument(p1Title, p1Pages);

        System.out.println("TextDocument 2");
        String t2Title = getValue.nextLine();
        int t2Words = Integer.parseInt(getValue.nextLine());
        TextDocument td2 = new TextDocument(t2Title, t2Words);

        System.out.println("PDFDocument 2");
        String p2Title = getValue.nextLine();
        int p2Pages = Integer.parseInt(getValue.nextLine());
        PDFDocument pd2 = new PDFDocument(p2Title, p2Pages);

        Document[] documents = {td1, pd1, td2, pd2};

        int totalPages = 0;
        for (Document doc : documents) {
            if (doc instanceof PDFDocument) {
                PDFDocument pdf = (PDFDocument) doc;
                totalPages += pdf.getPageCount();
            }
        }

        for (Document doc : documents) {
            doc.displayDetails();
        }

        System.out.println("Total Pages: " + totalPages);
        
        getValue.close();
    }
}