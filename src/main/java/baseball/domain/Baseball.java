package baseball.domain;

public class Baseball {

    private User user;

    private Computer computer;

    private Count count;

    public Baseball(User user, Computer computer) {
        this.user = user;
        this.computer = computer;
        this.count = new Count(0,0);
    }


    public Computer getComputer() {
        return computer;
    }

    public User getUser() {
        return user;
    }

    public Count getCount(){ return count; }
}
