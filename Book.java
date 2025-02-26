class Book
{
String title;
String author;
public Book()
{
title = "Money Management";
author = "krish";

System.out.println("The title is :"+title+ "the author is "+author);
}
public Book (String mytitle ,String myauthor)
{
this.title = mytitle;
this.author = myauthor;
System.out.println("The title is :"+title+ "the author is :"+author);
}

public static void  main(String args[])
{
Book B = new Book();
Book B2 = new Book("nature ","venila");
}
}
