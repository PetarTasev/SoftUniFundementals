package classesAndObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


class aticles {

    static class Article {
        String title;
        String content;
        String author;

        Article (String line, List<String> titles, List<String> content, List<String> author) {
            String[] info = line.split(", ");
            this.title = info[0];
            titles.add(info[0]);
            this.content = info[1];
            content.add(info[1]);
            this.author = info[2];
            author.add(info[2]);
        }

        String getTitle() {
            return this.title;
        }
        String getContent() {
            return this.content;
        }
        String getAuthor() {
            return this.author;
        }

        String finalPiece() {
            return this.title + " - " + this.content + ": " + this.author;
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Article> list = new ArrayList<Article>();
        List<String> titles = new ArrayList<>();
        List<String> contents = new ArrayList<>();
        List<String> authors = new ArrayList<>();
        int number = Integer.parseInt(scanner.nextLine());

        for (int n = 0; n < number; n++) {
            String liner = scanner.nextLine();
            list.add(new Article(liner, titles, contents, authors));
        }
        List<String> sortedTitles = titles.stream().sorted().collect(Collectors.toList());
        List<String> sortedAuthors = authors.stream().sorted().collect(Collectors.toList());
        List<String> sortedContent = contents.stream().sorted().collect(Collectors.toList());

        String type = scanner.nextLine();
        int count = 0;

        if (type.equals("title")) {
            for (int n = 0; n < list.size(); n++) {
                if (list.get(n).getTitle().equals(sortedTitles.get(count))) {
                    System.out.println(list.get(n).finalPiece());
                    if (authors.size() > count + 1) {
                        count++;
                        n = -1;
                    }
                }
            }
        } else if (type.equals("content")) {
            for (int n = 0; n < list.size(); n++) {
                if (list.get(n).getContent().equals(sortedContent.get(count))) {
                    System.out.println(list.get(n).finalPiece());
                    if (authors.size() > count + 1) {
                        count++;
                        n = -1;
                    }
                }
            }
        } else if (type.equals("author")) {
            for (int n = 0; n < list.size(); n++) {
                if (list.get(n).getAuthor().equals(sortedAuthors.get(count))) {
                    System.out.println(list.get(n).finalPiece());
                    if (authors.size() > count + 1 ) {
                        count++;
                        n = -1;
                    }
                }
            }

        }
    }
}
