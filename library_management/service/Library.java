package library_management.service;
import java.util.*;

import library_management.model.Book;
import library_management.model.Member;
import library_management.util.ValidationUtil;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members=new ArrayList<>();

    public void registerBook(Book book)
    {
        if(!ValidationUtil.isValidIsbn(book.getIsbn())){
            System.out.println("Invalid ISBN.");
            return;
        }
        if(findBookByIsbn(book.getIsbn())!=null)
        {
            System.out.println("Book already registered.");
            return;
        }
        books.add(book);
        System.out.println("Book registered.");
    }

    public void registerMember(Member member)
    {
        if (member == null)
        {
            System.out.println("Invalid.");
            return;
        }
        if(findMemberById(member.getMemberId())!=null)
        {
            System.out.println("Member already registered.");
            return;
        }
        members.add(member);
        System.out.println("Member registered.");
    }

    public void displayBooks()
    {
        for(Book book: books)
        {
            System.out.println("Title: "+book.getTitle());
            System.out.println("Author: "+book.getAuthor());
            System.out.println("ISBN: "+book.getIsbn());
            System.out.println("Status: "+book.isAvailable());
            System.out.println();
        }
        
    }

    public void displayMembers()
    {
        for(Member member: members)
        {
            System.out.println("Name: "+member.getName());
            System.out.println("Student ID: "+member.getMemberId());
            System.out.println("Books Borrowed: "+member.getBooksBorrowed());
            System.out.println();
        }
        
    }

    public void borrowBook(Member member, Book book)
    {
        if(member!=null && book!=null)
        {
            book.borrow(member);
        }
    }    

    public Book findBookByIsbn(String isbn)
    {
        for (Book book: books)
        {
            if(book.getIsbn().equals(isbn)){return book;}
        }
        return null;
    }

    public Member findMemberById(String id)
    {
        for(Member member: members)
        {
            if(member.getMemberId().equals(id)){return member;}
        }
        return null;
    }
}
