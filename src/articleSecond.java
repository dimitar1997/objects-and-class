import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class articleSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Article> allArticles = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(", ");
            Article oneArticle = new Article(input[0], input[1], input[2]);
            allArticles.add(oneArticle);
        }
        String command = scanner.nextLine();
        switch (command){
            case "title":
                allArticles.sort(Comparator.comparing(Article::getTitle));
                break;
            case "content":
                allArticles.sort(Comparator.comparing(Article::getContent));
                break;
            case "author":
                allArticles.sort(Comparator.comparing(Article::getAuthor));
                break;
        }
        for (int i = 0; i < allArticles.size() ; i++) {
            System.out.println(allArticles.get(i).toString());
        }
    }
    static class Article{
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
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

        public void setAuthor(String author) {
            this.author = author;
        }

        public String toString(){
            return  String.format("%s - %s: %s",
                    getTitle(), getContent(), getAuthor());
        }
    }
}
