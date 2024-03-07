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

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public void setCommute(Commute commute) {
        this.commute = commute;
    }

    public void setFreeTimeSpend(FreeTimeSpend freeTimeSpend) {
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
