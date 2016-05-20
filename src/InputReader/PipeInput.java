

package InputReader;

import Business.Person;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PipeInput {
    
    public List readPipeInput() throws FileNotFoundException, IOException{
        
        List<Person> personList = new ArrayList<>();
        
        BufferedReader br = new BufferedReader(new FileReader("codetest_files/input_files/pipe.txt"));
        
        try{
            String line = br.readLine().trim();
            line = line.replaceAll("\\s+", "");
            
            while(line != null){
                String[] input = line.split("\\|");
                Person p = new Person();
                p.setLastName(input[0]);
                p.setFirstName(input[1]);
                
                String gender = input[3];
                if(gender.equalsIgnoreCase("M")){
                   p.setGender("Male");
                }else{
                    p.setGender("Female");
                }
                p.setColor(input[4]);
                String date = input[5];
                date = date.replace("-", "/");
                p.setDate(date);
                personList.add(p);
                line = br.readLine();
                if(line != null){
                    line = line.replaceAll("\\s+", "");
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return personList;
    }
    }
