/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Business.Person;
import InputReader.PipeInput;
import InputReader.SpaceInput;
import InputReader.commaFileReader;
import Output.Output;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author deepak31205
 */
public class Main {
    
    public static void main(String args[]) throws IOException{
        
        List<Person> personList = new ArrayList<>();
        
        commaFileReader cReader = new commaFileReader();
        List<Person> personList1 = cReader.readCommaInput();
        
        PipeInput pi = new PipeInput();
        List<Person> personList2 = pi.readPipeInput();
        
        SpaceInput si = new SpaceInput();
        List<Person> personList3 = si.readSpaceInput();
        
        personList.addAll(personList1);
        personList.addAll(personList2);
        personList.addAll(personList3);
        
        Collections.shuffle(personList);
        
        Output o = new Output();
        o.createOutput(personList);
    }
}
