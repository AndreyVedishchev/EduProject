package interfaces.task4;

public class TextFile implements Readable, Closeable, Writable{

    String status = "close";
    String content = "";

    @Override
    public void close() {
        System.out.println("файл закрыт");
        status = "close";
    }

    @Override
    public String read() {
        if (this.status.equals("close")) {
            status = "read";
            System.out.println("файл содержит: " + content);
            return content;
        } else {
            System.out.println("файл занят!!!");
            return null;
        }
    }

    @Override
    public void write(String data) {
        if (this.status.equals("close")) { //если файл close, значит не занят и можно с ним работать
            status = "write";
            System.out.println("в файл записана строка: " + data);
            content = data;
        } else {
            System.out.println("файл занят!!!");
        }
    }

    public static void main(String[] args) {
        TextFile file = new TextFile();
        file.write("text");
//        file.close();
        file.read();
    }
}
