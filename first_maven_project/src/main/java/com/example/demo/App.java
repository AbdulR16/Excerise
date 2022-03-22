package com.example.demo;

import com.example.demo.service.MessageService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MessageService service = new MessageService();
        
        System.out.println(service.getMessage());
    }
}
