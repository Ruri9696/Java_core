package Lesson04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Phonebook {

    private HashMap<String, List<String>> book;

    public Phonebook(){
        this.book = new HashMap<>();
    }

    public void add(String surname, String number){
        if(book.containsKey(surname)){
            List<String> numbers = book.get(surname);
            if(!numbers.contains(number)){
                numbers.add(number);
                System.out.println(String.format("Номер %s добавлен контакту %s", number, surname));
            } else {
                System.out.println(String.format("Номер %s уже добавлен контакту %s", number, surname));
            }
        } else {
            book.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.println(String.format("Номер %s добавлен контакту %s", number, surname));
        }
    }

    public List<String> get(String surname){
            return book.get(surname);
        }
    }
