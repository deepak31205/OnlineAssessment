/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Output;

import Business.Person;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author deepak31205
 */
public class Output {
    
    public void createOutput(List personList) throws FileNotFoundException{
        
        PrintStream out = new PrintStream(new FileOutputStream("codetest_files/output_file/output_required.txt"));
        
        if(personList.size() != 0){
            Iterator<Person> i = personList.iterator();
            while(i.hasNext()){
                Person p1 = i.next();
                out.println(p1.getLastName()+" "+
                p1.getFirstName()+" "+p1.getGender()+" "+
                p1.getDate()+" "+p1.getColor());
            }
            out.close();
        }
        else{
            out.println("List is Empty");
        }
    }
}
