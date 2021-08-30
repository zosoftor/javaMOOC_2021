/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zac
 */
public class Book {
    private String title;
    private String pages;
    private String year;
    
    public Book(String title, String pages, String year){
        this.title = title;
        this.pages = pages;
        this.year = year;
    }
    
    public String toString(){
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
    
    public String getTitle(){
        return this.title;
    }
}
