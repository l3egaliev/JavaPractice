package programs.todolist;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Data {
    private List<Element> data;

    public Data(){
        this.data = new ArrayList<>();
    }

    public void setElement(Element element){
        this.data.add(element);
    }

    // Использую varags
    public void setElements(Element ... elements){
        for(Element e : elements){
            this.data.add(e);
        }
    }

    public Element getElement(int id){
        return this.data.get(id);
    }

    public List<Element> getAllList(){
        return this.data;
    }

    public void deleteElement(int id){
        this.data.remove(id);
    }

    public void updateElement(int id, Element element){
        Element toBeUpdate = this.data.get(id);
        toBeUpdate.setName(element.getName());
        this.data.add(toBeUpdate);
        this.data.remove(element);
    }

    public void saveInFile(int element) throws FileNotFoundException {
        File file = new File("task.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println(this.data.get(element));
        pw.close();
    }

    public void saveInFileAllTasks() throws FileNotFoundException {
        File file = new File("tasks.txt");
        PrintWriter pw = new PrintWriter(file);
        for(Element e : this.data){
            pw.println(e.getName());
        }

        pw.close();
    }

}
