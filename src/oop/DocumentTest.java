package oop;

class Document {
    static int count = 0;
    String name;

    Document(){
        this("제목없음"+ ++count);
    }

    Document(String name){
        this.name = name;
        System.out.println("문서 " + this.name + "가 생성되었습니다.");
    }
}

public class DocumentTest{
    public static void main(String[] args) {
        Document d1 = new Document();
        Document d2 = new Document();
        Document d3 = new Document("자바.txt");
        Document d4 = new Document();
    }
}

/*
문서 제목없음1가 생성되었습니다.
문서 제목없음2가 생성되었습니다.
문서 자바.txt가 생성되었습니다.
문서 제목없음3가 생성되었습니다.
* */