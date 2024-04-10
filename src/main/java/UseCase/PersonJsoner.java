package UseCase;

import Domen.Person;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;

public class PersonJsoner {
    private Person person;

    private Gson gson;

    private final String file = "person.json";



    public PersonJsoner(Person person) {
        gson = new Gson();
        this.person = person;
    }

    public void Serialize(){
        String json = gson.toJson(person);
        try(FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write(json);
            System.out.println("Успешно сериализованно в файл: " + file);
            System.out.println(json);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public Person Deserialize(){
        try(FileReader fileReader = new FileReader(file)){
            return gson.fromJson(fileReader, Person.class);
        } catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }
}
