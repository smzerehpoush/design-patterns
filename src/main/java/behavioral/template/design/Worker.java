package behavioral.template.design;

public abstract class Worker {

    public void doJob(){
         wakeUp();
         work();
         sleep();
    }

      abstract void wakeUp();
      abstract void work();
      abstract void sleep();
}
