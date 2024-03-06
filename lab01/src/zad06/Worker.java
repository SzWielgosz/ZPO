package zad06;

public class Worker {
    String occupation;
    Work work;
    Commute commute;
    FreeTimeSpend freeTimeSpend;


    public Worker(String occupation, Work work, Commute commute, FreeTimeSpend freeTimeSpend) {
        this.occupation = occupation;
        this.work = work;
        this.commute = commute;
        this.freeTimeSpend = freeTimeSpend;

    }

    void doWork(){
        work.work();
    }

    void doCommute(){
        commute.commute();
    }

    void doSpendFreeTime(){
        freeTimeSpend.spendFreeTime();
    }
}
