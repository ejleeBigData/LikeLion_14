class Box<T> {
    private T content ;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public <E> void printContent(E extraInfo) {
        System.out.println("Content : " + content + ", Extra : " + extraInfo);
    }
}

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("멋진 박스!!!");

        System.out.println(stringBox.getContent());

        stringBox.setContent("오우~~~");
        System.out.println(stringBox.getContent());
        stringBox.printContent("뭔가요?");
        stringBox.printContent(11111); // <E> 라서 가능
    }
}