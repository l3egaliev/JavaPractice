package programs.todolist;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
    static int close = 0;
    static Data data = new Data();

    static String name;



    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        while(close < 1){
            System.out.println("Выберите команду:");
            System.out.println("create - создать задачу,   delete - удалить задачу,  getAll - получить список,  "
            +"get - получить задачу,  save in file - сохранить задачу в файл,   save all in file - сохранить список задач в файл");
            System.out.println("Вы можете выбирать команду с помощью цифр: ");
            System.out.println("create - 1   delete - 2   getAll - 3    get - 4     save in file - 5    save all in file -  6"+
                    "   выйти из программы - 0");
            int command = scanner.nextInt();
            choseCommand(command);
        }

    }

    public static void choseCommand(int command){
        switch (command){
            case 0 :
                close = 1;
            case 1 :
                System.out.println("Напишите название задачи:");
                Scanner create = new Scanner(System.in);
                name = create.nextLine();
                create.close();
                data.setElement(new Element(name));
                break;
            case 2 :
                System.out.println("Id задачи которую хотите удалить:");
                Scanner del = new Scanner(System.in);
                int id = Integer.parseInt(del.nextLine());
                data.deleteElement(id);
                break;
            case 3 :
                for (Element e : data.getAllList()){
                    System.out.println(e.getName());
                }
                break;
            case 4 :
                System.out.println("Id Задачи которую хотите получить:");
                Scanner get = new Scanner(System.in);
                int get_id = Integer.parseInt(get.nextLine());
                System.out.println(data.getElement(get_id).getName());
                break;
            case 5 :
                System.out.println("Id Задачи которую хотите сохранить в файл:");
                Scanner save = new Scanner(System.in);
                int save_id = Integer.parseInt(save.nextLine());
                try{
                    data.saveInFile(save_id);
                }catch (IOException e){
                    System.out.println("Не удалось сохранить!");
                }
                break;
            case 6 :
                try{
                    data.saveInFileAllTasks();
                }catch(IOException ex){
                    System.out.println("Не удалось сохранить :(");
                }
                break;
        }
    }



}
