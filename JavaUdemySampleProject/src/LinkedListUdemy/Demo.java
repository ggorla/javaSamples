package LinkedListUdemy;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit,"Delhi");
        addInOrder(placesToVisit,"LA");
        addInOrder(placesToVisit,"NYC");
        addInOrder(placesToVisit,"Blr");
        addInOrder(placesToVisit,"hyd");
        addInOrder(placesToVisit,"Goa");
        printList(placesToVisit);
        addInOrder(placesToVisit,"hyder");
        addInOrder(placesToVisit,"Goa");
        printList(placesToVisit);
        visit(placesToVisit);

    }
    private  static void  printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("now Visiting "+i.next());
        }
        System.out.println("=================");
    }
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison ==0){
                System.out.println(newCity+"already exist");
                return  false;
            }
            else if(comparison>0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if( comparison<0){

            }

        }
        stringListIterator.add(newCity);
        return true;
    }
    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean  quit = false;
        boolean goingForward  = true;
        ListIterator<String> listIterator = cities.listIterator();
        if(cities.isEmpty()){
            System.out.println("No cities in the iteneray");
        }else{
            System.out.println("now visiting"+ listIterator.next());
            printMenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("now visting"+ listIterator.next());
                    }else{
                        System.out.println("reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting"+ listIterator.previous());
                    }else{
                        System.out.println("we are at the start of the list");
                        goingForward = true;
                    }
                case 3:
                    printMenu();
                    break;
            }
        }

    }
    private static void  printMenu(){
        System.out.println("avaiable actions:\npress");
        System.out.println("0 - to quite\n"+
                            "1 - go to next city\n"+
                            "2 - go to previous city\n");

    }
}
