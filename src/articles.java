import java.util.Scanner;

public class articles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(", ");
        String title = line[0];
        String content = line[1];
        String author = line[2];
        article article = new article(title, content, author);
         int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n ; i++) {
            String[] input = scanner.nextLine().split(": ");
          String command = input[0];
          switch (command){
              case "Edit":
                 article.setContent(input[1]);
                  break;
              case "ChangeAuthor":
                  article.setAuthor(input[1]);
                  break;
              case "Rename":
                  article.setTitle(input[1]);
                  break;
          }
        }
        System.out.println(article.toString());
    }
    static class article{
        String title;
        String content;
        String author;

        public article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
        public  String toString(){
            return  String.format("%s - %s: %s",
                    getTitle(), getContent(), getAuthor());
        }
    }
}
