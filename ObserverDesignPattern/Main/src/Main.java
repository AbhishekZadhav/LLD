import Observable.SmartPhone;
import Observer.Observer;
import Observable.Observable;
public class Main {
    public static void main(String[] args) {
        Observable smartPhone = new SmartPhone();
        for(int i=0; i<26; i++){
            Observer user = new Observer(String.valueOf((char)('a'+i)));
            smartPhone.add(user);
        }
        smartPhone.setState("in Stock");

    }
}