package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comment;
import entities.Post;

public class Program {

    public static void main(String[] args) throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
	
	Comment c1 = new Comment ("Have a nice trip!");
	Comment c2 = new Comment("woow! that's awesome!");
	Post p1 = new Post(sdf.parse("02/06/2020 01:32:05"), "To viajando pro Japão xD", "Viajando pra ver as oniichans", 368);
	p1.addComment(c1);
	p1.addComment(c2);
	System.out.println(p1);
    }

}
