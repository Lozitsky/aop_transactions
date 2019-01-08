package com.kirilo.spring.main;

import com.kirilo.spring.dao.impls.PostgresDAO;
import com.kirilo.spring.dao.objects.Author;
import com.kirilo.spring.dao.objects.MP3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        MP3 firstMP3 = new MP3();
        firstMP3.setName("Song N55");

        Author author = new Author();
        author.setName("Justin");

        firstMP3.setAuthor(author);
        //
        // MP3 secondMP3 = new MP3();
        // secondMP3.setName("Song name2");
        // secondMP3.setAuthor("Song author2");
        //
        // List<MP3> list = new ArrayList<>();
        //
        // list.add(firstMP3);
        // list.add(secondMP3);
        //
        // // new SQLiteDAO().insertWithJDBC(mp3);
        //
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        PostgresDAO postgresDAO = (PostgresDAO) context.getBean("postgresDAO");

        postgresDAO.insertMP3(firstMP3);
//        System.out.println(postgresDAO.insertMP3(firstMP3));
    }

}
