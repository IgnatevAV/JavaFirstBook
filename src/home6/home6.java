package home6;

public class home6 {
    public static void main(String[] args) {
        String Result;
        String eventName;
        String tempWinEvent = " Пройдена ";
        String tempLosseEvent = " Не удалось ";



    cat cat1 = new cat("Мотроскин",190,1);
    dog dog1 = new dog("Шарик",450,10);

    animal[] animals = {cat1,dog1};

    float someRun = 150;
    float someSwim = 5;

 for (int i = 0; i < animals.length; i++) {
     String nameString = animals[i].getType() + " " + animals[i].getName() ;

     eventName = " Бег. Рекорд : " + animals[i].getRun() + " Текущая дистанция " + someRun;
     Result = (animals[i].onRun(someRun)) ? tempWinEvent : tempLosseEvent;
     System.out.println(nameString + eventName  + Result);

     int swimResult = animals[i].onSwim(someSwim);

     eventName = " Плавание. Рекорд : " + animals[i].getSwim() + " Текущая дистанция " + someSwim;
     Result = (animals[i].onRun(someSwim)) ? tempWinEvent : tempLosseEvent;

     if (swimResult == animal.swimBad)
         Result = " Кто то не доплыл ";


         System.out.println(nameString + eventName  + Result);
         System.out.println("***************************************************************************");
     }
        System.out.println(" Всего животных " + animal.howAnimal + " Всего котов " + cat.countCat + " Всего собак " + dog.countDog);

    }

}
